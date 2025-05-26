package com.google.android.recaptcha.internal;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgf {

    @NotNull
    private final zzge zza;

    @NotNull
    private final HashMap zzb;

    @NotNull
    private final zzfw zzc;

    @NotNull
    private final zzcg zzd;

    public zzgf(@NotNull zzfw zzfwVar, @NotNull zzcg zzcgVar, @NotNull zzbo zzboVar) {
        this.zzc = zzfwVar;
        this.zzd = zzcgVar;
        zzge zzgeVar = new zzge();
        this.zza = zzgeVar;
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        zzgeVar.zzd(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO, hashMap);
    }

    @NotNull
    public final zzge zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO, this.zzb);
    }

    @NotNull
    public final zzcg zzc() {
        return this.zzd;
    }

    @NotNull
    public final zzfw zzd() {
        return this.zzc;
    }

    public final void zze(@NotNull int i13, @NotNull Object obj) {
        this.zzb.put(Integer.valueOf(i13 - 2), obj);
    }
}
