package wq1;

import com.pinterest.api.model.wy0;
import fk2.x;
import h32.u0;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import uj2.q;
import yk1.r;
import yk1.t;

/* loaded from: classes4.dex */
public final class n extends t implements h {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f130839a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.identity.authentication.a f130840b;

    /* renamed from: c, reason: collision with root package name */
    public final f20.a f130841c;

    /* renamed from: d, reason: collision with root package name */
    public final x10.d f130842d;

    /* renamed from: e, reason: collision with root package name */
    public final w f130843e;

    /* renamed from: f, reason: collision with root package name */
    public final mo1.d f130844f;

    /* renamed from: g, reason: collision with root package name */
    public final mr1.a f130845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(uk1.d pinalytics, q networkStateStream, b60.b activeUserManager, com.pinterest.identity.authentication.a authNavigationHelper, f20.a businessService, x10.d settingsApi, w eventManager, mo1.d intentHelper, mr1.a accountSwitcher) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(businessService, "businessService");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        this.f130839a = activeUserManager;
        this.f130840b = authNavigationHelper;
        this.f130841c = businessService;
        this.f130842d = settingsApi;
        this.f130843e = eventManager;
        this.f130844f = intentHelper;
        this.f130845g = accountSwitcher;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        i view = (i) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((f) view).f130817j0 = this;
    }

    public final void p3() {
        getPinalytics().f0(u0.BACK_BUTTON, null, null, null, false);
        int i13 = l.f130836a[((f) ((i) getView())).f130818k0.ordinal()];
        if (i13 == 1) {
            ((f) ((i) getView())).P7();
            return;
        }
        if (i13 == 2) {
            ((f) ((i) getView())).i8(j.PROFILE_NAME_STEP);
        } else if (i13 == 3) {
            ((f) ((i) getView())).i8(j.WEBSITE_STEP);
        } else {
            if (i13 != 4) {
                return;
            }
            ((f) ((i) getView())).i8(j.DESCRIPTION_STEP);
        }
    }

    public final void q3(String key, String businessName, String accountType, String advertisingIntent, String website) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(advertisingIntent, "advertisingIntent");
        Intrinsics.checkNotNullParameter(website, "website");
        ek2.f i13 = new fk2.l(new x(this.f130841c.b(businessName, website, accountType, advertisingIntent).l(tk2.e.f118017c).h(wj2.c.a()), new tp1.c(15, new m(this, 0)), ck2.i.f27924d, ck2.i.f27923c), new k(this, 1), 0).i(new oo1.c(this, key, businessName, accountType, advertisingIntent, website), new tp1.c(16, new m(this, 1)));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        addDisposable(i13);
    }

    public final void r3() {
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        ((f) ((i) getView())).i8(j.RUN_ADS_STEP);
    }

    public final void s3(String key, String email, String businessName, String locale, String accountType, String advertisingIntent, String website) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(advertisingIntent, "advertisingIntent");
        Intrinsics.checkNotNullParameter(website, "website");
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        xj2.c o13 = new kk2.h(new kk2.g(this.f130842d.a(z0.g(new Pair("business_name", businessName), new Pair("website_url", website), new Pair("advertising_intent", advertisingIntent), new Pair("account_type", accountType))).r(tk2.e.f118017c).l(wj2.c.a()), new tp1.c(19, new m(this, 2)), 2), new k(this, 4), 1).o(new tp1.c(20, new r60.d(this, key, businessName, accountType, advertisingIntent, website, 7)), new tp1.c(21, new m(this, 3)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void t3(String phone, String website, String profileName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(website, "website");
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        getPinalytics().f0(u0.SUBMIT_BUTTON, null, null, null, false);
        wy0 f13 = ((b60.d) this.f130839a).f();
        if (f13 != null) {
            String uid = f13.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            String N2 = f13.N2();
            String str = N2 == null ? "" : N2;
            String U2 = f13.U2();
            String str2 = U2 == null ? "" : U2;
            String P3 = f13.P3();
            String str3 = P3 == null ? "" : P3;
            String G2 = f13.G2();
            ek2.f i13 = new fk2.l(new x(this.f130841c.c(uid, str, str2, str3, website, phone, "self_serve", "business_create", G2 == null ? "" : G2, profileName).l(tk2.e.f118017c).h(wj2.c.a()), new tp1.c(17, new m(this, 4)), ck2.i.f27924d, ck2.i.f27923c), new k(this, 2), 0).i(new k(this, 3), new tp1.c(18, new m(this, 5)));
            Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
            addDisposable(i13);
        }
    }

    public final void u3() {
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        ((f) ((i) getView())).i8(j.WEBSITE_STEP);
    }

    public final void v3() {
        getPinalytics().f0(u0.NEXT_BUTTON, null, null, null, false);
        ((f) ((i) getView())).i8(j.DESCRIPTION_STEP);
    }

    public final void w3(String str, String str2, String str3, String str4, String str5) {
        wy0 f13 = ((b60.d) this.f130839a).f();
        if (f13 != null) {
            String N2 = f13.N2();
            Intrinsics.f(N2);
            String S3 = f13.S3();
            Intrinsics.f(S3);
            xj2.c o13 = new kk2.h(new kk2.g(this.f130841c.a(str, N2, str2, false, S3, str3, str4, str5).r(tk2.e.f118017c).l(wj2.c.a()), new tp1.c(12, new m(this, 6)), 2), new k(this, 0), 1).o(new tp1.c(13, new m(this, 7)), new tp1.c(14, new m(this, 8)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    public final void x3() {
        fk2.c cVar = new fk2.c(1, ((lb2.n) this.f130845g).g(), ck2.i.f27926f);
        Intrinsics.checkNotNullExpressionValue(cVar, "onErrorComplete(...)");
        addDisposable(nl.b.n(cVar, new yj1.d(this, 17), new m(this, 9)));
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        i view = (i) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((f) view).f130817j0 = this;
    }
}
