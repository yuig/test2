package pf;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum d {
    APP_USERS,
    APP_NON_USERS,
    EVERYBODY;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        d[] valuesCustom = values();
        return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
