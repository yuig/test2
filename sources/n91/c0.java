package n91;

import android.app.Application;
import ao2.j0;
import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final o91.e f90036c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f90037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Application application, j0 scope, o91.e emailOTPConfirmationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(emailOTPConfirmationSEP, "emailOTPConfirmationSEP");
        this.f90036c = emailOTPConfirmationSEP;
        l82.a0 a0Var = new l82.a0(scope);
        a0 stateTransformer = new a0();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f90037d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f90037d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f90037d.e();
    }

    public final void h(i0 pinalyticsContext, String newEmailAddress, HashMap priorRequestCache) {
        Intrinsics.checkNotNullParameter(newEmailAddress, "newEmailAddress");
        Intrinsics.checkNotNullParameter(priorRequestCache, "priorRequestCache");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        l82.y.i(this.f90037d, new b0(priorRequestCache, newEmailAddress, pinalyticsContext, ""), false, new j41.i(this, 27), 2);
    }
}
