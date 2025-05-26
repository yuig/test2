package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzho implements zzgx {

    @NotNull
    public static final zzho zza = new zzho();

    private zzho() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzce(4, 5, null);
        }
        try {
            field.set(null, zzgdVar.zzc().zza(zzueVarArr[1]));
        } catch (Exception e13) {
            throw new zzce(6, 11, e13);
        }
    }
}
