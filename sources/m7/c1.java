package m7;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public final n7.a f86122c;

    /* renamed from: d, reason: collision with root package name */
    public final d7.o f86123d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.a0 f86124e;

    /* renamed from: f, reason: collision with root package name */
    public long f86125f;

    /* renamed from: g, reason: collision with root package name */
    public int f86126g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86127h;

    /* renamed from: i, reason: collision with root package name */
    public y f86128i;

    /* renamed from: j, reason: collision with root package name */
    public a1 f86129j;

    /* renamed from: k, reason: collision with root package name */
    public a1 f86130k;

    /* renamed from: l, reason: collision with root package name */
    public a1 f86131l;

    /* renamed from: m, reason: collision with root package name */
    public a1 f86132m;

    /* renamed from: n, reason: collision with root package name */
    public a1 f86133n;

    /* renamed from: o, reason: collision with root package name */
    public int f86134o;

    /* renamed from: p, reason: collision with root package name */
    public Object f86135p;

    /* renamed from: q, reason: collision with root package name */
    public long f86136q;

    /* renamed from: a, reason: collision with root package name */
    public final a7.z0 f86120a = new a7.z0();

    /* renamed from: b, reason: collision with root package name */
    public final a7.a1 f86121b = new a7.a1();

    /* renamed from: r, reason: collision with root package name */
    public List f86137r = new ArrayList();

    public c1(n7.a aVar, d7.i0 i0Var, com.google.firebase.messaging.a0 a0Var, y yVar) {
        this.f86122c = aVar;
        this.f86123d = i0Var;
        this.f86124e = a0Var;
        this.f86128i = yVar;
    }

    public static boolean c(b1 b1Var, b1 b1Var2) {
        return b1Var.f86101b == b1Var2.f86101b && b1Var.f86100a.equals(b1Var2.f86100a);
    }

    public static g8.e0 w(a7.b1 b1Var, Object obj, long j13, long j14, a7.a1 a1Var, a7.z0 z0Var) {
        Object obj2 = obj;
        b1Var.h(obj2, z0Var);
        b1Var.o(z0Var.f1253c, a1Var);
        int b13 = b1Var.b(obj);
        while (true) {
            int i13 = z0Var.f1257g.f948b;
            if (i13 == 0) {
                break;
            }
            if ((i13 == 1 && z0Var.m(0)) || !z0Var.n(z0Var.k())) {
                break;
            }
            long j15 = 0;
            if (z0Var.c(0L) != -1) {
                break;
            }
            if (z0Var.f1254d != 0) {
                int i14 = i13 - (z0Var.m(i13 + (-1)) ? 2 : 1);
                for (int i15 = 0; i15 <= i14; i15++) {
                    j15 += z0Var.g(i15);
                }
                if (z0Var.f1254d > j15) {
                    break;
                }
            }
            if (b13 > a1Var.f943o) {
                break;
            }
            b1Var.g(b13, z0Var, true);
            obj2 = z0Var.f1252b;
            obj2.getClass();
            b13++;
        }
        b1Var.h(obj2, z0Var);
        int c13 = z0Var.c(j13);
        if (c13 == -1) {
            return new g8.e0(obj2, j14, z0Var.b(j13));
        }
        return new g8.e0(obj2, c13, z0Var.h(c13), j14);
    }

    public final int A(a7.b1 b1Var, long j13, long j14, long j15) {
        b1 b1Var2;
        a1 a1Var = this.f86129j;
        a1 a1Var2 = null;
        while (true) {
            boolean z13 = false;
            if (a1Var == null) {
                return 0;
            }
            b1 b1Var3 = a1Var.f86080h;
            if (a1Var2 == null) {
                b1Var2 = l(b1Var, b1Var3);
            } else {
                b1 b1Var4 = a1Var2.f86080h;
                long j16 = (a1Var2.f86089q + b1Var4.f86104e) - j13;
                b1 e13 = b1Var4.f86107h ? e(b1Var, a1Var2, j16) : f(b1Var, a1Var2, j16);
                if (e13 == null || !c(b1Var3, e13)) {
                    break;
                }
                b1Var2 = e13;
            }
            a1Var.f86080h = b1Var2.a(b1Var3.f86102c);
            long j17 = b1Var3.f86104e;
            if (j17 != -9223372036854775807L) {
                long j18 = b1Var2.f86104e;
                if (j17 != j18) {
                    a1Var.n();
                    long m13 = j18 == -9223372036854775807L ? Long.MAX_VALUE : a1Var.m(j18);
                    int i13 = (a1Var != this.f86130k || a1Var.f86080h.f86106g || (j14 != Long.MIN_VALUE && j14 < m13)) ? 0 : 1;
                    if (a1Var == this.f86131l && (j15 == Long.MIN_VALUE || j15 >= m13)) {
                        z13 = true;
                    }
                    int u13 = u(a1Var);
                    return u13 != 0 ? u13 : z13 ? i13 | 2 : i13;
                }
            }
            a1Var2 = a1Var;
            a1Var = a1Var.f86086n;
        }
        return u(a1Var2);
    }

    public final a1 a() {
        a1 a1Var = this.f86129j;
        if (a1Var == null) {
            return null;
        }
        if (a1Var == this.f86130k) {
            this.f86130k = a1Var.f86086n;
        }
        if (a1Var == this.f86131l) {
            this.f86131l = a1Var.f86086n;
        }
        a1Var.j();
        int i13 = this.f86134o - 1;
        this.f86134o = i13;
        if (i13 == 0) {
            this.f86132m = null;
            a1 a1Var2 = this.f86129j;
            this.f86135p = a1Var2.f86074b;
            this.f86136q = a1Var2.f86080h.f86100a.f64236d;
        }
        this.f86129j = this.f86129j.f86086n;
        r();
        return this.f86129j;
    }

    public final void b() {
        a1 a1Var = this.f86131l;
        bf.b.w(a1Var);
        this.f86131l = a1Var.f86086n;
        r();
        bf.b.w(this.f86131l);
    }

    public final void d() {
        if (this.f86134o == 0) {
            return;
        }
        a1 a1Var = this.f86129j;
        bf.b.w(a1Var);
        this.f86135p = a1Var.f86074b;
        this.f86136q = a1Var.f86080h.f86100a.f64236d;
        while (a1Var != null) {
            a1Var.j();
            a1Var = a1Var.f86086n;
        }
        this.f86129j = null;
        this.f86132m = null;
        this.f86130k = null;
        this.f86131l = null;
        this.f86134o = 0;
        r();
    }

    public final b1 e(a7.b1 b1Var, a1 a1Var, long j13) {
        b1 b1Var2;
        long j14;
        long j15;
        long j16;
        Object obj;
        long j17;
        long y13;
        b1 b1Var3 = a1Var.f86080h;
        int d2 = b1Var.d(b1Var.b(b1Var3.f86100a.f64233a), this.f86120a, this.f86121b, this.f86126g, this.f86127h);
        if (d2 == -1) {
            return null;
        }
        a7.z0 z0Var = this.f86120a;
        boolean z13 = true;
        int i13 = b1Var.g(d2, z0Var, true).f1253c;
        Object obj2 = z0Var.f1252b;
        obj2.getClass();
        g8.e0 e0Var = b1Var3.f86100a;
        long j18 = e0Var.f64236d;
        if (b1Var.n(i13, this.f86121b, 0L).f942n == d2) {
            Pair k13 = b1Var.k(this.f86121b, this.f86120a, i13, -9223372036854775807L, Math.max(0L, j13));
            if (k13 == null) {
                return null;
            }
            Object obj3 = k13.first;
            long longValue = ((Long) k13.second).longValue();
            a1 a1Var2 = a1Var.f86086n;
            if (a1Var2 == null || !a1Var2.f86074b.equals(obj3)) {
                y13 = y(obj3);
                if (y13 == -1) {
                    y13 = this.f86125f;
                    this.f86125f = 1 + y13;
                }
            } else {
                y13 = a1Var2.f86080h.f86100a.f64236d;
            }
            b1Var2 = b1Var3;
            j14 = longValue;
            j15 = -9223372036854775807L;
            j16 = y13;
            obj = obj3;
        } else {
            b1Var2 = b1Var3;
            j14 = 0;
            j15 = 0;
            j16 = j18;
            obj = obj2;
        }
        g8.e0 w13 = w(b1Var, obj, j14, j16, this.f86121b, this.f86120a);
        if (j15 != -9223372036854775807L) {
            long j19 = b1Var2.f86102c;
            if (j19 != -9223372036854775807L) {
                int i14 = b1Var.h(e0Var.f64233a, z0Var).f1257g.f948b;
                int i15 = z0Var.f1257g.f951e;
                if (i14 <= 0 || !z0Var.n(i15) || (i14 <= 1 && z0Var.d(i15) == Long.MIN_VALUE)) {
                    z13 = false;
                }
                if (w13.b() && z13) {
                    j17 = j19;
                    return g(b1Var, w13, j17, j14);
                }
                if (z13) {
                    j14 = j19;
                }
            }
        }
        j17 = j15;
        return g(b1Var, w13, j17, j14);
    }

    public final b1 f(a7.b1 b1Var, a1 a1Var, long j13) {
        b1 b1Var2 = a1Var.f86080h;
        g8.e0 e0Var = b1Var2.f86100a;
        Object obj = e0Var.f64233a;
        a7.z0 z0Var = this.f86120a;
        b1Var.h(obj, z0Var);
        boolean b13 = e0Var.b();
        Object obj2 = e0Var.f64233a;
        boolean z13 = b1Var2.f86106g;
        if (!b13) {
            int i13 = e0Var.f64237e;
            if (i13 != -1 && z0Var.m(i13)) {
                return e(b1Var, a1Var, j13);
            }
            int h10 = z0Var.h(i13);
            boolean z14 = z0Var.n(i13) && z0Var.f(i13, h10) == 3;
            if (h10 != z0Var.f1257g.a(i13).f909b && !z14) {
                return h(b1Var, e0Var.f64233a, e0Var.f64237e, h10, b1Var2.f86104e, e0Var.f64236d, z13);
            }
            b1Var.h(obj2, z0Var);
            long d2 = z0Var.d(i13);
            return i(b1Var, e0Var.f64233a, d2 == Long.MIN_VALUE ? z0Var.f1254d : z0Var.g(i13) + d2, b1Var2.f86104e, e0Var.f64236d, false);
        }
        a7.b bVar = z0Var.f1257g;
        int i14 = e0Var.f64234b;
        int i15 = bVar.a(i14).f909b;
        if (i15 == -1) {
            return null;
        }
        int a13 = z0Var.f1257g.a(i14).a(e0Var.f64235c);
        if (a13 < i15) {
            return h(b1Var, e0Var.f64233a, i14, a13, b1Var2.f86102c, e0Var.f64236d, z13);
        }
        long j14 = b1Var2.f86102c;
        if (j14 == -9223372036854775807L) {
            Pair k13 = b1Var.k(this.f86121b, z0Var, z0Var.f1253c, -9223372036854775807L, Math.max(0L, j13));
            if (k13 == null) {
                return null;
            }
            j14 = ((Long) k13.second).longValue();
        }
        b1Var.h(obj2, z0Var);
        int i16 = e0Var.f64234b;
        long d13 = z0Var.d(i16);
        return i(b1Var, e0Var.f64233a, Math.max(d13 == Long.MIN_VALUE ? z0Var.f1254d : z0Var.g(i16) + d13, j14), b1Var2.f86102c, e0Var.f64236d, z13);
    }

    public final b1 g(a7.b1 b1Var, g8.e0 e0Var, long j13, long j14) {
        b1Var.h(e0Var.f64233a, this.f86120a);
        if (e0Var.b()) {
            return h(b1Var, e0Var.f64233a, e0Var.f64234b, e0Var.f64235c, j13, e0Var.f64236d, false);
        }
        return i(b1Var, e0Var.f64233a, j14, j13, e0Var.f64236d, false);
    }

    public final b1 h(a7.b1 b1Var, Object obj, int i13, int i14, long j13, long j14, boolean z13) {
        g8.e0 e0Var = new g8.e0(i13, i14, -1, j14, obj);
        a7.z0 z0Var = this.f86120a;
        long a13 = b1Var.h(obj, z0Var).a(i13, i14);
        long j15 = i14 == z0Var.h(i13) ? z0Var.f1257g.f949c : 0L;
        return new b1(e0Var, (a13 == -9223372036854775807L || j15 < a13) ? j15 : Math.max(0L, a13 - 1), j13, -9223372036854775807L, a13, z13, z0Var.n(i13), false, false, false);
    }

    public final b1 i(a7.b1 b1Var, Object obj, long j13, long j14, long j15, boolean z13) {
        boolean z14;
        long j16;
        long j17;
        long j18;
        long j19 = j13;
        a7.z0 z0Var = this.f86120a;
        b1Var.h(obj, z0Var);
        int b13 = z0Var.b(j19);
        boolean z15 = b13 != -1 && z0Var.m(b13);
        if (b13 == -1) {
            if (z0Var.f1257g.f948b > 0 && z0Var.n(z0Var.k())) {
                z14 = true;
            }
            z14 = false;
        } else {
            if (z0Var.n(b13) && z0Var.d(b13) == z0Var.f1254d && z0Var.l(b13)) {
                z14 = true;
                b13 = -1;
            }
            z14 = false;
        }
        g8.e0 e0Var = new g8.e0(obj, j15, b13);
        boolean z16 = !e0Var.b() && b13 == -1;
        boolean o13 = o(b1Var, e0Var);
        boolean n13 = n(b1Var, e0Var, z16);
        boolean z17 = (b13 == -1 || !z0Var.n(b13) || z15) ? false : true;
        if (b13 != -1 && !z15) {
            j17 = z0Var.d(b13);
        } else {
            if (!z14) {
                j16 = -9223372036854775807L;
                j18 = (j16 != -9223372036854775807L || j16 == Long.MIN_VALUE) ? z0Var.f1254d : j16;
                if (j18 != -9223372036854775807L && j19 >= j18) {
                    j19 = Math.max(0L, j18 - ((n13 && z14) ? 0 : 1));
                }
                return new b1(e0Var, j19, j14, j16, j18, z13, z17, z16, o13, n13);
            }
            j17 = z0Var.f1254d;
        }
        j16 = j17;
        if (j16 != -9223372036854775807L) {
        }
        if (j18 != -9223372036854775807L) {
            j19 = Math.max(0L, j18 - ((n13 && z14) ? 0 : 1));
        }
        return new b1(e0Var, j19, j14, j16, j18, z13, z17, z16, o13, n13);
    }

    public final a1 j(g8.c0 c0Var) {
        for (int i13 = 0; i13 < this.f86137r.size(); i13++) {
            a1 a1Var = (a1) this.f86137r.get(i13);
            if (a1Var.f86073a == c0Var) {
                return a1Var;
            }
        }
        return null;
    }

    public final a1 k() {
        return this.f86131l;
    }

    public final b1 l(a7.b1 b1Var, b1 b1Var2) {
        g8.e0 e0Var = b1Var2.f86100a;
        boolean b13 = e0Var.b();
        int i13 = e0Var.f64237e;
        boolean z13 = !b13 && i13 == -1;
        boolean o13 = o(b1Var, e0Var);
        boolean n13 = n(b1Var, e0Var, z13);
        Object obj = b1Var2.f86100a.f64233a;
        a7.z0 z0Var = this.f86120a;
        b1Var.h(obj, z0Var);
        long d2 = (e0Var.b() || i13 == -1) ? -9223372036854775807L : z0Var.d(i13);
        boolean b14 = e0Var.b();
        int i14 = e0Var.f64234b;
        return new b1(e0Var, b1Var2.f86101b, b1Var2.f86102c, d2, b14 ? z0Var.a(i14, e0Var.f64235c) : (d2 == -9223372036854775807L || d2 == Long.MIN_VALUE) ? z0Var.f1254d : d2, b1Var2.f86105f, e0Var.b() ? z0Var.n(i14) : i13 != -1 && z0Var.n(i13), z13, o13, n13);
    }

    public final void m(a7.b1 b1Var) {
        a1 a1Var;
        if (this.f86128i.f86485a == -9223372036854775807L || (a1Var = this.f86132m) == null) {
            if (this.f86137r.isEmpty()) {
                return;
            }
            t(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = a1Var.f86080h.f86100a.f64233a;
        a7.z0 z0Var = this.f86120a;
        int e13 = b1Var.e(b1Var.h(obj, z0Var).f1253c, this.f86126g, this.f86127h);
        Pair k13 = e13 != -1 ? b1Var.k(this.f86121b, this.f86120a, e13, -9223372036854775807L, 0L) : null;
        if (k13 != null && !b1Var.n(b1Var.h(k13.first, z0Var).f1253c, this.f86121b, 0L).b()) {
            long y13 = y(k13.first);
            if (y13 == -1) {
                y13 = this.f86125f;
                this.f86125f = 1 + y13;
            }
            long j13 = y13;
            Object obj2 = k13.first;
            long longValue = ((Long) k13.second).longValue();
            g8.e0 w13 = w(b1Var, obj2, longValue, j13, this.f86121b, this.f86120a);
            b1 h10 = w13.b() ? h(b1Var, w13.f64233a, w13.f64234b, w13.f64235c, longValue, w13.f64236d, false) : i(b1Var, w13.f64233a, longValue, -9223372036854775807L, w13.f64236d, false);
            a1 v13 = v(h10);
            if (v13 == null) {
                long j14 = (a1Var.f86089q + a1Var.f86080h.f86104e) - h10.f86101b;
                u0 u0Var = (u0) this.f86124e.f33758b;
                v13 = new a1(u0Var.f86407b, j14, u0Var.f86411d, ((n) u0Var.f86415f).f86300a, u0Var.f86430u, h10, u0Var.f86413e, u0Var.f86406a0.f86485a);
            }
            arrayList.add(v13);
        }
        t(arrayList);
    }

    public final boolean n(a7.b1 b1Var, g8.e0 e0Var, boolean z13) {
        int b13 = b1Var.b(e0Var.f64233a);
        if (b1Var.n(b1Var.g(b13, this.f86120a, false).f1253c, this.f86121b, 0L).f937i) {
            return false;
        }
        return b1Var.d(b13, this.f86120a, this.f86121b, this.f86126g, this.f86127h) == -1 && z13;
    }

    public final boolean o(a7.b1 b1Var, g8.e0 e0Var) {
        if (!(!e0Var.b() && e0Var.f64237e == -1)) {
            return false;
        }
        Object obj = e0Var.f64233a;
        return b1Var.n(b1Var.h(obj, this.f86120a).f1253c, this.f86121b, 0L).f943o == b1Var.b(obj);
    }

    public final boolean p(g8.c0 c0Var) {
        a1 a1Var = this.f86133n;
        return a1Var != null && a1Var.f86073a == c0Var;
    }

    public final void q() {
        a1 a1Var = this.f86133n;
        if (a1Var == null || a1Var.i()) {
            this.f86133n = null;
            for (int i13 = 0; i13 < this.f86137r.size(); i13++) {
                a1 a1Var2 = (a1) this.f86137r.get(i13);
                if (!a1Var2.i()) {
                    this.f86133n = a1Var2;
                    return;
                }
            }
        }
    }

    public final void r() {
        pk.x0 n13 = pk.c1.n();
        for (a1 a1Var = this.f86129j; a1Var != null; a1Var = a1Var.f86086n) {
            n13.e(a1Var.f86080h.f86100a);
        }
        a1 a1Var2 = this.f86130k;
        ((d7.i0) this.f86123d).d(new h6.o(this, n13, a1Var2 == null ? null : a1Var2.f86080h.f86100a, 4));
    }

    public final void s(long j13) {
        a1 a1Var = this.f86132m;
        if (a1Var != null) {
            bf.b.t(a1Var.f86086n == null);
            if (a1Var.f86078f) {
                a1Var.f86073a.v(j13 - a1Var.f86089q);
            }
        }
    }

    public final void t(ArrayList arrayList) {
        for (int i13 = 0; i13 < this.f86137r.size(); i13++) {
            ((a1) this.f86137r.get(i13)).j();
        }
        this.f86137r = arrayList;
        this.f86133n = null;
        q();
    }

    public final int u(a1 a1Var) {
        bf.b.w(a1Var);
        int i13 = 0;
        if (a1Var.equals(this.f86132m)) {
            return 0;
        }
        this.f86132m = a1Var;
        while (true) {
            a1Var = a1Var.f86086n;
            if (a1Var == null) {
                break;
            }
            if (a1Var == this.f86130k) {
                a1 a1Var2 = this.f86129j;
                this.f86130k = a1Var2;
                this.f86131l = a1Var2;
                i13 = 3;
            }
            if (a1Var == this.f86131l) {
                this.f86131l = this.f86130k;
                i13 |= 2;
            }
            a1Var.j();
            this.f86134o--;
        }
        a1 a1Var3 = this.f86132m;
        a1Var3.getClass();
        if (a1Var3.f86086n != null) {
            a1Var3.c();
            a1Var3.f86086n = null;
            a1Var3.d();
        }
        r();
        return i13;
    }

    public final a1 v(b1 b1Var) {
        for (int i13 = 0; i13 < this.f86137r.size(); i13++) {
            if (((a1) this.f86137r.get(i13)).b(b1Var)) {
                return (a1) this.f86137r.remove(i13);
            }
        }
        return null;
    }

    public final g8.e0 x(a7.b1 b1Var, Object obj, long j13) {
        long y13;
        int b13;
        Object obj2 = obj;
        a7.z0 z0Var = this.f86120a;
        int i13 = b1Var.h(obj2, z0Var).f1253c;
        Object obj3 = this.f86135p;
        if (obj3 == null || (b13 = b1Var.b(obj3)) == -1 || b1Var.g(b13, z0Var, false).f1253c != i13) {
            a1 a1Var = this.f86129j;
            while (true) {
                if (a1Var == null) {
                    a1 a1Var2 = this.f86129j;
                    while (true) {
                        if (a1Var2 != null) {
                            int b14 = b1Var.b(a1Var2.f86074b);
                            if (b14 != -1 && b1Var.g(b14, z0Var, false).f1253c == i13) {
                                y13 = a1Var2.f86080h.f86100a.f64236d;
                                break;
                            }
                            a1Var2 = a1Var2.f86086n;
                        } else {
                            y13 = y(obj2);
                            if (y13 == -1) {
                                y13 = this.f86125f;
                                this.f86125f = 1 + y13;
                                if (this.f86129j == null) {
                                    this.f86135p = obj2;
                                    this.f86136q = y13;
                                }
                            }
                        }
                    }
                } else {
                    if (a1Var.f86074b.equals(obj2)) {
                        y13 = a1Var.f86080h.f86100a.f64236d;
                        break;
                    }
                    a1Var = a1Var.f86086n;
                }
            }
        } else {
            y13 = this.f86136q;
        }
        long j14 = y13;
        b1Var.h(obj2, z0Var);
        int i14 = z0Var.f1253c;
        a7.a1 a1Var3 = this.f86121b;
        b1Var.o(i14, a1Var3);
        boolean z13 = false;
        for (int b15 = b1Var.b(obj); b15 >= a1Var3.f942n; b15--) {
            b1Var.g(b15, z0Var, true);
            boolean z14 = z0Var.f1257g.f948b > 0;
            z13 |= z14;
            if (z0Var.c(z0Var.f1254d) != -1) {
                obj2 = z0Var.f1252b;
                obj2.getClass();
            }
            if (z13 && (!z14 || z0Var.f1254d != 0)) {
                break;
            }
        }
        return w(b1Var, obj2, j13, j14, this.f86121b, this.f86120a);
    }

    public final long y(Object obj) {
        for (int i13 = 0; i13 < this.f86137r.size(); i13++) {
            a1 a1Var = (a1) this.f86137r.get(i13);
            if (a1Var.f86074b.equals(obj)) {
                return a1Var.f86080h.f86100a.f64236d;
            }
        }
        return -1L;
    }

    public final int z(a7.b1 b1Var) {
        a1 a1Var;
        a1 a1Var2 = this.f86129j;
        if (a1Var2 == null) {
            return 0;
        }
        int b13 = b1Var.b(a1Var2.f86074b);
        while (true) {
            b13 = b1Var.d(b13, this.f86120a, this.f86121b, this.f86126g, this.f86127h);
            while (true) {
                a1Var2.getClass();
                a1Var = a1Var2.f86086n;
                if (a1Var == null || a1Var2.f86080h.f86107h) {
                    break;
                }
                a1Var2 = a1Var;
            }
            if (b13 == -1 || a1Var == null || b1Var.b(a1Var.f86074b) != b13) {
                break;
            }
            a1Var2 = a1Var;
        }
        int u13 = u(a1Var2);
        a1Var2.f86080h = l(b1Var, a1Var2.f86080h);
        return u13;
    }
}
