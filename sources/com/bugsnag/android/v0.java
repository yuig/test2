package com.bugsnag.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v0 {
    public static ErrorType a(String str) {
        ErrorType[] values = ErrorType.values();
        int length = values.length;
        int i13 = 0;
        while (i13 < length) {
            ErrorType errorType = values[i13];
            i13++;
            if (Intrinsics.d(errorType.getDesc(), str)) {
                return errorType;
            }
        }
        return null;
    }
}
