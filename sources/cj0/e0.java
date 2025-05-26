package cj0;

import a.cb;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o82.t1;
import so.pb;
import x02.i2;

/* loaded from: classes5.dex */
public final class e0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final e12.d f27805c;

    /* renamed from: d, reason: collision with root package name */
    public final lh0.r f27806d;

    /* renamed from: e, reason: collision with root package name */
    public final fj0.c f27807e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f27808f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.d0 f27809g;

    /* renamed from: h, reason: collision with root package name */
    public final pb f27810h;

    /* renamed from: i, reason: collision with root package name */
    public final g01.a f27811i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f27812j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e12.d boardService, i2 pinRepository, lh0.r experiments, fj0.c automagicalBoardSEP, w60.d navigatorSEP, zy.d0 pinalyticsSEP, pb quickSaveSEPFactory, m60.d0 gridColumnCountProvider, dj0.k displayStateMapper, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(automagicalBoardSEP, "automagicalBoardSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(quickSaveSEPFactory, "quickSaveSEPFactory");
        Intrinsics.checkNotNullParameter(gridColumnCountProvider, "gridColumnCountProvider");
        Intrinsics.checkNotNullParameter(displayStateMapper, "displayStateMapper");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f27805c = boardService;
        this.f27806d = experiments;
        this.f27807e = automagicalBoardSEP;
        this.f27808f = navigatorSEP;
        this.f27809g = pinalyticsSEP;
        this.f27810h = quickSaveSEPFactory;
        kv0.p pVar = new kv0.p(4);
        int i13 = 2;
        ns.m0 m0Var = new ns.m0(this, i13);
        ns.n0 n0Var = new ns.n0(14);
        dj0.h hVar = new dj0.h(boardService);
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        kv0.p.b(pVar, m0Var, n0Var, new o82.s0(hVar), false, t1.b(), new dj0.e(pinRepository), null, null, t.BoardFeed.getId(), null, 712);
        g01.a d2 = pVar.d();
        this.f27811i = d2;
        l82.a0 a0Var = new l82.a0(scope);
        c0 stateTransformer = new c0(displayStateMapper, gridColumnCountProvider, (o82.i0) d2.f63224a, new lt.j(i13));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f27812j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f27812j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f27812j.e();
    }

    public final void h(String boardId, wa2.m pinFeatureConfig, h32.i0 loggingContext, il1.a fragmentFactory, String str, String str2) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        zy.l0 l0Var = new zy.l0(loggingContext, str);
        zo.c cVar = zo.c.DEFAULT;
        String g13 = cb.g("toString(...)");
        l82.y.i(this.f27812j, new d0(boardId, pinFeatureConfig, null, cVar, g13, str2, new o82.j0(kotlin.collections.e0.b(new o82.i2(new dj0.f(boardId, pinFeatureConfig, g13, str2), new o82.k(new o82.y0(null, o82.v.f93728e, true, 1))))), l0Var, false), false, new gd0.c(18, this, fragmentFactory), 2);
    }
}
