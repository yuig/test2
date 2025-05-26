package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            if (zzb() == zzjvVar.zzb() && zzc(zzjvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i13 = zze[0] & 255;
        for (int i14 = 1; i14 < zze.length; i14++) {
            i13 |= (zze[i14] & 255) << (i14 * 8);
        }
        return i13;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb3 = new StringBuilder(length + length);
        for (byte b13 : zze) {
            char[] cArr = zza;
            sb3.append(cArr[(b13 >> 4) & 15]);
            sb3.append(cArr[b13 & 15]);
        }
        return sb3.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv zzjvVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
