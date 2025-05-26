package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.d;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
final class zzc extends d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, c cVar) {
        super(cVar);
        this.zzc = zzeVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        return zze == a.COROUTINE_SUSPENDED ? zze : new s(zze);
    }
}
