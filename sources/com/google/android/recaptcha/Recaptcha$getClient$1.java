package com.google.android.recaptcha;

import bl2.c;
import cl2.a;
import dl2.d;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
public final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, c cVar) {
        super(cVar);
        this.zzb = recaptcha;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m90getClientBWLJW6A = this.zzb.m90getClientBWLJW6A(null, null, 0L, this);
        return m90getClientBWLJW6A == a.COROUTINE_SUSPENDED ? m90getClientBWLJW6A : new s(m90getClientBWLJW6A);
    }
}
