package n7;

import a7.b1;
import a7.v0;
import a7.z0;
import java.util.Objects;
import pk.a3;
import pk.c1;
import pk.h1;
import pk.v2;
import pk.y0;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f89388a;

    /* renamed from: b, reason: collision with root package name */
    public c1 f89389b;

    /* renamed from: c, reason: collision with root package name */
    public h1 f89390c;

    /* renamed from: d, reason: collision with root package name */
    public g8.e0 f89391d;

    /* renamed from: e, reason: collision with root package name */
    public g8.e0 f89392e;

    /* renamed from: f, reason: collision with root package name */
    public g8.e0 f89393f;

    public b0(z0 z0Var) {
        this.f89388a = z0Var;
        y0 y0Var = c1.f100372b;
        this.f89389b = v2.f100502e;
        this.f89390c = a3.f100350g;
    }

    public static g8.e0 c(v0 v0Var, c1 c1Var, g8.e0 e0Var, z0 z0Var) {
        b1 v13 = v0Var.v();
        int B = v0Var.B();
        Object m13 = v13.q() ? null : v13.m(B);
        int b13 = (v0Var.g() || v13.q()) ? -1 : v13.f(B, z0Var).b(d7.n0.X(v0Var.X()) - z0Var.j());
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            g8.e0 e0Var2 = (g8.e0) c1Var.get(i13);
            if (d(e0Var2, m13, v0Var.g(), v0Var.q(), v0Var.G(), b13)) {
                return e0Var2;
            }
        }
        if (c1Var.isEmpty() && e0Var != null) {
            if (d(e0Var, m13, v0Var.g(), v0Var.q(), v0Var.G(), b13)) {
                return e0Var;
            }
        }
        return null;
    }

    public static boolean d(g8.e0 e0Var, Object obj, boolean z13, int i13, int i14, int i15) {
        if (!e0Var.f64233a.equals(obj)) {
            return false;
        }
        int i16 = e0Var.f64234b;
        return (z13 && i16 == i13 && e0Var.f64235c == i14) || (!z13 && i16 == -1 && e0Var.f64237e == i15);
    }

    public final void b(d7.b0 b0Var, g8.e0 e0Var, b1 b1Var) {
        if (e0Var == null) {
            return;
        }
        if (b1Var.b(e0Var.f64233a) != -1) {
            b0Var.e(e0Var, b1Var);
            return;
        }
        b1 b1Var2 = (b1) this.f89390c.get(e0Var);
        if (b1Var2 != null) {
            b0Var.e(e0Var, b1Var2);
        }
    }

    public final void e(b1 b1Var) {
        d7.b0 a13 = h1.a();
        if (this.f89389b.isEmpty()) {
            b(a13, this.f89392e, b1Var);
            if (!Objects.equals(this.f89393f, this.f89392e)) {
                b(a13, this.f89393f, b1Var);
            }
            if (!Objects.equals(this.f89391d, this.f89392e) && !Objects.equals(this.f89391d, this.f89393f)) {
                b(a13, this.f89391d, b1Var);
            }
        } else {
            for (int i13 = 0; i13 < this.f89389b.size(); i13++) {
                b(a13, (g8.e0) this.f89389b.get(i13), b1Var);
            }
            if (!this.f89389b.contains(this.f89391d)) {
                b(a13, this.f89391d, b1Var);
            }
        }
        this.f89390c = a13.a();
    }
}
