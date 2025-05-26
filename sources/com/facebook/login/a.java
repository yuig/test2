package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public enum a {
    S256("S256"),
    PLAIN("plain");

    a(String str) {
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* synthetic */ a(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "S256" : str);
    }
}
