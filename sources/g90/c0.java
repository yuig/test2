package g90;

import android.app.Application;
import ao2.j0;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import zy.l0;
import zy.q0;

/* loaded from: classes5.dex */
public final class c0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ws.q f64516c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f64517d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f64518e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f64519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ws.q cutoutLoadingSEP, w60.d screenNavigatorSEP, q0 unscopedPinalyticsSEPFactory, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(cutoutLoadingSEP, "cutoutLoadingSEP");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f64516c = cutoutLoadingSEP;
        this.f64517d = screenNavigatorSEP;
        this.f64518e = unscopedPinalyticsSEPFactory;
        l82.a0 a0Var = new l82.a0(scope);
        a0 stateTransformer = new a0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f64519f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f64519f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f64519f.e();
    }

    public final void h(i0 loggingContext, String collageId, String tappedCutoutItemId, String str, String str2, String rootPinId, boolean z13) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(tappedCutoutItemId, "tappedCutoutItemId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(rootPinId, "rootPinId");
        l82.y.i(this.f64519f, new b0(collageId, tappedCutoutItemId, new l0(loggingContext, str), z13, str2, rootPinId), false, new mz.c(this, 26), 2);
    }
}
