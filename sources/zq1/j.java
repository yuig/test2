package zq1;

import android.content.Intent;
import android.net.Uri;
import c2.m4;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.y1;
import lh0.z3;
import ni1.m2;
import yq1.o2;

/* loaded from: classes2.dex */
public final class j extends yk1.t implements a {

    /* renamed from: a, reason: collision with root package name */
    public final lb2.q f142685a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.identity.authentication.a f142686b;

    /* renamed from: c, reason: collision with root package name */
    public final b20.c f142687c;

    /* renamed from: d, reason: collision with root package name */
    public final mr1.a f142688d;

    /* renamed from: e, reason: collision with root package name */
    public final cr1.b f142689e;

    /* renamed from: f, reason: collision with root package name */
    public final vy.m f142690f;

    /* renamed from: g, reason: collision with root package name */
    public final mr1.c f142691g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f142692h;

    /* renamed from: i, reason: collision with root package name */
    public final String f142693i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f142694j;

    /* renamed from: k, reason: collision with root package name */
    public final y1 f142695k;

    /* renamed from: l, reason: collision with root package name */
    public final b60.b f142696l;

    /* renamed from: m, reason: collision with root package name */
    public final so.d0 f142697m;

    /* renamed from: n, reason: collision with root package name */
    public final lb0.q f142698n;

    /* renamed from: o, reason: collision with root package name */
    public String f142699o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f142700p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d presenterPinalytics, uj2.q networkStateStream, lb2.q authManager, com.pinterest.identity.authentication.a authNavigationHelper, b20.c authInfoProvider, mr1.a accountSwitcher, cr1.b authenticationService, vy.m analyticsApi, mr1.b activityProvider, boolean z13, String str, Uri uri, y1 experiments, b60.b activeUserManager, so.d0 magicLoginFactory, lb0.q prefsManagerPersisted) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(authInfoProvider, "authInfoProvider");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        Intrinsics.checkNotNullParameter(authenticationService, "authenticationService");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(magicLoginFactory, "magicLoginFactory");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f142685a = authManager;
        this.f142686b = authNavigationHelper;
        this.f142687c = authInfoProvider;
        this.f142688d = accountSwitcher;
        this.f142689e = authenticationService;
        this.f142690f = analyticsApi;
        this.f142691g = activityProvider;
        this.f142692h = z13;
        this.f142693i = str;
        this.f142694j = uri;
        this.f142695k = experiments;
        this.f142696l = activeUserManager;
        this.f142697m = magicLoginFactory;
        this.f142698n = prefsManagerPersisted;
        this.f142699o = "";
    }

    public static final void p3(j jVar, qr1.c cVar) {
        if (jVar.isBound()) {
            String str = jVar.f142693i;
            jVar.f142686b.b(cVar, j1.U0(str) ? n60.o.a("com.pinterest.EXTRA_PIN_ID", str) : null);
        }
    }

    @Override // yk1.b
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        this.f142685a.d(i13, i14, intent);
    }

    public final void q3(lr1.h hVar, qr1.y yVar) {
        int i13 = 0;
        xj2.c o13 = new kk2.h(new kk2.g(this.f142685a.b(hVar, this.f142691g, yVar), new o2(2, new f(this, i13)), 2), new d(this, i13), 1).o(new o2(3, new f(this, 1)), new o2(4, new xm1.k(22, this, hVar)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void r3(qr1.g0 g0Var) {
        qr1.g0 g0Var2;
        lb0.q qVar = this.f142698n;
        if (g0Var == null) {
            boolean f13 = qVar.f("PREF_GOOGLE_CONNECTED", false);
            g0Var2 = new qr1.g0(f13, f13, qVar.f("PREF_HAS_PASSWORD", false));
        } else {
            g0Var2 = g0Var;
        }
        int i13 = 26;
        if (g0Var2.getConnectedToGPlus()) {
            this.f142699o = "google";
            b bVar = (b) getViewIfBound();
            if (bVar != null) {
                int i14 = vq1.d.arr_facebook_deprecated_google_login_text;
                yq1.k kVar = (yq1.k) bVar;
                GestaltText gestaltText = kVar.L0;
                if (gestaltText == null) {
                    Intrinsics.r("facebookDeprecationBanner");
                    throw null;
                }
                gestaltText.i(new m4(kVar, i14, i13));
            }
        } else if (g0Var2.getHasPassword()) {
            this.f142699o = "email";
            b bVar2 = (b) getViewIfBound();
            if (bVar2 != null) {
                int i15 = vq1.d.arr_facebook_deprecated_email_login_text;
                yq1.k kVar2 = (yq1.k) bVar2;
                GestaltText gestaltText2 = kVar2.L0;
                if (gestaltText2 == null) {
                    Intrinsics.r("facebookDeprecationBanner");
                    throw null;
                }
                gestaltText2.i(new m4(kVar2, i15, i13));
            }
        } else if (g0Var != null || (qVar.e("PREF_GOOGLE_CONNECTED") && qVar.e("PREF_HAS_PASSWORD"))) {
            this.f142699o = "fbOnly";
        }
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        f1 f1Var = f1.UNAUTH_ACCOUNT_RECOVERY_FB_ACCOUNT_RETRIEVAL;
        h32.g0 g0Var3 = h32.g0.RECOVER_ACCOUNT_VIEW;
        HashMap hashMap = new HashMap();
        hashMap.put("authOption", this.f142699o);
        Unit unit = Unit.f80348a;
        nx.d0.B(d0Var, f1Var, g0Var3, null, hashMap, 20);
    }

    public final void s3(boolean z13) {
        y1 y1Var = this.f142695k;
        if (z13) {
            y1Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) y1Var.f83514a;
            if (g1Var.o("android_unauth_account_recovery_banner_phase3", "enabled", z3Var) || g1Var.l("android_unauth_account_recovery_banner_phase3")) {
                int i13 = 2;
                xj2.c o13 = new kk2.h(new kk2.g(new kk2.m(((hr1.k) this.f142685a.e(this.f142691g).a(lr1.h.FacebookAutoLoginMethod, null)).j(), new dl1.b0(12, new f(this, i13)), 0).l(wj2.c.a()), new com.pinterest.feature.home.model.h(26, new f(this, 3)), 2), new c(this, i13), 1).o(new com.pinterest.feature.home.model.h(27, new f(this, 4)), new com.pinterest.feature.home.model.h(28, new f(this, 5)));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                addDisposable(o13);
                return;
            }
        }
        y1Var.getClass();
        z3 z3Var2 = a4.f83298b;
        g1 g1Var2 = (g1) y1Var.f83514a;
        if (g1Var2.o("android_unauth_account_recovery_banner_phase3", "enabled", z3Var2) || g1Var2.l("android_unauth_account_recovery_banner_phase3")) {
            r3(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r3 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t3(java.lang.Throwable r13, lr1.h r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq1.j.t3(java.lang.Throwable, lr1.h):void");
    }

    @Override // yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(b view) {
        pr1.g gVar;
        String queryParameter;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        yq1.k kVar = (yq1.k) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        kVar.A0 = this;
        int i13 = 1;
        int i14 = 0;
        boolean c13 = ((gz1.b) this.f142687c.f21278a).c(null, true, 0);
        int i15 = 8;
        if (kVar.b8().b()) {
            GestaltButtonSocial gestaltButtonSocial = kVar.E0;
            if (gestaltButtonSocial == null) {
                Intrinsics.r("gplusBtGestaltSocial");
                throw null;
            }
            kh2.b0.O(gestaltButtonSocial, new mm1.i(c13, 8));
        } else {
            GestaltButton gestaltButton = kVar.H0;
            if (gestaltButton == null) {
                Intrinsics.r("gplusBtGestalt");
                throw null;
            }
            bs1.c.s(gestaltButton, new m2(c13, 5));
        }
        if (this.f142700p) {
            kVar.j8(false);
            this.f142700p = false;
        }
        Uri uri = this.f142694j;
        Uri parse = (uri == null || (queryParameter = uri.getQueryParameter("next")) == null) ? null : Uri.parse(queryParameter);
        if (parse != null) {
            if (!Intrinsics.d(uri.getPath(), "/secure/login/")) {
                parse = null;
            }
            if (parse != null) {
                uri = parse;
            }
        }
        if (uri != null) {
            String queryParameter2 = uri.getQueryParameter("token");
            String str = queryParameter2 == null ? "" : queryParameter2;
            String queryParameter3 = uri.getQueryParameter("expiration");
            String str2 = queryParameter3 == null ? "" : queryParameter3;
            String queryParameter4 = uri.getQueryParameter("user_id");
            String str3 = queryParameter4 == null ? "" : queryParameter4;
            String queryParameter5 = uri.getQueryParameter("stored");
            gVar = this.f142697m.a(str, str2, str3, queryParameter5 == null ? "" : queryParameter5, uri.getQueryParameter("login_type"));
        } else {
            gVar = null;
        }
        mr1.c cVar = this.f142691g;
        lb2.q qVar = this.f142685a;
        int i16 = 2;
        if (gVar != null) {
            xj2.c o13 = new kk2.h(new kk2.g(qVar.c(gVar, cVar), new com.pinterest.feature.home.model.h(18, new f(this, 6)), 2), new c(this, i14), 1).o(new com.pinterest.feature.home.model.h(19, new f(this, 7)), new com.pinterest.feature.home.model.h(20, new f(this, i15)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        } else {
            if (this.f142692h) {
                s3(((yq1.k) ((b) getView())).e8());
                return;
            }
            xj2.c o14 = new kk2.h(new kk2.g(qVar.b(lr1.h.AutoLoginMethod, cVar, null), new com.pinterest.feature.home.model.h(21, new g(this, i13)), 2), new c(this, i13), 1).o(new com.pinterest.feature.home.model.h(22, new g(this, i16)), new com.pinterest.feature.home.model.h(23, new g(this, 3)));
            Intrinsics.checkNotNullExpressionValue(o14, "subscribe(...)");
            addDisposable(o14);
        }
    }

    public final void v3(String str) {
        int i13 = 1;
        xj2.c o13 = new kk2.h(new kk2.g(this.f142685a.g(str), new o2(7, new f(this, 10)), 2), new d(this, i13), 1).o(new o2(8, new i(this, str, i13)), new o2(9, new f(this, 11)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }
}
