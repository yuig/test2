package wr1;

import android.app.Application;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import o82.i2;
import w41.q1;

/* loaded from: classes4.dex */
public final class d1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f130955c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f130956d;

    /* renamed from: e, reason: collision with root package name */
    public final xr1.d f130957e;

    /* renamed from: f, reason: collision with root package name */
    public final cr1.a f130958f;

    /* renamed from: g, reason: collision with root package name */
    public final g01.a f130959g;

    /* renamed from: h, reason: collision with root package name */
    public final l82.y f130960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Application application, ao2.j0 scope, zy.d0 pinalyticsSEP, xr1.d recoverAccountSEP, cr1.a unauthenticatedAccountService) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(recoverAccountSEP, "recoverAccountSEP");
        Intrinsics.checkNotNullParameter(unauthenticatedAccountService, "unauthenticatedAccountService");
        this.f130955c = scope;
        this.f130956d = pinalyticsSEP;
        this.f130957e = recoverAccountSEP;
        this.f130958f = unauthenticatedAccountService;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(15), new com.pinterest.feature.unauth.sba.q0(3), new o82.h(new androidx.appcompat.widget.q(this, 7)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f130959g = d2;
        l82.a0 a0Var = new l82.a0(scope);
        z0 stateTransformer = new z0((o82.i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f130960h = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f130960h.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f130960h.e();
    }

    public final void h(mr1.b activityProvider, h32.i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        l82.y yVar = this.f130960h;
        l82.c e13 = yVar.e();
        h32.i0 pinalyticsContext2 = new h32.i0(null, null, null, null, null, null);
        Intrinsics.checkNotNullParameter(pinalyticsContext2, "pinalyticsContext");
        this.f130956d.e(this.f130955c, new zy.e0(new zy.a(com.bumptech.glide.d.z0(pinalyticsContext2, t0.G), h32.f1.VIEW, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)), e13);
        l82.y.i(yVar, new a1(activityProvider, new wy0(), new o82.j0(kotlin.collections.e0.b(new i2((Object) null, 3))), new zy.l0(pinalyticsContext, 2)), false, new b1(this, 1), 2);
    }
}
