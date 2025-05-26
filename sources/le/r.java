package le;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum r {
    LOGIN_RECOVERABLE,
    OTHER,
    TRANSIENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        r[] valuesCustom = values();
        return (r[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
