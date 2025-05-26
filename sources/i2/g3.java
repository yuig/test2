package i2;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class g3 extends s2.a0 implements o1, s2.q {

    /* renamed from: b, reason: collision with root package name */
    public f3 f71120b;

    @Override // s2.q
    public final j3 a() {
        return y3.f71400a;
    }

    @Override // s2.z
    public final s2.b0 b(s2.b0 b0Var, s2.b0 b0Var2, s2.b0 b0Var3) {
        if (((f3) b0Var2).f71117c == ((f3) b0Var3).f71117c) {
            return b0Var2;
        }
        return null;
    }

    @Override // s2.z
    public final s2.b0 d() {
        return this.f71120b;
    }

    @Override // s2.z
    public final void e(s2.b0 b0Var) {
        this.f71120b = (f3) b0Var;
    }

    public final void h(long j13) {
        s2.i k13;
        f3 f3Var = (f3) s2.p.i(this.f71120b);
        if (f3Var.f71117c != j13) {
            f3 f3Var2 = this.f71120b;
            synchronized (s2.p.f110667b) {
                k13 = s2.p.k();
                ((f3) s2.p.o(f3Var2, this, k13, f3Var)).f71117c = j13;
                Unit unit = Unit.f80348a;
            }
            s2.p.n(k13, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((f3) s2.p.i(this.f71120b)).f71117c + ")@" + hashCode();
    }
}
