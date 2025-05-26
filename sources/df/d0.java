package df;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum d0 {
    NOT_LOADED,
    LOADING,
    SUCCESS,
    ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d0[] valuesCustom() {
        d0[] valuesCustom = values();
        return (d0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
