package v;

import a.jg;
import a.sc;
import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b1 implements t0 {

    /* renamed from: g, reason: collision with root package name */
    public static final long f123362g = TimeUnit.SECONDS.toNanos(2);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f123363h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final n f123364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123365b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f123366c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f123367d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f123368e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f123369f;

    public b1(n nVar, int i13, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z13) {
        this.f123364a = nVar;
        this.f123365b = i13;
        this.f123367d = executor;
        this.f123368e = scheduledExecutorService;
        this.f123369f = z13;
    }

    @Override // v.t0
    public final com.google.common.util.concurrent.c0 a(TotalCaptureResult totalCaptureResult) {
        kh2.m0.p("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + c1.i(this.f123365b, totalCaptureResult));
        if (c1.i(this.f123365b, totalCaptureResult)) {
            if (!this.f123364a.f123562r) {
                kh2.m0.p("Camera2CapturePipeline", "Turn on torch");
                final int i13 = 1;
                this.f123366c = true;
                g0.d a13 = g0.d.a(com.bumptech.glide.d.L(new a.z0(this, 8)));
                final int i14 = 0;
                g0.a aVar = new g0.a(this) { // from class: v.a1

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b1 f123345b;

                    {
                        this.f123345b = this;
                    }

                    @Override // g0.a
                    public final com.google.common.util.concurrent.c0 apply(Object obj) {
                        int i15 = i14;
                        b1 b1Var = this.f123345b;
                        switch (i15) {
                            case 0:
                                if (!b1Var.f123369f) {
                                    return g0.m.e(null);
                                }
                                g2 g2Var = b1Var.f123364a.f123552h;
                                g2Var.getClass();
                                return com.bumptech.glide.d.L(new a.z0(g2Var, 9));
                            default:
                                b1Var.getClass();
                                sc scVar = new sc(19);
                                long millis = TimeUnit.NANOSECONDS.toMillis(b1.f123362g);
                                v0 v0Var = new v0(scVar);
                                n nVar = b1Var.f123364a;
                                nVar.n(v0Var);
                                jg jgVar = new jg(9, nVar, v0Var);
                                r4.l lVar = v0Var.f123692b;
                                lVar.f106128b.d(jgVar, nVar.f123547c);
                                return com.bumptech.glide.d.L(new g0.i(millis, lVar, b1Var.f123368e));
                        }
                    }
                };
                Executor executor = this.f123367d;
                a13.getClass();
                return g0.m.j(g0.m.j(g0.m.j(a13, aVar, executor), new g0.a(this) { // from class: v.a1

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b1 f123345b;

                    {
                        this.f123345b = this;
                    }

                    @Override // g0.a
                    public final com.google.common.util.concurrent.c0 apply(Object obj) {
                        int i15 = i13;
                        b1 b1Var = this.f123345b;
                        switch (i15) {
                            case 0:
                                if (!b1Var.f123369f) {
                                    return g0.m.e(null);
                                }
                                g2 g2Var = b1Var.f123364a.f123552h;
                                g2Var.getClass();
                                return com.bumptech.glide.d.L(new a.z0(g2Var, 9));
                            default:
                                b1Var.getClass();
                                sc scVar = new sc(19);
                                long millis = TimeUnit.NANOSECONDS.toMillis(b1.f123362g);
                                v0 v0Var = new v0(scVar);
                                n nVar = b1Var.f123364a;
                                nVar.n(v0Var);
                                jg jgVar = new jg(9, nVar, v0Var);
                                r4.l lVar = v0Var.f123692b;
                                lVar.f106128b.d(jgVar, nVar.f123547c);
                                return com.bumptech.glide.d.L(new g0.i(millis, lVar, b1Var.f123368e));
                        }
                    }
                }, this.f123367d), new g0.l(new l0(4)), l3.c.s());
            }
            kh2.m0.p("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return g0.m.e(Boolean.FALSE);
    }

    @Override // v.t0
    public final boolean b() {
        return this.f123365b == 0;
    }

    @Override // v.t0
    public final void c() {
        if (this.f123366c) {
            n nVar = this.f123364a;
            nVar.f123554j.a(null, false);
            kh2.m0.p("Camera2CapturePipeline", "Turning off torch");
            if (this.f123369f) {
                nVar.f123552h.a(false, true);
            }
        }
    }
}
