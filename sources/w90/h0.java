package w90;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import ns.n0;
import o82.i2;
import o82.s0;

/* loaded from: classes5.dex */
public final class h0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final o12.a f128546c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f128547d;

    /* renamed from: e, reason: collision with root package name */
    public final ua0.d f128548e;

    /* renamed from: f, reason: collision with root package name */
    public final ua0.e f128549f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.d0 f128550g;

    /* renamed from: h, reason: collision with root package name */
    public final s f128551h;

    /* renamed from: i, reason: collision with root package name */
    public final o22.e f128552i;

    /* renamed from: j, reason: collision with root package name */
    public final lh0.g0 f128553j;

    /* renamed from: k, reason: collision with root package name */
    public final g01.a f128554k;

    /* renamed from: l, reason: collision with root package name */
    public final l82.y f128555l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o12.a collageService, w60.d navigatorSEP, ua0.d additionSEP, ua0.e toastSEP, zy.d0 pinalyticsSEP, s composerNavSEP, o22.e experimentSEP, lh0.g0 experiments, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(additionSEP, "additionSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(composerNavSEP, "composerNavSEP");
        Intrinsics.checkNotNullParameter(experimentSEP, "experimentSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f128546c = collageService;
        this.f128547d = navigatorSEP;
        this.f128548e = additionSEP;
        this.f128549f = toastSEP;
        this.f128550g = pinalyticsSEP;
        this.f128551h = composerNavSEP;
        this.f128552i = experimentSEP;
        this.f128553j = experiments;
        kv0.p pVar = new kv0.p(4);
        int i13 = 2;
        com.pinterest.boardAutoCollages.k0 k0Var = new com.pinterest.boardAutoCollages.k0(i13);
        n0 n0Var = new n0(10);
        xa0.h hVar = new xa0.h(collageService);
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        kv0.p.b(pVar, k0Var, n0Var, new s0(hVar), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f128554k = d2;
        l82.a0 a0Var = new l82.a0(scope);
        f0 stateTransformer = new f0((o82.i0) d2.f63224a, new lt.j(i13));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f128555l = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f128555l.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f128555l.e();
    }

    public final void h(String str, String str2, d32.c entryPointSource, boolean z13, h32.i0 loggingContext, String str3, boolean z14, lb0.r prefsManager) {
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(prefsManager, "prefsManager");
        if (str == null && str2 == null) {
            throw new IllegalStateException("Either Pin ID or shuffleAssetID is required and both are null");
        }
        l82.y.i(this.f128555l, new g0(str, str2, entryPointSource, z13, new o82.j0(kotlin.collections.e0.b(new i2(xa0.j.n(xa0.l.DRAFTS, false), 2))), new zy.l0(loggingContext, str3), ((g1) this.f128553j.f83349a).j(), z14, prefsManager), false, new p90.n0(this, 13), 2);
    }
}
