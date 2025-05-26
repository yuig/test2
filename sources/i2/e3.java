package i2;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class e3 extends s2.a0 implements n1, s2.q {

    /* renamed from: b, reason: collision with root package name */
    public d3 f71105b;

    @Override // s2.q
    public final j3 a() {
        return y3.f71400a;
    }

    @Override // s2.z
    public final s2.b0 b(s2.b0 b0Var, s2.b0 b0Var2, s2.b0 b0Var3) {
        if (((d3) b0Var2).f71099c == ((d3) b0Var3).f71099c) {
            return b0Var2;
        }
        return null;
    }

    @Override // s2.z
    public final s2.b0 d() {
        return this.f71105b;
    }

    @Override // s2.z
    public final void e(s2.b0 b0Var) {
        this.f71105b = (d3) b0Var;
    }

    public final int h() {
        return ((d3) s2.p.t(this.f71105b, this)).f71099c;
    }

    public final void i(int i13) {
        s2.i k13;
        d3 d3Var = (d3) s2.p.i(this.f71105b);
        if (d3Var.f71099c != i13) {
            d3 d3Var2 = this.f71105b;
            synchronized (s2.p.f110667b) {
                k13 = s2.p.k();
                ((d3) s2.p.o(d3Var2, this, k13, d3Var)).f71099c = i13;
                Unit unit = Unit.f80348a;
            }
            s2.p.n(k13, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((d3) s2.p.i(this.f71105b)).f71099c + ")@" + hashCode();
    }
}
