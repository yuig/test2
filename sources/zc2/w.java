package zc2;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes4.dex */
public final class w extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f141651c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.widget.configuration.e f141652d;

    /* renamed from: e, reason: collision with root package name */
    public final w60.d f141653e;

    /* renamed from: f, reason: collision with root package name */
    public final com.pinterest.widget.configuration.h f141654f;

    /* renamed from: g, reason: collision with root package name */
    public final y f141655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gx.e completeConfigurationSEP, com.pinterest.widget.configuration.e setContentSourceSEP, w60.d navigationSEP, com.pinterest.widget.configuration.h widgetConfigurationDataSource, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(completeConfigurationSEP, "completeConfigurationSEP");
        Intrinsics.checkNotNullParameter(setContentSourceSEP, "setContentSourceSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(widgetConfigurationDataSource, "widgetConfigurationDataSource");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f141651c = completeConfigurationSEP;
        this.f141652d = setContentSourceSEP;
        this.f141653e = navigationSEP;
        this.f141654f = widgetConfigurationDataSource;
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(12);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f141655g = a0Var.a();
        kotlin.jvm.internal.j.z(scope, null, null, new t(this, null), 3);
        kotlin.jvm.internal.j.z(scope, null, null, new v(this, null), 3);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f141655g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f141655g.e();
    }

    public final void h(int i13) {
        y.i(this.f141655g, new r(i13), false, new ha2.j(this, 28), 2);
    }
}
