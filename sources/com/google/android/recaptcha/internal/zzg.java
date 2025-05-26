package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.s;

/* loaded from: classes3.dex */
final class zzg extends j implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j13, c cVar) {
        super(2, cVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j13;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object zzc;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 != 0) {
            zzc = ((s) obj).f135226a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j13 = this.zzd;
            this.zza = 1;
            zzc = zzeVar.zzc(str, j13, this);
            if (zzc == aVar) {
                return aVar;
            }
        }
        return new s(zzc);
    }
}
