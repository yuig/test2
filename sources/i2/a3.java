package i2;

/* loaded from: classes2.dex */
public abstract class a3 extends s2.a0 implements l1, s2.q {

    /* renamed from: b, reason: collision with root package name */
    public z2 f71074b;

    @Override // s2.q
    public final j3 a() {
        return y3.f71400a;
    }

    @Override // s2.z
    public final s2.b0 b(s2.b0 b0Var, s2.b0 b0Var2, s2.b0 b0Var3) {
        if (((z2) b0Var2).f71425c == ((z2) b0Var3).f71425c) {
            return b0Var2;
        }
        return null;
    }

    @Override // s2.z
    public final s2.b0 d() {
        return this.f71074b;
    }

    @Override // s2.z
    public final void e(s2.b0 b0Var) {
        this.f71074b = (z2) b0Var;
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((z2) s2.p.i(this.f71074b)).f71425c + ")@" + hashCode();
    }
}
