package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzqb {
    private static final ThreadLocal zza;

    static {
        zzph zzi = zzpj.zzi();
        zzi.zzf(-62135596800L);
        zzi.zze(0);
        zzph zzi2 = zzpj.zzi();
        zzi2.zzf(253402300799L);
        zzi2.zze(999999999);
        zzph zzi3 = zzpj.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
        zza = new zzqa();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpj zza(zzpj zzpjVar) {
        long zzg = zzpjVar.zzg();
        boolean zze = zze(zzg);
        int zzf = zzpjVar.zzf();
        if (zze && zzf >= 0 && zzf < 1000000000) {
            return zzpjVar;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + zzf + ") must be in range [0, +999,999,999].");
    }

    public static zzpj zzb(long j13) {
        long j14 = j13 / 1000;
        if (!zze(j14)) {
            throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + j14 + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
        }
        int i13 = (int) ((j13 % 1000) * 1000000);
        if (i13 <= -1000000000 || i13 >= 1000000000) {
            j14 = zzkk.zza(j14, i13 / 1000000000);
            i13 %= 1000000000;
        }
        if (i13 < 0) {
            i13 += 1000000000;
            j14 = zzkk.zzb(j14, 1L);
        }
        zzph zzi = zzpj.zzi();
        zzi.zzf(j14);
        zzi.zze(i13);
        zzpj zzpjVar = (zzpj) zzi.zzk();
        zza(zzpjVar);
        return zzpjVar;
    }

    public static String zzc(zzpj zzpjVar) {
        zza(zzpjVar);
        long zzg = zzpjVar.zzg();
        int zzf = zzpjVar.zzf();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb3.append(".");
            sb3.append(zzf % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / 1000000)) : zzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf)));
        }
        sb3.append("Z");
        return sb3.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j13) {
        return j13 >= -62135596800L && j13 <= 253402300799L;
    }
}
