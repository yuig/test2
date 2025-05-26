package ug0;

import a.cb;
import a7.o;
import h32.f1;
import ir.j;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jk2.x;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.d0;
import nx.r0;
import rg0.s;
import t3.s1;
import uj2.b0;
import uj2.q;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final tg0.b f122136a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.e f122137b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f122138c;

    /* renamed from: d, reason: collision with root package name */
    public final v f122139d;

    /* renamed from: e, reason: collision with root package name */
    public final v f122140e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f122141f;

    /* renamed from: g, reason: collision with root package name */
    public final uk2.f f122142g;

    /* renamed from: h, reason: collision with root package name */
    public xj2.c f122143h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.f f122144i;

    public i(tg0.b experiencesService, m60.e applicationInfo, d0 pinalytics, wg0.a placementOverrideCache, o experiencesDeveloperOptions) {
        Intrinsics.checkNotNullParameter(experiencesService, "experiencesService");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(placementOverrideCache, "placementOverrideCache");
        Intrinsics.checkNotNullParameter(experiencesDeveloperOptions, "experiencesDeveloperOptions");
        this.f122136a = experiencesService;
        this.f122137b = applicationInfo;
        this.f122138c = pinalytics;
        this.f122139d = m.b(g.f122132i);
        this.f122140e = m.b(new r0(this, 5));
        this.f122141f = new LinkedHashSet();
        this.f122142g = cb.r("create(...)");
        this.f122144i = cb.r("create(...)");
        f0.u0(this);
    }

    public static final void a(i iVar, String str, Throwable th3) {
        iVar.getClass();
        iVar.f122142g.c(new a(str, th3));
    }

    public static /* synthetic */ q d(i iVar, String str, String str2, String str3, nl.b bVar, int i13) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return iVar.c(str, str2, str3, bVar, null);
    }

    public final x b(nl.b sideEffect, vd0.c response) {
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        Intrinsics.checkNotNullParameter(response, "response");
        x H = new ol1.d(new n7.o(response, sideEffect, this, 6), 2).H(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    public final q c(String placementId, String experienceId, String str, nl.b sideEffect, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        HashMap hashMap2 = new HashMap();
        if (str != null) {
            hashMap2.put("extra_context", str);
        }
        q j13 = j(new tg0.a("PUT", s1.d(new Object[]{placementId, experienceId}, 2, "/v3/experiences/%s:%s/completed/", "format(...)"), hashMap2), sideEffect);
        this.f122138c.g(f1.EXPERIENCE_COMPLETED, experienceId, hashMap, false);
        return j13;
    }

    public final q e(String placementId, String experienceId, String str, nl.b sideEffect, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        HashMap hashMap2 = new HashMap();
        if (str != null) {
            hashMap2.put("extra_context", str);
        }
        q j13 = j(new tg0.a("PUT", s1.d(new Object[]{placementId, experienceId}, 2, "/v3/experiences/%s:%s/dismiss/", "format(...)"), hashMap2), sideEffect);
        this.f122138c.g(f1.EXPERIENCE_DISMISSED, experienceId, hashMap, false);
        return j13;
    }

    public final pn.c g(tg0.c sideEffect) {
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        String p13 = com.bumptech.glide.c.p1(((dh0.d) i()).f54988g);
        ((m60.d) this.f122137b).g();
        b0<vd0.c> d2 = this.f122136a.d(p13, null);
        j jVar = new j(17, new h(this, sideEffect, 0));
        d2.getClass();
        pn.c cVar = new pn.c(1, d2, jVar);
        Intrinsics.checkNotNullExpressionValue(cVar, "flatMapObservable(...)");
        return cVar;
    }

    public final q h(List placementIds, Map map, boolean z13, nl.b sideEffect) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        String Z = CollectionsKt.Z(placementIds, ",", null, null, 0, null, null, 62);
        m60.e eVar = this.f122137b;
        if (z13) {
            HashMap o13 = ep.b.o("placement_ids", Z);
            String p13 = com.bumptech.glide.c.p1(map == null ? ((dh0.d) i()).f54988g : z0.j(((dh0.d) i()).f54988g, map));
            if (p13 != null) {
            }
            ((m60.d) eVar).g();
            return j(new tg0.a("GET", "/v3/experiences/", o13), sideEffect);
        }
        String valueOf = String.valueOf(1);
        String p14 = com.bumptech.glide.c.p1(map == null ? ((dh0.d) i()).f54988g : z0.j(((dh0.d) i()).f54988g, map));
        ((m60.d) eVar).g();
        b0<vd0.c> a13 = this.f122136a.a(Z, valueOf, p14, null);
        j jVar = new j(15, new gd0.c(10, this, sideEffect));
        a13.getClass();
        return new pn.c(1, a13, jVar);
    }

    public final s i() {
        return (s) this.f122139d.getValue();
    }

    public final q j(tg0.a aVar, nl.b bVar) {
        synchronized (this.f122141f) {
            this.f122141f.add(aVar);
        }
        xj2.c cVar = this.f122143h;
        if (cVar != null) {
            cVar.dispose();
        }
        int i13 = 2;
        this.f122143h = this.f122144i.m(100L, TimeUnit.MILLISECONDS, tk2.e.f118016b).F(new d(0, new e(this, i13)), new d(1, new e(this, 3)), ck2.i.f27923c, ck2.i.f27924d);
        this.f122144i.c(Unit.f80348a);
        uk2.f fVar = this.f122142g;
        dl1.b0 b0Var = new dl1.b0(0, new u00.e(aVar, 6));
        fVar.getClass();
        q t13 = new x(fVar, b0Var, i13).I(1L).t(new j(14, new h(this, bVar, i13)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    public final q k(String placementId, String experienceId, vd0.c cVar) {
        tg0.d sideEffect = tg0.d.f117578b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        HashMap hashMap = new HashMap();
        if (cVar != null) {
            hashMap.put("extra_context", cVar.f125623a.toString());
        }
        return j(new tg0.a("PUT", s1.d(new Object[]{placementId, experienceId}, 2, "/v3/experiences/%s:%s/trigger/", "format(...)"), hashMap), sideEffect);
    }

    public final q l(String placementId, String experienceId, String str, HashMap hashMap) {
        tg0.d sideEffect = tg0.d.f117578b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        HashMap hashMap2 = new HashMap();
        if (str != null) {
            hashMap2.put("extra_context", str);
        }
        q j13 = j(new tg0.a("PUT", s1.d(new Object[]{placementId, experienceId}, 2, "/v3/experiences/%s:%s/viewed/", "format(...)"), hashMap2), sideEffect);
        this.f122138c.g(f1.EXPERIENCE_VIEWED, experienceId, hashMap, false);
        return j13;
    }
}
