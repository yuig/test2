package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.d;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
final class zzi extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, c cVar) {
        super(cVar);
        this.zzb = zzlVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc = this.zzb.zzc(0L, null, null, this);
        return zzc == a.COROUTINE_SUSPENDED ? zzc : new s(zzc);
    }
}
