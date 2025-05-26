package y70;

import df.j1;
import ey.e5;
import h32.b1;
import h32.c1;
import h32.f1;
import h32.i0;
import h32.v0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.s0;
import lh0.z3;
import m60.w;
import nx.d0;
import nx.f0;
import nx.z0;
import t3.s1;
import u22.l;
import z70.n;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f137971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f137972b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f137973c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f137974d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f137975e;

    /* renamed from: f, reason: collision with root package name */
    public final long f137976f;

    /* renamed from: g, reason: collision with root package name */
    public final String f137977g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f137978h;

    /* renamed from: i, reason: collision with root package name */
    public final g f137979i;

    /* renamed from: j, reason: collision with root package name */
    public final e f137980j;

    /* renamed from: k, reason: collision with root package name */
    public final uk2.d f137981k;

    /* renamed from: l, reason: collision with root package name */
    public final xj2.c f137982l;

    /* renamed from: m, reason: collision with root package name */
    public final n f137983m;

    /* renamed from: n, reason: collision with root package name */
    public long f137984n;

    public c(String pinUid, String url, boolean z13, boolean z14, boolean z15, c1 c1Var, long j13, String str, z0 z0Var, f0 pinalyticsFactory, g customTabManager, e customTabEventLogger, tb0.h crashReporting, bz.d offPinterestTimeSpentManager, s0 experiments) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(customTabManager, "customTabManager");
        Intrinsics.checkNotNullParameter(customTabEventLogger, "customTabEventLogger");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(offPinterestTimeSpentManager, "offPinterestTimeSpentManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f137971a = pinUid;
        this.f137972b = url;
        this.f137973c = z14;
        this.f137974d = z15;
        this.f137975e = c1Var;
        this.f137976f = j13;
        this.f137977g = str;
        this.f137978h = z0Var;
        this.f137979i = customTabManager;
        this.f137980j = customTabEventLogger;
        uk2.d h10 = s1.h("create(...)");
        this.f137981k = h10;
        this.f137984n = System.currentTimeMillis();
        xj2.c F = h10.m(500L, TimeUnit.MILLISECONDS, tk2.e.f118016b).F(new u60.g(25, new a(this, 0)), new u60.g(26, b.f137967j), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f137982l = F;
        this.f137983m = new n(pinalyticsFactory, pinUid, z13, str, z0Var, offPinterestTimeSpentManager, experiments);
    }

    public final void a() {
        b1 b1Var;
        String str;
        String str2;
        this.f137982l.dispose();
        new e5(1).i();
        n nVar = this.f137983m;
        if (nVar == null) {
            Intrinsics.r("inAppBrowserPinalytics");
            throw null;
        }
        d0 pinalytics = nVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        e eVar = this.f137980j;
        eVar.getClass();
        String pinUid = this.f137971a;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        x70.a aVar = new x70.a(pinUid, null);
        w wVar = eVar.f137989c;
        wVar.f(aVar);
        wVar.f(new ls1.g(pinUid, currentTimeMillis));
        z0 z0Var = this.f137978h;
        if (z0Var != null && z0Var.containsKey("grid_click_type") && (str2 = (String) z0Var.get("grid_click_type")) != null && l.DIRECT_TO_DESTINATION.getValue() == Integer.parseInt(str2)) {
            wVar.f(new ls1.f(pinUid, currentTimeMillis));
        }
        c1 c1Var = this.f137975e;
        if (c1Var != null) {
            b1Var = new b1(c1Var);
            b1Var.A = null;
        } else {
            b1Var = new b1();
        }
        c1 a13 = b1Var.a();
        HashMap hashMap = z0Var != null ? new HashMap(z0Var) : new HashMap();
        if (!this.f137973c) {
            f1 f1Var = f1.PIN_CLICKTHROUGH_END;
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf(currentTimeMillis - this.f137976f);
            pinalytics.H(f1Var, pinUid, a13, hashMap, v0Var, false);
        }
        if (!this.f137974d || z0Var == null || (str = (String) z0Var.get("collection_pin_click_position")) == null) {
            return;
        }
        boolean d2 = Intrinsics.d(str, "0");
        pb0.a aVar2 = eVar.f137992f;
        if (d2) {
            f1 f1Var2 = f1.COLLECTION_PIN_CLICKTHROUGH_END;
            v0 v0Var2 = new v0();
            v0Var2.C = Long.valueOf(((pb0.g) aVar2).a() - eVar.f137993g);
            pinalytics.H(f1Var2, pinUid, a13, hashMap, v0Var2, false);
            return;
        }
        if (d2) {
            throw new NoWhenBranchMatchedException();
        }
        f1 f1Var3 = f1.COLLECTION_ITEM_CLICKTHROUGH_END;
        v0 v0Var3 = new v0();
        v0Var3.C = Long.valueOf(((pb0.g) aVar2).a() - eVar.f137993g);
        pinalytics.H(f1Var3, pinUid, c1Var, hashMap, v0Var3, false);
    }

    public final void b() {
        n nVar = this.f137983m;
        if (nVar != null) {
            HashMap l13 = nVar.l();
            l13.put("is_promoted_pin", String.valueOf(nVar.f141012h));
            d0 d0Var = nVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            f1 f1Var = f1.PIN_OPEN_IN_NATIVE_WEB_BROWSER;
            String str = nVar.f122380b;
            v0 v0Var = new v0();
            String str2 = nVar.f141013i;
            v0Var.G = str2;
            d0Var.H(f1Var, str, null, l13, v0Var, false);
            s0 s0Var = nVar.f141016l;
            s0Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) s0Var.f83472a;
            if (g1Var.o("android_timespent_chrome_off_pinterest", "enabled", z3Var) || g1Var.l("android_timespent_chrome_off_pinterest")) {
                String str3 = nVar.f122380b;
                Intrinsics.checkNotNullExpressionValue(str3, "getObjectIdForContext(...)");
                nVar.f141015k.a(str3, j1.R1(l13), str2, h32.a4.BROWSER);
            }
        }
    }

    public final void c() {
        new e5(1).i();
        n nVar = this.f137983m;
        if (nVar != null) {
            nVar.m(this.f137972b);
            this.f137984n = System.currentTimeMillis();
        }
    }

    public final void d() {
        new e5(1).i();
        n nVar = this.f137983m;
        if (nVar != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f137984n;
            d0 d0Var = nVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            f1 f1Var = f1.URL_LOAD_FINISHED;
            String str = nVar.f122380b;
            HashMap l13 = nVar.l();
            l13.put("url", this.f137972b);
            l13.put("page_load_finished", String.valueOf(currentTimeMillis));
            l13.put("connection_type", "");
            l13.put("is_promoted_pin", String.valueOf(nVar.f141012h));
            Unit unit = Unit.f80348a;
            d0Var.g(f1Var, str, l13, false);
            this.f137984n = System.currentTimeMillis();
        }
    }

    public final void e() {
        new e5(1).i();
        n nVar = this.f137983m;
        if (nVar != null) {
            nVar.m(this.f137972b);
            this.f137984n = System.currentTimeMillis();
        }
    }

    public final void f() {
        new e5(1).i();
        n nVar = this.f137983m;
        if (nVar != null) {
            HashMap l13 = nVar.l();
            l13.put("url", this.f137972b);
            l13.put("is_promoted_pin", String.valueOf(nVar.f141012h));
            d0 d0Var = nVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.g(f1.LOAD_URL, nVar.f122380b, l13, false);
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.g(f1.VIEW, nVar.f122380b, l13, false);
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.g(f1.URL_LOAD_STARTED, nVar.f122380b, l13, false);
            this.f137984n = System.currentTimeMillis();
        }
    }

    public final void g() {
        this.f137981k.c(0);
    }

    public final void h() {
        n nVar = this.f137983m;
        if (nVar == null) {
            Intrinsics.r("inAppBrowserPinalytics");
            throw null;
        }
        i0 chromeTabLogginContext = nVar.generateLoggingContext();
        Intrinsics.checkNotNullExpressionValue(chromeTabLogginContext, "generateLoggingContext(...)");
        e eVar = this.f137980j;
        eVar.getClass();
        String pinUid = this.f137971a;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(chromeTabLogginContext, "chromeTabLogginContext");
        eVar.f137993g = ((pb0.g) eVar.f137992f).a();
        z0 z0Var = this.f137978h;
        if (z0Var == null) {
            z0Var = new z0();
        }
        z0Var.put("pin_id", pinUid);
        Unit unit = Unit.f80348a;
        eVar.f137988b.f(chromeTabLogginContext, new qq2.c(z0Var, this.f137977g));
        eVar.f137994h.c(Boolean.TRUE);
    }
}
