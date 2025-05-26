package s3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends q1 {
    public static final b3.i N;
    public final h2 L;
    public a1 M;

    static {
        b3.i g13 = androidx.compose.ui.graphics.a.g();
        int i13 = b3.w.f21391o;
        g13.e(b3.w.f21383g);
        g13.l(1.0f);
        g13.m(1);
        N = g13;
    }

    public x(k0 k0Var) {
        super(k0Var);
        h2 h2Var = new h2();
        h2Var.f120045d = 0;
        this.L = h2Var;
        h2Var.f120049h = this;
        this.M = k0Var.f110815c != null ? new w(this) : null;
    }

    @Override // q3.r
    public final int D(int i13) {
        return this.f110898l.u().f(i13);
    }

    @Override // q3.r
    public final int N(int i13) {
        return this.f110898l.u().g(i13);
    }

    @Override // q3.r
    public final int P(int i13) {
        return this.f110898l.u().c(i13);
    }

    @Override // q3.o0
    public final q3.c1 Q(long j13) {
        x0(j13);
        k0 k0Var = this.f110898l;
        k2.e y13 = k0Var.y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            Object[] objArr = y13.f78182a;
            int i14 = 0;
            do {
                ((k0) objArr[i14]).f110838z.f110984r.f110940k = i0.NotUsed;
                i14++;
            } while (i14 < i13);
        }
        n1(k0Var.f110828p.a(this, k0Var.n(), j13));
        h1();
        return this;
    }

    @Override // s3.q1
    public final void R0() {
        if (this.M == null) {
            this.M = new w(this);
        }
    }

    @Override // s3.q1
    public final a1 V0() {
        return this.M;
    }

    @Override // s3.q1
    public final u2.p X0() {
        return this.L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (((r1 != null && r1.f140702c) ^ true) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // s3.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(s3.m1 r19, long r20, s3.v r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.x.c1(s3.m1, long, s3.v, boolean, boolean):void");
    }

    @Override // q3.r
    public final int d(int i13) {
        return this.f110898l.u().b(i13);
    }

    @Override // s3.q1
    public final void j1(b3.u uVar, e3.d dVar) {
        k0 k0Var = this.f110898l;
        a2 a13 = n0.a(k0Var);
        k2.e x13 = k0Var.x();
        int i13 = x13.f78184c;
        if (i13 > 0) {
            Object[] objArr = x13.f78182a;
            int i14 = 0;
            do {
                k0 k0Var2 = (k0) objArr[i14];
                if (k0Var2.H()) {
                    k0Var2.j(uVar, dVar);
                }
                i14++;
            } while (i14 < i13);
        }
        if (((t3.c0) a13).B) {
            P0(uVar, N);
        }
    }

    @Override // s3.q1
    public final void k1(long j13, float f13, e3.d dVar) {
        if (this.f110899m) {
            a1 V0 = V0();
            Intrinsics.f(V0);
            l1(V0.G0(), f13, null, dVar);
        } else {
            l1(j13, f13, null, dVar);
        }
        if (this.f111013g) {
            return;
        }
        i1();
        this.f110898l.f110838z.f110984r.D0();
    }

    @Override // q3.c1
    public final void u0(long j13, float f13, Function1 function1) {
        if (this.f110899m) {
            a1 V0 = V0();
            Intrinsics.f(V0);
            l1(V0.G0(), f13, function1, null);
        } else {
            l1(j13, f13, function1, null);
        }
        if (this.f111013g) {
            return;
        }
        i1();
        this.f110898l.f110838z.f110984r.D0();
    }

    @Override // s3.z0
    public final int y0(q3.a aVar) {
        a1 a1Var = this.M;
        if (a1Var != null) {
            return a1Var.y0(aVar);
        }
        t0 t0Var = this.f110898l.f110838z.f110984r;
        boolean z13 = t0Var.f110941l;
        l0 l0Var = t0Var.f110950u;
        if (!z13) {
            v0 v0Var = t0Var.H;
            if (v0Var.f110969c == g0.Measuring) {
                l0Var.f110728f = true;
                if (l0Var.f110724b) {
                    v0Var.f110971e = true;
                    v0Var.f110972f = true;
                }
            } else {
                l0Var.f110729g = true;
            }
        }
        t0Var.F().f111014h = true;
        t0Var.x();
        t0Var.F().f111014h = false;
        Integer num = (Integer) l0Var.f110731i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
