package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzpz {
    static {
        zzmj zzi = zzml.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzmj zzi2 = zzml.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzmj zzi3 = zzml.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
    }

    public static zzml zza(long j13) {
        int i13 = (int) (j13 % 1000000000);
        long j14 = j13 / 1000000000;
        if (i13 <= -1000000000 || i13 >= 1000000000) {
            j14 = zzkk.zza(j14, i13 / 1000000000);
            i13 %= 1000000000;
        }
        if (j14 > 0 && i13 < 0) {
            i13 += 1000000000;
            j14--;
        }
        if (j14 < 0 && i13 > 0) {
            i13 -= 1000000000;
            j14++;
        }
        zzmj zzi = zzml.zzi();
        zzi.zzf(j14);
        zzi.zze(i13);
        zzml zzmlVar = (zzml) zzi.zzk();
        long zzg = zzmlVar.zzg();
        int zzf = zzmlVar.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && zzf >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (zzg <= 0 && zzf <= 0))) {
            return zzmlVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + zzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
