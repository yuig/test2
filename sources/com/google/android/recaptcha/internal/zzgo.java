package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgo implements zzgx {

    @NotNull
    public static final zzgo zza = new zzgo();

    private zzgo() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
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
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str2 = (String) zza3;
        if (str2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i13, str.concat(str2));
    }
}
