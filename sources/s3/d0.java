package s3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class d0 extends q1 {
    public static final b3.i O;
    public c0 L;
    public a1 M;
    public q3.f N;

    static {
        b3.i g13 = androidx.compose.ui.graphics.a.g();
        int i13 = b3.w.f21391o;
        g13.e(b3.w.f21385i);
        g13.l(1.0f);
        g13.m(1);
        O = g13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(k0 k0Var, c0 c0Var) {
        super(k0Var);
        this.L = c0Var;
        this.M = k0Var.f110815c != null ? new w(this) : null;
        if ((((u2.p) c0Var).f120042a.f120044c & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.N = null;
        } else {
            n60.o.t(c0Var);
            throw null;
        }
    }

    @Override // q3.r
    public final int D(int i13) {
        if (this.N != null) {
            Intrinsics.f(this.f110900n);
            throw null;
        }
        c0 c0Var = this.L;
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        return c0Var.e(this, q1Var, i13);
    }

    @Override // q3.r
    public final int N(int i13) {
        if (this.N != null) {
            Intrinsics.f(this.f110900n);
            throw null;
        }
        c0 c0Var = this.L;
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        return c0Var.a(this, q1Var, i13);
    }

    @Override // q3.r
    public final int P(int i13) {
        if (this.N != null) {
            Intrinsics.f(this.f110900n);
            throw null;
        }
        c0 c0Var = this.L;
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        return c0Var.h(this, q1Var, i13);
    }

    @Override // q3.o0
    public final q3.c1 Q(long j13) {
        x0(j13);
        q3.f fVar = this.N;
        if (fVar != null) {
            fVar.a();
            throw null;
        }
        c0 c0Var = this.L;
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        n1(c0Var.i(this, q1Var, j13));
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
        return ((u2.p) this.L).f120042a;
    }

    @Override // q3.r
    public final int d(int i13) {
        if (this.N != null) {
            Intrinsics.f(this.f110900n);
            throw null;
        }
        c0 c0Var = this.L;
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        return c0Var.d(this, q1Var, i13);
    }

    @Override // s3.q1
    public final void j1(b3.u uVar, e3.d dVar) {
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        q1Var.O0(uVar, dVar);
        if (((t3.c0) n0.a(this.f110898l)).B) {
            P0(uVar, O);
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
        v1();
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
        v1();
    }

    public final void v1() {
        if (this.f111013g) {
            return;
        }
        i1();
        if (this.N != null) {
            Intrinsics.f(this.M);
            throw null;
        }
        E0().d();
        q1 q1Var = this.f110900n;
        Intrinsics.f(q1Var);
        q1Var.f110899m = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(c0 c0Var) {
        if (!Intrinsics.d(c0Var, this.L)) {
            if ((((u2.p) c0Var).f120042a.f120044c & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
                ep.b.A(c0Var);
                q3.f fVar = this.N;
                if (fVar != null) {
                    ep.b.A(c0Var);
                } else {
                    ep.b.A(c0Var);
                    fVar = new q3.f(this);
                }
                this.N = fVar;
            } else {
                this.N = null;
            }
        }
        this.L = c0Var;
    }

    @Override // s3.z0
    public final int y0(q3.a aVar) {
        a1 a1Var = this.M;
        return a1Var != null ? a1Var.L0(aVar) : kh2.n.m(this, aVar);
    }
}
