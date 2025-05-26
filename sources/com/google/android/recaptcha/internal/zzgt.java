package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgt implements zzgx {

    @NotNull
    public static final zzgt zza = new zzgt();

    private zzgt() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int intValue = num.intValue();
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num2 = (Integer) zza3;
        if (num2 == null) {
            throw new zzce(4, 5, null);
        }
        int intValue2 = num2.intValue();
        Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str = (String) zza4;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        String zza5 = zzgdVar.zzh().zza(str);
        Object zza6 = zzgdVar.zzc().zza(zzueVarArr[3]);
        if (true != (zza6 instanceof String)) {
            zza6 = null;
        }
        String str2 = (String) zza6;
        if (str2 == null) {
            throw new zzce(4, 5, null);
        }
        String zza7 = zzgdVar.zzh().zza(str2);
        Object zza8 = length == 5 ? zzgdVar.zzc().zza(zzueVarArr[4]) : null;
        zzfz zzfzVar = new zzfz(intValue2);
        try {
            Class zza9 = zzgc.zza(zza5);
            zzgdVar.zzc().zze(intValue, Proxy.newProxyInstance(zza9.getClassLoader(), new Class[]{zza9}, new zzga(zzfzVar, zza7, zza8)));
            zzgdVar.zzc().zze(i13, zzfzVar);
        } catch (Exception e13) {
            throw new zzce(6, 20, e13);
        }
    }
}
