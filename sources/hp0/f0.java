package hp0;

import android.app.Application;
import ao2.j0;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import zy.l0;
import zy.q0;

/* loaded from: classes5.dex */
public final class f0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ws.q f69834c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f69835d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f69836e;

    /* renamed from: f, reason: collision with root package name */
    public final mb0.a f69837f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f69838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Application application, j0 scope, ws.q qcmDrawerLoadingSEP, w60.d screenNavigatorSEP, q0 unscopedPinalyticsSEPFactory, mb0.a qcmDrawerJsonLoggerSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(qcmDrawerLoadingSEP, "qcmDrawerLoadingSEP");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(qcmDrawerJsonLoggerSEP, "qcmDrawerJsonLoggerSEP");
        this.f69834c = qcmDrawerLoadingSEP;
        this.f69835d = screenNavigatorSEP;
        this.f69836e = unscopedPinalyticsSEPFactory;
        this.f69837f = qcmDrawerJsonLoggerSEP;
        l82.a0 a0Var = new l82.a0(scope);
        a0Var.f82204b = d7.g.n(10, "stateTransformer");
        a0Var.c(this, application);
        this.f69838g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f69838g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f69838g.e();
    }

    public final void h(String rootPinUid, String tappedPinItemId, i0 loggingContext, String str) {
        Intrinsics.checkNotNullParameter(rootPinUid, "rootPinUid");
        Intrinsics.checkNotNullParameter(tappedPinItemId, "tappedPinItemId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        l82.y.i(this.f69838g, new e0(new l0(loggingContext, str), tappedPinItemId, rootPinUid, true), false, new kl0.t(this, 27), 2);
    }
}
