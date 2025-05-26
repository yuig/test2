package t02;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import u50.r;

/* loaded from: classes4.dex */
public final class o extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w60.d f115734c;

    /* renamed from: d, reason: collision with root package name */
    public final y f115735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Application application, j0 scope, w60.d reportSensitivityNoticeSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(reportSensitivityNoticeSEP, "reportSensitivityNoticeSEP");
        this.f115734c = reportSensitivityNoticeSEP;
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(8);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f115735d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f115735d.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f115735d.e();
    }

    public final void h(m02.b sensitivityData) {
        Intrinsics.checkNotNullParameter(sensitivityData, "sensitivityData");
        y.i(this.f115735d, new n(sensitivityData), false, new ex1.n(this, 28), 2);
    }
}
