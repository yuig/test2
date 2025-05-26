package com.google.android.recaptcha.internal;

import ao2.j0;
import ao2.v;
import ao2.w;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzeb extends j implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ v zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, v vVar, long j13, c cVar) {
        super(2, cVar);
        this.zzb = zzecVar;
        this.zzc = vVar;
        this.zzd = j13;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzci zzciVar;
        a aVar = a.COROUTINE_SUSPENDED;
        try {
            if (this.zza != 0) {
                ue.c.H(obj);
            } else {
                ue.c.H(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Boolean) obj).getClass();
        } catch (zzbd e13) {
            zzec zzecVar = this.zzb;
            zzciVar = zzcm.zzd;
            zzecVar.zzf = zzciVar;
            ((w) this.zzc).e0(e13);
        }
        return Unit.f80348a;
    }
}
