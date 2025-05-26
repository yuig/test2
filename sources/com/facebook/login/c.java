package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum c {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    private final String nativeProtocolAudience;

    c(String str) {
        this.nativeProtocolAudience = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] valuesCustom = values();
        return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
