package xs0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ni1.a2;
import so.ba;
import so.da;
import zy.q0;

/* loaded from: classes5.dex */
public final class h0 implements wt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.c0 f135818a;

    /* renamed from: b, reason: collision with root package name */
    public final l82.y f135819b;

    public h0(j0 scope, q0 pinalyticsSEPFactory, nu.b repositorySEP, k92.j toastSEP, ni1.d0 vmStateConverterFactory, es.h adsCommonDisplay, es.a adFormats, fs.c saleDealAdDisplayUtils, jv.a adsPostClickHelper, nx.b0 pinAuxHelper, ur.a adsDependencies, da pinRepSEPFactory) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalyticsSEPFactory, "pinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(repositorySEP, "repositorySEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(saleDealAdDisplayUtils, "saleDealAdDisplayUtils");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(pinRepSEPFactory, "pinRepSEPFactory");
        this.f135818a = ((ba) vmStateConverterFactory).a(wa2.m.a(a2.a(), false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -269484033, -1, 1023), new ss0.b(1), new mj.m(9));
        l82.a0 a0Var = new l82.a0(scope);
        f0 stateTransformer = new f0(adsCommonDisplay, saleDealAdDisplayUtils, adFormats, adsPostClickHelper, pinAuxHelper, adsDependencies);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        l82.y a13 = a0Var.a();
        ri1.c a14 = pinRepSEPFactory.a(new zw.a());
        a13.a(a14, g.f135799t, g.f135800u, a14.a());
        zy.d0 a15 = pinalyticsSEPFactory.a();
        a13.a(a15, g.f135801v, g.f135802w, a15.a());
        a13.a(repositorySEP, g.f135803x, g.f135804y, repositorySEP.a());
        a13.a(toastSEP, g.f135805z, g.A, toastSEP.a());
        this.f135819b = a13;
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f135819b.d();
    }

    @Override // wt1.d
    public final u50.o b(i0 i0Var, boolean z13) {
        g0 startState = (g0) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (q) this.f135819b.j(g0.b(startState, null, this.f135818a.a(startState.f135808b, startState.f135807a), 63), z13);
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f135819b.e();
    }
}
