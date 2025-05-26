package fv;

import android.util.LruCache;
import ao2.f0;
import ao2.j0;
import ao2.k2;
import ao2.v0;
import cc2.h;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import h32.f3;
import h32.g3;
import h32.i0;
import h32.k4;
import h32.r3;
import h32.z1;
import java.util.concurrent.CancellationException;
import ko2.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j;
import lh0.z3;
import nx.d0;
import pb0.g;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f63000a;

    /* renamed from: b, reason: collision with root package name */
    public final cc2.c f63001b;

    /* renamed from: c, reason: collision with root package name */
    public final pb0.a f63002c;

    /* renamed from: d, reason: collision with root package name */
    public final j f63003d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f63004e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f63005f;

    /* renamed from: g, reason: collision with root package name */
    public final LruCache f63006g;

    /* renamed from: h, reason: collision with root package name */
    public k2 f63007h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f63008i;

    public c(d0 pinalytics, cc2.c videoPinalytics, pb0.a clock, qs.a adsBtrImpressionLogger, j adsExperiments, j0 applicationScope) {
        f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(videoPinalytics, "videoPinalytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(adsBtrImpressionLogger, "adsBtrImpressionLogger");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f63000a = pinalytics;
        this.f63001b = videoPinalytics;
        this.f63002c = clock;
        this.f63003d = adsExperiments;
        this.f63004e = applicationScope;
        this.f63005f = ioDispatcher;
        this.f63006g = new LruCache(100);
    }

    public static double f(f30 f30Var) {
        String v13;
        double intValue = (f30Var.v6() != null ? r0.u() : 0).intValue() * 5000;
        dl0 v63 = f30Var.v6();
        return intValue + ((v63 == null || (v13 = v63.v()) == null) ? 0.0d : Double.parseDouble(v13));
    }

    public final e a(f30 f30Var) {
        return (e) this.f63006g.get(f30Var.getUid());
    }

    public final void b(f30 f30Var, long j13, long j14) {
        ((g) this.f63002c).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Long valueOf = Long.valueOf(currentTimeMillis - (j14 - j13));
        Long valueOf2 = Long.valueOf(currentTimeMillis);
        Long valueOf3 = Long.valueOf(j13);
        Long valueOf4 = Long.valueOf(j14);
        Long valueOf5 = Long.valueOf((long) f(f30Var));
        r3 r3Var = r3.PLAYING;
        g3 g3Var = new g3(null, null, null, null, valueOf, valueOf2, valueOf3, valueOf4, null, Double.valueOf(1.0d), null, null, null, Integer.valueOf(cc2.g.INVALID_QUARTILE.getTraditionalQuartile()), r3Var, null, null, null, null, null, k4.WATCHTIME_PLAYSTATE, null, valueOf5, null, null, null, null, null);
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        i0 p13 = this.f63000a.p();
        if (p13 == null) {
            p13 = new i0(null, null, null, null, null, null);
        }
        this.f63001b.c(g3Var, "", uid, p13, false);
    }

    public final void c(f30 f30Var, h hVar, boolean z13) {
        e a13 = a(f30Var);
        if (a13 != null) {
            ((g) this.f63002c).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j13 = 5000;
            if (!z13) {
                j13 = (a13.a() + (currentTimeMillis - a13.b())) % 5000;
            }
            long j14 = j13;
            long f13 = (long) f(f30Var);
            f3 f3Var = new f3();
            f3Var.f67005w = Long.valueOf((long) f(f30Var));
            f3Var.f66992j = Double.valueOf(1.0d);
            f3Var.f66997o = r3.PLAYING;
            Unit unit = Unit.f80348a;
            i0 p13 = this.f63000a.p();
            if (p13 == null) {
                p13 = new i0(null, null, null, null, null, null);
            }
            hVar.a(j14, f13, f3Var, this.f63001b, p13);
        }
    }

    public final void d(f30 f30Var, e eVar) {
        LruCache lruCache = this.f63006g;
        String uid = f30Var.getUid();
        if (eVar == null) {
            eVar = new e();
        }
        lruCache.put(uid, eVar);
    }

    public final void e(f30 f30Var) {
        j jVar = this.f63003d;
        jVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) jVar.f83394a;
        if (g1Var.o("android_idea_ads_grid_static_playtime", "enabled", z3Var) || g1Var.l("android_idea_ads_grid_static_playtime")) {
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            h hVar = new h("", uid);
            e a13 = a(f30Var);
            long j13 = 5000;
            if (a13 == null || a13.a() != 0) {
                e a14 = a(f30Var);
                long a15 = a14 != null ? a14.a() : cc2.g.INVALID_QUARTILE.getTraditionalQuartile();
                long f13 = (long) f(f30Var);
                this.f63000a.p();
                hVar.b(a15, f13);
                e a16 = a(f30Var);
                j13 = 5000 - (a16 != null ? a16.a() : 0L);
            }
            a aVar = new a(this, f30Var, j13, hVar, null);
            j0 j0Var = this.f63004e;
            f0 f0Var = this.f63005f;
            this.f63007h = kotlin.jvm.internal.j.z(j0Var, f0Var, null, aVar, 2);
            this.f63008i = kotlin.jvm.internal.j.z(j0Var, f0Var, null, new b(this, f30Var, hVar, null), 2);
        }
    }

    public final void g(f30 f30Var, boolean z13, z1 z1Var) {
        e a13;
        e a14;
        if (f30Var != null) {
            LruCache lruCache = this.f63006g;
            e eVar = null;
            if (z13) {
                if (z1Var != null && lruCache.get(f30Var.getUid()) == null) {
                    d(f30Var, null);
                    e(f30Var);
                    return;
                }
                if (lruCache.get(f30Var.getUid()) == null || (a14 = a(f30Var)) == null || !a14.f63009a) {
                    return;
                }
                e a15 = a(f30Var);
                if (a15 != null) {
                    a15.f63009a = false;
                    Unit unit = Unit.f80348a;
                    eVar = a15;
                }
                d(f30Var, eVar);
                e(f30Var);
                return;
            }
            if (lruCache.get(f30Var.getUid()) == null || (a13 = a(f30Var)) == null || a13.f63009a) {
                return;
            }
            e a16 = a(f30Var);
            if (a16 != null) {
                a16.f63009a = true;
                Unit unit2 = Unit.f80348a;
            } else {
                a16 = null;
            }
            d(f30Var, a16);
            vb0.e eVar2 = j.f83391b;
            if (j.f83392c == null) {
                eVar2.f().invoke();
                eVar2.g(lh0.c.f83307k);
            }
            j jVar = j.f83392c;
            if (jVar == null) {
                Intrinsics.r("INSTANCE");
                throw null;
            }
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) jVar.f83394a;
            if (g1Var.o("android_idea_ads_grid_static_playtime", "enabled", z3Var) || g1Var.l("android_idea_ads_grid_static_playtime")) {
                k2 k2Var = this.f63007h;
                if (k2Var != null) {
                    k2Var.cancel((CancellationException) null);
                }
                k2 k2Var2 = this.f63008i;
                if (k2Var2 != null) {
                    k2Var2.cancel((CancellationException) null);
                }
                ((g) this.f63002c).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                e a17 = a(f30Var);
                if (a17 != null) {
                    long j13 = currentTimeMillis - a17.f63010b;
                    long j14 = a17.f63011c;
                    long j15 = (j13 + j14) % 5000;
                    b(f30Var, j14, j15);
                    a17.f63011c = j15;
                    Unit unit3 = Unit.f80348a;
                    d(f30Var, a17);
                }
            }
        }
    }
}
