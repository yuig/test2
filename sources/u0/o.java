package u0;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.m0;
import kh2.m2;

/* loaded from: classes2.dex */
public final class o implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f119796a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f119797b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final int f119798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f119799d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f119800e;

    /* renamed from: f, reason: collision with root package name */
    public long f119801f;

    /* renamed from: g, reason: collision with root package name */
    public gc.c f119802g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f119803h;

    public o(i iVar) {
        this.f119798c = iVar.a();
        this.f119799d = iVar.f119771b;
    }

    @Override // u0.f
    public final void a() {
        this.f119797b.getAndSet(true);
    }

    @Override // u0.f
    public final void b(gc.c cVar, Executor executor) {
        boolean z13 = true;
        com.bumptech.glide.d.v("AudioStream can not be started when setCallback.", !this.f119796a.get());
        c();
        if (cVar != null && executor == null) {
            z13 = false;
        }
        com.bumptech.glide.d.g("executor can't be null with non-null callback.", z13);
        this.f119802g = cVar;
        this.f119803h = executor;
    }

    public final void c() {
        com.bumptech.glide.d.v("AudioStream has been released.", !this.f119797b.get());
    }

    @Override // u0.f
    public final j read(ByteBuffer byteBuffer) {
        c();
        com.bumptech.glide.d.v("AudioStream has not been started.", this.f119796a.get());
        long remaining = byteBuffer.remaining();
        int i13 = this.f119798c;
        long N1 = m2.N1(i13, remaining);
        long j13 = i13;
        com.bumptech.glide.d.g("bytesPerFrame must be greater than 0.", j13 > 0);
        int i14 = (int) (j13 * N1);
        if (i14 <= 0) {
            return new j(0, this.f119801f);
        }
        long I0 = this.f119801f + m2.I0(this.f119799d, N1);
        long nanoTime = I0 - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException e13) {
                m0.Y0("SilentAudioStream", "Ignore interruption", e13);
            }
        }
        com.bumptech.glide.d.v(null, i14 <= byteBuffer.remaining());
        byte[] bArr = this.f119800e;
        if (bArr == null || bArr.length < i14) {
            this.f119800e = new byte[i14];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f119800e, 0, i14).limit(position + i14).position(position);
        j jVar = new j(i14, this.f119801f);
        this.f119801f = I0;
        return jVar;
    }

    @Override // u0.f
    public final void start() {
        c();
        if (this.f119796a.getAndSet(true)) {
            return;
        }
        this.f119801f = System.nanoTime();
        gc.c cVar = this.f119802g;
        Executor executor = this.f119803h;
        if (cVar == null || executor == null) {
            return;
        }
        executor.execute(new n(cVar, 0));
    }

    @Override // u0.f
    public final void stop() {
        c();
        this.f119796a.set(false);
    }
}
