package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c0;
import kotlin.collections.g0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgy implements zzgx {

    @NotNull
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return c0.W((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return c0.c0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return c0.Z((int[]) obj);
        }
        if (obj instanceof long[]) {
            return c0.a0((long[]) obj);
        }
        if (obj instanceof float[]) {
            return c0.Y((float[]) obj);
        }
        if (obj instanceof double[]) {
            return c0.X((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i13, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
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
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i13, zzb(zza2, zza3));
    }

    @NotNull
    public final Object zzb(@NotNull Object obj, @NotNull Object obj2) {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                List list = zzc2;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            List list2 = zzc;
            ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i13 = 0; i13 < size; i13++) {
            dArr[i13] = Double.valueOf(Math.pow(((Number) zzc.get(i13)).doubleValue(), ((Number) zzc2.get(i13)).doubleValue()));
        }
        return dArr;
    }
}
