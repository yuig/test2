package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import com.google.android.recaptcha.RecaptchaAction;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.s;

/* loaded from: classes3.dex */
final class zzcz extends j implements Function2 {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j13, RecaptchaAction recaptchaAction, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzdcVar;
        this.zzc = j13;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzcn zzcnVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j13 = this.zzc;
            zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j13, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new s((String) obj);
    }
}
