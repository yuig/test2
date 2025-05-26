package ek1;

import ey.m2;
import ey.o2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.r2;
import lh0.z3;

/* loaded from: classes2.dex */
public final class x1 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f59392a;

    /* renamed from: b, reason: collision with root package name */
    public final r2 f59393b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f59394c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f59395d;

    public x1(m60.w eventManager, r2 pinGridCellLibraryExperiments) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinGridCellLibraryExperiments, "pinGridCellLibraryExperiments");
        this.f59392a = eventManager;
        this.f59393b = pinGridCellLibraryExperiments;
        this.f59394c = xk2.m.b(f1.f59233k);
        this.f59395d = xk2.m.b(new nx.r0(this, 16));
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ao2.f0 f(w0 effectRequest) {
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        r2 r2Var = this.f59393b;
        r2Var.getClass();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) r2Var.f83469a;
        return (ao2.f0) ((g1Var.o("android_image_placeholder_adjust_sba_timestamps", "enabled", z3Var) || g1Var.l("android_image_placeholder_adjust_sba_timestamps")) ? k() : super.f(effectRequest));
    }

    public final ao2.f0 k() {
        return (ao2.f0) this.f59394c.getValue();
    }

    public final boolean l() {
        return ((Boolean) this.f59395d.getValue()).booleanValue();
    }

    @Override // l82.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, w0 request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof u0) {
            u0 u0Var = (u0) request;
            py.b bVar = new py.b(u0Var.f59382a);
            if (l()) {
                bVar.k(u0Var.f59383b);
            }
            bVar.i();
            return;
        }
        if (request instanceof q0) {
            n((q0) request);
            return;
        }
        if (request instanceof p0) {
            p0 p0Var = (p0) request;
            o2 o2Var = new o2(p0Var.f59312a, p0Var.f59313b, p0Var.f59314c, p0Var.f59315d, p0Var.f59316e);
            if (l()) {
                o2Var.k(p0Var.f59317f);
            }
            o2Var.i();
            return;
        }
        if (request instanceof s0) {
            s0 s0Var = (s0) request;
            py.g gVar = new py.g(s0Var.f59366a);
            if (l()) {
                gVar.k(s0Var.f59367b);
            }
            gVar.i();
            return;
        }
        if (request instanceof t0) {
            t0 t0Var = (t0) request;
            m2 m2Var = new m2(t0Var.f59375a);
            if (l()) {
                m2Var.k(t0Var.f59376b);
            }
            m2Var.i();
            return;
        }
        if (request instanceof r0) {
            r0 r0Var = (r0) request;
            py.f fVar = new py.f(r0Var.f59333a, r0Var.f59334b, r0Var.f59335c, q92.c.PIN);
            if (l()) {
                fVar.k(r0Var.f59336d);
            }
            fVar.i();
            return;
        }
        if (request instanceof o0) {
            o0 o0Var = (o0) request;
            py.i iVar = new py.i(o0Var.f59294a, o0Var.f59295b, o0Var.f59296c, o0Var.f59297d, o0Var.f59298e);
            if (l()) {
                iVar.k(o0Var.f59299f);
            }
            iVar.i();
            if (ao2.m0.f20172b) {
                return;
            }
            this.f59392a.d(new ky.b());
        }
    }

    public final void n(q0 q0Var) {
        py.c cVar = new py.c(q0Var.f59320a);
        if (l()) {
            cVar.k(q0Var.f59321b);
        }
        cVar.i();
    }
}
