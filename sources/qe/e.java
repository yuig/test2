package qe;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum e {
    ID(1),
    TEXT(2),
    TAG(4),
    DESCRIPTION(8),
    HINT(16);

    private final int value;

    e(int i13) {
        this.value = i13;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] valuesCustom = values();
        return (e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final int getValue() {
        return this.value;
    }
}
