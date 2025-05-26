package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgg implements zzgx {

    @NotNull
    public static final zzgg zza = new zzgg();

    private zzgg() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        Object array;
        if (zzueVarArr.length != 2) {
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
        if (zza2 instanceof Integer) {
            array = Integer.valueOf(((Number) zza2).intValue() + intValue);
        } else {
            if (!(zza2 instanceof int[])) {
                throw new zzce(4, 5, null);
            }
            int[] iArr = (int[]) zza2;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i14 : iArr) {
                arrayList.add(Integer.valueOf(i14 + intValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzgdVar.zzc().zze(i13, array);
    }
}
