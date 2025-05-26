package v21;

import android.app.Application;
import ao2.j0;
import h32.i0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import y01.p1;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class c0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final o f123868c;

    /* renamed from: d, reason: collision with root package name */
    public final b f123869d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f123870e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f123871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(o pinOrSpinRewardPreviewSEP, b pinOrSpinPreviewLoggingSEP, d0 pinalyticsSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(pinOrSpinRewardPreviewSEP, "pinOrSpinRewardPreviewSEP");
        Intrinsics.checkNotNullParameter(pinOrSpinPreviewLoggingSEP, "pinOrSpinPreviewLoggingSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f123868c = pinOrSpinRewardPreviewSEP;
        this.f123869d = pinOrSpinPreviewLoggingSEP;
        this.f123870e = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        a0 stateTransformer = new a0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        q0 q0Var = q0.f80391a;
        this.f123871f = l82.a0.b(a0Var, new b0("", "", "", q0Var, q0Var, new l0((i0) null, 3)), new p1(this, 13), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f123871f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f123871f.e();
    }
}
