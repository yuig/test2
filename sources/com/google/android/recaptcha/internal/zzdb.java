package com.google.android.recaptcha.internal;

import bl2.c;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzdb extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(zzdc zzdcVar, c cVar) {
        super(cVar);
        this.zzb = zzdcVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzg;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzg = this.zzb.zzg(null, null, this);
        return zzg;
    }
}
