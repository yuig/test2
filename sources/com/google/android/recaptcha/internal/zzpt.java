package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
final class zzpt {
    public static /* bridge */ /* synthetic */ void zza(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) {
        if (!zze(b14)) {
            if ((((b14 + 112) + (b13 << 28)) >> 30) == 0 && !zze(b15) && !zze(b16)) {
                int i14 = ((b13 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
                cArr[i13] = (char) ((i14 >>> 10) + 55232);
                cArr[i13 + 1] = (char) ((i14 & 1023) + 56320);
                return;
            }
        }
        throw new zznn("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b13, byte b14, byte b15, char[] cArr, int i13) {
        if (!zze(b14)) {
            if (b13 == -32) {
                if (b14 >= -96) {
                    b13 = -32;
                }
            }
            if (b13 == -19) {
                if (b14 < -96) {
                    b13 = -19;
                }
            }
            if (!zze(b15)) {
                cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
                return;
            }
        }
        throw new zznn("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b13, byte b14, char[] cArr, int i13) {
        if (b13 < -62 || zze(b14)) {
            throw new zznn("Protocol message had invalid UTF-8.");
        }
        cArr[i13] = (char) (((b13 & 31) << 6) | (b14 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b13) {
        return b13 >= 0;
    }

    private static boolean zze(byte b13) {
        return b13 > -65;
    }
}
