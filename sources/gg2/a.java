package gg2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum a {
    DEV("dev"),
    PROD("prod"),
    UNKNOWN("UNKNOWN");


    @NotNull
    private final String value;

    a(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
