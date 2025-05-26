package p91;

import a.cb;
import android.view.View;
import com.google.android.recaptcha.RecaptchaAction;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.account.view.PasswordEditView;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.m3;
import lh0.z3;
import q91.g1;
import x81.h0;

/* loaded from: classes5.dex */
public final class c0 extends yk1.t {

    /* renamed from: a, reason: collision with root package name */
    public final l91.f f99261a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f99262b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f99263c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.w f99264d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99265e;

    /* renamed from: f, reason: collision with root package name */
    public final c60.d f99266f;

    /* renamed from: g, reason: collision with root package name */
    public final a60.a f99267g;

    /* renamed from: h, reason: collision with root package name */
    public final m3 f99268h;

    /* renamed from: i, reason: collision with root package name */
    public final tb.l f99269i;

    /* renamed from: j, reason: collision with root package name */
    public final mr1.c f99270j;

    /* renamed from: k, reason: collision with root package name */
    public final or1.i f99271k;

    /* renamed from: l, reason: collision with root package name */
    public final ox.b f99272l;

    /* renamed from: m, reason: collision with root package name */
    public final r42.j f99273m;

    /* renamed from: n, reason: collision with root package name */
    public final rr1.g f99274n;

    /* renamed from: o, reason: collision with root package name */
    public final uk2.f f99275o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(uk1.d pinalytics, uj2.q networkStateStream, l91.f passwordMode, cr1.a accountService, b60.b activeUserManager, m60.w eventManager, boolean z13, m3 experiments, tb.l pinterestKeychain, mr1.b activityProvider, or1.i authLoggingUtils, ox.b analyticsApi, r42.j recaptchaTokenGenerator, rr1.g passwordValidationUtils) {
        super(pinalytics, networkStateStream);
        c60.d apiAuthManager = c60.d.f26513a;
        a60.a myUserAccounts = a60.a.f905a;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(passwordMode, "passwordMode");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(apiAuthManager, "apiAuthManager");
        Intrinsics.checkNotNullParameter(myUserAccounts, "myUserAccounts");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinterestKeychain, "pinterestKeychain");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(recaptchaTokenGenerator, "recaptchaTokenGenerator");
        Intrinsics.checkNotNullParameter(passwordValidationUtils, "passwordValidationUtils");
        this.f99261a = passwordMode;
        this.f99262b = accountService;
        this.f99263c = activeUserManager;
        this.f99264d = eventManager;
        this.f99265e = z13;
        this.f99266f = apiAuthManager;
        this.f99267g = myUserAccounts;
        this.f99268h = experiments;
        this.f99269i = pinterestKeychain;
        this.f99270j = activityProvider;
        this.f99271k = authLoggingUtils;
        this.f99272l = analyticsApi;
        this.f99273m = recaptchaTokenGenerator;
        this.f99274n = passwordValidationUtils;
        this.f99275o = cb.r("create(...)");
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(l91.j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        g1 g1Var = (g1) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        g1Var.A0 = this;
        int i13 = z.f99346a[this.f99261a.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            PasswordEditView passwordEditView = g1Var.f103117s0;
            if (passwordEditView != null) {
                passwordEditView.setVisibility(0);
                return;
            } else {
                Intrinsics.r("currentPasswordView");
                throw null;
            }
        }
        PasswordEditView passwordEditView2 = g1Var.f103117s0;
        if (passwordEditView2 == null) {
            Intrinsics.r("currentPasswordView");
            throw null;
        }
        passwordEditView2.setVisibility(8);
        if (this.f99265e) {
            View view2 = g1Var.f103122x0;
            if (view2 != null) {
                view2.setVisibility(0);
            } else {
                Intrinsics.r("mfaPasswordDisclaimerView");
                throw null;
            }
        }
    }

    public final void q3(String currentPassword, String newPassword, String confirmPassword, String str) {
        uj2.b0 mVar;
        Intrinsics.checkNotNullParameter(currentPassword, "currentPassword");
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        m3 m3Var = this.f99268h;
        m3Var.getClass();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) m3Var.f83424a;
        int i13 = 0;
        if (g1Var.o("android_change_password_recaptcha_token_generation", "enabled", z3Var) || g1Var.l("android_change_password_recaptcha_token_generation")) {
            RecaptchaAction recaptchaAction = com.pinterest.security.h.f51755d;
            wy0 f13 = ((b60.d) this.f99263c).f();
            String uid = f13 != null ? f13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            mVar = new kk2.m(this.f99273m.a(recaptchaAction, this.f99272l, uid, new i1.h(this, 18)), new t81.a(13, new e.c((Object) this, currentPassword, (Object) newPassword, (Object) confirmPassword, (Object) str, 12)), 0);
        } else {
            mVar = this.f99262b.s(this.f99261a == l91.f.UPDATE ? currentPassword : null, newPassword, confirmPassword, str, null).r(tk2.e.f118017c);
        }
        int i14 = 2;
        xj2.c o13 = new kk2.m(new kk2.g(new kk2.h(new kk2.g(mVar.l(wj2.c.a()), new h0(29, new a0(this, i13)), 2), new g51.h(this, i14), 1), new y(0, new a0(this, 1)), 3), new t81.a(14, new y71.b(5, this, newPassword)), 0).o(new y(1, new a0(this, i14)), new y(2, new b0(this, currentPassword, newPassword, confirmPassword, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void s3(String currentPassword, String newPassword, String confirmPassword) {
        Intrinsics.checkNotNullParameter(currentPassword, "currentPassword");
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        Intrinsics.checkNotNullParameter(confirmPassword, "confirmPassword");
        boolean j13 = kotlin.text.z.j(newPassword);
        rr1.g gVar = this.f99274n;
        boolean z13 = j13 || gVar.c(newPassword, false);
        boolean z14 = kotlin.text.z.j(confirmPassword) || Intrinsics.d(newPassword, confirmPassword);
        ((g1) ((l91.j) getView())).e8(newPassword.length() > 0 && confirmPassword.length() > 0 && (this.f99261a == l91.f.CREATE || gVar.b(currentPassword)) && z13 && z14);
        g1 g1Var = (g1) ((l91.j) getView());
        g1Var.getClass();
        Integer valueOf = !z13 ? Integer.valueOf(b52.c.your_password_too_short) : null;
        Integer valueOf2 = !z14 ? Integer.valueOf(b52.c.your_password_not_match) : null;
        PasswordEditView passwordEditView = g1Var.f103119u0;
        if (passwordEditView == null) {
            Intrinsics.r("newPasswordView");
            throw null;
        }
        passwordEditView.l(valueOf);
        PasswordEditView passwordEditView2 = g1Var.f103120v0;
        if (passwordEditView2 != null) {
            passwordEditView2.l(valueOf2);
        } else {
            Intrinsics.r("confirmPasswordView");
            throw null;
        }
    }

    public final void t3(String currentPassword, vr1.b newPasswordInput) {
        Intrinsics.checkNotNullParameter(currentPassword, "currentPassword");
        Intrinsics.checkNotNullParameter(newPasswordInput, "newPasswordInput");
        ((g1) ((l91.j) getView())).e8(newPasswordInput.f126458b && (this.f99261a == l91.f.CREATE || this.f99274n.b(currentPassword)));
    }
}
