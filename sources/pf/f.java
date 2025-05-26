package pf;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum f {
    PHOTO,
    VIDEO;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        f[] valuesCustom = values();
        return (f[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
