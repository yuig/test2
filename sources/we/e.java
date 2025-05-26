package we;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum e {
    OPERATION_SUCCESS,
    SERVICE_NOT_AVAILABLE,
    SERVICE_ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] valuesCustom = values();
        return (e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
