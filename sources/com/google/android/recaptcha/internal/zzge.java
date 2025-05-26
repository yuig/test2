package com.google.android.recaptcha.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.g0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzge {

    @NotNull
    private final Map zza = new LinkedHashMap();

    @NotNull
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzue) it.next()));
        }
        return arrayList;
    }

    public final Object zza(@NotNull zzue zzueVar) {
        int zzS = zzueVar.zzS();
        int i13 = zzS - 1;
        if (zzS == 0) {
            throw null;
        }
        switch (i13) {
            case 0:
                return this.zza.get(Integer.valueOf(zzueVar.zzi()));
            case 1:
                return Boolean.valueOf(zzueVar.zzQ());
            case 2:
                byte[] zzl = zzueVar.zzM().zzl();
                if (zzl.length == 1) {
                    return Byte.valueOf(zzl[0]);
                }
                throw new zzce(4, 6, null);
            case 3:
                String zzO = zzueVar.zzO();
                if (zzO.length() == 1) {
                    return Character.valueOf(zzO.charAt(0));
                }
                throw new zzce(4, 6, null);
            case 4:
                int zzj = zzueVar.zzj();
                if (zzj < -32768 || zzj > 32767) {
                    throw new zzce(4, 6, null);
                }
                return Short.valueOf((short) zzj);
            case 5:
                return Integer.valueOf(zzueVar.zzk());
            case 6:
            case 8:
                throw new zzce(4, 6, null);
            case 7:
                return Long.valueOf(zzueVar.zzl());
            case 9:
                return Float.valueOf(zzueVar.zzg());
            case 10:
                return Double.valueOf(zzueVar.zzf());
            case 11:
                return zzueVar.zzP();
            case 12:
                return null;
            default:
                throw new zzce(4, 5, null);
        }
    }

    public final Object zzb(int i13) {
        return this.zza.remove(Integer.valueOf(i13));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i13, Object obj) {
        zze(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO, obj);
        this.zzb.add(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO));
    }

    public final void zze(int i13, Object obj) {
        this.zza.put(Integer.valueOf(i13), obj);
    }

    @NotNull
    public final Class[] zzf(@NotNull List list) {
        List zzh = zzh(list);
        ArrayList arrayList = new ArrayList(g0.q(zzh, 10));
        Iterator it = zzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzgc.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    @NotNull
    public final Object[] zzg(@NotNull List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
