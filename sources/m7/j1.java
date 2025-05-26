package m7;

import a.a4;
import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j1 implements g8.i0, s7.n {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f86221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f86222b;

    public j1(n1 n1Var, l1 l1Var) {
        this.f86222b = n1Var;
        this.f86221a = l1Var;
    }

    @Override // g8.i0
    public final void a(int i13, g8.e0 e0Var, final g8.v vVar, final g8.a0 a0Var, final int i14) {
        final Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new Runnable() { // from class: m7.h1
                @Override // java.lang.Runnable
                public final void run() {
                    n7.a aVar = j1.this.f86222b.f86322h;
                    Pair pair = c13;
                    ((n7.c0) aVar).a(((Integer) pair.first).intValue(), (g8.e0) pair.second, vVar, a0Var, i14);
                }
            });
        }
    }

    @Override // s7.n
    public final void b(int i13, g8.e0 e0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new f1(this, c13, 0));
        }
    }

    public final Pair c(int i13, g8.e0 e0Var) {
        g8.e0 e0Var2;
        l1 l1Var = this.f86221a;
        g8.e0 e0Var3 = null;
        if (e0Var != null) {
            int i14 = 0;
            while (true) {
                if (i14 >= l1Var.f86294c.size()) {
                    e0Var2 = null;
                    break;
                }
                if (((g8.e0) l1Var.f86294c.get(i14)).f64236d == e0Var.f64236d) {
                    Object obj = l1Var.f86293b;
                    int i15 = t1.f86391k;
                    e0Var2 = e0Var.a(Pair.create(obj, e0Var.f64233a));
                    break;
                }
                i14++;
            }
            if (e0Var2 == null) {
                return null;
            }
            e0Var3 = e0Var2;
        }
        return Pair.create(Integer.valueOf(i13 + l1Var.f86295d), e0Var3);
    }

    @Override // g8.i0
    public final void d(int i13, g8.e0 e0Var, g8.v vVar, g8.a0 a0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new g1(this, c13, vVar, a0Var, 0));
        }
    }

    @Override // g8.i0
    public final void e(int i13, g8.e0 e0Var, g8.v vVar, g8.a0 a0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new w.b(this, c13, vVar, a0Var, 7));
        }
    }

    @Override // g8.i0
    public final void f(int i13, g8.e0 e0Var, final g8.v vVar, final g8.a0 a0Var, final IOException iOException, final boolean z13) {
        final Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new Runnable() { // from class: m7.i1
                @Override // java.lang.Runnable
                public final void run() {
                    n7.a aVar = j1.this.f86222b.f86322h;
                    Pair pair = c13;
                    ((n7.c0) aVar).f(((Integer) pair.first).intValue(), (g8.e0) pair.second, vVar, a0Var, iOException, z13);
                }
            });
        }
    }

    @Override // g8.i0
    public final void g(int i13, g8.e0 e0Var, g8.a0 a0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new h6.o(this, c13, a0Var, 5));
        }
    }

    @Override // s7.n
    public final void h(int i13, g8.e0 e0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new f1(this, c13, 2));
        }
    }

    @Override // s7.n
    public final void i(int i13, g8.e0 e0Var, int i14) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new v.j(this, c13, i14, 4));
        }
    }

    @Override // s7.n
    public final void j(int i13, g8.e0 e0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new f1(this, c13, 1));
        }
    }

    @Override // s7.n
    public final void m(int i13, g8.e0 e0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new f1(this, c13, 3));
        }
    }

    @Override // g8.i0
    public final void p(int i13, g8.e0 e0Var, g8.a0 a0Var) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new a4(this, c13, a0Var, 20));
        }
    }

    @Override // s7.n
    public final void q(int i13, g8.e0 e0Var, Exception exc) {
        Pair c13 = c(i13, e0Var);
        if (c13 != null) {
            ((d7.i0) this.f86222b.f86323i).d(new a4(this, c13, exc, 21));
        }
    }
}
