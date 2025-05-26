package oe;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum h {
    OPTIONS("data_processing_options"),
    COUNTRY("data_processing_options_country"),
    STATE("data_processing_options_state");


    @NotNull
    public static final g Companion = new g();

    @NotNull
    private final String rawValue;

    h(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        h[] valuesCustom = values();
        return (h[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
