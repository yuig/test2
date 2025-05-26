package a7;

import java.util.ArrayList;
import java.util.List;
import m7.t1;

/* loaded from: classes.dex */
public abstract class h implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f1053a = new a1();

    @Override // a7.v0
    public final boolean F() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        if (v13.q()) {
            return false;
        }
        int N = l0Var.N();
        l0Var.L0();
        int i13 = l0Var.H;
        if (i13 == 1) {
            i13 = 0;
        }
        l0Var.L0();
        return v13.l(N, i13, l0Var.I) != -1;
    }

    @Override // a7.v0
    public final boolean K() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        return !v13.q() && v13.n(l0Var.N(), this.f1053a, 0L).f936h;
    }

    @Override // a7.v0
    public final void T() {
        m7.l0 l0Var = (m7.l0) this;
        l0Var.L0();
        d0(12, l0Var.f86289x);
    }

    @Override // a7.v0
    public final void U() {
        m7.l0 l0Var = (m7.l0) this;
        l0Var.L0();
        d0(11, -l0Var.f86288w);
    }

    @Override // a7.v0
    public final void W(List list) {
        m7.l0 l0Var = (m7.l0) this;
        l0Var.L0();
        l0Var.z0(l0Var.j0(list), true);
    }

    @Override // a7.v0
    public final boolean Y() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        return !v13.q() && v13.n(l0Var.N(), this.f1053a, 0L).b();
    }

    public final long Z() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        if (v13.q()) {
            return -9223372036854775807L;
        }
        return d7.n0.o0(v13.n(l0Var.N(), this.f1053a, 0L).f941m);
    }

    public final void a0(int i13) {
        b0(-1, -9223372036854775807L, false);
    }

    public abstract void b0(int i13, long j13, boolean z13);

    public final void c0(int i13, long j13) {
        b0(((m7.l0) this).N(), j13, false);
    }

    public final void d0(int i13, long j13) {
        m7.l0 l0Var = (m7.l0) this;
        long X = l0Var.X() + j13;
        long duration = l0Var.getDuration();
        if (duration != -9223372036854775807L) {
            X = Math.min(X, duration);
        }
        c0(i13, Math.max(X, 0L));
    }

    public final void e() {
        m7.l0 l0Var = (m7.l0) this;
        l0Var.L0();
        ArrayList arrayList = l0Var.f86282q;
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || min == 0) {
            return;
        }
        m7.o1 o1Var = l0Var.f86276m0;
        int n03 = l0Var.n0(o1Var);
        long l03 = l0Var.l0(o1Var);
        int size2 = arrayList.size();
        l0Var.f86251J++;
        l0Var.v0(min);
        t1 t1Var = new t1(arrayList, l0Var.O);
        m7.o1 r03 = l0Var.r0(o1Var, t1Var, l0Var.o0(o1Var.f86330a, t1Var, n03, l03));
        int i13 = r03.f86334e;
        if (i13 != 1 && i13 != 4 && min > 0 && min == size2 && n03 >= r03.f86330a.p()) {
            r03 = m7.l0.q0(r03, 4);
        }
        m7.o1 o1Var2 = r03;
        g8.e1 e1Var = l0Var.O;
        d7.i0 i0Var = l0Var.f86275m.f86417h;
        i0Var.getClass();
        d7.h0 c13 = d7.i0.c();
        c13.f53827a = i0Var.f53829a.obtainMessage(20, 0, min, e1Var);
        c13.b();
        l0Var.J0(o1Var2, 0, !o1Var2.f86331b.f64233a.equals(l0Var.f86276m0.f86331b.f64233a), 4, l0Var.m0(o1Var2), -1, false);
    }

    public final void e0(i0 i0Var) {
        W(pk.c1.v(i0Var));
    }

    @Override // a7.v0
    public final boolean f() {
        m7.l0 l0Var = (m7.l0) this;
        return l0Var.L() == 3 && l0Var.z() && l0Var.u() == 0;
    }

    @Override // a7.v0
    public final i0 i() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        if (v13.q()) {
            return null;
        }
        return v13.n(l0Var.N(), this.f1053a, 0L).f931c;
    }

    @Override // a7.v0
    public final void k() {
        b0(((m7.l0) this).N(), -9223372036854775807L, false);
    }

    @Override // a7.v0
    public final int l() {
        return ((m7.l0) this).N();
    }

    @Override // a7.v0
    public final void m() {
        int l13;
        int l14;
        m7.l0 l0Var = (m7.l0) this;
        if (l0Var.v().q() || l0Var.g()) {
            a0(7);
            return;
        }
        boolean F = F();
        if (Y() && !K()) {
            if (!F) {
                a0(7);
                return;
            }
            b1 v13 = l0Var.v();
            if (v13.q()) {
                l14 = -1;
            } else {
                int N = l0Var.N();
                l0Var.L0();
                int i13 = l0Var.H;
                if (i13 == 1) {
                    i13 = 0;
                }
                l0Var.L0();
                l14 = v13.l(N, i13, l0Var.I);
            }
            if (l14 == -1) {
                a0(7);
                return;
            } else if (l14 == l0Var.N()) {
                b0(l0Var.N(), -9223372036854775807L, true);
                return;
            } else {
                b0(l14, -9223372036854775807L, false);
                return;
            }
        }
        if (F) {
            long X = l0Var.X();
            l0Var.L0();
            if (X <= l0Var.f86290y) {
                b1 v14 = l0Var.v();
                if (v14.q()) {
                    l13 = -1;
                } else {
                    int N2 = l0Var.N();
                    l0Var.L0();
                    int i14 = l0Var.H;
                    if (i14 == 1) {
                        i14 = 0;
                    }
                    l0Var.L0();
                    l13 = v14.l(N2, i14, l0Var.I);
                }
                if (l13 == -1) {
                    a0(7);
                    return;
                } else if (l13 == l0Var.N()) {
                    b0(l0Var.N(), -9223372036854775807L, true);
                    return;
                } else {
                    b0(l13, -9223372036854775807L, false);
                    return;
                }
            }
        }
        c0(7, 0L);
    }

    @Override // a7.v0
    public final boolean p() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        if (v13.q()) {
            return false;
        }
        int N = l0Var.N();
        l0Var.L0();
        int i13 = l0Var.H;
        if (i13 == 1) {
            i13 = 0;
        }
        l0Var.L0();
        return v13.e(N, i13, l0Var.I) != -1;
    }

    @Override // a7.v0
    public final void pause() {
        ((m7.l0) this).B0(false);
    }

    @Override // a7.v0
    public final void play() {
        ((m7.l0) this).B0(true);
    }

    @Override // a7.v0
    public final boolean r(int i13) {
        m7.l0 l0Var = (m7.l0) this;
        l0Var.L0();
        return l0Var.Q.f1197a.f1162a.get(i13);
    }

    @Override // a7.v0
    public final void s() {
        c0(5, 0L);
    }

    @Override // a7.v0
    public final boolean t() {
        m7.l0 l0Var = (m7.l0) this;
        b1 v13 = l0Var.v();
        return !v13.q() && v13.n(l0Var.N(), this.f1053a, 0L).f937i;
    }

    @Override // a7.v0
    public final void x() {
        int e13;
        m7.l0 l0Var = (m7.l0) this;
        if (l0Var.v().q() || l0Var.g()) {
            a0(9);
            return;
        }
        if (!p()) {
            if (Y() && t()) {
                b0(l0Var.N(), -9223372036854775807L, false);
                return;
            } else {
                a0(9);
                return;
            }
        }
        b1 v13 = l0Var.v();
        if (v13.q()) {
            e13 = -1;
        } else {
            int N = l0Var.N();
            l0Var.L0();
            int i13 = l0Var.H;
            if (i13 == 1) {
                i13 = 0;
            }
            l0Var.L0();
            e13 = v13.e(N, i13, l0Var.I);
        }
        if (e13 == -1) {
            a0(9);
        } else if (e13 == l0Var.N()) {
            b0(l0Var.N(), -9223372036854775807L, true);
        } else {
            b0(e13, -9223372036854775807L, false);
        }
    }

    @Override // a7.v0
    public final void y(int i13, long j13) {
        b0(i13, j13, false);
    }
}
