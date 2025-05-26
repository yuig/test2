package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgi implements zzgx {

    @NotNull
    public static final zzgi zza = new zzgi();

    private zzgi() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length != 3) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int intValue = num.intValue();
        Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (zza4 instanceof Object)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            Array.set(zza2, intValue, zza4);
        } catch (Exception e13) {
            if (!(e13 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzce(4, 25, e13);
            }
            throw new zzce(4, 22, e13);
        }
    }
}
