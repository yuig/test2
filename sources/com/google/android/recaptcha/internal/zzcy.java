package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.d;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
final class zzcy extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzdc zzdcVar, c cVar) {
        super(cVar);
        this.zzb = zzdcVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object zzf;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzf = this.zzb.zzf(null, 0L, this);
        return zzf == a.COROUTINE_SUSPENDED ? zzf : new s(zzf);
    }
}
