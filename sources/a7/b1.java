package a7;

import android.util.Pair;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f958a = new y0();

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(2);
    }

    public int a(boolean z13) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z13) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i13, z0 z0Var, a1 a1Var, int i14, boolean z13) {
        int i15 = g(i13, z0Var, false).f1253c;
        if (n(i15, a1Var, 0L).f943o != i13) {
            return i13 + 1;
        }
        int e13 = e(i15, i14, z13);
        if (e13 == -1) {
            return -1;
        }
        return n(e13, a1Var, 0L).f942n;
    }

    public int e(int i13, int i14, boolean z13) {
        if (i14 == 0) {
            if (i13 == c(z13)) {
                return -1;
            }
            return i13 + 1;
        }
        if (i14 == 1) {
            return i13;
        }
        if (i14 == 2) {
            return i13 == c(z13) ? a(z13) : i13 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int c13;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (b1Var.p() != p() || b1Var.i() != i()) {
            return false;
        }
        a1 a1Var = new a1();
        z0 z0Var = new z0();
        a1 a1Var2 = new a1();
        z0 z0Var2 = new z0();
        for (int i13 = 0; i13 < p(); i13++) {
            if (!n(i13, a1Var, 0L).equals(b1Var.n(i13, a1Var2, 0L))) {
                return false;
            }
        }
        for (int i14 = 0; i14 < i(); i14++) {
            if (!g(i14, z0Var, true).equals(b1Var.g(i14, z0Var2, true))) {
                return false;
            }
        }
        int a13 = a(true);
        if (a13 != b1Var.a(true) || (c13 = c(true)) != b1Var.c(true)) {
            return false;
        }
        while (a13 != c13) {
            int e13 = e(a13, 0, true);
            if (e13 != b1Var.e(a13, 0, true)) {
                return false;
            }
            a13 = e13;
        }
        return true;
    }

    public final z0 f(int i13, z0 z0Var) {
        return g(i13, z0Var, false);
    }

    public abstract z0 g(int i13, z0 z0Var, boolean z13);

    public z0 h(Object obj, z0 z0Var) {
        return g(b(obj), z0Var, true);
    }

    public int hashCode() {
        a1 a1Var = new a1();
        z0 z0Var = new z0();
        int p13 = p() + RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER;
        for (int i13 = 0; i13 < p(); i13++) {
            p13 = (p13 * 31) + n(i13, a1Var, 0L).hashCode();
        }
        int i14 = i() + (p13 * 31);
        for (int i15 = 0; i15 < i(); i15++) {
            i14 = (i14 * 31) + g(i15, z0Var, true).hashCode();
        }
        int a13 = a(true);
        while (a13 != -1) {
            i14 = (i14 * 31) + a13;
            a13 = e(a13, 0, true);
        }
        return i14;
    }

    public abstract int i();

    public final Pair j(a1 a1Var, z0 z0Var, int i13, long j13) {
        Pair k13 = k(a1Var, z0Var, i13, j13, 0L);
        k13.getClass();
        return k13;
    }

    public final Pair k(a1 a1Var, z0 z0Var, int i13, long j13, long j14) {
        bf.b.m(i13, p());
        n(i13, a1Var, j14);
        if (j13 == -9223372036854775807L) {
            j13 = a1Var.f940l;
            if (j13 == -9223372036854775807L) {
                return null;
            }
        }
        int i14 = a1Var.f942n;
        g(i14, z0Var, false);
        while (i14 < a1Var.f943o && z0Var.f1255e != j13) {
            int i15 = i14 + 1;
            if (g(i15, z0Var, false).f1255e > j13) {
                break;
            }
            i14 = i15;
        }
        g(i14, z0Var, true);
        long j15 = j13 - z0Var.f1255e;
        long j16 = z0Var.f1254d;
        if (j16 != -9223372036854775807L) {
            j15 = Math.min(j15, j16 - 1);
        }
        long max = Math.max(0L, j15);
        Object obj = z0Var.f1252b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i13, int i14, boolean z13) {
        if (i14 == 0) {
            if (i13 == a(z13)) {
                return -1;
            }
            return i13 - 1;
        }
        if (i14 == 1) {
            return i13;
        }
        if (i14 == 2) {
            return i13 == a(z13) ? c(z13) : i13 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i13);

    public abstract a1 n(int i13, a1 a1Var, long j13);

    public final void o(int i13, a1 a1Var) {
        n(i13, a1Var, 0L);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
