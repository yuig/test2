package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i13, int i14);

    public abstract void zze(Object obj, int i13, long j13);

    public abstract void zzf(Object obj, int i13, Object obj2);

    public abstract void zzg(Object obj, int i13, zzle zzleVar);

    public abstract void zzh(Object obj, int i13, long j13);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i13) {
        int zzd = zzovVar.zzd();
        int i14 = zzd >>> 3;
        int i15 = zzd & 7;
        if (i15 == 0) {
            zzh(obj, i14, zzovVar.zzl());
            return true;
        }
        if (i15 == 1) {
            zze(obj, i14, zzovVar.zzk());
            return true;
        }
        if (i15 == 2) {
            zzg(obj, i14, zzovVar.zzp());
            return true;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return false;
            }
            if (i15 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i14, zzovVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i16 = i14 << 3;
        int i17 = i13 + 1;
        if (i17 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzovVar, i17)) {
        }
        if ((i16 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i14, zzc(zzb));
        return true;
    }
}
