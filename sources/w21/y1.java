package w21;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final h0 f127875c;

    /* renamed from: d, reason: collision with root package name */
    public final l f127876d;

    /* renamed from: e, reason: collision with root package name */
    public final z f127877e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.d0 f127878f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f127879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(zb0.i alertSEP, h0 pinOrSpinSelectionSEP, l pinOrSpinLoaderSEP, z pinOrSpinSelectionLoggingSEP, zy.d0 pinalyticsSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(pinOrSpinSelectionSEP, "pinOrSpinSelectionSEP");
        Intrinsics.checkNotNullParameter(pinOrSpinLoaderSEP, "pinOrSpinLoaderSEP");
        Intrinsics.checkNotNullParameter(pinOrSpinSelectionLoggingSEP, "pinOrSpinSelectionLoggingSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f127875c = pinOrSpinSelectionSEP;
        this.f127876d = pinOrSpinLoaderSEP;
        this.f127877e = pinOrSpinSelectionLoggingSEP;
        this.f127878f = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        w1 stateTransformer = new w1(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f127879g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f127879g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f127879g.e();
    }

    public final void h(String experienceId, String errorMsg, String experienceNotExistentErrorMsg, boolean z13) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(experienceNotExistentErrorMsg, "experienceNotExistentErrorMsg");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        l82.y.i(this.f127879g, new x1(experienceId, z13, 0, q0Var, q0Var, new zy.l0((h32.i0) null, 3), errorMsg, experienceNotExistentErrorMsg, true), false, new o0(this, 1), 2);
    }
}
