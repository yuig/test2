package com.google.android.recaptcha.internal;

import bl2.c;
import com.google.android.recaptcha.RecaptchaAction;
import dl2.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class zzdu extends d {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzec zzecVar, c cVar) {
        super(cVar);
        this.zzc = zzecVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
