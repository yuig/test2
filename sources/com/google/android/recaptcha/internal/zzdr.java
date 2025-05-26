package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzdr extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;
    zzdt zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzdt zzdtVar, c cVar) {
        super(cVar);
        this.zzb = zzdtVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzo(0L, this);
    }
}
