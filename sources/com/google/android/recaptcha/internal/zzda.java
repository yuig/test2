package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import com.google.android.recaptcha.RecaptchaAction;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.s;

/* loaded from: classes3.dex */
final class zzda extends j implements Function2 {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j13, c cVar) {
        super(2, cVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j13;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 != 0) {
            zzf = ((s) obj).f135226a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j13 = this.zzd;
            this.zza = 1;
            zzf = zzdcVar.zzf(recaptchaAction, j13, this);
            if (zzf == aVar) {
                return aVar;
            }
        }
        ue.c.H(zzf);
        return zzf;
    }
}
