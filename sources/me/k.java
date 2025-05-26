package me;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum k {
    AUTO,
    EXPLICIT_ONLY;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        k[] valuesCustom = values();
        return (k[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
