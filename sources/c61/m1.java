package c61;

import android.app.Application;
import android.content.res.Resources;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.e3;
import lh0.z3;
import o82.s1;
import so.kb;
import so.ob;

/* loaded from: classes5.dex */
public final class m1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final p0 f26614c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.c f26615d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f26616e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f26617f;

    /* renamed from: g, reason: collision with root package name */
    public final mb0.a f26618g;

    /* renamed from: h, reason: collision with root package name */
    public final nu.b f26619h;

    /* renamed from: i, reason: collision with root package name */
    public final ob f26620i;

    /* renamed from: j, reason: collision with root package name */
    public final mb0.a f26621j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.w f26622k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26623l;

    /* renamed from: m, reason: collision with root package name */
    public final l1 f26624m;

    /* renamed from: n, reason: collision with root package name */
    public final g01.a f26625n;

    /* renamed from: o, reason: collision with root package name */
    public final l82.y f26626o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p0 searchLandingService, m7.c dynamicStoryRecyclerViewTypeCalculator, zy.d0 pinalyticsSEP, w60.d navigationSEP, s1 sectionPerfLoggerSEPFactory, mb0.a preferencesSEP, nu.b impressionSEP, ob perfLoggerSEPFactory, mb0.a dynamicStoriesImagePrefetcherSEP, m60.w eventManager, e3 experiments, rg0.s experiences, Application application, ao2.j0 scope) {
        super(scope);
        boolean z13;
        Intrinsics.checkNotNullParameter(searchLandingService, "searchLandingService");
        Intrinsics.checkNotNullParameter(dynamicStoryRecyclerViewTypeCalculator, "dynamicStoryRecyclerViewTypeCalculator");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(sectionPerfLoggerSEPFactory, "sectionPerfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(preferencesSEP, "preferencesSEP");
        Intrinsics.checkNotNullParameter(impressionSEP, "impressionSEP");
        Intrinsics.checkNotNullParameter(perfLoggerSEPFactory, "perfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(dynamicStoriesImagePrefetcherSEP, "dynamicStoriesImagePrefetcherSEP");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f26614c = searchLandingService;
        this.f26615d = dynamicStoryRecyclerViewTypeCalculator;
        this.f26616e = pinalyticsSEP;
        this.f26617f = navigationSEP;
        this.f26618g = preferencesSEP;
        this.f26619h = impressionSEP;
        this.f26620i = perfLoggerSEPFactory;
        this.f26621j = dynamicStoriesImagePrefetcherSEP;
        this.f26622k = eventManager;
        boolean z14 = false;
        int i13 = 1;
        if (((dh0.d) experiences).b(i32.y0.ANDROID_SEARCH_TAB_LANDING_TAKEOVER) != null) {
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) experiments.f83338a;
            if (g1Var.o("android_search_landing_experience_pwt_fix", "enabled", z3Var) || g1Var.l("android_search_landing_experience_pwt_fix")) {
                z13 = true;
                this.f26623l = z13;
                this.f26624m = new l1(this);
                kv0.p pVar = new kv0.p(4);
                ns.m0 m0Var = new ns.m0(this, 3);
                bt0.u uVar = new bt0.u(17);
                m0 m0Var2 = new m0(searchLandingService, false);
                Resources resources = application.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                kv0.p.b(pVar, m0Var, uVar, new o82.s0(m0Var2, new a61.b(1, resources)), false, null, null, null, null, null, ((kb) sectionPerfLoggerSEPFactory).a(s92.i.SEARCH_TAB_RENDER), 504);
                g01.a d2 = pVar.d();
                this.f26625n = d2;
                l82.a0 a0Var = new l82.a0(scope);
                j1 stateTransformer = new j1((o82.i0) d2.f63224a, new lt.j(i13));
                Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
                a0Var.f82204b = stateTransformer;
                a0Var.c(this, application);
                this.f26626o = l82.a0.b(a0Var, new k1(z14, new zy.l0(new h32.i0(d4.SEARCH, h32.a4.SEARCH_TAB, null, h32.g0.DYNAMIC_GRID_STORY, null, null), 2), z13, 27), new j41.i(this, 12), 2);
            }
        }
        z13 = false;
        this.f26623l = z13;
        this.f26624m = new l1(this);
        kv0.p pVar2 = new kv0.p(4);
        ns.m0 m0Var3 = new ns.m0(this, 3);
        bt0.u uVar2 = new bt0.u(17);
        m0 m0Var22 = new m0(searchLandingService, false);
        Resources resources2 = application.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        kv0.p.b(pVar2, m0Var3, uVar2, new o82.s0(m0Var22, new a61.b(1, resources2)), false, null, null, null, null, null, ((kb) sectionPerfLoggerSEPFactory).a(s92.i.SEARCH_TAB_RENDER), 504);
        g01.a d23 = pVar2.d();
        this.f26625n = d23;
        l82.a0 a0Var2 = new l82.a0(scope);
        j1 stateTransformer2 = new j1((o82.i0) d23.f63224a, new lt.j(i13));
        Intrinsics.checkNotNullParameter(stateTransformer2, "stateTransformer");
        a0Var2.f82204b = stateTransformer2;
        a0Var2.c(this, application);
        this.f26626o = l82.a0.b(a0Var2, new k1(z14, new zy.l0(new h32.i0(d4.SEARCH, h32.a4.SEARCH_TAB, null, h32.g0.DYNAMIC_GRID_STORY, null, null), 2), z13, 27), new j41.i(this, 12), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f26626o.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f26626o.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        this.f26622k.j(this.f26624m);
        super.g();
    }

    public final void h(boolean z13) {
        this.f26626o.j(new k1(z13, new zy.l0(new h32.i0(d4.SEARCH, h32.a4.SEARCH_TAB, null, h32.g0.DYNAMIC_GRID_STORY, null, null), 2), this.f26623l, 25), true);
    }
}
