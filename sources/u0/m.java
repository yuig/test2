package u0;

import a.a4;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.m0;

/* loaded from: classes2.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f119782a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f119783b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f119784c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final f0.j f119785d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f119786e;

    /* renamed from: f, reason: collision with root package name */
    public l f119787f;

    /* renamed from: g, reason: collision with root package name */
    public final f f119788g;

    /* renamed from: h, reason: collision with root package name */
    public final int f119789h;

    /* renamed from: i, reason: collision with root package name */
    public final int f119790i;

    /* renamed from: j, reason: collision with root package name */
    public final int f119791j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f119792k;

    /* renamed from: l, reason: collision with root package name */
    public int f119793l;

    public m(h hVar, i iVar) {
        f0.c cVar;
        if (f0.c.f60725c != null) {
            cVar = f0.c.f60725c;
        } else {
            synchronized (f0.c.class) {
                try {
                    if (f0.c.f60725c == null) {
                        f0.c.f60725c = new f0.c();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            cVar = f0.c.f60725c;
        }
        this.f119785d = new f0.j(cVar);
        this.f119786e = new Object();
        this.f119787f = null;
        this.f119792k = new AtomicBoolean(false);
        this.f119788g = hVar;
        int a13 = iVar.a();
        this.f119789h = a13;
        int i13 = iVar.f119771b;
        this.f119790i = i13;
        com.bumptech.glide.d.g("mBytesPerFrame must be greater than 0.", ((long) a13) > 0);
        com.bumptech.glide.d.g("mSampleRate must be greater than 0.", ((long) i13) > 0);
        this.f119791j = 500;
        this.f119793l = a13 * 1024;
    }

    @Override // u0.f
    public final void a() {
        if (this.f119783b.getAndSet(true)) {
            return;
        }
        this.f119785d.execute(new k(this, 3));
    }

    @Override // u0.f
    public final void b(gc.c cVar, Executor executor) {
        boolean z13 = true;
        com.bumptech.glide.d.v("AudioStream can not be started when setCallback.", !this.f119782a.get());
        c();
        if (cVar != null && executor == null) {
            z13 = false;
        }
        com.bumptech.glide.d.g("executor can't be null with non-null callback.", z13);
        this.f119785d.execute(new a4(this, cVar, executor, 15));
    }

    public final void c() {
        com.bumptech.glide.d.v("AudioStream has been released.", !this.f119783b.get());
    }

    public final void d() {
        if (this.f119792k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f119793l);
            l lVar = new l(allocateDirect, this.f119788g.read(allocateDirect), this.f119789h, this.f119790i);
            int i13 = this.f119791j;
            synchronized (this.f119786e) {
                try {
                    this.f119784c.offer(lVar);
                    while (this.f119784c.size() > i13) {
                        this.f119784c.poll();
                        m0.X0("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f119792k.get()) {
                this.f119785d.execute(new k(this, 2));
            }
        }
    }

    @Override // u0.f
    public final j read(ByteBuffer byteBuffer) {
        boolean z13;
        c();
        com.bumptech.glide.d.v("AudioStream has not been started.", this.f119782a.get());
        this.f119785d.execute(new v.k(this, byteBuffer.remaining(), 3));
        j jVar = new j(0, 0L);
        do {
            synchronized (this.f119786e) {
                try {
                    l lVar = this.f119787f;
                    this.f119787f = null;
                    if (lVar == null) {
                        lVar = (l) this.f119784c.poll();
                    }
                    if (lVar != null) {
                        jVar = lVar.a(byteBuffer);
                        if (lVar.f119780c.remaining() > 0) {
                            this.f119787f = lVar;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            z13 = jVar.f119774a <= 0 && this.f119782a.get() && !this.f119783b.get();
            if (z13) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e13) {
                    m0.Y0("BufferedAudioStream", "Interruption while waiting for audio data", e13);
                }
            }
        } while (z13);
        return jVar;
    }

    @Override // u0.f
    public final void start() {
        c();
        AtomicBoolean atomicBoolean = this.f119782a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new k(this, 1), null);
        this.f119785d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e13) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException(e13);
        }
    }

    @Override // u0.f
    public final void stop() {
        c();
        if (this.f119782a.getAndSet(false)) {
            this.f119785d.execute(new k(this, 0));
        }
    }
}
