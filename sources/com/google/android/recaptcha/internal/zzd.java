package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.s;

/* loaded from: classes3.dex */
final class zzd extends j implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzsc zzscVar, c cVar) {
        super(2, cVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzd(this.zzb, this.zzc, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 != 0) {
            zzh = ((s) obj).f135226a;
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            zzh = zzeVar.zzh(zzscVar, this);
            if (zzh == aVar) {
                return aVar;
            }
        }
        return new s(zzh);
    }
}
