package i2;

/* loaded from: classes.dex */
public interface n1 extends q1, v3 {
    @Override // i2.v3
    default Object getValue() {
        return Integer.valueOf(((e3) this).h());
    }

    @Override // i2.q1
    default void setValue(Object obj) {
        ((e3) this).i(((Number) obj).intValue());
    }
}
