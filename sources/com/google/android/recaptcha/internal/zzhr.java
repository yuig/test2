package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhr implements zzgx {

    @NotNull
    public static final zzhr zza = new zzhr();

    private zzhr() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof int[])) {
            zza2 = null;
        }
        int[] iArr = (int[]) zza2;
        if (iArr == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        zzge zzc = zzgdVar.zzc();
        StringBuilder sb3 = new StringBuilder();
        try {
            for (int i14 : iArr) {
                sb3.append(str.charAt(i14));
            }
            zzc.zze(i13, sb3.toString());
        } catch (Exception e13) {
            throw new zzce(4, 22, e13);
        }
    }
}
