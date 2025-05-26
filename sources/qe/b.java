package qe;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum b {
    MANUAL,
    INFERENCE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] valuesCustom = values();
        return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
