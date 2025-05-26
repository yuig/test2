package n70;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;

/* loaded from: classes5.dex */
public final class t0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final m7.c f89677c;

    /* renamed from: d, reason: collision with root package name */
    public final p70.e f89678d;

    /* renamed from: e, reason: collision with root package name */
    public final i60.a f89679e;

    /* renamed from: f, reason: collision with root package name */
    public final nu.a f89680f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.d0 f89681g;

    /* renamed from: h, reason: collision with root package name */
    public final g01.a f89682h;

    /* renamed from: i, reason: collision with root package name */
    public final l82.y f89683i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Application application, ao2.j0 scope, v60.d shopPinsPageLoader, v60.d categoriesFeedPageLoader, v60.d stlFeedPageLoader, m7.c dynamicStoryRecyclerViewTypeCalculator, p70.e pinActionSEP, i60.a loggingSEP, nu.a eventManagerSEP, zy.d0 pinalyticsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(shopPinsPageLoader, "shopPinsPageLoader");
        Intrinsics.checkNotNullParameter(categoriesFeedPageLoader, "categoriesFeedPageLoader");
        Intrinsics.checkNotNullParameter(stlFeedPageLoader, "stlFeedPageLoader");
        Intrinsics.checkNotNullParameter(dynamicStoryRecyclerViewTypeCalculator, "dynamicStoryRecyclerViewTypeCalculator");
        Intrinsics.checkNotNullParameter(pinActionSEP, "pinActionSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(eventManagerSEP, "eventManagerSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f89677c = dynamicStoryRecyclerViewTypeCalculator;
        this.f89678d = pinActionSEP;
        this.f89679e = loggingSEP;
        this.f89680f = eventManagerSEP;
        this.f89681g = pinalyticsSEP;
        kv0.p pVar = new kv0.p(4);
        p0 p0Var = new p0(this, 1);
        p0 p0Var2 = new p0(this, 0);
        s0 s0Var = new s0(p0Var);
        r0 r0Var = new r0();
        Intrinsics.checkNotNullParameter(shopPinsPageLoader, "<this>");
        kv0.p.b(pVar, s0Var, r0Var, new o82.s0(shopPinsPageLoader), true, new q0(p0Var2), null, null, null, null, null, 992);
        s0 s0Var2 = new s0(p0Var);
        r0 r0Var2 = new r0();
        Intrinsics.checkNotNullParameter(stlFeedPageLoader, "<this>");
        kv0.p.b(pVar, s0Var2, r0Var2, new o82.s0(stlFeedPageLoader), true, new q0(p0Var2), null, null, null, null, null, 992);
        s0 s0Var3 = new s0(p0Var);
        r0 r0Var3 = new r0();
        Intrinsics.checkNotNullParameter(categoriesFeedPageLoader, "<this>");
        kv0.p.b(pVar, s0Var3, r0Var3, new o82.s0(categoriesFeedPageLoader), true, new q0(p0Var2), null, null, null, null, null, 992);
        g01.a d2 = pVar.d();
        this.f89682h = d2;
        l82.a0 a0Var = new l82.a0(scope);
        n0 stateTransformer = new n0((o82.i0) d2.f63224a, new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f89683i = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f89683i.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f89683i.e();
    }

    public final void h(h32.i0 pinalyticsContext, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        int i13 = 2;
        l82.y.i(this.f89683i, new o0(str, str2, str6, str3, str8, str9, str4, str5, str7, null, 0, new o82.j0(kotlin.collections.f0.j(new i2(new m70.f(str, str2, str7, null), i13), new i2(new m70.d(str3, str4, str2, str5, str7), i13), new i2(new m70.a(str, str8, str9), i13))), new zy.l0(pinalyticsContext, str)), false, new mz.c(this, 14), 2);
    }
}
