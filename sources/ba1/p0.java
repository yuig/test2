package ba1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import w41.q1;

/* loaded from: classes5.dex */
public final class p0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w60.d f22390c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f22391d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f22392e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f22393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ao2.j0 scope, Application application, w60.d listClaimedAccountsSEP, g claimedAccountPageLoader, e0 listClaimedAccountsRequestsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(listClaimedAccountsSEP, "listClaimedAccountsSEP");
        Intrinsics.checkNotNullParameter(claimedAccountPageLoader, "claimedAccountPageLoader");
        Intrinsics.checkNotNullParameter(listClaimedAccountsRequestsSEP, "listClaimedAccountsRequestsSEP");
        this.f22390c = listClaimedAccountsSEP;
        this.f22391d = listClaimedAccountsRequestsSEP;
        kv0.p pVar = new kv0.p(4);
        q1 q1Var = new q1(2);
        bt0.u uVar = new bt0.u(19);
        Intrinsics.checkNotNullParameter(claimedAccountPageLoader, "<this>");
        kv0.p.b(pVar, q1Var, uVar, new o82.h(claimedAccountPageLoader), false, null, null, null, null, "ACCOUNT_SECTION_ID", null, 760);
        g01.a d2 = pVar.d();
        this.f22392e = d2;
        l82.a0 a0Var = new l82.a0(scope);
        tx0.x stateTransformer = new tx0.x((o82.i0) d2.f63224a, 1);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f22393f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f22393f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f22393f.e();
    }

    @Override // l82.b, androidx.lifecycle.l1
    public final void g() {
        this.f22391d.f22359c.dispose();
        super.g();
    }

    public final void h() {
        l82.y.i(this.f22393f, new o0(null, 7), false, new q91.h(this, 14), 2);
    }
}
