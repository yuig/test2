package com.pinterest.feature.home.model;

import com.pinterest.api.model.DynamicFeed;
import dl1.a0;
import dl1.m;
import ew.n;
import ey.h3;
import ey.j3;
import ey.k3;
import hs1.q;
import i1.a1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kk2.r;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l7.w0;
import le.s;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.h0;
import nm.u;
import ny.j0;
import ny.v;
import qz.f0;
import tb0.p;
import uj2.b0;

/* loaded from: classes.dex */
public final class j implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f45801a;

    /* renamed from: b, reason: collision with root package name */
    public final k f45802b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f45803c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f45804d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.a0 f45805e;

    /* renamed from: f, reason: collision with root package name */
    public final qb0.e f45806f;

    /* renamed from: g, reason: collision with root package name */
    public final k3 f45807g;

    /* renamed from: h, reason: collision with root package name */
    public final q f45808h;

    /* renamed from: i, reason: collision with root package name */
    public final ac2.i f45809i;

    /* renamed from: j, reason: collision with root package name */
    public final ew.l f45810j;

    /* renamed from: k, reason: collision with root package name */
    public final ds.a f45811k;

    /* renamed from: l, reason: collision with root package name */
    public final n1 f45812l;

    public j(k homeService, k vxHomeService, h0 pageSizeProvider, uj2.a0 subscribeScheduler, uj2.a0 observeScheduler, qb0.e networkUtils, k3 perfLogger, q imageCache, ac2.i cronetEngineOwner, ew.l adsGmaHeaderManager, ds.a adNetwork, n1 hairballExperiments, x92.b developerPreferences) {
        j3 perfLogUtils = j3.f60510a;
        Intrinsics.checkNotNullParameter(homeService, "homeService");
        Intrinsics.checkNotNullParameter(vxHomeService, "vxHomeService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(subscribeScheduler, "subscribeScheduler");
        Intrinsics.checkNotNullParameter(observeScheduler, "observeScheduler");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(perfLogUtils, "perfLogUtils");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(cronetEngineOwner, "cronetEngineOwner");
        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(hairballExperiments, "hairballExperiments");
        Intrinsics.checkNotNullParameter(developerPreferences, "developerPreferences");
        this.f45801a = homeService;
        this.f45802b = vxHomeService;
        this.f45803c = pageSizeProvider;
        this.f45804d = subscribeScheduler;
        this.f45805e = observeScheduler;
        this.f45806f = networkUtils;
        this.f45807g = perfLogger;
        this.f45808h = imageCache;
        this.f45809i = cronetEngineOwner;
        this.f45810j = adsGmaHeaderManager;
        this.f45811k = adNetwork;
        this.f45812l = hairballExperiments;
        ((m60.d) ((m60.e) developerPreferences.f134366c)).g();
        boolean z13 = ff0.j.f62103a;
        ((m60.d) ((m60.e) developerPreferences.f134366c)).g();
        ((m60.d) ((m60.e) developerPreferences.f134366c)).g();
        ((m60.d) ((m60.e) developerPreferences.f134366c)).g();
        ((m60.d) ((m60.e) developerPreferences.f134366c)).g();
    }

    public static vd0.a g(Map map) {
        vd0.a aVar = new vd0.a();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            u uVar = new u();
            uVar.u(String.valueOf(r22.c.USE_CASE_ID.getValue()), str);
            String valueOf = String.valueOf(r22.c.SELECTED_OBJECTS.getValue());
            nm.q qVar = new nm.q();
            for (String str2 : list) {
                u uVar2 = new u();
                uVar2.u(String.valueOf(r22.f.OBJECT_ID.getValue()), str2);
                uVar2.u(String.valueOf(r22.f.OBJECT_TYPE.getValue()), "pin");
                qVar.t(uVar2);
            }
            Unit unit = Unit.f80348a;
            uVar.r(valueOf, qVar);
            aVar.f125618a.t(uVar);
        }
        return aVar;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        fk2.h hVar = new fk2.h(new w0(13), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "error(...)");
        return hVar;
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        b0<DynamicFeed> kVar;
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean a13 = params.a();
        int i13 = 1;
        ew.l lVar = this.f45810j;
        k kVar2 = this.f45801a;
        if (a13) {
            j3 j3Var = j3.f60510a;
            h3 g13 = j3.g(this.f45807g, v.f92540b, null, null);
            if (g13.f60496c) {
                os0.b bVar = os0.b.f97497a;
                new ny.a0(12, 0).i();
                new j0(16, 0).i();
            }
            h0 h0Var = this.f45803c;
            String valueOf = String.valueOf(h0Var.f85907c + h0Var.f85905a);
            HashMap hashMap = new HashMap(g13.f60495b);
            if (params.f45794g) {
                hashMap.put("X-Pinterest-AppState", m60.b.FOREGROUND.getApiHeader());
            }
            ew.c cVar = (ew.c) lVar;
            if (cVar.f60290g) {
                cVar.c(n.HOME, hashMap);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_autoplay_disabled", String.valueOf(1 ^ (ac2.f.f1945a.c() ? 1 : 0)));
            f0 f0Var = new f0(linkedHashMap);
            n1 n1Var = this.f45812l;
            n1Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) n1Var.f83439a;
            if (g1Var.o("android_ad_connection_type", "enabled", z3Var) || g1Var.l("android_ad_connection_type")) {
                f0Var.c(((ds.d) this.f45811k).a(), "connection_type");
            }
            if (params.f45795h) {
                f0Var.e("in_nux", "true");
            }
            Map map = params.f45796i;
            if (map != null) {
                f0Var.d(g(map), "nux_signals_map");
            }
            if (params.a()) {
                f0Var.e("link_header", valueOf);
            }
            f0Var.e("in_local_navigation", String.valueOf(params.f45797j));
            f0Var.e("fields", n00.b.a(n00.c.DYNAMIC_GRID_FEED_WITH_BOARD_FIELDS));
            f0Var.e("page_size", valueOf);
            f0Var.c(0, "item_count");
            f0Var.c(6, "dynamic_grid_stories");
            f0Var.c((int) (vb0.j.f125485t / 1000), "network_bandwidth_kbps");
            u uVar = new u();
            uVar.u("java_heap_space", (Runtime.getRuntime().maxMemory() / 1048576) + "MB");
            uVar.u("image_width", "236x");
            String sVar = uVar.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            f0Var.e("device_info", sVar);
            kVar = kVar2.a(hashMap, f0Var.i());
        } else if (params.f123037c == 2) {
            Map<String, String> hashMap2 = new HashMap<>();
            ew.c cVar2 = (ew.c) lVar;
            if (cVar2.f60290g) {
                cVar2.c(n.HOME, hashMap2);
            }
            String str = params.f123038d;
            Intrinsics.checkNotNullExpressionValue(str, "getNextRequestUrl(...)");
            if (str.length() == 0) {
                IllegalStateException illegalStateException = new IllegalStateException("Next page requests MUST have valid next request URL");
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(illegalStateException, "Next page requests MUST have valid next request URL", p.HOME_FEED);
                kVar = r.f79973a;
            } else {
                Intrinsics.checkNotNullExpressionValue(str, "getNextRequestUrl(...)");
                kVar = kVar2.b(hashMap2, str);
            }
        } else {
            kVar = new kk2.k(new s(i13), 0);
        }
        ir.j jVar = new ir.j(20, new u00.e(params, 7));
        kVar.getClass();
        t l13 = new kk2.m(kVar, jVar, 2).k(new ir.j(21, new i2.i(19, params, this))).r(this.f45804d).l(this.f45805e);
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return l13;
    }

    @Override // dl1.a0
    public final uj2.l c(m mVar, dl1.s sVar) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return new hk2.c(new w0(12), 1);
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        g params = (g) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        kk2.k kVar = new kk2.k(new w0(14), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }

    public final void f(DynamicFeed dynamicFeed, Integer num) {
        hs1.t.b().F(new ug0.d(29, new a1(dynamicFeed, num, this, 10)), new h(0, i.f45800i), new vy.c(6), ck2.i.f27924d);
    }
}
