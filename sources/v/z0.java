package v;

import a.ig;
import a.jg;
import a.o3;
import a.sc;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class z0 implements t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final long f123749f = TimeUnit.SECONDS.toNanos(2);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f123750g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final n f123751a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f123752b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f123753c;

    /* renamed from: d, reason: collision with root package name */
    public final c0.g0 f123754d;

    /* renamed from: e, reason: collision with root package name */
    public final gc.c f123755e;

    public z0(n nVar, Executor executor, ScheduledExecutorService scheduledExecutorService, gc.c cVar) {
        this.f123751a = nVar;
        this.f123752b = executor;
        this.f123753c = scheduledExecutorService;
        this.f123755e = cVar;
        c0.g0 g0Var = nVar.f123561q;
        Objects.requireNonNull(g0Var);
        this.f123754d = g0Var;
    }

    @Override // v.t0
    public final com.google.common.util.concurrent.c0 a(TotalCaptureResult totalCaptureResult) {
        kh2.m0.p("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        AtomicReference atomicReference = new AtomicReference();
        final int i13 = 0;
        r4.l L = com.bumptech.glide.d.L(new w0(atomicReference, 0));
        g0.d a13 = g0.d.a(com.bumptech.glide.d.L(new o3(4, this, atomicReference)));
        g0.a aVar = new g0.a(this) { // from class: v.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f123733b;

            {
                this.f123733b = this;
            }

            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                int i14 = i13;
                z0 z0Var = this.f123733b;
                switch (i14) {
                    case 0:
                        return z0Var.f123751a.f123552h.b(true);
                    case 1:
                        z0Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(z0Var, 7));
                    case 2:
                        g2 g2Var = z0Var.f123751a.f123552h;
                        g2Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(g2Var, 9));
                    default:
                        z0Var.getClass();
                        sc scVar = new sc(18);
                        long millis = TimeUnit.NANOSECONDS.toMillis(z0.f123749f);
                        v0 v0Var = new v0(scVar);
                        n nVar = z0Var.f123751a;
                        nVar.n(v0Var);
                        jg jgVar = new jg(9, nVar, v0Var);
                        r4.l lVar = v0Var.f123692b;
                        lVar.f106128b.d(jgVar, nVar.f123547c);
                        return com.bumptech.glide.d.L(new g0.i(millis, lVar, z0Var.f123753c));
                }
            }
        };
        a13.getClass();
        Executor executor = this.f123752b;
        final int i14 = 1;
        g0.b j13 = g0.m.j(g0.m.j(g0.m.j(a13, aVar, executor), new g0.a(this) { // from class: v.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f123733b;

            {
                this.f123733b = this;
            }

            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                int i142 = i14;
                z0 z0Var = this.f123733b;
                switch (i142) {
                    case 0:
                        return z0Var.f123751a.f123552h.b(true);
                    case 1:
                        z0Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(z0Var, 7));
                    case 2:
                        g2 g2Var = z0Var.f123751a.f123552h;
                        g2Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(g2Var, 9));
                    default:
                        z0Var.getClass();
                        sc scVar = new sc(18);
                        long millis = TimeUnit.NANOSECONDS.toMillis(z0.f123749f);
                        v0 v0Var = new v0(scVar);
                        n nVar = z0Var.f123751a;
                        nVar.n(v0Var);
                        jg jgVar = new jg(9, nVar, v0Var);
                        r4.l lVar = v0Var.f123692b;
                        lVar.f106128b.d(jgVar, nVar.f123547c);
                        return com.bumptech.glide.d.L(new g0.i(millis, lVar, z0Var.f123753c));
                }
            }
        }, executor), new o3(1, this, L), executor);
        final int i15 = 2;
        g0.b j14 = g0.m.j(j13, new g0.a(this) { // from class: v.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f123733b;

            {
                this.f123733b = this;
            }

            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                int i142 = i15;
                z0 z0Var = this.f123733b;
                switch (i142) {
                    case 0:
                        return z0Var.f123751a.f123552h.b(true);
                    case 1:
                        z0Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(z0Var, 7));
                    case 2:
                        g2 g2Var = z0Var.f123751a.f123552h;
                        g2Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(g2Var, 9));
                    default:
                        z0Var.getClass();
                        sc scVar = new sc(18);
                        long millis = TimeUnit.NANOSECONDS.toMillis(z0.f123749f);
                        v0 v0Var = new v0(scVar);
                        n nVar = z0Var.f123751a;
                        nVar.n(v0Var);
                        jg jgVar = new jg(9, nVar, v0Var);
                        r4.l lVar = v0Var.f123692b;
                        lVar.f106128b.d(jgVar, nVar.f123547c);
                        return com.bumptech.glide.d.L(new g0.i(millis, lVar, z0Var.f123753c));
                }
            }
        }, executor);
        final int i16 = 3;
        g0.b j15 = g0.m.j(j14, new g0.a(this) { // from class: v.x0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f123733b;

            {
                this.f123733b = this;
            }

            @Override // g0.a
            public final com.google.common.util.concurrent.c0 apply(Object obj) {
                int i142 = i16;
                z0 z0Var = this.f123733b;
                switch (i142) {
                    case 0:
                        return z0Var.f123751a.f123552h.b(true);
                    case 1:
                        z0Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(z0Var, 7));
                    case 2:
                        g2 g2Var = z0Var.f123751a.f123552h;
                        g2Var.getClass();
                        return com.bumptech.glide.d.L(new a.z0(g2Var, 9));
                    default:
                        z0Var.getClass();
                        sc scVar = new sc(18);
                        long millis = TimeUnit.NANOSECONDS.toMillis(z0.f123749f);
                        v0 v0Var = new v0(scVar);
                        n nVar = z0Var.f123751a;
                        nVar.n(v0Var);
                        jg jgVar = new jg(9, nVar, v0Var);
                        r4.l lVar = v0Var.f123692b;
                        lVar.f106128b.d(jgVar, nVar.f123547c);
                        return com.bumptech.glide.d.L(new g0.i(millis, lVar, z0Var.f123753c));
                }
            }
        }, executor);
        l0 l0Var = new l0(3);
        return g0.m.j(j15, new g0.l(l0Var), l3.c.s());
    }

    @Override // v.t0
    public final boolean b() {
        return false;
    }

    @Override // v.t0
    public final void c() {
        kh2.m0.p("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
        boolean O = this.f123755e.O();
        n nVar = this.f123751a;
        if (O) {
            nVar.p(false);
        }
        nVar.f123552h.b(false).d(new h(2), this.f123752b);
        nVar.f123552h.a(false, true);
        f0.g H0 = l3.c.H0();
        c0.g0 g0Var = this.f123754d;
        Objects.requireNonNull(g0Var);
        H0.execute(new ig(g0Var, 9));
    }
}
