package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhb implements zzgx {

    @NotNull
    public static final zzhb zza = new zzhb();

    private zzhb() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Class<?> zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i13, cls.getField(zzgdVar.zzh().zza(str)));
        } catch (Exception e13) {
            throw new zzce(6, 10, e13);
        }
    }
}
