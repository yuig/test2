package ea1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;

/* loaded from: classes5.dex */
public final class q1 extends l82.b implements l82.i {

    /* renamed from: i, reason: collision with root package name */
    public static final n91.z f58117i = new n91.z(9, 0);

    /* renamed from: c, reason: collision with root package name */
    public final fa1.n f58118c;

    /* renamed from: d, reason: collision with root package name */
    public final k92.l f58119d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f58120e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f58121f;

    /* renamed from: g, reason: collision with root package name */
    public final zb0.i f58122g;

    /* renamed from: h, reason: collision with root package name */
    public final l82.y f58123h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(fa1.n claimRedesignSEP, k92.l toastSEP, zy.d0 pinalyticsSEP, w60.d navigationSEP, zb0.i alertSEP, m3 experiments, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(claimRedesignSEP, "claimRedesignSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f58118c = claimRedesignSEP;
        this.f58119d = toastSEP;
        this.f58120e = pinalyticsSEP;
        this.f58121f = navigationSEP;
        this.f58122g = alertSEP;
        l82.a0 a0Var = new l82.a0(scope);
        o1 stateTransformer = new o1(new lt.j(2), experiments);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f58123h = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f58123h.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f58123h.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        fa1.n nVar = this.f58118c;
        e82.f fVar = nVar.f61582c;
        fVar.f57834d = null;
        fVar.f57835e = null;
        fVar.f57836f = null;
        fVar.f57837g = false;
        fVar.f57838h = false;
        ek2.j jVar = nVar.f61585f;
        if (jVar != null && !jVar.isDisposed()) {
            bk2.c.dispose(jVar);
        }
        ek2.j jVar2 = nVar.f61586g;
        if (jVar2 != null && !jVar2.isDisposed()) {
            bk2.c.dispose(jVar2);
        }
        nVar.f61587h.dispose();
        super.g();
    }

    public final void h(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        l82.y.i(this.f58123h, new p1(new zy.l0(f58117i.e(), 2), false, network, null, null, false, false, false, false, false, false), false, new q91.h(this, 18), 2);
    }
}
