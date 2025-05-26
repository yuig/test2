package fk0;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;

/* loaded from: classes5.dex */
public final class x extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f62330c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f62331d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f62332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Application application, j0 scope, gx.e boardCreateSEP, w60.d navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(boardCreateSEP, "boardCreateSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f62330c = boardCreateSEP;
        this.f62331d = navigationSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(7, "stateTransformer");
        a0Var.c(this, application);
        this.f62332e = a0.b(a0Var, new w("", false), new hh0.a(this, 22), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f62332e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f62332e.e();
    }
}
