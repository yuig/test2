package oy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ey.k3;
import h32.a4;
import h32.d4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z1 extends ey.v1 {

    /* renamed from: q, reason: collision with root package name */
    public static final s92.l f98252q = s92.l.USER_NAVIGATION;

    /* renamed from: r, reason: collision with root package name */
    public static final Set f98253r = kotlin.collections.h1.f(k.class, j.class, i.class, a.class, p2.class, o2.class, a1.class, z0.class, g.class, f.class, p1.class, o1.class, s1.class, r1.class, o.class, l.class, d2.class, c2.class, f2.class, e2.class, n.class, m.class, k2.class, j2.class, m2.class, l2.class, c.class, b.class, u0.class, t0.class, w0.class, v0.class, g1.class, f1.class, v1.class, u1.class, m2.class, l2.class, e.class, d.class, j1.class, i1.class);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f98254f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f98255g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f98256h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f98257i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f98258j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f98259k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f98260l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f98261m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f98262n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f98263o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f98264p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f98254f = new LinkedHashMap();
        this.f98255g = new LinkedHashMap();
        this.f98256h = new LinkedHashMap();
        this.f98257i = new LinkedHashMap();
        this.f98258j = new LinkedHashMap();
        this.f98259k = new LinkedHashMap();
        this.f98260l = new LinkedHashMap();
        this.f98261m = new LinkedHashMap();
        this.f98262n = new LinkedHashMap();
        this.f98263o = new LinkedHashMap();
        this.f98264p = new LinkedHashMap();
    }

    public static void E(int i13, int i14, s92.o oVar, Function0 function0) {
        int i15 = x1.f98242a[oVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            function0.invoke();
        } else if (i15 == 3 && i13 >= i14) {
            function0.invoke();
        }
    }

    public final void A(l lVar, boolean z13) {
        ey.u1 e2Var;
        if (z13) {
            e2Var = new c2(lVar.f98133e);
            e2Var.f60583a = lVar.f60583a;
        } else {
            e2Var = new e2(lVar.f98133e);
            e2Var.f60583a = lVar.f60583a;
        }
        o(e2Var);
        a2 a2Var = lVar.f98133e;
        if (!z13 || a2Var.e() == s92.o.COMPLETE) {
            String i13 = a2Var.i();
            int g13 = a2Var.g();
            int c13 = a2Var.c();
            long j13 = lVar.f60583a;
            s92.o e13 = a2Var.e();
            E(g13, c13, e13, new y1(this, i13, j13, e13));
        }
    }

    public final void B(m mVar, boolean z13) {
        ey.u1 l2Var;
        if (z13) {
            l2Var = new j2(mVar.f98142e);
            l2Var.f60583a = mVar.f60583a;
        } else {
            l2Var = new l2(mVar.f98142e);
            l2Var.f60583a = mVar.f60583a;
        }
        o(l2Var);
        h2 h2Var = mVar.f98142e;
        i(h2Var.g() / 1000, "video.size.exported.kilobytes");
        i(h2Var.f(), "video.duration");
        String e13 = h2Var.e();
        long j13 = mVar.f60583a;
        p2 p2Var = new p2(e13);
        p2Var.f60583a = j13;
        o(p2Var);
        i(h2Var.g() / 1000, "video.size.exported.kilobytes");
        i(h2Var.f(), "video.duration");
        if (h2Var.h() != null) {
            l("user.cancelled", h2Var.h().booleanValue());
        }
        if (h2Var.a() != null) {
            j("failure.message", h2Var.a());
        }
        LinkedHashMap linkedHashMap = this.f98264p;
        e1 e1Var = (e1) linkedHashMap.get(h2Var.e());
        linkedHashMap.put(h2Var.e(), e1Var != null ? e1.a(e1Var, h2Var.g(), h2Var.f()) : new e1(false, 0L, 0L, h2Var.g(), h2Var.f(), 6));
        boolean z14 = h2Var.c() == s92.o.ERROR || Intrinsics.d(h2Var.h(), Boolean.TRUE);
        if (z13 || !z14) {
            return;
        }
        String e14 = h2Var.e();
        int d2 = h2Var.d();
        int b13 = h2Var.b();
        s92.o c13 = h2Var.c();
        E(d2, b13, c13, new y1(this, e14, mVar.f60583a, c13));
    }

    public final void C(n nVar, boolean z13) {
        ey.u1 m2Var;
        String h10 = nVar.f98146e.h();
        long j13 = nVar.f60583a;
        p2 p2Var = new p2(h10);
        p2Var.f60583a = j13;
        o(p2Var);
        i2 i2Var = nVar.f98146e;
        i(i2Var.f() / 1000, "video.size.raw.kilobytes");
        i(i2Var.g(), "video.duration.raw");
        this.f98264p.put(i2Var.h(), new e1(false, i2Var.f(), i2Var.g(), 0L, 0L, 24));
        if (z13) {
            m2Var = new k2(i2Var);
            m2Var.f60583a = nVar.f60583a;
        } else {
            m2Var = new m2(i2Var);
            m2Var.f60583a = nVar.f60583a;
        }
        o(m2Var);
    }

    public final void D(o oVar, boolean z13) {
        ey.u1 f2Var;
        String g13 = oVar.f98157e.g();
        long j13 = oVar.f60583a;
        p2 p2Var = new p2(g13);
        p2Var.f60583a = j13;
        o(p2Var);
        b2 b2Var = oVar.f98157e;
        if (z13) {
            f2Var = new d2(b2Var);
            f2Var.f60583a = oVar.f60583a;
        } else {
            f2Var = new f2(b2Var);
            f2Var.f60583a = oVar.f60583a;
        }
        o(f2Var);
    }

    public final void F(j jVar) {
        if (!d()) {
            o(new h(jVar));
            return;
        }
        ey.j1.f60506c = false;
        if (jVar.f98095l == s92.o.COMPLETE) {
            String str = jVar.f98088e;
            if (str == null) {
                str = "";
            }
            j("pin.id", str);
            Boolean bool = jVar.f98089f;
            if (bool != null) {
                l("draft", bool.booleanValue());
            }
            String str2 = jVar.f98093j;
            if (str2 != null) {
                j("entry.type", str2);
            }
        } else {
            String str3 = jVar.f98090g;
            if (str3 != null) {
                j("failure.message", str3);
            }
            r32.c cVar = jVar.f98091h;
            if (cVar != null) {
                k("failure.reason", (short) cVar.getValue());
            }
            String str4 = jVar.f98092i;
            if (str4 != null) {
                j("failure.response.code", str4);
            }
            if (jVar.f98095l == s92.o.ABORTED) {
                l("user.cancelled", jVar.f98094k);
            }
        }
        LinkedHashMap linkedHashMap = this.f98264p;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        for (e1 e1Var : linkedHashMap.values()) {
            if (e1Var.f()) {
                long e13 = e1Var.e() + j13;
                j14 = e1Var.c() + j14;
                j13 = e13;
            } else {
                long e14 = e1Var.e() + j15;
                long c13 = e1Var.c() + j16;
                long d2 = e1Var.d() + j17;
                j18 = e1Var.b() + j18;
                j17 = d2;
                j16 = c13;
                j15 = e14;
            }
        }
        i(j13 / 1000, "total.image.size.raw.kilobytes");
        i(j14 / 1000, "total.image.size.exported.kilobytes");
        i(j15 / 1000, "total.video.size.raw.kilobytes");
        i(j16 / 1000, "total.video.size.exported.kilobytes");
        i((j13 + j15) / 1000, "total.size.raw.kilobytes");
        i((j14 + j16) / 1000, "total.size.exported.kilobytes");
        i(j17, "total.video.duration.raw");
        i(j18, "total.video.duration");
        a(jVar.f98095l, f98252q, d4.STORY_PIN_CREATE_RESPONSE, a4.STORY_PIN_CREATE, jVar.c(), false);
        v();
        linkedHashMap.clear();
    }

    public final void G(long j13, s0 s0Var) {
        k("pwt.result", (short) s0Var.e().getValue());
        if (s0Var.b() != null) {
            j("image.signature", s0Var.b());
        }
        if (s0Var.i() != null) {
            i(s0Var.i().longValue(), "image.upload.duration");
        }
        if (s0Var.d() != null) {
            j("tracking.id", s0Var.d());
        }
        if (s0Var.g() != null) {
            j("support.work.status", s0Var.g());
        }
        if (s0Var.a() != null) {
            j("failure.message", s0Var.a());
        }
        if (s0Var.j() != null) {
            l("user.cancelled", s0Var.j().booleanValue());
        }
        r(j13);
    }

    public final void H(long j13, x0 x0Var) {
        q(j13);
        k("retry.count", (short) x0Var.j());
        i(x0Var.d() / 1000, "image.size.raw.kilobytes");
        j("page.id", x0Var.g());
        j("file.uri", x0Var.e());
        if (x0Var.l() != null) {
            l("cover.image", x0Var.l().booleanValue());
        }
        if (x0Var.a() != null) {
            i(x0Var.a().longValue() / 1000, "image.size.exported.kilobytes");
        }
        if (x0Var.i() != null) {
            h(x0Var.i().intValue(), "image.raw.width");
        }
        if (x0Var.h() != null) {
            h(x0Var.h().intValue(), "image.raw.height");
        }
        if (x0Var.c() != null) {
            h(x0Var.c().intValue(), "image.exported.width");
        }
        if (x0Var.b() != null) {
            h(x0Var.b().intValue(), "image.exported.height");
        }
        if (x0Var.f() != null) {
            l("media.export.skipped", x0Var.f().booleanValue());
        }
    }

    public final void I(long j13, n1 n1Var) {
        k("pwt.result", (short) n1Var.c().getValue());
        if (n1Var.f() != null) {
            i(n1Var.f().longValue(), "upload.id");
        }
        if (n1Var.g() != null) {
            j("upload.url", n1Var.g());
        }
        if (n1Var.a() != null) {
            j("failure.message", n1Var.a());
        }
        if (n1Var.h() != null) {
            l("user.cancelled", n1Var.h().booleanValue());
        }
        r(j13);
    }

    public final void J(long j13, h2 h2Var) {
        if (h2Var.a() != null) {
            j("failure.message", h2Var.a());
        }
        k("pwt.result", (short) h2Var.c().getValue());
        r(j13);
    }

    public final void K(long j13, i2 i2Var) {
        q(j13);
        k("retry.count", (short) i2Var.e());
        j("page.id", i2Var.d());
        k("media.count", (short) i2Var.b());
        if (i2Var.a() > 0) {
            k("image.count", (short) i2Var.a());
        }
        if (i2Var.i() > 0) {
            k("video.count", (short) i2Var.i());
            i(i2Var.f() / 1000, "video.size.raw.kilobytes");
            i(i2Var.g(), "video.duration.raw");
        }
        j("media.details", i2Var.c());
    }

    public final void L(long j13, a2 a2Var) {
        if (a2Var.d() != null) {
            j("tracking.id", a2Var.d());
        }
        if (a2Var.b() != null) {
            j("failure.message", a2Var.b());
        }
        if (a2Var.l() != null) {
            l("user.cancelled", a2Var.l().booleanValue());
        }
        if (a2Var.k() != null) {
            i(a2Var.k().longValue(), "video.upload.duration");
        }
        if (a2Var.f() != null) {
            j("response.headers", a2Var.f());
        }
        if (a2Var.a() != null) {
            i(a2Var.a().longValue(), "bytes.written");
        }
        if (a2Var.h() != null) {
            i(a2Var.h().longValue(), "total.bytes.to.write");
        }
        if (a2Var.j() != null) {
            j("upload.status", a2Var.j());
        }
        k("pwt.result", (short) a2Var.e().getValue());
        r(j13);
    }

    public final void M(long j13, b2 b2Var) {
        q(j13);
        k("retry.count", (short) b2Var.f());
        j("page.id", b2Var.d());
        j("file.uri", b2Var.b());
        i(b2Var.a() / 1000, "video.size.exported.kilobytes");
        if (b2Var.e() >= 0) {
            h(b2Var.e(), "post.registration.time.duration.in.min");
        }
        if (b2Var.c() != null) {
            l("media.export.skipped", b2Var.c().booleanValue());
        }
    }

    @Override // ey.v1
    public final Set b() {
        return f98253r;
    }

    @Override // ey.v1
    public final boolean o(ey.u1 e13) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean o13 = super.o(e13);
        LinkedHashMap linkedHashMap = this.f98263o;
        LinkedHashMap linkedHashMap2 = this.f98262n;
        LinkedHashMap linkedHashMap3 = this.f98261m;
        LinkedHashMap linkedHashMap4 = this.f98260l;
        LinkedHashMap linkedHashMap5 = this.f98257i;
        LinkedHashMap linkedHashMap6 = this.f98256h;
        LinkedHashMap linkedHashMap7 = this.f98255g;
        LinkedHashMap linkedHashMap8 = this.f98254f;
        LinkedHashMap linkedHashMap9 = this.f98259k;
        LinkedHashMap linkedHashMap10 = this.f98258j;
        boolean z13 = true;
        if (!o13) {
            if (!(e13 instanceof m1)) {
                return false;
            }
            if (e13 instanceof c) {
                linkedHashMap10.put(((c) e13).f98018e.k(), e13);
            } else if (e13 instanceof b) {
                linkedHashMap9.put(((b) e13).f98004e.h(), e13);
            } else if (e13 instanceof g) {
                linkedHashMap8.put(((g) e13).f98054e.c(), e13);
            } else if (e13 instanceof f) {
                linkedHashMap7.put(((f) e13).f98042e.e(), e13);
            } else if (e13 instanceof o) {
                linkedHashMap6.put(((o) e13).f98157e.g(), e13);
            } else if (e13 instanceof l) {
                linkedHashMap5.put(((l) e13).f98133e.i(), e13);
            } else if (e13 instanceof n) {
                linkedHashMap4.put(((n) e13).f98146e.h(), e13);
            } else if (e13 instanceof m) {
                linkedHashMap3.put(((m) e13).f98142e.e(), e13);
            } else if (e13 instanceof e) {
                linkedHashMap2.put(((e) e13).f98031e.b(), e13);
            } else if (e13 instanceof d) {
                linkedHashMap.put(((d) e13).f98026e.c(), e13);
            } else {
                if (e13 instanceof i) {
                    v();
                }
                z13 = false;
            }
        } else if (e13 instanceof k) {
            this.f98264p.clear();
            k kVar = (k) e13;
            q(kVar.c());
            j("initiated.by", kVar.f98101e.getValue());
            k("image.count", (short) kVar.f98102f);
            k("video.count", (short) kVar.f98103g);
            j("page.ids", kVar.f98104h);
            qb0.e eVar = qb0.d.f103396a;
            ConnectivityManager connectivityManager = eVar.f103403g;
            if (connectivityManager == null) {
                Context context = kb0.a.f79058b;
                connectivityManager = (ConnectivityManager) m60.f0.X().getSystemService("connectivity");
                eVar.f103403g = connectivityManager;
            }
            int i13 = -1;
            if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                i13 = networkCapabilities.getLinkUpstreamBandwidthKbps();
            }
            h(i13, "maximum.upload.speed.kilobits");
            int i14 = kVar.f98113q;
            h(i14, "preupload.count.from.this.session");
            int i15 = kVar.f98114r;
            h(i15, "preupload.count.from.last.session");
            k("prepublish.pages.finished", (short) (i14 + i15));
            k("prepublish.video.export.started", (short) kVar.f98105i);
            k("prepublish.video.upload.started", (short) kVar.f98106j);
            k("prepublish.image.upload.started", (short) kVar.f98107k);
            k("prepublish.cover.image.upload.started", (short) kVar.f98108l);
            k("prepublish.video.export.finished", (short) kVar.f98109m);
            k("prepublish.video.upload.finished", (short) kVar.f98110n);
            k("prepublish.image.upload.finished", (short) kVar.f98111o);
            k("prepublish.cover.image.upload.finished", (short) kVar.f98112p);
            ey.j1.f60506c = true;
            Iterator it = CollectionsKt.F0(linkedHashMap10.values()).iterator();
            while (it.hasNext()) {
                x((c) it.next(), true);
            }
            for (b bVar : CollectionsKt.F0(linkedHashMap9.values())) {
                w(bVar, linkedHashMap10.containsKey(bVar.f98004e.h()));
                s0 s0Var = bVar.f98004e;
                linkedHashMap9.remove(s0Var.h());
                linkedHashMap10.remove(s0Var.h());
            }
            Iterator it2 = CollectionsKt.F0(linkedHashMap4.values()).iterator();
            while (it2.hasNext()) {
                C((n) it2.next(), true);
            }
            for (m mVar : CollectionsKt.F0(linkedHashMap3.values())) {
                B(mVar, linkedHashMap4.containsKey(mVar.f98142e.e()));
                h2 h2Var = mVar.f98142e;
                linkedHashMap3.remove(h2Var.e());
                linkedHashMap4.remove(h2Var.e());
            }
            Iterator it3 = CollectionsKt.F0(linkedHashMap8.values()).iterator();
            while (it3.hasNext()) {
                z((g) it3.next(), true);
            }
            for (f fVar : CollectionsKt.F0(linkedHashMap7.values())) {
                y(fVar, linkedHashMap8.containsKey(fVar.f98042e.e()));
                n1 n1Var = fVar.f98042e;
                linkedHashMap7.remove(n1Var.e());
                linkedHashMap8.remove(n1Var.e());
            }
            for (e eVar2 : CollectionsKt.F0(linkedHashMap2.values())) {
                j1 j1Var = new j1(eVar2.f98031e);
                j1Var.f60583a = eVar2.f60583a;
                o(j1Var);
            }
            for (d dVar : CollectionsKt.F0(linkedHashMap.values())) {
                i1 i1Var = new i1(dVar.f98026e);
                i1Var.f60583a = dVar.f60583a;
                o(i1Var);
                h1 h1Var = dVar.f98026e;
                linkedHashMap.remove(h1Var.c());
                linkedHashMap2.remove(h1Var.c());
            }
            Iterator it4 = CollectionsKt.F0(linkedHashMap6.values()).iterator();
            while (it4.hasNext()) {
                D((o) it4.next(), true);
            }
            for (l lVar : CollectionsKt.F0(linkedHashMap5.values())) {
                A(lVar, linkedHashMap6.containsKey(lVar.f98133e.i()));
                a2 a2Var = lVar.f98133e;
                linkedHashMap5.remove(a2Var.i());
                linkedHashMap6.remove(a2Var.i());
            }
        } else if (e13 instanceof a) {
            e(e13.c(), "check_work_cancel");
        } else if (e13 instanceof j) {
            F((j) e13);
        } else if (e13 instanceof g1) {
            g1 g1Var = (g1) e13;
            q(g1Var.c());
            j("media.ids", g1Var.f98055f);
        } else if (e13 instanceof f1) {
            f1 f1Var = (f1) e13;
            k("pwt.result", (short) f1Var.f98050j.getValue());
            String str = f1Var.f98047g;
            if (str != null && str.length() != 0) {
                j("page.id.to.video.signature", str);
            }
            String str2 = f1Var.f98046f;
            if (str2 != null) {
                j("upload.id.to.status", str2);
            }
            String str3 = f1Var.f98048h;
            if (str3 != null) {
                j("failure.message", str3);
            }
            Boolean bool = f1Var.f98049i;
            if (bool != null) {
                l("user.cancelled", bool.booleanValue());
            }
            r(f1Var.c());
        } else if (e13 instanceof v1) {
            v1 v1Var = (v1) e13;
            q(v1Var.c());
            k("retry.count", (short) v1Var.f98222h);
            Integer num = v1Var.f98223i;
            if (num != null) {
                h(num.intValue(), "template.type");
            }
            l("is.scheduled", v1Var.f98224j);
        } else if (e13 instanceof u1) {
            u1 u1Var = (u1) e13;
            String str4 = u1Var.f98210i;
            if (str4 != null) {
                j("story.pin.data", str4);
            }
            h(u1Var.f98211j, "story.pin.data.size.in.bytes");
            k("pwt.result", (short) u1Var.f98215n.getValue());
            String str5 = u1Var.f98209h;
            if (str5 != null) {
                j("pin.id", str5);
            }
            l("is.user.caused.error", u1Var.f98212k);
            String str6 = u1Var.f98213l;
            if (str6 != null) {
                j("failure.message", str6);
            }
            Boolean bool2 = u1Var.f98214m;
            if (bool2 != null) {
                l("user.cancelled", bool2.booleanValue());
            }
            r(u1Var.c());
        } else if (e13 instanceof h) {
            h hVar = (h) e13;
            q(hVar.l().c());
            if (d()) {
                l("logging.failure", true);
                F(hVar.l());
            }
            z13 = false;
        } else if (e13 instanceof c) {
            x((c) e13, false);
        } else if (e13 instanceof b) {
            b bVar2 = (b) e13;
            s0 s0Var2 = bVar2.f98004e;
            w(bVar2, linkedHashMap6.containsKey(s0Var2.h()));
            linkedHashMap9.remove(s0Var2.h());
            linkedHashMap10.remove(s0Var2.h());
        } else if (e13 instanceof u0) {
            H(e13.c(), ((u0) e13).f98205e);
        } else if (e13 instanceof t0) {
            G(e13.c(), ((t0) e13).f98199e);
        } else if (e13 instanceof w0) {
            H(e13.c(), ((w0) e13).f98226e);
        } else if (e13 instanceof v0) {
            G(e13.c(), ((v0) e13).f98218e);
        } else if (e13 instanceof g) {
            z((g) e13, false);
        } else if (e13 instanceof f) {
            y((f) e13, false);
        } else if (e13 instanceof s1) {
            q(e13.c());
            q1 q1Var = ((s1) e13).f98196e;
            k("retry.count", (short) q1Var.b());
            j("page.id", q1Var.a());
        } else if (e13 instanceof r1) {
            I(e13.c(), ((r1) e13).f98178e);
        } else if (e13 instanceof p1) {
            q(e13.c());
            q1 q1Var2 = ((p1) e13).f98167e;
            k("retry.count", (short) q1Var2.b());
            j("page.id", q1Var2.a());
        } else if (e13 instanceof o1) {
            I(e13.c(), ((o1) e13).f98159e);
        } else if (e13 instanceof o) {
            D((o) e13, false);
        } else if (e13 instanceof l) {
            l lVar2 = (l) e13;
            a2 a2Var2 = lVar2.f98133e;
            A(lVar2, linkedHashMap6.containsKey(a2Var2.i()));
            linkedHashMap5.remove(a2Var2.i());
            linkedHashMap6.remove(a2Var2.i());
        } else if (e13 instanceof d2) {
            M(e13.c(), ((d2) e13).f98028e);
        } else if (e13 instanceof c2) {
            L(e13.c(), ((c2) e13).f98023e);
        } else if (e13 instanceof f2) {
            M(e13.c(), ((f2) e13).f98051e);
        } else if (e13 instanceof e2) {
            L(e13.c(), ((e2) e13).f98039e);
        } else if (e13 instanceof n) {
            C((n) e13, false);
        } else if (e13 instanceof m) {
            m mVar2 = (m) e13;
            h2 h2Var2 = mVar2.f98142e;
            B(mVar2, linkedHashMap4.containsKey(h2Var2.e()));
            linkedHashMap3.remove(h2Var2.e());
            linkedHashMap4.remove(h2Var2.e());
        } else if (e13 instanceof k2) {
            K(e13.c(), ((k2) e13).f98130e);
        } else if (e13 instanceof j2) {
            J(e13.c(), ((j2) e13).f98098e);
        } else if (e13 instanceof m2) {
            K(e13.c(), ((m2) e13).f98143e);
        } else if (e13 instanceof l2) {
            J(e13.c(), ((l2) e13).f98139e);
        } else if (e13 instanceof e) {
            e eVar3 = (e) e13;
            j1 j1Var2 = new j1(eVar3.f98031e);
            j1Var2.f60583a = eVar3.f60583a;
            o(j1Var2);
        } else if (e13 instanceof d) {
            d dVar2 = (d) e13;
            h1 h1Var2 = dVar2.f98026e;
            i1 i1Var2 = new i1(h1Var2);
            i1Var2.f60583a = dVar2.f60583a;
            o(i1Var2);
            linkedHashMap.remove(h1Var2.c());
            linkedHashMap2.remove(h1Var2.c());
        } else if (e13 instanceof j1) {
            q(e13.c());
            k1 k1Var = ((j1) e13).f98096f;
            j("part.number", k1Var.b());
            j("page.id", k1Var.a());
        } else if (e13 instanceof i1) {
            long c13 = e13.c();
            h1 h1Var3 = ((i1) e13).f98077f;
            if (h1Var3.a() != null) {
                j("failure.message", h1Var3.a());
            }
            k("pwt.result", (short) h1Var3.d().getValue());
            r(c13);
        } else if (e13 instanceof p2) {
            p2 p2Var = (p2) e13;
            if (!d()) {
                q(p2Var.c());
                j("page.id", p2Var.f98170g);
            }
        } else if (e13 instanceof o2) {
            o2 o2Var = (o2) e13;
            k("pwt.result", (short) o2Var.f98163h.getValue());
            r(o2Var.c());
        } else if (e13 instanceof a1) {
            a1 a1Var = (a1) e13;
            if (!d()) {
                q(a1Var.c());
                j("page.id", a1Var.f97991g);
            }
        } else if (e13 instanceof z0) {
            z0 z0Var = (z0) e13;
            k("pwt.result", (short) z0Var.f98251h.getValue());
            r(z0Var.c());
        } else {
            z13 = false;
        }
        return z13;
    }

    public final void v() {
        this.f98258j.clear();
        this.f98259k.clear();
        this.f98254f.clear();
        this.f98255g.clear();
        this.f98256h.clear();
        this.f98257i.clear();
        this.f98260l.clear();
        this.f98261m.clear();
        this.f98262n.clear();
        this.f98263o.clear();
    }

    public final void w(b bVar, boolean z13) {
        ey.u1 v0Var;
        if (z13) {
            v0Var = new t0(bVar.f98004e);
            v0Var.f60583a = bVar.f60583a;
        } else {
            v0Var = new v0(bVar.f98004e);
            v0Var.f60583a = bVar.f60583a;
        }
        o(v0Var);
        s0 s0Var = bVar.f98004e;
        if (!z13 || s0Var.e() == s92.o.COMPLETE) {
            E(s0Var.f(), s0Var.c(), s0Var.e(), new zp.j0(20, this, bVar));
        }
    }

    public final void x(c cVar, boolean z13) {
        ey.u1 w0Var;
        String k13 = cVar.f98018e.k();
        long j13 = cVar.f60583a;
        a1 a1Var = new a1(k13);
        a1Var.f60583a = j13;
        o(a1Var);
        x0 x0Var = cVar.f98018e;
        long d2 = x0Var.d();
        Long a13 = x0Var.a();
        long longValue = a13 != null ? a13.longValue() : 0L;
        i(d2 / 1000, "image.size.raw.kilobytes");
        if (x0Var.l() != null) {
            l("cover.image", x0Var.l().booleanValue());
        }
        if (longValue != 0) {
            i(longValue / 1000, "image.size.exported.kilobytes");
        }
        this.f98264p.put(x0Var.k(), new e1(true, d2, 0L, longValue, 0L, 20));
        if (z13) {
            w0Var = new u0(x0Var);
            w0Var.f60583a = cVar.f60583a;
        } else {
            w0Var = new w0(x0Var);
            w0Var.f60583a = cVar.f60583a;
        }
        o(w0Var);
    }

    public final void y(f fVar, boolean z13) {
        ey.u1 r1Var;
        if (z13) {
            r1Var = new o1(fVar.f98042e);
            r1Var.f60583a = fVar.f60583a;
        } else {
            r1Var = new r1(fVar.f98042e);
            r1Var.f60583a = fVar.f60583a;
        }
        o(r1Var);
        n1 n1Var = fVar.f98042e;
        boolean z14 = n1Var.c() == s92.o.ERROR || Intrinsics.d(n1Var.h(), Boolean.TRUE);
        if (z13 || !z14) {
            return;
        }
        String e13 = n1Var.e();
        int d2 = n1Var.d();
        int b13 = n1Var.b();
        s92.o c13 = n1Var.c();
        E(d2, b13, c13, new y1(this, e13, fVar.f60583a, c13));
    }

    public final void z(g gVar, boolean z13) {
        ey.u1 s1Var;
        String c13 = gVar.f98054e.c();
        long j13 = gVar.f60583a;
        p2 p2Var = new p2(c13);
        p2Var.f60583a = j13;
        o(p2Var);
        q1 q1Var = gVar.f98054e;
        if (z13) {
            s1Var = new p1(q1Var);
            s1Var.f60583a = gVar.f60583a;
        } else {
            s1Var = new s1(q1Var);
            s1Var.f60583a = gVar.f60583a;
        }
        o(s1Var);
    }
}
