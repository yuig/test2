package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzdj extends d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, c cVar) {
        super(cVar);
        this.zzc = zzdtVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzv;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzv = this.zzc.zzv(null, 0L, this);
        return zzv;
    }
}
