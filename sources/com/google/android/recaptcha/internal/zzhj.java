package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.collections.c0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhj implements zzgx {

    @NotNull
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Constructor<?> zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Constructor<?> constructor = zza2 instanceof Constructor ? zza2 : zza2.getClass().getConstructor(new Class[0]);
        Object[] zzg = zzgdVar.zzc().zzg(c0.b0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i13, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e13) {
            throw new zzce(6, 14, e13);
        }
    }
}
