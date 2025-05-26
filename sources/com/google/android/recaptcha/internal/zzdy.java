package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
final class zzdy extends j implements Function1 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j13, zzec zzecVar, c cVar) {
        super(1, cVar);
        this.zzb = j13;
        this.zzc = zzecVar;
    }

    @Override // dl2.a
    public final c create(c cVar) {
        return new zzdy(this.zzb, this.zzc, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            long j13 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (bs1.c.w2(j13, zzdxVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
