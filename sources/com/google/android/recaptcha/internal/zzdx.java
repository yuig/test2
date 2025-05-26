package com.google.android.recaptcha.internal;

import ao2.j0;
import ao2.v;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzdx extends j implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, c cVar) {
        super(2, cVar);
        this.zzb = zzecVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzdx(this.zzb, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        v vVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            vVar = this.zzb.zzc;
            this.zza = 1;
            if (vVar.await(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f80348a;
    }
}
