package m7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final h f86446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86447b;

    /* renamed from: c, reason: collision with root package name */
    public final h f86448c;

    /* renamed from: d, reason: collision with root package name */
    public int f86449d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86450e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86451f = false;

    public w1(h hVar, h hVar2, int i13) {
        this.f86446a = hVar;
        this.f86447b = i13;
        this.f86448c = hVar2;
    }

    public static void c(h hVar) {
        int i13 = hVar.f86177h;
        if (i13 == 2) {
            bf.b.t(i13 == 2);
            hVar.f86177h = 1;
            hVar.x();
        }
    }

    public static boolean l(h hVar) {
        return hVar.f86177h != 0;
    }

    public static void s(h hVar, long j13) {
        hVar.f86183n = true;
        if (hVar instanceof j8.f) {
            j8.f fVar = (j8.f) hVar;
            bf.b.t(fVar.f86183n);
            fVar.f74919J = j13;
        }
    }

    public final void a(p pVar) {
        h hVar;
        if (j()) {
            int i13 = this.f86449d;
            boolean z13 = i13 == 4 || i13 == 2;
            int i14 = i13 != 4 ? 0 : 1;
            if (z13) {
                hVar = this.f86446a;
            } else {
                hVar = this.f86448c;
                hVar.getClass();
            }
            b(hVar, pVar);
            o(z13);
            this.f86449d = i14;
        }
    }

    public final void b(h hVar, p pVar) {
        bf.b.t(this.f86446a == hVar || this.f86448c == hVar);
        if (l(hVar)) {
            if (hVar == pVar.f86352c) {
                pVar.f86353d = null;
                pVar.f86352c = null;
                pVar.f86354e = true;
            }
            c(hVar);
            bf.b.t(hVar.f86177h == 1);
            hVar.f86172c.c();
            hVar.f86177h = 0;
            hVar.f86178i = null;
            hVar.f86179j = null;
            hVar.f86183n = false;
            hVar.r();
        }
    }

    public final int d() {
        boolean l13 = l(this.f86446a);
        h hVar = this.f86448c;
        return (l13 ? 1 : 0) + ((hVar == null || !l(hVar)) ? 0 : 1);
    }

    public final long e(long j13, long j14) {
        h hVar = this.f86446a;
        long j15 = l(hVar) ? hVar.j(j13, j14) : Long.MAX_VALUE;
        h hVar2 = this.f86448c;
        return (hVar2 == null || !l(hVar2)) ? j15 : Math.min(j15, hVar2.j(j13, j14));
    }

    public final long f(a1 a1Var) {
        h g13 = g(a1Var);
        Objects.requireNonNull(g13);
        return g13.f86182m;
    }

    public final h g(a1 a1Var) {
        g8.b1 b1Var;
        if (a1Var != null && (b1Var = a1Var.f86075c[this.f86447b]) != null) {
            h hVar = this.f86446a;
            if (hVar.f86178i == b1Var) {
                return hVar;
            }
            h hVar2 = this.f86448c;
            if (hVar2 != null && hVar2.f86178i == b1Var) {
                return hVar2;
            }
        }
        return null;
    }

    public final boolean h(h hVar, a1 a1Var) {
        if (hVar == null) {
            return true;
        }
        g8.b1[] b1VarArr = a1Var.f86075c;
        int i13 = this.f86447b;
        g8.b1 b1Var = b1VarArr[i13];
        g8.b1 b1Var2 = hVar.f86178i;
        if (b1Var2 == null) {
            return true;
        }
        if (b1Var2 == b1Var) {
            if (b1Var == null || hVar.n()) {
                return true;
            }
            a1 a1Var2 = a1Var.f86086n;
            if (a1Var.f86080h.f86106g && a1Var2 != null && a1Var2.f86078f && ((hVar instanceof j8.f) || (hVar instanceof y7.b) || hVar.f86182m >= a1Var2.f())) {
                return true;
            }
        }
        a1 a1Var3 = a1Var.f86086n;
        return a1Var3 != null && a1Var3.f86075c[i13] == hVar.f86178i;
    }

    public final boolean i(a1 a1Var) {
        h g13 = g(a1Var);
        g13.getClass();
        return g13.n();
    }

    public final boolean j() {
        int i13 = this.f86449d;
        return i13 == 2 || i13 == 4 || i13 == 3;
    }

    public final boolean k() {
        int i13 = this.f86449d;
        if (i13 == 0 || i13 == 2 || i13 == 4) {
            return l(this.f86446a);
        }
        h hVar = this.f86448c;
        hVar.getClass();
        return hVar.f86177h != 0;
    }

    public final boolean m(int i13) {
        int i14 = this.f86449d;
        boolean z13 = i14 == 2 || i14 == 4;
        int i15 = this.f86447b;
        return (z13 && i13 == i15) || (i14 == 3 && i13 != i15);
    }

    public final void n(g8.b1 b1Var, p pVar, long j13, boolean z13) {
        h hVar = this.f86446a;
        if (l(hVar)) {
            if (b1Var != hVar.f86178i) {
                b(hVar, pVar);
            } else if (z13) {
                hVar.f86183n = false;
                hVar.f86181l = j13;
                hVar.f86182m = j13;
                hVar.t(j13, false);
            }
        }
        h hVar2 = this.f86448c;
        if (hVar2 == null || !l(hVar2)) {
            return;
        }
        if (b1Var != hVar2.f86178i) {
            b(hVar2, pVar);
        } else if (z13) {
            hVar2.f86183n = false;
            hVar2.f86181l = j13;
            hVar2.f86182m = j13;
            hVar2.t(j13, false);
        }
    }

    public final void o(boolean z13) {
        if (z13) {
            if (this.f86450e) {
                this.f86446a.C();
                this.f86450e = false;
                return;
            }
            return;
        }
        if (this.f86451f) {
            h hVar = this.f86448c;
            hVar.getClass();
            hVar.C();
            this.f86451f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(h hVar, a1 a1Var, k8.z zVar, p pVar) {
        h hVar2;
        int i13;
        if (hVar == null || hVar.f86177h == 0 || ((hVar == (hVar2 = this.f86446a) && ((i13 = this.f86449d) == 2 || i13 == 4)) || (hVar == this.f86448c && this.f86449d == 3))) {
            return 1;
        }
        g8.b1 b1Var = hVar.f86178i;
        g8.b1[] b1VarArr = a1Var.f86075c;
        int i14 = this.f86447b;
        byte b13 = b1Var != b1VarArr[i14];
        boolean c13 = zVar.c(i14);
        if (c13 && b13 != true) {
            return 1;
        }
        if (hVar.f86183n) {
            if (!hVar.o()) {
                return 0;
            }
            b(hVar, pVar);
            if (!c13 || j()) {
                o(hVar == hVar2);
            }
            return 1;
        }
        k8.t tVar = zVar.f78586c[i14];
        int length = tVar != null ? tVar.length() : 0;
        androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[length];
        for (int i15 = 0; i15 < length; i15++) {
            tVar.getClass();
            bVarArr[i15] = tVar.e(i15);
        }
        g8.b1 b1Var2 = b1VarArr[i14];
        b1Var2.getClass();
        hVar.B(bVarArr, b1Var2, a1Var.f(), a1Var.f86089q, a1Var.f86080h.f86100a);
        return 3;
    }

    public final void q() {
        if (!l(this.f86446a)) {
            o(true);
        }
        h hVar = this.f86448c;
        if (hVar == null || hVar.f86177h != 0) {
            return;
        }
        o(false);
    }

    public final void r(a1 a1Var, long j13) {
        h g13 = g(a1Var);
        g13.getClass();
        s(g13, j13);
    }

    public final void t() {
        int i13;
        h hVar = this.f86446a;
        int i14 = hVar.f86177h;
        if (i14 == 1 && this.f86449d != 4) {
            bf.b.t(i14 == 1);
            hVar.f86177h = 2;
            hVar.w();
            return;
        }
        h hVar2 = this.f86448c;
        if (hVar2 == null || (i13 = hVar2.f86177h) != 1 || this.f86449d == 3) {
            return;
        }
        bf.b.t(i13 == 1);
        hVar2.f86177h = 2;
        hVar2.w();
    }

    public final void u(boolean z13) {
        h hVar = this.f86446a;
        h hVar2 = this.f86448c;
        if (z13) {
            hVar2.getClass();
            hVar2.b(17, hVar);
        } else {
            hVar2.getClass();
            hVar.b(17, hVar2);
        }
    }
}
