package ns;

import android.app.Application;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;

/* loaded from: classes3.dex */
public final class p0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final k92.l f91949c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f91950d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f91951e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f91952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x searchLandingAdPreviewItemsFetcher, k92.l toastSEPNoEvents, zy.d0 pinalyticsSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(searchLandingAdPreviewItemsFetcher, "searchLandingAdPreviewItemsFetcher");
        Intrinsics.checkNotNullParameter(toastSEPNoEvents, "toastSEPNoEvents");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f91949c = toastSEPNoEvents;
        this.f91950d = pinalyticsSEP;
        kv0.p pVar = new kv0.p(4);
        int i13 = 0;
        m0 m0Var = new m0(this, i13);
        n0 n0Var = new n0(i13);
        Intrinsics.checkNotNullParameter(searchLandingAdPreviewItemsFetcher, "<this>");
        kv0.p.b(pVar, m0Var, n0Var, new o82.h(searchLandingAdPreviewItemsFetcher), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f91951e = d2;
        l82.a0 a0Var = new l82.a0(scope);
        k0 stateTransformer = new k0((o82.i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f91952f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f91952f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f91952f.e();
    }

    public final void h(a4 viewParameterType, d4 viewType, String pinId, String deeplinkUrl) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        l82.y.i(this.f91952f, new l0(pinId, deeplinkUrl, true, new o82.j0(kotlin.collections.e0.b(new i2(new y(pinId, deeplinkUrl), 2))), new zy.l0(new h32.i0(viewType, viewParameterType, null, null, null, null), 2)), false, new tq.a0(this, 15), 2);
    }
}
