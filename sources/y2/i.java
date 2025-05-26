package y2;

import i1.i0;
import kotlin.collections.z0;
import lb.l0;
import q3.c1;
import q3.j1;
import q3.n;
import q3.o0;
import q3.q0;
import q3.r0;
import q3.s;
import s3.c0;
import s3.m0;
import s3.r;
import u2.p;

/* loaded from: classes.dex */
public final class i extends p implements c0, r {

    /* renamed from: n, reason: collision with root package name */
    public g3.b f136673n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f136674o;

    /* renamed from: p, reason: collision with root package name */
    public u2.e f136675p;

    /* renamed from: q, reason: collision with root package name */
    public n f136676q;

    /* renamed from: r, reason: collision with root package name */
    public float f136677r;

    /* renamed from: s, reason: collision with root package name */
    public b3.p f136678s;

    public static boolean O0(long j13) {
        if (!a3.f.a(j13, h.f136670b)) {
            float b13 = a3.f.b(j13);
            if (!Float.isInfinite(b13) && !Float.isNaN(b13)) {
                return true;
            }
        }
        return false;
    }

    public static boolean P0(long j13) {
        if (!a3.f.a(j13, h.f136670b)) {
            float d2 = a3.f.d(j13);
            if (!Float.isInfinite(d2) && !Float.isNaN(d2)) {
                return true;
            }
        }
        return false;
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    public final long M0(long j13) {
        if (!N0()) {
            return j13;
        }
        long c13 = bs1.c.c(!P0(this.f136673n.d()) ? a3.f.d(j13) : a3.f.d(this.f136673n.d()), !O0(this.f136673n.d()) ? a3.f.b(j13) : a3.f.b(this.f136673n.d()));
        if (a3.f.d(j13) == 0.0f || a3.f.b(j13) == 0.0f) {
            return 0L;
        }
        long b13 = ((vb0.i) this.f136676q).b(c13, j13);
        return bs1.c.c(j1.a(b13) * a3.f.d(c13), j1.b(b13) * a3.f.b(c13));
    }

    public final boolean N0() {
        return this.f136674o && this.f136673n.d() != h.f136670b;
    }

    public final long Q0(long j13) {
        boolean z13 = false;
        boolean z14 = n4.a.d(j13) && n4.a.c(j13);
        if (n4.a.f(j13) && n4.a.e(j13)) {
            z13 = true;
        }
        if ((!N0() && z14) || z13) {
            return n4.a.a(j13, n4.a.h(j13), 0, n4.a.g(j13), 0, 10);
        }
        long d2 = this.f136673n.d();
        long M0 = M0(bs1.c.c(bs1.c.J(P0(d2) ? Math.round(a3.f.d(d2)) : n4.a.j(j13), j13), bs1.c.I(O0(d2) ? Math.round(a3.f.b(d2)) : n4.a.i(j13), j13)));
        return n4.a.a(j13, bs1.c.J(Math.round(a3.f.d(M0)), j13), 0, bs1.c.I(Math.round(a3.f.b(M0)), j13), 0, 10);
    }

    @Override // s3.c0
    public final int a(s sVar, q3.r rVar, int i13) {
        if (!N0()) {
            return rVar.N(i13);
        }
        long Q0 = Q0(bs1.c.b(0, i13, 7));
        return Math.max(n4.a.j(Q0), rVar.N(i13));
    }

    @Override // s3.c0
    public final int d(s sVar, q3.r rVar, int i13) {
        if (!N0()) {
            return rVar.d(i13);
        }
        long Q0 = Q0(bs1.c.b(i13, 0, 13));
        return Math.max(n4.a.i(Q0), rVar.d(i13));
    }

    @Override // s3.c0
    public final int e(s sVar, q3.r rVar, int i13) {
        if (!N0()) {
            return rVar.D(i13);
        }
        long Q0 = Q0(bs1.c.b(i13, 0, 13));
        return Math.max(n4.a.i(Q0), rVar.D(i13));
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        long j13;
        float f13;
        float f14;
        long d2 = this.f136673n.d();
        long c13 = bs1.c.c(P0(d2) ? a3.f.d(d2) : a3.f.d(((m0) eVar).f110840a.g()), O0(d2) ? a3.f.b(d2) : a3.f.b(((m0) eVar).f110840a.g()));
        m0 m0Var = (m0) eVar;
        try {
            if (a3.f.d(m0Var.f110840a.g()) != 0.0f) {
                d3.c cVar = m0Var.f110840a;
                if (a3.f.b(cVar.g()) != 0.0f) {
                    long b13 = ((vb0.i) this.f136676q).b(c13, cVar.g());
                    j13 = bs1.c.c(j1.a(b13) * a3.f.d(c13), j1.b(b13) * a3.f.b(c13));
                    long j14 = j13;
                    u2.e eVar2 = this.f136675p;
                    long d13 = l0.d(Math.round(a3.f.d(j14)), Math.round(a3.f.b(j14)));
                    d3.c cVar2 = m0Var.f110840a;
                    long a13 = eVar2.a(d13, l0.d(Math.round(a3.f.d(cVar2.g())), Math.round(a3.f.b(cVar2.g()))), m0Var.getLayoutDirection());
                    f13 = (int) (a13 >> 32);
                    f14 = (int) (a13 & 4294967295L);
                    m0Var.f110840a.f53652b.f53648a.d(f13, f14);
                    this.f136673n.c(eVar, j14, this.f136677r, this.f136678s);
                    ((m0) eVar).f110840a.f53652b.f53648a.d(-f13, -f14);
                    m0Var.a();
                    return;
                }
            }
            this.f136673n.c(eVar, j14, this.f136677r, this.f136678s);
            ((m0) eVar).f110840a.f53652b.f53648a.d(-f13, -f14);
            m0Var.a();
            return;
        } catch (Throwable th3) {
            ((m0) eVar).f110840a.f53652b.f53648a.d(-f13, -f14);
            throw th3;
        }
        j13 = 0;
        long j142 = j13;
        u2.e eVar22 = this.f136675p;
        long d132 = l0.d(Math.round(a3.f.d(j142)), Math.round(a3.f.b(j142)));
        d3.c cVar22 = m0Var.f110840a;
        long a132 = eVar22.a(d132, l0.d(Math.round(a3.f.d(cVar22.g())), Math.round(a3.f.b(cVar22.g()))), m0Var.getLayoutDirection());
        f13 = (int) (a132 >> 32);
        f14 = (int) (a132 & 4294967295L);
        m0Var.f110840a.f53652b.f53648a.d(f13, f14);
    }

    @Override // s3.c0
    public final int h(s sVar, q3.r rVar, int i13) {
        if (!N0()) {
            return rVar.P(i13);
        }
        long Q0 = Q0(bs1.c.b(0, i13, 7));
        return Math.max(n4.a.j(Q0), rVar.P(i13));
    }

    @Override // s3.c0
    public final q0 i(r0 r0Var, o0 o0Var, long j13) {
        q0 s03;
        c1 Q = o0Var.Q(Q0(j13));
        s03 = r0Var.s0(Q.f102178a, Q.f102179b, z0.d(), new i0(Q, 4));
        return s03;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f136673n + ", sizeToIntrinsics=" + this.f136674o + ", alignment=" + this.f136675p + ", alpha=" + this.f136677r + ", colorFilter=" + this.f136678s + ')';
    }
}
