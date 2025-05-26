package ni1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import so.da;

/* loaded from: classes2.dex */
public final class o2 extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final s2 f90761c;

    /* renamed from: d, reason: collision with root package name */
    public final ri1.c f90762d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f90763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ao2.j0 scope, boolean z13, Application application, zw.a pinActionHandlerSEP, da pinRepSEPFactory, es.h adsCommonDisplay, fs.c saleDealAdDisplayUtils, es.a adFormats, lh0.r2 experiments, jv.a adsPostClickHelper, nx.b0 pinAuxHelper, ur.a adsDependencies, nx.d0 pinalytics) {
        super(scope);
        ao2.o1 o1Var;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinActionHandlerSEP, "pinActionHandlerSEP");
        Intrinsics.checkNotNullParameter(pinRepSEPFactory, "pinRepSEPFactory");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(saleDealAdDisplayUtils, "saleDealAdDisplayUtils");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        ri1.c sep = pinRepSEPFactory.a(pinActionHandlerSEP);
        this.f90762d = sep;
        if (z13 && (o1Var = (ao2.o1) scope.getCoroutineContext().get(ao2.g0.f20154b)) != null) {
            o1Var.invokeOnCompletion(new u00.e(this, 14));
        }
        l82.a0 a0Var = new l82.a0(scope);
        n2 stateTransformer = dl2.b.f55292a;
        if (stateTransformer == null) {
            stateTransformer = new n2(adsCommonDisplay, adFormats, saleDealAdDisplayUtils, adsPostClickHelper, pinAuxHelper, adsDependencies);
            dl2.b.f55292a = stateTransformer;
        }
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        Intrinsics.checkNotNullParameter("PinRepViewModel", "tagged");
        ko2.f fVar = ao2.v0.f20219a;
        l82.p tuning = new l82.p(((bo2.e) ho2.q.f69782a).f23612f);
        Intrinsics.checkNotNullParameter(tuning, "tuning");
        a0Var.f82206d = tuning;
        if (application != null) {
            a0Var.c(this, application);
        }
        l82.y a13 = a0Var.a();
        String a14 = sep.a();
        Intrinsics.checkNotNullParameter(sep, "sep");
        a13.a(sep, l82.u.f82264j, l82.u.f82265k, a14);
        this.f90763e = a13;
        this.f90761c = new s2(scope, experiments, a13, pinalytics);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f90763e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        s2 s2Var = this.f90761c;
        return ((Boolean) s2Var.f90796d.getValue()).booleanValue() ? s2Var.f90799g : s2Var.f90794b.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        super.g();
        ri1.c cVar = this.f90762d;
        j jVar = cVar.f108381q;
        i iVar = jVar.f90710b;
        if (iVar != null) {
            jVar.f90709a.j(iVar);
        }
        jVar.f90710b = null;
        cVar.f108365a.f142891b = new bk1.h2();
    }

    @Override // wt1.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final u0 b(y2 startState, boolean z13) {
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (u0) this.f90763e.j(startState, z13);
    }
}
