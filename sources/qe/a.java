package qe;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum a {
    CLICK,
    SELECTED,
    TEXT_CHANGED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
