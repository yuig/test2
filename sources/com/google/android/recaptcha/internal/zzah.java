package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzah extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzan zzanVar, c cVar) {
        super(cVar);
        this.zzb = zzanVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(null, this);
        return zzj;
    }
}
