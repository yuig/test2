package oe;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum b {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    @NotNull
    public static final a Companion = new a();

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] valuesCustom = values();
        return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
