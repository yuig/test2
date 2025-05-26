package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhs implements zzgx {

    @NotNull
    public static final zzhs zza = new zzhs();

    private zzhs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzce(4, 3, null);
            }
            zzgdVar.zzc().zze(i13, new zzbn());
            return;
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof zzbn)) {
            zza3 = null;
        }
        zzbn zzbnVar = (zzbn) zza3;
        if (zzbnVar == null) {
            throw new zzce(4, 5, null);
        }
        byte[] zzd = zzev.zza(zzgdVar.zzb(), zzbnVar).zzd();
        zzgdVar.zzi().zzb(str, zzkh.zzh().zzi(zzd, 0, zzd.length));
    }
}
