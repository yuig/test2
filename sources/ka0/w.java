package ka0;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import p90.n0;

/* loaded from: classes5.dex */
public final class w extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final oa0.b f78918c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f78919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(oa0.b navigationSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f78918c = navigationSEP;
        l82.a0 a0Var = new l82.a0(scope);
        t stateTransformer = new t();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f78919d = l82.a0.b(a0Var, v.f78917a, new n0(this, 26), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f78919d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f78919d.e();
    }
}
