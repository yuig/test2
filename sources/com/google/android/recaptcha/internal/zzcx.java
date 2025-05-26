package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.d;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
final class zzcx extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, c cVar) {
        super(cVar);
        this.zzb = zzdcVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo92executegIAlus = this.zzb.mo92executegIAlus(null, this);
        return mo92executegIAlus == a.COROUTINE_SUSPENDED ? mo92executegIAlus : new s(mo92executegIAlus);
    }
}
