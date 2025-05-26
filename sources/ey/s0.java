package ey;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes.dex */
public abstract class s0 extends k {

    /* renamed from: h, reason: collision with root package name */
    public static final Set f60570h = kotlin.collections.h1.f(m2.class, o2.class, i2.class, j2.class, k2.class, t2.class, s2.class, u2.class, q2.class, r2.class, h2.class, l2.class);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f60571f;

    /* renamed from: g, reason: collision with root package name */
    public r92.c f60572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f60571f = new LinkedHashMap();
    }

    @Override // ey.v1
    public final void a(s92.o pwtResult, s92.l lVar, h32.d4 d4Var, h32.a4 a4Var, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        r92.c cVar = this.f60572g;
        if (cVar != null) {
            h(cVar.getValue(), "media_critical");
        }
        super.a(pwtResult, lVar, d4Var, a4Var, j13, false);
    }

    @Override // ey.v1
    public Set b() {
        return kotlin.collections.i1.i(f60570h, l.f60529a);
    }

    @Override // ey.v1
    public void c() {
        this.f60571f.clear();
        super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ey.k, ey.v1
    public boolean o(u1 e13) {
        long a13;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof q2) {
            q(e13.c());
            y((g2) e13);
            return true;
        }
        if (e13 instanceof r2) {
            y((g2) e13);
            r(e13.c());
            return true;
        }
        if (e13 instanceof j2) {
            y((g2) e13);
            j2 j2Var = (j2) e13;
            l("success", j2Var.n());
            v(j2Var.m(), j2Var.l());
            o1 o1Var = this.f60594b;
            if ((o1Var != null ? o1Var.f60556j : 0L) == 0) {
                if ((o1Var != null ? o1Var.f60554h : null) != null && o1Var != null && (arrayList = o1Var.f60554h) != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        o1 o1Var2 = (o1) it.next();
                        if (Intrinsics.d(o1Var2.b().f107710b, "network_time") || Intrinsics.d(o1Var2.b().f107710b, "cache_fetch_time")) {
                            ly1.f a14 = o1Var2.a();
                            if (a14.f85169h - a14.f85164c != 0) {
                                return true;
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long c13 = (elapsedRealtime - e13.c()) - o1Var2.a().f85167f;
                            o1 o1Var3 = this.f60594b;
                            r(elapsedRealtime - ((o1Var3 != null ? o1Var3.a().f85167f : 0L) + c13));
                            return true;
                        }
                    }
                }
            }
            r(e13.c());
            return true;
        }
        if (e13 instanceof h2) {
            if (!d()) {
                return true;
            }
            y((g2) e13);
            o1 o1Var4 = this.f60594b;
            if (o1Var4 == null) {
                return true;
            }
            long l13 = ((h2) e13).l() + o1Var4.a().f85167f;
            o1 o1Var5 = this.f60594b;
            if (o1Var5 == null) {
                return true;
            }
            o1Var5.f60556j = l13;
            return true;
        }
        if (e13 instanceof i2) {
            if (d()) {
                return true;
            }
            q(e13.c());
            y((g2) e13);
            j("http.url", ((i2) e13).l());
            j("pwt_action", w().toString());
            return true;
        }
        boolean z13 = e13 instanceof m2;
        LinkedHashMap linkedHashMap = this.f60571f;
        if (z13) {
            if (!d()) {
                q(e13.c());
                y((g2) e13);
                m2 m2Var = (m2) e13;
                linkedHashMap.put(m2Var.l(), Long.valueOf(m2Var.a()));
                i(m2Var.a(), "http.url");
                j("pwt_action", w().toString());
            }
            if (this.f60597e == Long.MIN_VALUE) {
                this.f60597e = SystemClock.elapsedRealtime();
            }
            if (this.f60572g != null) {
                return true;
            }
            new k2().i();
            return true;
        }
        if (e13 instanceof o2) {
            y((g2) e13);
            o2 o2Var = (o2) e13;
            l("image_cached", o2Var.l());
            l("success", o2Var.o());
            v(o2Var.n(), o2Var.m());
            r(e13.c());
            this.f60572g = r92.c.IMAGE;
            return true;
        }
        if (e13 instanceof t2) {
            String l14 = ((t2) e13).l();
            Long l15 = (Long) linkedHashMap.remove(l14);
            if (l15 != null) {
                a13 = l15.longValue();
            } else {
                j3 j3Var = j3.f60510a;
                a13 = j3.a();
            }
            s2 s2Var = new s2(l14, a13);
            s2Var.j(e13.d());
            s2Var.i();
            return true;
        }
        if (e13 instanceof s2) {
            q(e13.c());
            y((g2) e13);
            j("http.url", ((s2) e13).l());
            j("pwt_action", w().toString());
            return true;
        }
        if (!(e13 instanceof u2)) {
            if (!(e13 instanceof k2)) {
                return true;
            }
            q(e13.c());
            return true;
        }
        y((g2) e13);
        u2 u2Var = (u2) e13;
        if (u2Var.m()) {
            p();
        }
        r(e13.c());
        o1 o1Var6 = this.f60594b;
        if (o1Var6 == null) {
            return true;
        }
        ly1.f a15 = o1Var6.a();
        new h2(u2Var.l(), a15.f85169h - a15.f85164c).i();
        return true;
    }

    public final void v(Headers headers, s92.c cVar) {
        if (headers != null) {
            String c13 = headers.c("x-cdn");
            if (c13 != null) {
                j("cdn.name", c13);
            }
            String c14 = headers.c("x-pinterest-cache");
            if (c14 != null) {
                j("cdn.cache", c14);
            }
        }
        k("data.source", (short) cVar.getValue());
    }

    public abstract s92.i w();

    public final void x(r92.c cVar) {
        this.f60572g = cVar;
    }

    public void y(g2 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    public final void z() {
        j1.f60506c = false;
        this.f60571f.clear();
    }
}
