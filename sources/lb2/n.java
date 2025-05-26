package lb2;

import a.k1;
import a.z0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import ey.k3;
import hk2.y;
import hk2.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jk2.e0;
import jk2.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z1;
import m60.f0;
import nx.d0;
import t3.s1;
import uj2.b0;
import x02.a2;
import x02.x2;

/* loaded from: classes2.dex */
public final class n implements mr1.a {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f82783a;

    /* renamed from: b, reason: collision with root package name */
    public final mo1.d f82784b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f82785c;

    /* renamed from: d, reason: collision with root package name */
    public final cr1.g f82786d;

    /* renamed from: e, reason: collision with root package name */
    public final cr1.d f82787e;

    /* renamed from: f, reason: collision with root package name */
    public final x f82788f;

    /* renamed from: g, reason: collision with root package name */
    public final or1.i f82789g;

    /* renamed from: h, reason: collision with root package name */
    public final z10.a f82790h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f82791i;

    /* renamed from: j, reason: collision with root package name */
    public final cy.k f82792j;

    /* renamed from: k, reason: collision with root package name */
    public final k3 f82793k;

    /* renamed from: l, reason: collision with root package name */
    public final z1 f82794l;

    /* renamed from: m, reason: collision with root package name */
    public final g1 f82795m;

    /* renamed from: n, reason: collision with root package name */
    public final x2 f82796n;

    public n(bf2.a userDeserializerProvider, mo1.d intentHelper, d0 pinalytics, cr1.g userServiceFactory, cr1.d authenticationServiceFactory, x logoutManager, or1.i authLoggingUtils, f0 authTokenProvider, b60.b activeUserManager, cy.k networkMetricsCollector, k3 perfLogger, z1 experiments, g1 experimentsManager, x2 userRepository) {
        Intrinsics.checkNotNullParameter(userDeserializerProvider, "userDeserializerProvider");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userServiceFactory, "userServiceFactory");
        Intrinsics.checkNotNullParameter(authenticationServiceFactory, "authenticationServiceFactory");
        Intrinsics.checkNotNullParameter(logoutManager, "logoutManager");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(networkMetricsCollector, "networkMetricsCollector");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experimentsManager, "experimentsManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f82783a = userDeserializerProvider;
        this.f82784b = intentHelper;
        this.f82785c = pinalytics;
        this.f82786d = userServiceFactory;
        this.f82787e = authenticationServiceFactory;
        this.f82788f = logoutManager;
        this.f82789g = authLoggingUtils;
        this.f82790h = authTokenProvider;
        this.f82791i = activeUserManager;
        this.f82792j = networkMetricsCollector;
        this.f82793k = perfLogger;
        this.f82794l = experiments;
        this.f82795m = experimentsManager;
        this.f82796n = userRepository;
    }

    public final kk2.g b(b0 b0Var, String str) {
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.g(b0Var, new ua2.v(23, new ha2.i(11, this, str)), 2), new ua2.v(24, new h(this, 0)), 3), new ua2.v(25, new h(this, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }

    public final kk2.g c(Context context, mr1.h account) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(account, "account");
        kk2.g gVar = new kk2.g(f(context, true).c(k(account)), new ua2.v(22, i.f82769n), 2);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnSubscribe(...)");
        return b(gVar, account.f88088a);
    }

    public final void d(Activity activity, String logoutReason, String sourceUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(logoutReason, "logoutReason");
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        e(activity, logoutReason, sourceUrl, new h(this, 2));
    }

    public final void e(Activity activity, String logoutReason, String sourceUrl, Function1 completionHandler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(logoutReason, "logoutReason");
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        or1.a aVar = or1.b.Companion;
        b60.d dVar = (b60.d) this.f82791i;
        wy0 f13 = dVar.f();
        aVar.getClass();
        or1.b a13 = or1.a.a(f13);
        wy0 f14 = dVar.f();
        String uid = f14 != null ? f14.getUid() : null;
        qr1.u uVar = new qr1.u(logoutReason);
        final int i13 = 1;
        uVar.e(true);
        uVar.c();
        uVar.d(sourceUrl);
        uVar.b();
        qr1.u a14 = uVar.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        uj2.l t13 = this.f82788f.a(activity, a14).t();
        hk2.i iVar = hk2.i.f69412a;
        y yVar = new y(t13, new ck2.f(iVar));
        Intrinsics.checkNotNullExpressionValue(yVar, "onErrorResumeNext(...)");
        hk2.k kVar = new hk2.k(yVar, new b22.f(24, new h(this, 3)), i13);
        final int i14 = 0;
        hk2.c cVar = new hk2.c(new k1(uid, 26), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        hk2.k i15 = kVar.i(cVar);
        ua2.v vVar = new ua2.v(18, new j(this, a13, i14));
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar2 = ck2.i.f27923c;
        z zVar = new z(new z(new z(i15, vVar, a2Var, a2Var, cVar2), a2Var, a2Var, a2Var, new qb1.a(11, this, a13)), a2Var, a2Var, new ua2.v(19, new j(this, a13, i13)), cVar2);
        e0 e0Var = new e0(new ol1.d(new f(this, i13), 3));
        Intrinsics.checkNotNullExpressionValue(e0Var, "firstElement(...)");
        hk2.k kVar2 = new hk2.k(zVar.i(e0Var), new b22.f(25, new h(this, 4)), i13);
        fk2.g gVar = new fk2.g(new ak2.a(this) { // from class: lb2.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f82755b;

            {
                this.f82755b = this;
            }

            @Override // ak2.a
            public final void run() {
                n this$0 = this.f82755b;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        mo1.d.a(this$0.f82784b, true, null, null, null, 14);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        or1.c cVar3 = or1.c.DELETE_GROUP;
                        or1.e eVar = or1.e.ATTEMPT;
                        or1.b bVar = or1.b.NO_ACCOUNT;
                        this$0.h(cVar3, eVar, bVar, null);
                        Context context = kb0.a.f79058b;
                        f0.W().getSharedPreferences("PREF_ACCUNT_SWITCHER_GROUP_ID", 0).edit().clear().apply();
                        SharedPreferences sharedPreferences = f0.W().getSharedPreferences("PREF_MY_USER_USER_ACCOUNTS_4", 0);
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                        sharedPreferences.edit().clear().apply();
                        this$0.h(cVar3, or1.e.SUCCESS, bVar, null);
                        break;
                }
            }
        }, 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "fromAction(...)");
        kVar2.i(new hk2.f(0, iVar, gVar)).f(new hk2.b(new ua2.v(20, new al1.j(14, completionHandler)), new ua2.v(21, new h(this, 5)), new ak2.a(this) { // from class: lb2.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f82755b;

            {
                this.f82755b = this;
            }

            @Override // ak2.a
            public final void run() {
                n this$0 = this.f82755b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        mo1.d.a(this$0.f82784b, true, null, null, null, 14);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        or1.c cVar3 = or1.c.DELETE_GROUP;
                        or1.e eVar = or1.e.ATTEMPT;
                        or1.b bVar = or1.b.NO_ACCOUNT;
                        this$0.h(cVar3, eVar, bVar, null);
                        Context context = kb0.a.f79058b;
                        f0.W().getSharedPreferences("PREF_ACCUNT_SWITCHER_GROUP_ID", 0).edit().clear().apply();
                        SharedPreferences sharedPreferences = f0.W().getSharedPreferences("PREF_MY_USER_USER_ACCOUNTS_4", 0);
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                        sharedPreferences.edit().clear().apply();
                        this$0.h(cVar3, or1.e.SUCCESS, bVar, null);
                        break;
                }
            }
        }));
    }

    public final uj2.b f(Context context, boolean z13) {
        if (!c60.d.b() || !l()) {
            return fk2.m.f62459a;
        }
        c60.a aVar = c60.d.f26516d;
        if (aVar == null) {
            throw new IllegalStateException("Missing access token");
        }
        String a13 = c60.d.a();
        if (a13 == null) {
            a13 = "";
        }
        int i13 = 13;
        kk2.m k13 = cr1.g.a(this.f82786d, a13).w("me", n00.b.a(n00.c.USER_ME)).r(tk2.e.f118017c).l(wj2.c.a()).k(new z0(new ha2.j(aVar, i13), 5));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return new fk2.c(1, new fk2.c(4, k13, new b22.f(28, new k1.b0((Object) this, (Object) context, "account_switch", z13, 23))), new b22.f(i13, new h(this, 6)));
    }

    public final fk2.c g() {
        fk2.c cVar = new fk2.c(1, new kk2.g(this.f82796n.d0().Q("me").H(tk2.e.f118017c).s(), new e82.o(4, l.f82780i), 3).i(), ck2.i.f27926f);
        Intrinsics.checkNotNullExpressionValue(cVar, "onErrorComplete(...)");
        Object obj = this.f82783a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        fk2.c b13 = cVar.b(new q0(new jk2.x(uj2.q.w(com.bumptech.glide.c.a0((UserDeserializer) obj)), new dl1.b0(11, new m(this, 0)), 2), new r42.k(5, new m(this, 1))));
        Intrinsics.checkNotNullExpressionValue(b13, "andThen(...)");
        return b13;
    }

    public final void h(or1.c funnelAction, or1.e logEvent, or1.b accountType, Throwable th3) {
        Intrinsics.checkNotNullParameter(funnelAction, "funnelAction");
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Context context = kb0.a.f79058b;
        String string = f0.W().getSharedPreferences("PREF_ACCUNT_SWITCHER_GROUP_ID", 0).getString("PREF_ACCUNT_SWITCHER_GROUP_ID", null);
        Object obj = this.f82783a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        int size = com.bumptech.glide.c.a0((UserDeserializer) obj).size();
        or1.i iVar = this.f82789g;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(funnelAction, "funnelAction");
        Intrinsics.checkNotNullParameter(logEvent, "logEvent");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        String c13 = s1.c("client.events.account_switcher.", funnelAction.getLogValue(), ".", logEvent.getLogValue());
        nm.u b13 = iVar.b(th3);
        HashMap hashMap = new HashMap();
        if (string == null) {
            string = "no_group";
        }
        hashMap.put("group_id", string);
        hashMap.put("group_count", String.valueOf(size));
        hashMap.put("account_type", accountType.getLogValue());
        Unit unit = Unit.f80348a;
        iVar.f(c13, b13, hashMap);
    }

    public final kk2.m i(c60.a accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kk2.m mVar = new kk2.m(cr1.g.a(this.f82786d, accessToken.a()).w("me", n00.b.a(n00.c.USER_ME)).r(tk2.e.f118017c).l(wj2.c.a()), new b22.f(26, new ha2.i(13, this, accessToken)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final kk2.m j(c60.a accessToken, wy0 loggedInUser) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(loggedInUser, "loggedInUser");
        int i13 = 2;
        kk2.m mVar = new kk2.m(new kk2.k(new lb.n(accessToken, this, loggedInUser, i13), 1), new r42.k(6, new m(this, i13)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final kk2.m k(mr1.h account) {
        Intrinsics.checkNotNullParameter(account, "account");
        kk2.b j13 = b0.j(account);
        b22.f fVar = new b22.f(16, new k(account, 0));
        int i13 = 1;
        hk2.k kVar = new hk2.k(new hk2.h(new hk2.f(1, j13, fVar), new z0(i.f82770o, 3), i13), new z0(new ha2.i(12, this, account), 4), i13);
        Intrinsics.checkNotNullExpressionValue(kVar, "flatMap(...)");
        kk2.m mVar = new kk2.m(new hk2.b0(kVar, new kk2.k(new k1(account, 25), 1), 0), new b22.f(27, new h(this, 7)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final boolean l() {
        Intrinsics.checkNotNullExpressionValue(this.f82783a.get(), "get(...)");
        return !com.bumptech.glide.c.a0((UserDeserializer) r0).isEmpty();
    }

    public final boolean m() {
        Object obj = this.f82783a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        List a03 = com.bumptech.glide.c.a0((UserDeserializer) obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : a03) {
            if (true ^ ((mr1.h) obj2).a()) {
                arrayList.add(obj2);
            }
        }
        return arrayList.size() > 1;
    }
}
