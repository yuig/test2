package zq1;

import h32.u0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import so.oa;
import so.s8;
import yq1.o2;
import yq1.x1;
import yq1.y1;

/* loaded from: classes4.dex */
public final class f0 extends yk1.t implements z {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.f0 f142668a;

    /* renamed from: b, reason: collision with root package name */
    public final mr1.c f142669b;

    /* renamed from: c, reason: collision with root package name */
    public final lb2.q f142670c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.w f142671d;

    /* renamed from: e, reason: collision with root package name */
    public final com.pinterest.identity.authentication.a f142672e;

    /* renamed from: f, reason: collision with root package name */
    public final vy.m f142673f;

    /* renamed from: g, reason: collision with root package name */
    public final dy.d f142674g;

    /* renamed from: h, reason: collision with root package name */
    public final so.b0 f142675h;

    /* renamed from: i, reason: collision with root package name */
    public final so.c0 f142676i;

    /* renamed from: j, reason: collision with root package name */
    public final fr1.c f142677j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(uk1.d pinalytics, uj2.q networkStateStream, qr1.f0 signupType, mr1.b activityProvider, lb2.q authManager, m60.w eventManager, com.pinterest.identity.authentication.a authNavigationHelper, vy.m analyticsApi, dy.d firebaseAnalyticsEvents, so.b0 pinterestSignupFactory, so.c0 businessSignupFactory, fr1.c complianceManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(signupType, "signupType");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEvents, "firebaseAnalyticsEvents");
        Intrinsics.checkNotNullParameter(pinterestSignupFactory, "pinterestSignupFactory");
        Intrinsics.checkNotNullParameter(businessSignupFactory, "businessSignupFactory");
        Intrinsics.checkNotNullParameter(complianceManager, "complianceManager");
        this.f142668a = signupType;
        this.f142669b = activityProvider;
        this.f142670c = authManager;
        this.f142671d = eventManager;
        this.f142672e = authNavigationHelper;
        this.f142673f = analyticsApi;
        this.f142674g = firebaseAnalyticsEvents;
        this.f142675h = pinterestSignupFactory;
        this.f142676i = businessSignupFactory;
        this.f142677j = complianceManager;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        a0 view = (a0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((y1) view).f140076p0 = this;
    }

    public final void p3(ar1.d step) {
        ar1.d dVar;
        Intrinsics.checkNotNullParameter(step, "step");
        getPinalytics().f0(u0.BACK_BUTTON, null, null, null, false);
        y1 y1Var = (y1) ((a0) getView());
        int i13 = x1.f140055a[y1Var.f140077q0.ordinal()];
        if (i13 == 1) {
            y1Var.P7();
            return;
        }
        if (i13 == 2) {
            dVar = ar1.d.EMAIL_STEP;
        } else if (i13 == 3) {
            dVar = ar1.d.PASSWORD_STEP;
        } else if (i13 == 4) {
            dVar = ar1.d.NAME_STEP;
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = ar1.d.BIRTHDAY_STEP;
        }
        y1Var.f140077q0 = dVar;
        y1Var.c8(dVar);
    }

    public final void q3(String str, String str2, String str3, long j13, Boolean bool, Boolean bool2) {
        List split$default;
        String str4;
        int i13;
        sr1.l lVar;
        int i14 = 0;
        split$default = StringsKt__StringsKt.split$default(str3, new String[]{" "}, false, 0, 6, null);
        String str5 = (String) split$default.get(0);
        if (Intrinsics.d(str3, str5)) {
            str4 = "";
        } else {
            str4 = str3.substring(str5.length());
            Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
        }
        int i15 = d0.f142662a[this.f142668a.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i13 = 2;
            s8 s8Var = this.f142675h.f113341a.f114091b;
            sr1.l hVar = new sr1.h(str5, str4, str, j13, str2, bool, bool2);
            oa oaVar = s8Var.f114255d;
            hVar.f115120e = (cr1.b) oaVar.Z5.get();
            hVar.f115121f = (or1.i) oaVar.f114015y5.get();
            hVar.f115122g = (b60.b) oaVar.f113850p0.get();
            hVar.f115123h = (tr1.a) oaVar.f113734i6.get();
            hVar.f115124i = (fr1.c) oaVar.f113821n6.get();
            lVar = hVar;
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String a13 = tr1.b.a(str);
            s8 s8Var2 = this.f142676i.f113356a.f114091b;
            sr1.l bVar = new sr1.b(str2, str5, str4, str, j13, a13, bool, bool2);
            oa oaVar2 = s8Var2.f114255d;
            bVar.f115120e = (cr1.b) oaVar2.Z5.get();
            bVar.f115121f = (or1.i) oaVar2.f114015y5.get();
            bVar.f115122g = (b60.b) oaVar2.f113850p0.get();
            bVar.f115123h = (tr1.a) oaVar2.f113734i6.get();
            bVar.f115124i = (fr1.c) oaVar2.f113821n6.get();
            lVar = bVar;
            i13 = 2;
        }
        xj2.c o13 = new kk2.h(new kk2.g(this.f142670c.c(lVar, this.f142669b), new c0(1, new e0(this, i14)), i13), new b0(this, 1), 1).o(new c0(i13, new e0(this, i16)), new c0(3, new e0(this, i13)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void r3(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        new kk2.h(new kk2.g(this.f142670c.g(email), new o2(28, new e0(this, 3)), 2), new b0(this, 0), 1).o(new o2(29, new xm1.k(23, this, email)), new c0(0, new e0(this, 4)));
    }

    public final void s3() {
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        ((y1) ((a0) getView())).c8(ar1.d.BIRTHDAY_STEP);
    }

    public final void t3() {
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        ((y1) ((a0) getView())).c8(ar1.d.NAME_STEP);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        a0 view = (a0) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "presenter");
        ((y1) view).f140076p0 = this;
    }
}
