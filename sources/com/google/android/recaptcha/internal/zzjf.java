package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzjf {
    public static void zza(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z13, String str, char c13) {
        if (!z13) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c13)));
        }
    }

    public static void zzd(int i13, int i14, int i15) {
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            throw new IndexOutOfBoundsException((i13 < 0 || i13 > i15) ? zzf(i13, i15, "start index") : (i14 < 0 || i14 > i15) ? zzf(i14, i15, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13)));
        }
    }

    public static void zze(boolean z13, Object obj) {
        if (!z13) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i13, int i14, String str) {
        return i13 < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i13)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
    }
}
