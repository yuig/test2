package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i13, long j13) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i13);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzbj();
        }
        zzbj zzbjVar = (zzbj) obj;
        zzbjVar.zzg(zzbjVar.zzb() + 1);
        zzbjVar.zzf(zzbjVar.zzd() + j13);
        zzbjVar.zze(Math.max(j13, zzbjVar.zzc()));
        concurrentHashMap.put(valueOf, zzbjVar);
    }
}
