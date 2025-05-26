package sv;

import android.app.Application;
import ao2.j0;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import zy.l0;
import zy.q0;

/* loaded from: classes3.dex */
public final class g extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final tv.e f115289c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f115290d;

    /* renamed from: e, reason: collision with root package name */
    public final w60.d f115291e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f115292f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tv.e cutoutLoadingSEP, q0 unscopedPinalyticsSEPFactory, w60.d screenNavigatorSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(cutoutLoadingSEP, "cutoutLoadingSEP");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f115289c = cutoutLoadingSEP;
        this.f115290d = unscopedPinalyticsSEPFactory;
        this.f115291e = screenNavigatorSEP;
        l82.a0 a0Var = new l82.a0(scope);
        a0 stateTransformer = new a0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f115292f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f115292f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f115292f.e();
    }

    public final void h(String collageId, String tappedCutoutItemId, i0 loggingContext, String str, String str2, String rootPinId, String cutoutSelectedPinId) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(tappedCutoutItemId, "tappedCutoutItemId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(rootPinId, "rootPinId");
        Intrinsics.checkNotNullParameter(cutoutSelectedPinId, "cutoutSelectedPinId");
        l82.y.i(this.f115292f, new c0(collageId, tappedCutoutItemId, new l0(loggingContext, str), str2, rootPinId, 0, cutoutSelectedPinId), false, new wt.c(this, 15), 2);
    }
}
