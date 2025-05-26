package zq1;

import a.cb;
import android.content.res.Resources;
import androidx.fragment.app.w0;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.identity.authentication.AuthenticationLocation;
import com.pinterest.identity.core.error.UnauthException;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import h32.u0;
import java.util.Map;
import kh2.k3;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.y1;
import lh0.z3;
import m60.x0;
import v.f1;
import yq1.o2;

/* loaded from: classes4.dex */
public final class o extends yk1.t implements p {

    /* renamed from: a, reason: collision with root package name */
    public final i92.k f142713a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.identity.authentication.a f142714b;

    /* renamed from: c, reason: collision with root package name */
    public final cr1.a f142715c;

    /* renamed from: d, reason: collision with root package name */
    public final Resources f142716d;

    /* renamed from: e, reason: collision with root package name */
    public final mr1.a f142717e;

    /* renamed from: f, reason: collision with root package name */
    public final lb2.q f142718f;

    /* renamed from: g, reason: collision with root package name */
    public final y1 f142719g;

    /* renamed from: h, reason: collision with root package name */
    public final tb.l f142720h;

    /* renamed from: i, reason: collision with root package name */
    public final mr1.c f142721i;

    /* renamed from: j, reason: collision with root package name */
    public final b60.b f142722j;

    /* renamed from: k, reason: collision with root package name */
    public final or1.i f142723k;

    /* renamed from: l, reason: collision with root package name */
    public final ox.b f142724l;

    /* renamed from: m, reason: collision with root package name */
    public final r42.j f142725m;

    /* renamed from: n, reason: collision with root package name */
    public final uk2.f f142726n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i92.k toastUtils, com.pinterest.identity.authentication.a authNavigationHelper, cr1.a accountService, Resources resources, uk1.d pinalytics, uj2.q networkStateStream, mr1.a accountSwitcher, lb2.q authManager, y1 experiments, tb.l pinterestKeychain, mr1.b activityProvider, b60.b activeUserManager, or1.i authLoggingUtils, ox.b analyticsApi, r42.j recaptchaTokenGenerator) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinterestKeychain, "pinterestKeychain");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(recaptchaTokenGenerator, "recaptchaTokenGenerator");
        this.f142713a = toastUtils;
        this.f142714b = authNavigationHelper;
        this.f142715c = accountService;
        this.f142716d = resources;
        this.f142717e = accountSwitcher;
        this.f142718f = authManager;
        this.f142719g = experiments;
        this.f142720h = pinterestKeychain;
        this.f142721i = activityProvider;
        this.f142722j = activeUserManager;
        this.f142723k = authLoggingUtils;
        this.f142724l = analyticsApi;
        this.f142725m = recaptchaTokenGenerator;
        this.f142726n = cb.r("create(...)");
    }

    public static final void p3(o oVar, Throwable th3, Map params) {
        String th4;
        qz.d M;
        qz.d M2;
        oVar.getClass();
        String str = (String) params.get("username");
        boolean containsKey = params.containsKey("google_id_token");
        u0 u0Var = containsKey ? u0.GOOGLE_CONTINUE_BUTTON : u0.LOGIN_BUTTON;
        boolean z13 = th3 instanceof NetworkResponseError;
        if (z13) {
            NetworkResponseError networkResponseError = (NetworkResponseError) th3;
            f1 f1Var = networkResponseError.f45043a;
            Integer valueOf = f1Var != null ? Integer.valueOf(f1Var.f123449b) : null;
            f1 f1Var2 = networkResponseError.f45043a;
            th4 = (f1Var2 == null || (M2 = k3.M(f1Var2)) == null) ? null : M2.e();
            if (th4 == null) {
                th4 = "";
            }
            if (valueOf != null && valueOf.intValue() == 400) {
                th4 = "old_email_token";
            } else if (containsKey && valueOf != null && valueOf.intValue() == 500) {
                th4 = "using_someone_else_account_or_other_api_error";
            } else if (!j1.U0(th4)) {
                Integer valueOf2 = f1Var2 != null ? Integer.valueOf(f1Var2.f123449b) : null;
                th4 = "Status Code: " + valueOf2 + ", Message: " + th3.getMessage() + ", Error: " + th3;
            }
        } else if (j1.U0(th3.getMessage())) {
            th4 = th3.getMessage();
            if (th4 == null) {
                th4 = "Empty throwable message";
            }
        } else {
            th4 = th3.toString();
        }
        oVar.getPinalytics().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.UNAUTH_ACCOUNT_RECOVERY_FAILURE, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : h32.g0.FB_RECOVER_LOGIN_FORM, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : ep.b.o("fail_reason", th4), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        boolean z14 = th3 instanceof UnauthException;
        com.pinterest.identity.authentication.a aVar = oVar.f142714b;
        if (z14) {
            aVar.a(false, th3);
            return;
        }
        i92.k kVar = oVar.f142713a;
        if (!z13) {
            kVar.h(x0.generic_error);
            return;
        }
        f1 f1Var3 = ((NetworkResponseError) th3).f45043a;
        if (f1Var3 == null || (M = k3.M(f1Var3)) == null) {
            return;
        }
        if (r91.b.c(th3)) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            androidx.appcompat.app.n nVar = aVar.f49817b;
            mu1.a aVar2 = (mu1.a) d7.b.R(nVar);
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(jh1.f.class, "fragmentClass");
            jh1.f fVar = (jh1.f) aVar2.f(jh1.f.class);
            kh2.b0.L(fVar, new rr1.h(params));
            w0 supportFragmentManager = nVar.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            mo1.c.c(supportFragmentManager, vq1.b.fragment_wrapper, fVar, true, null, 48);
            return;
        }
        if (M.f105387g != 1201) {
            String str2 = M.f105384d;
            if (str2 == null) {
                str2 = oVar.f142716d.getString(x0.generic_error);
            }
            kVar.i(str2);
            return;
        }
        yq1.u uVar = (yq1.u) ((q) oVar.getView());
        uVar.getClass();
        NavigationImpl w13 = Navigation.w1(AuthenticationLocation.UNAUTH_LOGIN_SCREEN);
        w13.m0("EXTRA_EMAIL", str);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        uVar.M1(w13);
    }

    public final void q3(Map passwordParams) {
        Intrinsics.checkNotNullParameter(passwordParams, "passwordParams");
        int i13 = 1;
        xj2.c o13 = new kk2.h(new kk2.g(this.f142715c.n(passwordParams).l(wj2.c.a()).r(tk2.e.f118017c), new o2(18, new l(this, 0)), 2), new k(this, i13), 1).o(new o2(19, new l(this, i13)), new o2(20, m.f142706j));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // yk1.p
    public final void r3(q view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((yq1.u) view).A0 = this;
        nx.d0.B(getPinalytics(), h32.f1.VIEW, h32.g0.FB_RECOVER_LOGIN_FORM, null, null, 28);
    }

    public final void s3(Map params) {
        uj2.b0 mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        y1 y1Var = this.f142719g;
        y1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) y1Var.f83514a;
        int i13 = 2;
        int i14 = 0;
        if (g1Var.o("android_reset_password_recaptcha_token_generation", "enabled", z3Var) || g1Var.l("android_reset_password_recaptcha_token_generation")) {
            RecaptchaAction recaptchaAction = com.pinterest.security.h.f51756e;
            wy0 f13 = ((b60.d) this.f142722j).f();
            String uid = f13 != null ? f13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            mVar = new kk2.m(this.f142725m.a(recaptchaAction, this.f142724l, uid, new mm1.g(this, i13)), new oo1.d(6, new n(this, params, i13)), 0);
        } else {
            mVar = this.f142715c.u(params).r(tk2.e.f118017c);
        }
        xj2.c o13 = new kk2.m(new kk2.g(new kk2.h(new kk2.g(new kk2.m(mVar.l(wj2.c.a()), new oo1.d(7, new l(this, i13)), 0).k(new oo1.d(8, m.f142707k)), new o2(12, new l(this, 3)), 2), new k(this, i14), 1), new o2(13, new qf1.f0(this, params.containsKey("google_id_token"), 10)), 3), new oo1.d(9, new n(this, params, i14)), 0).o(new o2(14, new l(this, 4)), new o2(15, new n(this, params, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void t3(Map passwordParams) {
        Intrinsics.checkNotNullParameter(passwordParams, "passwordParams");
        getPinalytics().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.CLICK, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : h32.g0.FB_RECOVER_LOGIN_FORM, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        lr1.h authMethodType = lr1.h.GoogleUnifiedAuthMethod;
        lb2.q qVar = this.f142718f;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(authMethodType, "authMethodType");
        mr1.c activityProvider = this.f142721i;
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        lr1.g a13 = qVar.e(activityProvider).a(authMethodType, null);
        qVar.f82806f.g(h32.f1.CLIENT_AUTH_INITIATED, null, bs1.c.o(new Pair("auth_handler", a13.a())), false);
        b20.c cVar = a13.f84605e;
        if (cVar == null) {
            Intrinsics.r("unauthKillSwitch");
            throw null;
        }
        qr1.m mVar = a13.f84601a;
        kk2.t l13 = (cVar.o(mVar) ? a13.d() : uj2.b0.g(new UnauthException.AuthServiceNotAvailableError(mVar))).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        l13.r(tk2.e.f118017c).l(wj2.c.a()).o(new o2(16, new n(passwordParams, this, 3)), new o2(17, new n(passwordParams, this, 4)));
    }

    public final void u3() {
        getPinalytics().h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.CLICK, (r18 & 2) != 0 ? null : u0.CREATE_PASSWORD_BUTTON, (r18 & 4) != 0 ? null : h32.g0.FB_RECOVER_LOGIN_FORM, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }
}
