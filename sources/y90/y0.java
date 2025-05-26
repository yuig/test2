package y90;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final zy.d0 f138272c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f138273d;

    /* renamed from: e, reason: collision with root package name */
    public final ba0.e f138274e;

    /* renamed from: f, reason: collision with root package name */
    public final sa0.y f138275f;

    /* renamed from: g, reason: collision with root package name */
    public final k92.l f138276g;

    /* renamed from: h, reason: collision with root package name */
    public final o22.g f138277h;

    /* renamed from: i, reason: collision with root package name */
    public final lh0.h0 f138278i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f138279j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(zy.d0 pinalyticsSEP, w60.d navigatorSEP, ba0.e collageEffectsSEP, sa0.y cutoutRepinPrepSEP, k92.l toastSEP, o22.g experimentSEP, lh0.h0 experiments, Application application, ao2.j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(navigatorSEP, "navigatorSEP");
        Intrinsics.checkNotNullParameter(collageEffectsSEP, "collageEffectsSEP");
        Intrinsics.checkNotNullParameter(cutoutRepinPrepSEP, "cutoutRepinPrepSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(experimentSEP, "experimentSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f138272c = pinalyticsSEP;
        this.f138273d = navigatorSEP;
        this.f138274e = collageEffectsSEP;
        this.f138275f = cutoutRepinPrepSEP;
        this.f138276g = toastSEP;
        this.f138277h = experimentSEP;
        this.f138278i = experiments;
        l82.a0 a0Var = new l82.a0(scope);
        w0 stateTransformer = new w0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f138279j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f138279j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f138279j.e();
    }

    public final void h(h32.i0 loggingContext, String itemId, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f138279j, new x0(itemId, new zy.l0(loggingContext, str), !z13, ((lh0.g1) this.f138278i.f83377a).j()), false, new r0(this, 2), 2);
    }
}
