package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgs implements zzgx {

    @NotNull
    public static final zzgs zza = new zzgs();

    private zzgs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        int i14;
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
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
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str2 = (String) zza4;
        if (str2 == null) {
            throw new zzce(4, 5, null);
        }
        String zza5 = zzgdVar.zzh().zza(str2);
        Object zza6 = zzgdVar.zzc().zza(zzueVarArr[3]);
        if (length == 5) {
            Object zza7 = zzgdVar.zzc().zza(zzueVarArr[4]);
            if (true != (zza7 instanceof Integer)) {
                zza7 = null;
            }
            Integer num = (Integer) zza7;
            if (num == null) {
                throw new zzce(4, 5, null);
            }
            i14 = num.intValue();
        } else {
            i14 = -1;
        }
        try {
            if (zza3 instanceof String) {
                zza3 = zzgdVar.zzh().zza((String) zza3);
            }
            Class zza8 = zzgc.zza(zza3);
            zzgdVar.zzc().zze(i13, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zzfy(new zzgr(zzgdVar, str, i14), zza5, zza6)));
        } catch (Exception e13) {
            throw new zzce(6, 20, e13);
        }
    }
}
