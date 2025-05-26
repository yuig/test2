package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzdw extends d {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzec zzecVar, c cVar) {
        super(cVar);
        this.zzc = zzecVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzm;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzm = this.zzc.zzm(0L, this);
        return zzm;
    }
}
