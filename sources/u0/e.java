package u0;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import c0.m1;
import com.google.android.gms.internal.measurement.q4;
import com.google.common.util.concurrent.c0;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m0;
import y0.u;
import y0.x;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f0.j f119732a;

    /* renamed from: d, reason: collision with root package name */
    public final m f119735d;

    /* renamed from: e, reason: collision with root package name */
    public final o f119736e;

    /* renamed from: f, reason: collision with root package name */
    public final long f119737f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f119740i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f119741j;

    /* renamed from: k, reason: collision with root package name */
    public q4 f119742k;

    /* renamed from: l, reason: collision with root package name */
    public y0.j f119743l;

    /* renamed from: m, reason: collision with root package name */
    public m1 f119744m;

    /* renamed from: n, reason: collision with root package name */
    public c f119745n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f119746o;

    /* renamed from: p, reason: collision with root package name */
    public long f119747p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f119748q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f119749r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f119750s;

    /* renamed from: t, reason: collision with root package name */
    public double f119751t;

    /* renamed from: v, reason: collision with root package name */
    public final int f119753v;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f119733b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f119734c = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public d f119738g = d.CONFIGURED;

    /* renamed from: h, reason: collision with root package name */
    public t0.b f119739h = t0.b.INACTIVE;

    /* renamed from: u, reason: collision with root package name */
    public long f119752u = 0;

    public e(i iVar, f0.j jVar, Context context) {
        f0.j jVar2 = new f0.j(jVar);
        this.f119732a = jVar2;
        this.f119737f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            m mVar = new m(new h(iVar, context), iVar);
            this.f119735d = mVar;
            mVar.b(new gc.c(this, 22), jVar2);
            this.f119736e = new o(iVar);
            this.f119753v = iVar.f119773d;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e13) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e13);
        }
    }

    public final void a() {
        Executor executor = this.f119741j;
        q4 q4Var = this.f119742k;
        if (executor == null || q4Var == null) {
            return;
        }
        int i13 = 0;
        boolean z13 = this.f119749r || this.f119746o || this.f119748q;
        if (Objects.equals(this.f119733b.getAndSet(Boolean.valueOf(z13)), Boolean.valueOf(z13))) {
            return;
        }
        executor.execute(new b(q4Var, z13, i13));
    }

    public final void b(y0.j jVar) {
        y0.j jVar2 = this.f119743l;
        t0.b bVar = null;
        if (jVar2 != null) {
            c cVar = this.f119745n;
            Objects.requireNonNull(cVar);
            ((x) jVar2).f(cVar);
            this.f119743l = null;
            this.f119745n = null;
            this.f119744m = null;
            this.f119739h = t0.b.INACTIVE;
            f();
        }
        if (jVar != null) {
            this.f119743l = jVar;
            this.f119745n = new c(this, jVar);
            this.f119744m = new m1(10, this, jVar);
            try {
                c0 c13 = ((x) jVar).c();
                if (((r4.l) c13).f106128b.isDone()) {
                    bVar = (t0.b) ((r4.l) c13).f106128b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (bVar != null) {
                this.f119739h = bVar;
                f();
            }
            ((x) this.f119743l).a(this.f119745n, this.f119732a);
        }
    }

    public final void c() {
        y0.j jVar = this.f119743l;
        Objects.requireNonNull(jVar);
        r4.l L = com.bumptech.glide.d.L(new u((x) jVar, 1));
        m1 m1Var = this.f119744m;
        Objects.requireNonNull(m1Var);
        g0.m.a(L, m1Var, this.f119732a);
    }

    public final void d(d dVar) {
        m0.p("AudioSource", "Transitioning internal state: " + this.f119738g + " --> " + dVar);
        this.f119738g = dVar;
    }

    public final void e() {
        if (this.f119740i) {
            this.f119740i = false;
            m0.p("AudioSource", "stopSendingAudio");
            this.f119735d.stop();
        }
    }

    public final void f() {
        if (this.f119738g != d.STARTED) {
            e();
            return;
        }
        int i13 = 1;
        boolean z13 = this.f119739h == t0.b.ACTIVE;
        boolean z14 = !z13;
        Executor executor = this.f119741j;
        q4 q4Var = this.f119742k;
        if (executor != null && q4Var != null && this.f119734c.getAndSet(z14) != z14) {
            executor.execute(new b(q4Var, z14, i13));
        }
        if (!z13) {
            e();
            return;
        }
        if (this.f119740i) {
            return;
        }
        try {
            m0.p("AudioSource", "startSendingAudio");
            this.f119735d.start();
            this.f119746o = false;
        } catch (AudioStream$AudioStreamException e13) {
            m0.Y0("AudioSource", "Failed to start AudioStream", e13);
            this.f119746o = true;
            this.f119736e.start();
            this.f119747p = System.nanoTime();
            a();
        }
        this.f119740i = true;
        c();
    }
}
