package le;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum f0 {
    GET,
    POST,
    DELETE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static f0[] valuesCustom() {
        f0[] valuesCustom = values();
        return (f0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
