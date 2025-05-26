package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.d;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
final class zzir extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, c cVar) {
        super(cVar);
        this.zzb = zzjaVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == a.COROUTINE_SUSPENDED ? zzh : new s(zzh);
    }
}
