package zq1;

import c2.m4;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import so.s8;
import yq1.a1;
import yq1.b1;
import yq1.o2;
import yq1.u1;

/* loaded from: classes4.dex */
public final class y extends yk1.t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f142740a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.identity.authentication.a f142741b;

    /* renamed from: c, reason: collision with root package name */
    public final lb2.q f142742c;

    /* renamed from: d, reason: collision with root package name */
    public final so.j0 f142743d;

    /* renamed from: e, reason: collision with root package name */
    public final fr1.c f142744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(uk1.d pinalytics, uj2.q networkStateStream, mr1.b activityProvider, com.pinterest.identity.authentication.a authNavigationHelper, lb2.q authManager, so.j0 pendingAgeSignupFactory, fr1.c complianceManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(pendingAgeSignupFactory, "pendingAgeSignupFactory");
        Intrinsics.checkNotNullParameter(complianceManager, "complianceManager");
        this.f142740a = activityProvider;
        this.f142741b = authNavigationHelper;
        this.f142742c = authManager;
        this.f142743d = pendingAgeSignupFactory;
        this.f142744e = complianceManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        w view = (w) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((b1) view).f139790o0 = this;
    }

    public final void p3(ar1.d step) {
        Intrinsics.checkNotNullParameter(step, "step");
        getPinalytics().f0(u0.BACK_BUTTON, null, null, null, false);
        b1 b1Var = (b1) ((w) getView());
        int i13 = a1.f139770a[b1Var.f139791p0.ordinal()];
        if (i13 == 1) {
            b1Var.P7();
        } else {
            if (i13 != 2) {
                return;
            }
            ar1.d dVar = ar1.d.BIRTHDAY_STEP;
            b1Var.f139791p0 = dVar;
            b1Var.b8(dVar);
        }
    }

    public final void q3(long j13, sr1.g gVar, int i13, Boolean bool, Boolean bool2) {
        s8 s8Var = this.f142743d.f113471a.f114091b;
        sr1.e eVar = new sr1.e(gVar, j13, bool, bool2);
        oa oaVar = s8Var.f114255d;
        eVar.f115120e = (cr1.b) oaVar.Z5.get();
        eVar.f115121f = (or1.i) oaVar.f114015y5.get();
        eVar.f115122g = (b60.b) oaVar.f113850p0.get();
        eVar.f115123h = (tr1.a) oaVar.f113734i6.get();
        eVar.f115124i = (fr1.c) oaVar.f113821n6.get();
        xj2.c o13 = this.f142742c.c(eVar, this.f142740a).o(new o2(26, new m4(this, i13, 28)), new o2(27, new u1(this, 3)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void r3(long j13, sr1.g pendingSignupData, int i13) {
        Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
        if (!this.f142744e.d(t92.c.KR_SIGNUP_CONSENT)) {
            q3(j13, pendingSignupData, i13, null, null);
            return;
        }
        ((b1) ((w) getView())).b8(ar1.d.KOREA_CONSENT_STEP);
    }

    public final void s3(long j13, sr1.g pendingSignupData, int i13, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
        q3(j13, pendingSignupData, i13, Boolean.valueOf(z13), Boolean.valueOf(z14));
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        w view = (w) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((b1) view).f139790o0 = this;
    }
}
