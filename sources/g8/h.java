package g8;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements i0, s7.n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f64272a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f64273b;

    /* renamed from: c, reason: collision with root package name */
    public s7.m f64274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f64275d;

    public h(j jVar, Object obj) {
        this.f64275d = jVar;
        this.f64273b = jVar.a(null);
        this.f64274c = new s7.m(jVar.f64175d.f111329c, 0, null);
        this.f64272a = obj;
    }

    @Override // g8.i0
    public final void a(int i13, e0 e0Var, v vVar, a0 a0Var, int i14) {
        if (c(i13, e0Var)) {
            h0 h0Var = this.f64273b;
            a0 k13 = k(a0Var, e0Var);
            h0Var.getClass();
            h0Var.a(new n7.e(h0Var, vVar, k13, i14, 2));
        }
    }

    @Override // s7.n
    public final void b(int i13, e0 e0Var) {
        if (c(i13, e0Var)) {
            this.f64274c.f();
        }
    }

    public final boolean c(int i13, e0 e0Var) {
        e0 e0Var2;
        Object obj = this.f64272a;
        j jVar = this.f64275d;
        if (e0Var != null) {
            e0Var2 = jVar.x(obj, e0Var);
            if (e0Var2 == null) {
                return false;
            }
        } else {
            e0Var2 = null;
        }
        int z13 = jVar.z(i13, obj);
        h0 h0Var = this.f64273b;
        if (h0Var.f64276a != z13 || !Objects.equals(h0Var.f64277b, e0Var2)) {
            this.f64273b = new h0(jVar.f64174c.f64278c, z13, e0Var2);
        }
        s7.m mVar = this.f64274c;
        if (mVar.f111327a == z13 && Objects.equals(mVar.f111328b, e0Var2)) {
            return true;
        }
        this.f64274c = new s7.m(jVar.f64175d.f111329c, z13, e0Var2);
        return true;
    }

    @Override // g8.i0
    public final void d(int i13, e0 e0Var, v vVar, a0 a0Var) {
        if (c(i13, e0Var)) {
            h0 h0Var = this.f64273b;
            a0 k13 = k(a0Var, e0Var);
            h0Var.getClass();
            h0Var.a(new n7.o(h0Var, vVar, k13, 2));
        }
    }

    @Override // g8.i0
    public final void e(int i13, e0 e0Var, v vVar, a0 a0Var) {
        if (c(i13, e0Var)) {
            h0 h0Var = this.f64273b;
            a0 k13 = k(a0Var, e0Var);
            h0Var.getClass();
            h0Var.a(new l0.d(h0Var, vVar, k13, 7));
        }
    }

    @Override // g8.i0
    public final void f(int i13, e0 e0Var, v vVar, a0 a0Var, IOException iOException, boolean z13) {
        if (c(i13, e0Var)) {
            h0 h0Var = this.f64273b;
            a0 k13 = k(a0Var, e0Var);
            h0Var.getClass();
            h0Var.a(new n7.l(h0Var, vVar, k13, iOException, z13));
        }
    }

    @Override // g8.i0
    public final void g(int i13, e0 e0Var, a0 a0Var) {
        if (c(i13, e0Var)) {
            h0 h0Var = this.f64273b;
            a0 k13 = k(a0Var, e0Var);
            h0Var.getClass();
            h0Var.a(new androidx.fragment.app.c(7, h0Var, k13));
        }
    }

    @Override // s7.n
    public final void h(int i13, e0 e0Var) {
        if (c(i13, e0Var)) {
            this.f64274c.c();
        }
    }

    @Override // s7.n
    public final void i(int i13, e0 e0Var, int i14) {
        if (c(i13, e0Var)) {
            this.f64274c.d(i14);
        }
    }

    @Override // s7.n
    public final void j(int i13, e0 e0Var) {
        if (c(i13, e0Var)) {
            this.f64274c.b();
        }
    }

    public final a0 k(a0 a0Var, e0 e0Var) {
        long j13 = a0Var.f64184f;
        j jVar = this.f64275d;
        Object obj = this.f64272a;
        long y13 = jVar.y(obj, j13);
        long j14 = a0Var.f64185g;
        long y14 = jVar.y(obj, j14);
        if (y13 == a0Var.f64184f && y14 == j14) {
            return a0Var;
        }
        return new a0(a0Var.f64179a, a0Var.f64180b, a0Var.f64181c, a0Var.f64182d, a0Var.f64183e, y13, y14);
    }

    @Override // s7.n
    public final void m(int i13, e0 e0Var) {
        if (c(i13, e0Var)) {
            this.f64274c.a();
        }
    }

    @Override // g8.i0
    public final void p(int i13, e0 e0Var, a0 a0Var) {
        if (c(i13, e0Var)) {
            h0 h0Var = this.f64273b;
            a0 k13 = k(a0Var, e0Var);
            e0 e0Var2 = h0Var.f64277b;
            e0Var2.getClass();
            h0Var.a(new l0.d(h0Var, e0Var2, k13, 8));
        }
    }

    @Override // s7.n
    public final void q(int i13, e0 e0Var, Exception exc) {
        if (c(i13, e0Var)) {
            this.f64274c.e(exc);
        }
    }
}
