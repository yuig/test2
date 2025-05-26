package com.bugsnag.android;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum g0 {
    DELIVERED,
    UNDELIVERED,
    FAILURE;


    @NotNull
    public static final f0 Companion = new f0();

    @NotNull
    public static final g0 forHttpResponseCode(int i13) {
        Companion.getClass();
        return f0.a(i13);
    }
}
