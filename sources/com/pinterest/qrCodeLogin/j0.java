package com.pinterest.qrCodeLogin;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w60.d f50321c;

    /* renamed from: d, reason: collision with root package name */
    public final wz1.b f50322d;

    /* renamed from: e, reason: collision with root package name */
    public final k92.l f50323e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.d0 f50324f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f50325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Application application, ao2.j0 scope, w60.d navigationSEP, wz1.b qrCodeLoginSEP, k92.l toastSEP, zy.d0 pinalyticsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(qrCodeLoginSEP, "qrCodeLoginSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f50321c = navigationSEP;
        this.f50322d = qrCodeLoginSEP;
        this.f50323e = toastSEP;
        this.f50324f = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        rw1.f stateTransformer = new rw1.f(5);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f50325g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f50325g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f50325g.e();
    }

    public final void h(h32.i0 pinalyticsContext, String qrCodeToken) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(qrCodeToken, "qrCodeToken");
        l82.y.i(this.f50325g, new i0(new zy.l0(pinalyticsContext, 2), qrCodeToken), false, new ex1.n(this, 18), 2);
    }
}
