package z91;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;

/* loaded from: classes5.dex */
public final class v extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final p70.e f141402c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f141403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j0 scope, Application application, lt.j stateTransformer, p70.e claimedAmazonAccountSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stateTransformer, "claimedAmazonAccountStateTransformer");
        Intrinsics.checkNotNullParameter(claimedAmazonAccountSEP, "claimedAmazonAccountSEP");
        this.f141402c = claimedAmazonAccountSEP;
        a0 a0Var = new a0(scope);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f141403d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f141403d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f141403d.e();
    }

    public final void h() {
        l82.y.i(this.f141403d, u.f141401a, false, new q91.h(this, 8), 2);
    }
}
