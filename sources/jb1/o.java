package jb1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import u50.r;
import zy.d0;

/* loaded from: classes5.dex */
public final class o extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final y f75351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Application application, j0 scope, w60.d screenNavigatorSEP, d0 pinalyticsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(20, "stateTransformer");
        a0Var.c(this, application);
        this.f75351c = a0.b(a0Var, new n(), new y71.b(26, screenNavigatorSEP, pinalyticsSEP), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f75351c.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f75351c.e();
    }
}
