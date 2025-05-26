package aa1;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final p70.e f1683c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f1684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 scope, Application application, lt.j stateTransformer, p70.e claimedTargetAccountSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stateTransformer, "claimedTargetAccountStateTransformer");
        Intrinsics.checkNotNullParameter(claimedTargetAccountSEP, "claimedTargetAccountSEP");
        this.f1683c = claimedTargetAccountSEP;
        l82.a0 a0Var = new l82.a0(scope);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f1684d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f1684d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f1684d.e();
    }

    public final void h() {
        l82.y.i(this.f1684d, y.f1682a, false, new q91.h(this, 11), 2);
    }
}
