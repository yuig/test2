package eu1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import u50.r;
import yq1.u1;

/* loaded from: classes4.dex */
public final class l extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final y f60191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j0 scope, Application application, du1.a navDemoOneNavigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(navDemoOneNavigationSEP, "navDemoOneNavigationSEP");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(26, "stateTransformer");
        a0Var.c(this, application);
        this.f60191c = a0.b(a0Var, k.f60190a, new u1(navDemoOneNavigationSEP, 13), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f60191c.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f60191c.e();
    }
}
