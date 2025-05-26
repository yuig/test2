package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.c0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzhg implements zzgx {

    @NotNull
    public static final zzhg zza = new zzhg();

    private zzhg() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            throw new zzce(4, 5, null);
        }
        Object[] zzg = zzgdVar.zzc().zzg(c0.b0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i13, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e13) {
            throw new zzce(6, 15, e13);
        }
    }
}
