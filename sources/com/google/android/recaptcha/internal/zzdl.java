package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzdl extends j implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j13, c cVar) {
        super(2, cVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j13;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j13 = this.zzd;
            this.zza = 1;
            zzv = zzdtVar.zzv(zzscVar, j13, this);
            if (zzv == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
