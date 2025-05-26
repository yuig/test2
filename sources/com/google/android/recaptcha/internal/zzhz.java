package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import xk2.a0;
import xk2.b0;

/* loaded from: classes3.dex */
public final class zzhz implements zzhx {

    @NotNull
    private final zzhy zza;

    public zzhz(@NotNull zzhy zzhyVar, @NotNull zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) {
        zzhu zzhuVar;
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            long zza = this.zza.zza(CollectionsKt.G0(list));
            zzhuVar = zzhv.zza;
            zzhv zzhvVar = new zzhv(zza, 255L, zzhuVar);
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i13 = 0; i13 < str.length(); i13++) {
                char charAt = str.charAt(i13);
                a0 a0Var = b0.f135200b;
                sb3.append((char) (charAt ^ ((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb3.toString()));
        } catch (Exception e13) {
            throw new zzce(3, 18, e13);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    @NotNull
    public final zztz zza(@NotNull zzub zzubVar) {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i13 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza);
        return zzb2;
    }
}
