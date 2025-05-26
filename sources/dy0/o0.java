package dy0;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final ey0.g f56608c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f56609d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f56610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Application application, ao2.j0 scope, ey0.g nuxEndSEP, zy.d0 pinalyticsSEP, ob0.a crashReporter) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(nuxEndSEP, "nuxEndSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f56608c = nuxEndSEP;
        this.f56609d = pinalyticsSEP;
        l82.a0 a0Var = new l82.a0(scope);
        m0 stateTransformer = new m0(new lt.j(2), crashReporter);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f56610e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f56610e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f56610e.e();
    }

    public final void h(h32.i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        l82.y.i(this.f56610e, new n0(new zy.l0(pinalyticsContext, 2), false), false, new dx0.d(this, 8), 2);
    }
}
