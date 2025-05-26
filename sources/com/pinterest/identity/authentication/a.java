package com.pinterest.identity.authentication;

import a.cb;
import android.os.Bundle;
import androidx.appcompat.app.n;
import androidx.fragment.app.w0;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.identity.core.error.UnauthException;
import h32.f1;
import i92.k;
import jc0.v;
import ji0.i;
import kh2.b0;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import mo1.d;
import nx.d0;
import qr1.e;
import qr1.f;
import qr1.h;
import qr1.j;
import qr1.l;
import qr1.m;
import sr1.g;
import yq1.b1;
import yq1.y0;
import yq1.z;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f49816a;

    /* renamed from: b, reason: collision with root package name */
    public final n f49817b;

    /* renamed from: c, reason: collision with root package name */
    public final w f49818c;

    /* renamed from: d, reason: collision with root package name */
    public final mr1.a f49819d;

    /* renamed from: e, reason: collision with root package name */
    public final d f49820e;

    /* renamed from: f, reason: collision with root package name */
    public final lu1.b f49821f;

    /* renamed from: g, reason: collision with root package name */
    public final k f49822g;

    public a(d0 pinalytics, n hostActivity, w eventManager, mr1.a accountSwitcher, d intentHelper, lu1.b activityHelper, k toastUtils) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(activityHelper, "activityHelper");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f49816a = pinalytics;
        this.f49817b = hostActivity;
        this.f49818c = eventManager;
        this.f49819d = accountSwitcher;
        this.f49820e = intentHelper;
        this.f49821f = activityHelper;
        this.f49822g = toastUtils;
    }

    public final void a(boolean z13, Throwable throwable) {
        yb0.n a13;
        String string;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UnauthException.ThirdParty.GoogleOneTap) || (throwable instanceof UnauthException.AuthCanceledError) || (throwable instanceof UnauthException.ThirdParty.SSO.SSOCancelledError)) {
            return;
        }
        boolean z14 = throwable instanceof UnauthException.AuthenticationError.SuspendedAccountError;
        w wVar = this.f49818c;
        if (z14) {
            wVar.g(1000L, new v(new i(), false, 0L, 30));
            return;
        }
        boolean z15 = throwable instanceof UnauthException.AuthenticationError.AgeRequiredForCountryError;
        n nVar = this.f49817b;
        if (z15) {
            g gVar = ((UnauthException.AuthenticationError.AgeRequiredForCountryError) throwable).f49833a;
            mu1.a aVar = (mu1.a) d7.b.R(nVar);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(b1.class, "fragmentClass");
            b1 b1Var = (b1) aVar.f(b1.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_PENDING_SIGNUP_DATA", gVar);
            bundle.putBoolean("EXTRA_IS_GOOGLE_AUTH", z13);
            b1Var.setArguments(bundle);
            w0 supportFragmentManager = nVar.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            mo1.c.c(supportFragmentManager, nVar instanceof MainActivity ? tr.b.main_container : vq1.b.fragment_wrapper, b1Var, true, mo1.a.FADE, 32);
            return;
        }
        int i13 = 1;
        Unit unit = null;
        if (throwable instanceof UnauthException.AuthenticationError.Require2FAError) {
            UnauthException.AuthenticationError.Require2FAError require2FAError = (UnauthException.AuthenticationError.Require2FAError) throwable;
            m mVar = require2FAError.f49836a;
            if (require2FAError.f49838c) {
                return;
            }
            w0 supportFragmentManager2 = nVar.getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "beginTransaction(...)");
            mo1.c.a(aVar2, mo1.a.MODAL);
            int i14 = vq1.b.fragment_wrapper;
            mu1.a aVar3 = (mu1.a) d7.b.R(nVar);
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(y0.class, "fragmentClass");
            y0 y0Var = (y0) aVar3.f(y0.class);
            ph.a.l(y0Var, require2FAError.f49837b, mVar, require2FAError.f49839d);
            aVar2.g(i14, y0Var, null, 1);
            aVar2.c(null);
            aVar2.e(false);
            return;
        }
        if (throwable instanceof UnauthException.AuthenticationError.MissingEmailError) {
            g gVar2 = ((UnauthException.AuthenticationError.MissingEmailError) throwable).f49835a;
            w0 supportFragmentManager3 = nVar.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
            int i15 = vq1.b.fragment_wrapper;
            mu1.a aVar4 = (mu1.a) d7.b.R(nVar);
            aVar4.getClass();
            Intrinsics.checkNotNullParameter(z.class, "fragmentClass");
            z zVar = (z) aVar4.f(z.class);
            b0.M(zVar, gVar2);
            mo1.c.c(supportFragmentManager3, i15, zVar, true, null, 48);
            return;
        }
        if (throwable instanceof UnauthException.AuthenticationError.SignupError) {
            UnauthException.AuthenticationError.SignupError signupError = (UnauthException.AuthenticationError.SignupError) throwable;
            qz.d apiResponse = signupError.f49840a;
            if (apiResponse != null) {
                br1.d dVar = new br1.d();
                Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
                dVar.f23773c0 = apiResponse;
                wVar.g(1000L, new of0.a(dVar));
                unit = Unit.f80348a;
            }
            if (unit == null) {
                c(signupError);
                return;
            }
            return;
        }
        if (throwable instanceof UnauthException.AuthServiceNotAvailableError) {
            m mVar2 = ((UnauthException.AuthServiceNotAvailableError) throwable).f49830a;
            if (mVar2 instanceof j) {
                string = nVar.getString(x0.app_name);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else if (mVar2 instanceof f) {
                string = nVar.getString(vq1.d.facebook);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else if (mVar2 instanceof qr1.i) {
                string = nVar.getString(vq1.d.line);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else if ((mVar2 instanceof qr1.g) || (mVar2 instanceof h) || (mVar2 instanceof l)) {
                string = nVar.getString(vq1.d.google);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else if (mVar2 instanceof e) {
                string = nVar.getString(vq1.d.etsy);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                if (!(mVar2 instanceof qr1.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = nVar.getString(vq1.d.sso);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            yb0.n nVar2 = new yb0.n(nVar);
            String string2 = nVar.getString(vq1.d.auth_service_not_available_title, string);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            nVar2.w(string2);
            nVar2.u(nVar.getString(vq1.d.auth_service_not_available_message, string));
            nVar2.o(false);
            String string3 = nVar.getString(x0.okay);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            nVar2.q(string3);
            nVar2.f138513j = new v51.a(nVar2, 2);
            nVar2.f138517n = true;
            cb.x(nVar2, wVar);
            return;
        }
        boolean z16 = throwable instanceof UnauthException.AuthenticationError.UnderageSignupError;
        k kVar = this.f49822g;
        if (z16) {
            tr1.b.h();
            kVar.i(nVar.getString(vq1.d.error_underage_signup));
            return;
        }
        if (throwable instanceof UnauthException.AuthenticationError.MagicLinkExpiredError) {
            int i16 = yb0.n.f138503p;
            String string4 = nVar.getString(vq1.d.magic_link_expired_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = nVar.getString(vq1.d.magic_link_expired_description);
            String string6 = nVar.getString(vq1.d.magic_link_expired_got_it);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            a13 = xa0.j.a(nVar, string4, string5, string6, (r20 & 16) != 0 ? "" : "", (r20 & 32) != 0 ? yb0.k.f138491j : null, (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
            a13.o(false);
            wVar.d(new yb0.e(a13));
            return;
        }
        if (!(throwable instanceof UnauthException.AuthenticationError.LoginRateLimitError)) {
            if (throwable instanceof UnauthException.AuthenticationError.FacebookDeprecatedError) {
                kVar.i(nVar.getString(vq1.d.error_facebook_deprecated));
                return;
            } else {
                c(throwable);
                return;
            }
        }
        d0.B(this.f49816a, f1.LOGIN_ATTEMPT_LIMIT_REACHED, null, null, null, 30);
        yb0.n nVar3 = new yb0.n(nVar);
        String string7 = nVar.getString(vq1.d.auth_rate_limit_title);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        nVar3.w(string7);
        nVar3.u(nVar.getString(vq1.d.auth_rate_limit_description));
        String string8 = nVar.getString(x0.okay);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        nVar3.q(string8);
        nVar3.f138513j = new v51.a(nVar3, i13);
        nVar3.o(false);
        nVar3.f138517n = true;
        cb.x(nVar3, wVar);
    }

    public final void b(qr1.c authUser, Bundle bundle) {
        Intrinsics.checkNotNullParameter(authUser, "authUser");
        if (((lb2.n) this.f49819d).m()) {
            d.a(this.f49820e, false, null, null, bundle, 6);
        } else {
            ((lu1.c) this.f49821f).o(this.f49817b, bundle, authUser.a());
        }
    }

    public final void c(Throwable th3) {
        String string;
        v.f1 f1Var;
        qz.d M;
        boolean z13 = th3 instanceof UnauthException.ThirdParty.Facebook.OutdatedError;
        n nVar = this.f49817b;
        if (z13) {
            string = nVar.getString(vq1.d.facebook_needs_update);
            Intrinsics.f(string);
        } else if ((th3 instanceof UnauthException.ThirdParty.Facebook.MissingAccessTokenError) || (th3 instanceof UnauthException.ThirdParty.Facebook.LoginResultError)) {
            string = nVar.getString(vq1.d.facebook_error_request_access);
            Intrinsics.f(string);
        } else if ((th3 instanceof UnauthException.ThirdParty.Line.MissingTokenError) || (th3 instanceof UnauthException.ThirdParty.Line.MissingLineIdError) || (th3 instanceof UnauthException.ThirdParty.Line.LoginResultError)) {
            string = nVar.getString(vq1.d.line_login_error);
            Intrinsics.f(string);
        } else if (th3 instanceof UnauthException.AuthenticationError.NonExistentEmailError) {
            string = nVar.getString(vq1.d.non_existent_email);
            Intrinsics.f(string);
        } else if (th3 instanceof UnauthException.AuthenticationError.GoogleAccountAlreadyLinkedError) {
            string = nVar.getString(vq1.d.google_account_already_linked);
            Intrinsics.f(string);
        } else if (th3 instanceof UnauthException.AuthenticationError.FacebookAccountAlreadyLinkedError) {
            string = nVar.getString(vq1.d.facebook_account_already_linked);
            Intrinsics.f(string);
        } else if (th3 instanceof UnauthException.AuthenticationError) {
            Throwable cause = th3.getCause();
            NetworkResponseError networkResponseError = cause instanceof NetworkResponseError ? (NetworkResponseError) cause : null;
            if (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null || (string = M.f105384d) == null) {
                string = nVar.getString(x0.generic_error);
            }
            Intrinsics.f(string);
        } else {
            string = nVar.getString(x0.generic_error);
            Intrinsics.f(string);
        }
        this.f49818c.g(1000L, new i92.i(new i92.f(string)));
    }
}
