package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzkl {
    public static void zza(boolean z13, String str, long j13, long j14) {
        if (z13) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j13 + ", " + j14 + ")");
    }

    public static void zzb(boolean z13) {
        if (!z13) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
