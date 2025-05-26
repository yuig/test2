package cd2;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import u50.r;

/* loaded from: classes4.dex */
public final class p extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f27570c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.widget.configuration.e f27571d;

    /* renamed from: e, reason: collision with root package name */
    public final w60.d f27572e;

    /* renamed from: f, reason: collision with root package name */
    public final y f27573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gx.e completeConfigurationSEP, com.pinterest.widget.configuration.e setContentSourceSEP, w60.d navigationSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(completeConfigurationSEP, "completeConfigurationSEP");
        Intrinsics.checkNotNullParameter(setContentSourceSEP, "setContentSourceSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f27570c = completeConfigurationSEP;
        this.f27571d = setContentSourceSEP;
        this.f27572e = navigationSEP;
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(13);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f27573f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f27573f.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f27573f.e();
    }

    public final void h(int i13) {
        y.i(this.f27573f, new o(i13), false, new n(this, 1), 2);
    }
}
