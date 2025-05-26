package m7;

import android.util.Pair;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final g8.c0 f86073a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f86074b;

    /* renamed from: c, reason: collision with root package name */
    public final g8.b1[] f86075c;

    /* renamed from: d, reason: collision with root package name */
    public final long f86076d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86077e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86078f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86079g;

    /* renamed from: h, reason: collision with root package name */
    public b1 f86080h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f86081i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f86082j;

    /* renamed from: k, reason: collision with root package name */
    public final h[] f86083k;

    /* renamed from: l, reason: collision with root package name */
    public final k8.y f86084l;

    /* renamed from: m, reason: collision with root package name */
    public final n1 f86085m;

    /* renamed from: n, reason: collision with root package name */
    public a1 f86086n;

    /* renamed from: o, reason: collision with root package name */
    public g8.m1 f86087o;

    /* renamed from: p, reason: collision with root package name */
    public k8.z f86088p;

    /* renamed from: q, reason: collision with root package name */
    public long f86089q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [g8.c] */
    public a1(h[] hVarArr, long j13, k8.y yVar, l8.m mVar, n1 n1Var, b1 b1Var, k8.z zVar, long j14) {
        this.f86083k = hVarArr;
        this.f86089q = j13;
        this.f86084l = yVar;
        this.f86085m = n1Var;
        g8.e0 e0Var = b1Var.f86100a;
        this.f86074b = e0Var.f64233a;
        this.f86080h = b1Var;
        this.f86076d = j14;
        this.f86087o = g8.m1.f64347d;
        this.f86088p = zVar;
        this.f86075c = new g8.b1[hVarArr.length];
        this.f86082j = new boolean[hVarArr.length];
        n1Var.getClass();
        int i13 = t1.f86391k;
        Pair pair = (Pair) e0Var.f64233a;
        Object obj = pair.first;
        g8.e0 a13 = e0Var.a(pair.second);
        l1 l1Var = (l1) n1Var.f86318d.get(obj);
        l1Var.getClass();
        n1Var.f86321g.add(l1Var);
        k1 k1Var = (k1) n1Var.f86320f.get(l1Var);
        if (k1Var != null) {
            k1Var.f86240a.g(k1Var.f86241b);
        }
        l1Var.f86294c.add(a13);
        g8.w b13 = l1Var.f86292a.b(a13, mVar, b1Var.f86101b);
        n1Var.f86317c.put(b13, l1Var);
        n1Var.d();
        long j15 = b1Var.f86103d;
        this.f86073a = j15 != -9223372036854775807L ? new g8.c(b13, !b1Var.f86105f, 0L, j15) : b13;
    }

    public final long a(k8.z zVar, long j13, boolean z13, boolean[] zArr) {
        h[] hVarArr;
        g8.b1[] b1VarArr;
        int i13 = 0;
        while (true) {
            boolean z14 = true;
            if (i13 >= zVar.f78584a) {
                break;
            }
            if (z13 || !zVar.b(this.f86088p, i13)) {
                z14 = false;
            }
            this.f86082j[i13] = z14;
            i13++;
        }
        int i14 = 0;
        while (true) {
            hVarArr = this.f86083k;
            int length = hVarArr.length;
            b1VarArr = this.f86075c;
            if (i14 >= length) {
                break;
            }
            if (hVarArr[i14].f86171b == -2) {
                b1VarArr[i14] = null;
            }
            i14++;
        }
        c();
        this.f86088p = zVar;
        d();
        long l13 = this.f86073a.l(zVar.f78586c, this.f86082j, this.f86075c, zArr, j13);
        for (int i15 = 0; i15 < hVarArr.length; i15++) {
            if (hVarArr[i15].f86171b == -2 && this.f86088p.c(i15)) {
                b1VarArr[i15] = new g8.r();
            }
        }
        this.f86079g = false;
        for (int i16 = 0; i16 < b1VarArr.length; i16++) {
            if (b1VarArr[i16] != null) {
                bf.b.t(zVar.c(i16));
                if (hVarArr[i16].f86171b != -2) {
                    this.f86079g = true;
                }
            } else {
                bf.b.t(zVar.f78586c[i16] == null);
            }
        }
        return l13;
    }

    public final boolean b(b1 b1Var) {
        b1 b1Var2 = this.f86080h;
        long j13 = b1Var2.f86104e;
        return (j13 == -9223372036854775807L || j13 == b1Var.f86104e) && b1Var2.f86101b == b1Var.f86101b && b1Var2.f86100a.equals(b1Var.f86100a);
    }

    public final void c() {
        if (this.f86086n != null) {
            return;
        }
        int i13 = 0;
        while (true) {
            k8.z zVar = this.f86088p;
            if (i13 >= zVar.f78584a) {
                return;
            }
            boolean c13 = zVar.c(i13);
            k8.t tVar = this.f86088p.f78586c[i13];
            if (c13 && tVar != null) {
                tVar.g();
            }
            i13++;
        }
    }

    public final void d() {
        if (this.f86086n != null) {
            return;
        }
        int i13 = 0;
        while (true) {
            k8.z zVar = this.f86088p;
            if (i13 >= zVar.f78584a) {
                return;
            }
            boolean c13 = zVar.c(i13);
            k8.t tVar = this.f86088p.f78586c[i13];
            if (c13 && tVar != null) {
                tVar.o();
            }
            i13++;
        }
    }

    public final long e() {
        if (!this.f86078f) {
            return this.f86080h.f86101b;
        }
        long t13 = this.f86079g ? this.f86073a.t() : Long.MIN_VALUE;
        return t13 == Long.MIN_VALUE ? this.f86080h.f86104e : t13;
    }

    public final long f() {
        return this.f86080h.f86101b + this.f86089q;
    }

    public final void g(float f13, a7.b1 b1Var, boolean z13) {
        this.f86078f = true;
        this.f86087o = this.f86073a.r();
        k8.z k13 = k(f13, b1Var, z13);
        b1 b1Var2 = this.f86080h;
        long j13 = b1Var2.f86101b;
        long j14 = b1Var2.f86104e;
        long a13 = a(k13, (j14 == -9223372036854775807L || j13 < j14) ? j13 : Math.max(0L, j14 - 1), false, new boolean[this.f86083k.length]);
        long j15 = this.f86089q;
        b1 b1Var3 = this.f86080h;
        this.f86089q = (b1Var3.f86101b - a13) + j15;
        this.f86080h = b1Var3.b(a13);
    }

    public final boolean h() {
        return this.f86078f && (!this.f86079g || this.f86073a.t() == Long.MIN_VALUE);
    }

    public final boolean i() {
        return this.f86078f && (h() || e() - this.f86080h.f86101b >= this.f86076d);
    }

    public final void j() {
        c();
        g8.c0 c0Var = this.f86073a;
        try {
            boolean z13 = c0Var instanceof g8.c;
            n1 n1Var = this.f86085m;
            if (z13) {
                n1Var.g(((g8.c) c0Var).f64215a);
            } else {
                n1Var.g(c0Var);
            }
        } catch (RuntimeException e13) {
            d7.u.d("MediaPeriodHolder", "Period release failed.", e13);
        }
    }

    public final k8.z k(float f13, a7.b1 b1Var, boolean z13) {
        k8.t[] tVarArr;
        g8.m1 m1Var = this.f86087o;
        g8.e0 e0Var = this.f86080h.f86100a;
        k8.y yVar = this.f86084l;
        h[] hVarArr = this.f86083k;
        k8.z g13 = yVar.g(hVarArr, m1Var, e0Var, b1Var);
        int i13 = 0;
        while (true) {
            int i14 = g13.f78584a;
            tVarArr = g13.f78586c;
            if (i13 >= i14) {
                break;
            }
            if (g13.c(i13)) {
                if (tVarArr[i13] == null && hVarArr[i13].f86171b != -2) {
                    r5 = false;
                }
                bf.b.t(r5);
            } else {
                bf.b.t(tVarArr[i13] == null);
            }
            i13++;
        }
        for (k8.t tVar : tVarArr) {
            if (tVar != null) {
                tVar.i(f13);
                tVar.n(z13);
            }
        }
        return g13;
    }

    public final void l(long j13) {
        this.f86089q = j13;
    }

    public final long m(long j13) {
        return j13 + this.f86089q;
    }

    public final void n() {
        g8.c0 c0Var = this.f86073a;
        if (c0Var instanceof g8.c) {
            long j13 = this.f86080h.f86103d;
            if (j13 == -9223372036854775807L) {
                j13 = Long.MIN_VALUE;
            }
            ((g8.c) c0Var).d(j13);
        }
    }
}
