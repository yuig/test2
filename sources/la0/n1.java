package la0;

import android.app.Application;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;

/* loaded from: classes5.dex */
public final class n1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final o12.a f82441c;

    /* renamed from: d, reason: collision with root package name */
    public final lh0.i0 f82442d;

    /* renamed from: e, reason: collision with root package name */
    public final zb0.i f82443e;

    /* renamed from: f, reason: collision with root package name */
    public final ta0.v f82444f;

    /* renamed from: g, reason: collision with root package name */
    public final ta0.h0 f82445g;

    /* renamed from: h, reason: collision with root package name */
    public final oa0.b f82446h;

    /* renamed from: i, reason: collision with root package name */
    public final na0.c f82447i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.d0 f82448j;

    /* renamed from: k, reason: collision with root package name */
    public final na0.e f82449k;

    /* renamed from: l, reason: collision with root package name */
    public final k92.l f82450l;

    /* renamed from: m, reason: collision with root package name */
    public final nu.b f82451m;

    /* renamed from: n, reason: collision with root package name */
    public final o22.i f82452n;

    /* renamed from: o, reason: collision with root package name */
    public final g01.a f82453o;

    /* renamed from: p, reason: collision with root package name */
    public final l82.y f82454p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o12.a collageService, lh0.i0 experiments, zb0.i alertSEP, ta0.v collageDraftDownloadSEP, ta0.h0 collageDuplicateSEP, oa0.b navigationSEP, na0.c optionsSEP, zy.d0 pinalyticsSEP, na0.e refreshSEP, k92.l toastSEP, nu.b impressionSEP, o22.i experimentSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(collageDraftDownloadSEP, "collageDraftDownloadSEP");
        Intrinsics.checkNotNullParameter(collageDuplicateSEP, "collageDuplicateSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(optionsSEP, "optionsSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(refreshSEP, "refreshSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(impressionSEP, "impressionSEP");
        Intrinsics.checkNotNullParameter(experimentSEP, "experimentSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f82441c = collageService;
        this.f82442d = experiments;
        this.f82443e = alertSEP;
        this.f82444f = collageDraftDownloadSEP;
        this.f82445g = collageDuplicateSEP;
        this.f82446h = navigationSEP;
        this.f82447i = optionsSEP;
        this.f82448j = pinalyticsSEP;
        this.f82449k = refreshSEP;
        this.f82450l = toastSEP;
        this.f82451m = impressionSEP;
        this.f82452n = experimentSEP;
        kv0.p pVar = new kv0.p(4);
        com.pinterest.boardAutoCollages.k0 k0Var = new com.pinterest.boardAutoCollages.k0(4);
        ns.n0 n0Var = new ns.n0(13);
        xa0.h hVar = new xa0.h(collageService);
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        kv0.p.b(pVar, k0Var, n0Var, new o82.s0(hVar), false, o82.t1.b(), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f82453o = d2;
        l82.a0 a0Var = new l82.a0(scope);
        lt.j jVar = new lt.j(2);
        k1 stateTransformer = new k1((o82.i0) d2.f63224a, jVar, new x31.o(jVar), new lt.j(1));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f82454p = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f82454p.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f82454p.e();
    }

    public final void h(xa0.l type, boolean z13, xa0.q draftSelectionResult, h32.i0 loggingContext, String str, boolean z14) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(draftSelectionResult, "draftSelectionResult");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        zy.l0 pinalyticsVMState = new zy.l0(loggingContext, str);
        x31.c cVar = o1.f82456a;
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        l82.y.i(this.f82454p, new m1(type, z13, draftSelectionResult, new o82.j0(kotlin.collections.e0.b(new i2(xa0.j.n(type, z13), 2))), z13, pinalyticsVMState, new x31.p(x31.t.Single, false, null, kotlin.collections.f0.j(c.f82375a, d.f82385a), pinalyticsVMState, z14, RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP), "", ((lh0.g1) this.f82442d.f83386a).j(), z14), false, new p90.n0(this, 28), 2);
    }
}
