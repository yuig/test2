package i2;

/* loaded from: classes.dex */
public interface m1 extends q1, v3 {
    @Override // i2.v3
    default Object getValue() {
        return Float.valueOf(((c3) this).h());
    }

    @Override // i2.q1
    default void setValue(Object obj) {
        ((c3) this).i(((Number) obj).floatValue());
    }
}
