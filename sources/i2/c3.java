package i2;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class c3 extends s2.a0 implements m1, s2.q {

    /* renamed from: b, reason: collision with root package name */
    public b3 f71086b;

    @Override // s2.q
    public final j3 a() {
        return y3.f71400a;
    }

    @Override // s2.z
    public final s2.b0 b(s2.b0 b0Var, s2.b0 b0Var2, s2.b0 b0Var3) {
        if (((b3) b0Var2).f71079c == ((b3) b0Var3).f71079c) {
            return b0Var2;
        }
        return null;
    }

    @Override // s2.z
    public final s2.b0 d() {
        return this.f71086b;
    }

    @Override // s2.z
    public final void e(s2.b0 b0Var) {
        this.f71086b = (b3) b0Var;
    }

    public final float h() {
        return ((b3) s2.p.t(this.f71086b, this)).f71079c;
    }

    public final void i(float f13) {
        s2.i k13;
        b3 b3Var = (b3) s2.p.i(this.f71086b);
        if (b3Var.f71079c == f13) {
            return;
        }
        b3 b3Var2 = this.f71086b;
        synchronized (s2.p.f110667b) {
            k13 = s2.p.k();
            ((b3) s2.p.o(b3Var2, this, k13, b3Var)).f71079c = f13;
            Unit unit = Unit.f80348a;
        }
        s2.p.n(k13, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((b3) s2.p.i(this.f71086b)).f71079c + ")@" + hashCode();
    }
}
