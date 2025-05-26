package i2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public interface l1 extends v3, q1 {
    @Override // i2.v3
    default Object getValue() {
        a3 a3Var = (a3) this;
        return Double.valueOf(((z2) s2.p.t(a3Var.f71074b, a3Var)).f71425c);
    }

    @Override // i2.q1
    default void setValue(Object obj) {
        s2.i k13;
        double doubleValue = ((Number) obj).doubleValue();
        a3 a3Var = (a3) this;
        z2 z2Var = (z2) s2.p.i(a3Var.f71074b);
        if (z2Var.f71425c == doubleValue) {
            return;
        }
        z2 z2Var2 = a3Var.f71074b;
        synchronized (s2.p.f110667b) {
            k13 = s2.p.k();
            ((z2) s2.p.o(z2Var2, a3Var, k13, z2Var)).f71425c = doubleValue;
            Unit unit = Unit.f80348a;
        }
        s2.p.n(k13, a3Var);
    }
}
