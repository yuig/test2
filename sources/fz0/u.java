package fz0;

import android.app.Application;
import ao2.j0;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import zy.l0;

/* loaded from: classes5.dex */
public final class u extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final mb0.a f63155c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f63156d;

    /* renamed from: e, reason: collision with root package name */
    public final i60.a f63157e;

    /* renamed from: f, reason: collision with root package name */
    public final y f63158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mb0.a pearQuizLoaderSEP, w60.d navigationSEP, i60.a pearQuizLoggingSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(pearQuizLoaderSEP, "pearQuizLoaderSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(pearQuizLoggingSEP, "pearQuizLoggingSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f63155c = pearQuizLoaderSEP;
        this.f63156d = navigationSEP;
        this.f63157e = pearQuizLoggingSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(16, "stateTransformer");
        a0Var.c(this, application);
        this.f63158f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f63158f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f63158f.e();
    }

    public final void h(i0 pinalyticsContext, String quizId, String referrer, boolean z13) {
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        y.i(this.f63158f, new t(quizId, z13, referrer, new l0(pinalyticsContext, 2)), false, new dx0.d(this, 15), 2);
    }
}
