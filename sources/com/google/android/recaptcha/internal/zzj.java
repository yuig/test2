package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.s;

/* loaded from: classes3.dex */
final class zzj extends j implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j13, zzsc zzscVar, c cVar) {
        super(2, cVar);
        this.zzb = zzeVar;
        this.zzc = j13;
        this.zzd = zzscVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 != 0) {
            zze = ((s) obj).f135226a;
        } else {
            zze zzeVar = this.zzb;
            long j13 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            zze = zzeVar.zze(j13, zzscVar, this);
            if (zze == aVar) {
                return aVar;
            }
        }
        return new s(zze);
    }
}
