package iu1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes4.dex */
public final class u extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final du1.a f73719c;

    /* renamed from: d, reason: collision with root package name */
    public final hu1.j f73720d;

    /* renamed from: e, reason: collision with root package name */
    public final y f73721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(du1.a navigationSEP, hu1.j navDemoTwoUserLoaderSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(navDemoTwoUserLoaderSEP, "navDemoTwoUserLoaderSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f73719c = navigationSEP;
        this.f73720d = navDemoTwoUserLoaderSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(28, "stateTransformer");
        a0Var.c(this, application);
        this.f73721e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f73721e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f73721e.e();
    }
}
