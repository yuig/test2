package v91;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes5.dex */
public final class v extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w91.f f125012c;

    /* renamed from: d, reason: collision with root package name */
    public final k92.l f125013d;

    /* renamed from: e, reason: collision with root package name */
    public final y f125014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Application application, j0 scope, w91.f autoOrgOptInSEP, k92.l toastSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(autoOrgOptInSEP, "autoOrgOptInSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f125012c = autoOrgOptInSEP;
        this.f125013d = toastSEP;
        a0 a0Var = new a0(scope);
        t stateTransformer = new t();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f125014e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f125014e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f125014e.e();
    }

    public final void h(String socialAccountType) {
        Intrinsics.checkNotNullParameter(socialAccountType, "socialAccountType");
        y.i(this.f125014e, new u(socialAccountType, false), false, new q91.h(this, 4), 2);
    }
}
