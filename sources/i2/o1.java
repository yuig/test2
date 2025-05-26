package i2;

/* loaded from: classes.dex */
public interface o1 extends q1, v3 {
    @Override // i2.v3
    default Object getValue() {
        g3 g3Var = (g3) this;
        return Long.valueOf(((f3) s2.p.t(g3Var.f71120b, g3Var)).f71117c);
    }

    @Override // i2.q1
    default void setValue(Object obj) {
        ((g3) this).h(((Number) obj).longValue());
    }
}
