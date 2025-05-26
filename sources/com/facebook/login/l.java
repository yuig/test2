package com.facebook.login;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum l {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");


    @NotNull
    private final String loggingValue;

    l(String str) {
        this.loggingValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        l[] valuesCustom = values();
        return (l[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getLoggingValue() {
        return this.loggingValue;
    }
}
