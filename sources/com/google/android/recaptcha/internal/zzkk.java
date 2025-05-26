package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzkk {
    public static long zza(long j13, long j14) {
        long j15 = j13 + j14;
        zzkl.zza(((j13 ^ j14) < 0) | ((j13 ^ j15) >= 0), "checkedAdd", j13, j14);
        return j15;
    }

    public static long zzb(long j13, long j14) {
        long j15 = (-1) + j13;
        zzkl.zza(((1 ^ j13) >= 0) | ((j13 ^ j15) >= 0), "checkedSubtract", j13, 1L);
        return j15;
    }
}
