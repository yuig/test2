package ey;

import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final k3 f60593a;

    /* renamed from: b, reason: collision with root package name */
    public o1 f60594b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f60595c;

    /* renamed from: d, reason: collision with root package name */
    public String f60596d;

    /* renamed from: e, reason: collision with root package name */
    public long f60597e;

    public v1(k3 perfLogger) {
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f60593a = perfLogger;
        this.f60595c = new LinkedHashMap();
        this.f60596d = "";
        this.f60597e = Long.MIN_VALUE;
    }

    public void a(s92.o pwtResult, s92.l lVar, h32.d4 d4Var, h32.a4 a4Var, long j13, boolean z13) {
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        o1 stopWatch = this.f60594b;
        if (stopWatch != null) {
            if (pwtResult == s92.o.ABORTED && !Intrinsics.d("", this.f60596d)) {
                j("abort.cause", this.f60596d);
            }
            if (this.f60597e != Long.MIN_VALUE) {
                i(SystemClock.elapsedRealtime() - this.f60597e, "media_render");
            }
            k3 k3Var = this.f60593a;
            k3Var.getClass();
            Intrinsics.checkNotNullParameter(stopWatch, "stopWatch");
            Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
            k3.a(stopWatch, pwtResult, lVar, d4Var, a4Var, j13, z13);
            List<o1> list = stopWatch.f60555i;
            if (list == null) {
                list = new ArrayList();
            }
            for (o1 o1Var : list) {
                HashMap hashMap = k3Var.f60526g;
                dl2.b.u(hashMap).remove(o1Var.f60548b);
            }
            new d5(list, k3Var).b();
        }
        this.f60595c.clear();
        this.f60597e = Long.MIN_VALUE;
    }

    public abstract Set b();

    public void c() {
        o1 stopwatch = this.f60594b;
        if (stopwatch != null) {
            k3 k3Var = this.f60593a;
            k3Var.getClass();
            Intrinsics.checkNotNullParameter(stopwatch, "stopWatch");
            HashMap hashMap = k3Var.f60526g;
            dl2.b.u(hashMap).remove(stopwatch.f60548b);
            stopwatch.d();
            Intrinsics.checkNotNullParameter(stopwatch, "stopwatch");
            ArrayDeque arrayDeque = k3Var.f60527h;
            if (arrayDeque.size() < 50) {
                arrayDeque.add(stopwatch);
            }
            this.f60594b = null;
        }
        this.f60595c.clear();
        this.f60597e = Long.MIN_VALUE;
    }

    public final boolean d() {
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            return o1Var.a().f85170i;
        }
        return false;
    }

    public final void e(long j13, String annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.e(j13, annotation);
        }
    }

    public final void f(String annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.e(0L, annotation);
        }
    }

    public final void g() {
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            vb0.j.f125466a.R(o1Var.f60549c, "only allow the top level stop watch to pause or resume", tb0.p.UNSPECIFIED, new Object[0]);
            ly1.f a13 = o1Var.a();
            if (!a13.f85170i || a13.f85171j) {
                return;
            }
            ((pb0.g) a13.f85163b).getClass();
            a13.f85165d = SystemClock.elapsedRealtime();
            a13.f85171j = true;
        }
    }

    public final void h(int i13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.h(i13, key);
        }
    }

    public final void i(long j13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.i(j13, key);
        }
    }

    public final void j(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.j(key, value);
        }
    }

    public final void k(String key, short s13) {
        Intrinsics.checkNotNullParameter(key, "key");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.k(key, s13);
        }
    }

    public final void l(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            wo2.m mVar = wo2.m.f130712d;
            byte[] data = {z13 ? (byte) 1 : (byte) 0};
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            o1Var.l(new re2.g(key, new wo2.m(copyOf), re2.d.BOOL));
        }
    }

    public final String m(u1 u1Var) {
        String g13 = u1Var.g();
        String[] h10 = u1Var.h();
        String f13 = u1Var.f();
        if (f13 == null) {
            f13 = u1Var.b();
        }
        LinkedHashMap linkedHashMap = this.f60595c;
        if (g13 != null && g13.length() != 0) {
            String str = (String) linkedHashMap.get(g13 + f13);
            return str == null ? (String) linkedHashMap.get(g13) : str;
        }
        if (h10 == null) {
            h10 = new String[0];
        }
        for (String str2 : h10) {
            String C = a.a.C(str2, f13);
            if (linkedHashMap.containsKey(C)) {
                return (String) linkedHashMap.get(C);
            }
            if (linkedHashMap.containsKey(str2)) {
                return (String) linkedHashMap.get(str2);
            }
        }
        return null;
    }

    public final void n() {
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            vb0.j.f125466a.R(o1Var.f60549c, "only allow the top level stop watch to pause or resume", tb0.p.UNSPECIFIED, new Object[0]);
            ly1.f a13 = o1Var.a();
            if (a13.f85170i && a13.f85171j) {
                long j13 = a13.f85164c;
                ((pb0.g) a13.f85163b).getClass();
                a13.f85164c = (SystemClock.elapsedRealtime() - a13.f85165d) + j13;
                a13.f85171j = false;
            }
        }
    }

    public boolean o(u1 e13) {
        String[] h10;
        String str;
        o1 o1Var;
        String str2;
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13 instanceof l2) {
            this.f60596d = ((l2) e13).f60530c;
            return false;
        }
        String e14 = e13.e();
        String b13 = e13.b();
        String C = a.a.C(e14, b13);
        String g13 = e13.g();
        if ((g13 == null || kotlin.text.z.j(g13)) && ((h10 = e13.h()) == null || h10.length == 0)) {
            str = null;
        } else {
            str = m(e13);
            if (str == null) {
                return false;
            }
        }
        t(e14, b13, str, e13);
        if (this.f60594b != null) {
            LinkedHashMap linkedHashMap = this.f60595c;
            if (!linkedHashMap.containsKey(C) && (o1Var = this.f60594b) != null && (str2 = o1Var.f60548b) != null) {
                linkedHashMap.put(C, str2);
            }
        }
        o1 o1Var2 = this.f60594b;
        if (o1Var2 != null) {
            String str3 = o1Var2.f60548b;
            String e15 = e13.e();
            vb0.j.f125466a.R(str3 != null && StringsKt.E(str3, e15, false), t3.s1.c("the routed stop watch id ", str3, " does not have the event metric name ", e15), tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
        }
        return this.f60594b != null;
    }

    public final void p() {
        Intrinsics.checkNotNullParameter("cache_fetch_time", "metricName");
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            Intrinsics.checkNotNullParameter("cache_fetch_time", "metricName");
            re2.j source = o1Var.b();
            Intrinsics.checkNotNullParameter(source, "source");
            re2.j jVar = new re2.j(source.f107709a, "cache_fetch_time", source.f107711c, source.f107712d, source.f107713e, source.f107714f, source.f107715g, source.f107716h, source.f107717i, source.f107718j);
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            o1Var.f60553g = jVar;
        }
    }

    public final void q(long j13) {
        o1 o1Var;
        if (this.f60594b != null) {
            if (d() && (o1Var = this.f60594b) != null) {
                o1Var.m();
            }
            o1 o1Var2 = this.f60594b;
            if (o1Var2 == null || o1Var2.f60551e) {
                return;
            }
            if (!o1Var2.a().f85170i) {
                o1Var2.e(j13, "cs");
            }
            ly1.f a13 = o1Var2.a();
            if (a13.f85170i) {
                return;
            }
            a13.f85168g = System.currentTimeMillis() - j13;
            ((pb0.g) a13.f85163b).getClass();
            a13.f85167f = SystemClock.elapsedRealtime() - j13;
            a13.f85170i = true;
        }
    }

    public final void r(long j13) {
        o1 o1Var = this.f60594b;
        if (o1Var != null) {
            o1Var.n(j13);
        }
    }

    public final void s(u1 u1Var) {
        Intrinsics.checkNotNullParameter(u1Var, "<this>");
        t(u1Var.e(), u1Var.b(), u1Var.g(), u1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(String metricName, String str, String str2, u1 e13) {
        o1 subStopwatch;
        o1 parentStopwatch;
        o1 o1Var;
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(e13, "e");
        k3 k3Var = this.f60593a;
        o1 o1Var2 = (o1) k3Var.f60526g.get(str2);
        if (o1Var2 != null && !o1Var2.a().f85170i) {
            ly1.f a13 = o1Var2.a();
            if (a13.f85169h - a13.f85164c > 0) {
                this.f60594b = null;
                return;
            }
        }
        o1 b13 = k3Var.b(metricName, str, str2);
        this.f60594b = b13;
        boolean z13 = e13 instanceof b2;
        if (z13 && b13 == null) {
            long a14 = e13 instanceof c2 ? ((c2) e13).a() : Long.MIN_VALUE;
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            String U = m60.f0.U(metricName, str, str2);
            HashMap hashMap = k3Var.f60526g;
            vb0.j.f125466a.R(hashMap.get(U) == null, "the global map should not have it!", tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
            if (str2 != null) {
                o1 o1Var3 = (o1) hashMap.get(str2);
                parentStopwatch = (o1Var3 != null && o1Var3.a().f85170i) ? o1Var3 : null;
                subStopwatch = null;
                this.f60594b = subStopwatch;
            }
            ArrayDeque arrayDeque = k3Var.f60527h;
            if (arrayDeque.peek() != null) {
                o1Var = (o1) arrayDeque.pop();
                if (o1Var != null) {
                    o1Var.c(a14, U, metricName, str2 == null);
                }
                subStopwatch = null;
                this.f60594b = subStopwatch;
            } else {
                o1Var = new o1(U, metricName, str2 == null, k3Var.f60520a, a14, true);
            }
            subStopwatch = o1Var;
            hashMap.put(U, subStopwatch);
            if (parentStopwatch != null) {
                Intrinsics.checkNotNullParameter(subStopwatch, "subStopwatch");
                parentStopwatch.f60554h.add(subStopwatch);
                List list = parentStopwatch.f60555i;
                if (list != null) {
                    list.add(subStopwatch);
                }
                subStopwatch.f60550d = parentStopwatch.f60550d;
                Intrinsics.checkNotNullParameter(parentStopwatch, "parentStopwatch");
                re2.j source = subStopwatch.b();
                Intrinsics.checkNotNullParameter(source, "source");
                re2.j jVar = new re2.j(parentStopwatch.b().f107709a, source.f107710b, source.f107711c, parentStopwatch.b().f107711c, source.f107713e, source.f107714f, source.f107715g, source.f107716h, source.f107717i, source.f107718j);
                Intrinsics.checkNotNullParameter(jVar, "<set-?>");
                subStopwatch.f60553g = jVar;
                subStopwatch.f60555i = parentStopwatch.f60555i;
            }
            this.f60594b = subStopwatch;
        }
        o1 o1Var4 = this.f60594b;
        if (!z13 || (e13 instanceof c2) || o1Var4 == null || o1Var4.f60549c) {
            return;
        }
        o1Var4.j("lc", o1Var4.f60550d);
    }

    public final void u(u1 u1Var) {
        o1 o1Var;
        String str;
        Intrinsics.checkNotNullParameter(u1Var, "<this>");
        String C = a.a.C(u1Var.e(), u1Var.b());
        t(u1Var.e(), u1Var.b(), m(u1Var), u1Var);
        if (this.f60594b != null) {
            LinkedHashMap linkedHashMap = this.f60595c;
            if (linkedHashMap.containsKey(C) || (o1Var = this.f60594b) == null || (str = o1Var.f60548b) == null) {
                return;
            }
            linkedHashMap.put(C, str);
        }
    }
}
