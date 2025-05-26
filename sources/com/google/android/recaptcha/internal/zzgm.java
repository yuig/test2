package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgm implements zzgx {

    @NotNull
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        boolean z13 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzgdVar.zzh().zza((String) zza2);
                }
                zzge zzc = zzgdVar.zzc();
                try {
                    zzgc.zza(zza2);
                } catch (zzce e13) {
                    if (e13.zzb() == 8 || e13.zzb() == 6) {
                        z13 = false;
                    } else if (e13.zzb() != 47) {
                        throw e13;
                    }
                }
                zzc.zze(i13, Boolean.valueOf(z13));
            } catch (Exception e14) {
                throw new zzce(6, 8, e14);
            }
        } catch (zzce e15) {
            throw e15;
        }
    }
}
