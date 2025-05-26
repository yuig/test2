package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum c0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    @NotNull
    public static final b0 Companion = new b0();

    @NotNull
    private final String targetApp;

    c0(String str) {
        this.targetApp = str;
    }

    @NotNull
    public static final c0 fromString(String str) {
        Companion.getClass();
        c0[] valuesCustom = valuesCustom();
        int length = valuesCustom.length;
        int i13 = 0;
        while (i13 < length) {
            c0 c0Var = valuesCustom[i13];
            i13++;
            if (Intrinsics.d(c0Var.toString(), str)) {
                return c0Var;
            }
        }
        return FACEBOOK;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static c0[] valuesCustom() {
        c0[] valuesCustom = values();
        return (c0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.targetApp;
    }
}
