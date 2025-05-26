package ue;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum d {
    MOBILE_INSTALL_EVENT,
    CUSTOM_APP_EVENTS;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        d[] valuesCustom = values();
        return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
