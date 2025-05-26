package ca0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final da0.f f27076c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f27077d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f27078e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f27079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(da0.f publishSEP, w60.d navigationSEP, zy.d0 pinalyticsSEP, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(publishSEP, "publishSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f27076c = publishSEP;
        this.f27077d = navigationSEP;
        this.f27078e = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        y0 stateTransformer = new y0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f27079f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f27079f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f27079f.e();
    }

    public final void h(h32.i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f27079f, new a1("", "", "", "", h1.f27123a, true, b.f27072a, new zy.l0(loggingContext, str)), false, new p90.n0(this, 15), 2);
    }
}
