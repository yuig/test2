package me;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum q {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        q[] valuesCustom = values();
        return (q[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
