package pf;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum a {
    Open,
    Closed;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
