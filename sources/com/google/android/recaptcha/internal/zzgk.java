package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgk implements zzgx {

    @NotNull
    public static final zzgk zza = new zzgk();

    private zzgk() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length == 0) {
            throw new zzce(4, 3, null);
        }
        zztf zzf = zzti.zzf();
        for (zzue zzueVar : zzueVarArr) {
            Object zza2 = zzgdVar.zzc().zza(zzueVar);
            if (zza2 == null) {
                throw new zzce(4, 4, null);
            }
            zztg zzf2 = zzth.zzf();
            if (zza2 instanceof Integer) {
                zzf2.zzu(((Number) zza2).intValue());
            } else if (zza2 instanceof Short) {
                zzf2.zzt(((Number) zza2).shortValue());
            } else if (zza2 instanceof Byte) {
                zzf2.zzf(zzle.zzk(new byte[]{((Number) zza2).byteValue()}, 0, 1));
            } else if (zza2 instanceof Long) {
                zzf2.zzv(((Number) zza2).longValue());
            } else if (zza2 instanceof Double) {
                zzf2.zzr(((Number) zza2).doubleValue());
            } else if (zza2 instanceof Float) {
                zzf2.zzs(((Number) zza2).floatValue());
            } else if (zza2 instanceof Boolean) {
                zzf2.zze(((Boolean) zza2).booleanValue());
            } else if (zza2 instanceof Character) {
                zzf2.zzq(String.valueOf(((Character) zza2).charValue()));
            } else if (zza2 instanceof String) {
                zzf2.zzw((String) zza2);
            } else {
                zzf2.zzw(zza2.toString());
            }
            zzf.zzf((zzth) zzf2.zzk());
        }
        zzge zzc = zzgdVar.zzc();
        byte[] zzd = ((zzti) zzf.zzk()).zzd();
        zzc.zze(i13, zzkh.zzh().zzi(zzd, 0, zzd.length));
    }
}
