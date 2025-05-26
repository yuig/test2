package ew;

import ads_mobile_sdk.nh;
import android.content.Context;
import ao2.e2;
import ao2.f0;
import ao2.j0;
import ao2.v0;
import h32.f1;
import ho2.q;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.g1;
import lh0.y0;
import lh0.z0;
import m60.w;
import nb0.x;
import nm.u;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60315a;

    /* renamed from: b, reason: collision with root package name */
    public final x f60316b;

    /* renamed from: c, reason: collision with root package name */
    public final pb0.a f60317c;

    /* renamed from: d, reason: collision with root package name */
    public final gw.f f60318d;

    /* renamed from: e, reason: collision with root package name */
    public final lh0.i f60319e;

    /* renamed from: f, reason: collision with root package name */
    public final ix.d f60320f;

    /* renamed from: g, reason: collision with root package name */
    public final kw.b f60321g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f60322h;

    /* renamed from: i, reason: collision with root package name */
    public final fw.c f60323i;

    /* renamed from: j, reason: collision with root package name */
    public final l f60324j;

    /* renamed from: k, reason: collision with root package name */
    public final mw.a f60325k;

    /* renamed from: l, reason: collision with root package name */
    public final lw.d f60326l;

    /* renamed from: m, reason: collision with root package name */
    public final hw.c f60327m;

    /* renamed from: n, reason: collision with root package name */
    public final w f60328n;

    /* renamed from: o, reason: collision with root package name */
    public final tb0.h f60329o;

    /* renamed from: p, reason: collision with root package name */
    public final jw.b f60330p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f60331q;

    /* renamed from: r, reason: collision with root package name */
    public final fw.d f60332r;

    /* renamed from: s, reason: collision with root package name */
    public final f0 f60333s;

    /* renamed from: t, reason: collision with root package name */
    public final f0 f60334t;

    /* renamed from: u, reason: collision with root package name */
    public final mw.b f60335u;

    /* renamed from: v, reason: collision with root package name */
    public final mw.b f60336v;

    /* renamed from: w, reason: collision with root package name */
    public final i f60337w;

    public j(Context context, r prefsManagerUser, pb0.a clock, gw.f adsGmaSdkDecorator, lh0.i experiments, ix.d adsGmaConfigManager, kw.a adsGmaQuarantine, j0 applicationScope, fw.c adsGmaLibraryAnalytics, l adsGmaHeaderManager, mw.a adsGmaHeaderUtils, lw.d adsGmaQueryInfoManager, hw.c adsGmaCrashBackoffManager, w eventManager, tb0.h crashReporting, jw.b powerscoreExperimentManager, boolean z13, fw.d adsGmaLogger) {
        ko2.f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        e2 mainDispatcher = q.f69782a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(adsGmaSdkDecorator, "adsGmaSdkDecorator");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsGmaConfigManager, "adsGmaConfigManager");
        Intrinsics.checkNotNullParameter(adsGmaQuarantine, "adsGmaQuarantine");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(adsGmaLibraryAnalytics, "adsGmaLibraryAnalytics");
        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
        Intrinsics.checkNotNullParameter(adsGmaHeaderUtils, "adsGmaHeaderUtils");
        Intrinsics.checkNotNullParameter(adsGmaQueryInfoManager, "adsGmaQueryInfoManager");
        Intrinsics.checkNotNullParameter(adsGmaCrashBackoffManager, "adsGmaCrashBackoffManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(powerscoreExperimentManager, "powerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsGmaLogger, "adsGmaLogger");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f60315a = context;
        this.f60316b = prefsManagerUser;
        this.f60317c = clock;
        this.f60318d = adsGmaSdkDecorator;
        this.f60319e = experiments;
        this.f60320f = adsGmaConfigManager;
        this.f60321g = adsGmaQuarantine;
        this.f60322h = applicationScope;
        this.f60323i = adsGmaLibraryAnalytics;
        this.f60324j = adsGmaHeaderManager;
        this.f60325k = adsGmaHeaderUtils;
        this.f60326l = adsGmaQueryInfoManager;
        this.f60327m = adsGmaCrashBackoffManager;
        this.f60328n = eventManager;
        this.f60329o = crashReporting;
        this.f60330p = powerscoreExperimentManager;
        this.f60331q = z13;
        this.f60332r = adsGmaLogger;
        this.f60333s = ioDispatcher;
        this.f60334t = mainDispatcher;
        this.f60335u = new mw.b(d.f60296k);
        this.f60336v = new mw.b(d.f60295j);
        this.f60337w = new i(this);
    }

    public final nh a(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return (nh) this.f60336v.c(pinId);
    }

    public final bj.f b(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        return (bj.f) this.f60335u.c(pinId);
    }

    public final void c() {
        jw.c b13;
        Integer d2;
        Integer c13;
        if (this.f60319e.a()) {
            jw.b bVar = this.f60330p;
            jw.c b14 = bVar.b();
            if (b14 != null && (c13 = b14.c()) != null) {
                if (bVar.a() <= c13.intValue()) {
                    return;
                }
            }
            boolean z13 = this.f60331q;
            hw.c cVar = this.f60327m;
            if (z13) {
                hw.a aVar = (hw.a) cVar;
                jw.b bVar2 = aVar.f70468f;
                if (bVar2.d()) {
                    Long valueOf = (!bVar2.d() || (b13 = bVar2.b()) == null || (d2 = b13.d()) == null) ? null : Long.valueOf(d2.intValue());
                    long longValue = valueOf != null ? valueOf.longValue() : 1L;
                    ((pb0.g) aVar.f70463a).getClass();
                    aVar.f70466d.c("PREFS_ADS_GMA_NEXT_VALID_INITIALIZATION_EPOCH_MS", (longValue * 86400000) + System.currentTimeMillis());
                }
            }
            hw.a aVar2 = (hw.a) cVar;
            boolean d13 = aVar2.f70468f.d();
            lb0.q qVar = aVar2.f70466d;
            if (d13) {
                ((pb0.g) aVar2.f70463a).getClass();
                boolean z14 = System.currentTimeMillis() < qVar.a("PREFS_ADS_GMA_NEXT_VALID_INITIALIZATION_EPOCH_MS", 0L);
                if (z14) {
                    aVar2.f70469g.b("GMA_SDK_MOBILE_CRASH", null, null, null);
                    f1 f1Var = f1.GMA_SDK_MOBILE_CRASH;
                    HashMap hashMap = new HashMap();
                    g1 g1Var = aVar2.f70465c;
                    g1Var.getClass();
                    Intrinsics.checkNotNullParameter("android_ad_gma_ps", "experiment");
                    z0.f83518a.getClass();
                    String g13 = g1Var.g("android_ad_gma_ps", y0.f83513c);
                    if (g13 == null) {
                        g13 = "";
                    }
                    hashMap.put("experiment_group", g13);
                    u uVar = new u();
                    uVar.u("powerscore", String.valueOf(aVar2.f70467e.a()));
                    String sVar = uVar.toString();
                    Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                    hashMap.put("3p_additional_data", sVar);
                    Unit unit = Unit.f80348a;
                    aVar2.f70464b.g(f1Var, null, hashMap, false);
                }
                if (z14) {
                    return;
                }
            } else {
                qVar.c("PREFS_ADS_GMA_NEXT_VALID_INITIALIZATION_EPOCH_MS", 0L);
            }
            kotlin.jvm.internal.j.z(this.f60322h, this.f60333s, null, new h(this, null), 2);
        }
    }

    public final boolean d() {
        return this.f60318d.f66200d && this.f60319e.a();
    }

    public final String e() {
        x xVar = this.f60316b;
        String d2 = xVar.d("SHARED_PREF_USER_AGENT", null);
        long a13 = xVar.a("SHARED_PREF_USER_AGENT_EXPIRY", 0L);
        if (d2 != null) {
            ((pb0.g) this.f60317c).getClass();
            if (a13 > System.currentTimeMillis()) {
                return d2;
            }
        }
        xVar.remove("SHARED_PREF_USER_AGENT");
        xVar.remove("SHARED_PREF_USER_AGENT_EXPIRY");
        return null;
    }
}
