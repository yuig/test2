package com.amazonaws.util;

/* loaded from: classes3.dex */
public abstract class ValidationUtils {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
