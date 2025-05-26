package ga1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import lh0.m3;
import n91.z;
import xs.f0;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class x extends l82.b implements l82.i {

    /* renamed from: g, reason: collision with root package name */
    public static final z f64659g = new z(12, 0);

    /* renamed from: c, reason: collision with root package name */
    public final da1.c f64660c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f64661d;

    /* renamed from: e, reason: collision with root package name */
    public final k92.l f64662e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f64663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(da1.c claimSuccessSEP, d0 pinalyticsSEP, k92.l toastSEP, m3 experiments, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(claimSuccessSEP, "claimSuccessSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f64660c = claimSuccessSEP;
        this.f64661d = pinalyticsSEP;
        this.f64662e = toastSEP;
        a0 a0Var = new a0(scope);
        f0 stateTransformer = new f0(new lt.j(2), experiments);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f64663f = a0.b(a0Var, new w(new l0(f64659g.e(), 2), null), new q91.h(this, 19), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f64663f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f64663f.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        da1.c cVar = this.f64660c;
        int i13 = cVar.f54228a;
        Object obj = cVar.f54231d;
        switch (i13) {
            case 0:
                ((xj2.b) obj).dispose();
                break;
            default:
                ((xj2.b) obj).dispose();
                break;
        }
        super.g();
    }
}
