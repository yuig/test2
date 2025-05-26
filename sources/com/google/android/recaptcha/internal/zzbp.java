package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzbp extends d {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, c cVar) {
        super(cVar);
        this.zzg = zzbqVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
