package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.b;
import dl2.j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzfq extends j implements Function2 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, c cVar) {
        super(2, cVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, cVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            j0 j0Var = (j0) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !b.x1(j0Var)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e13) {
                    zzufVar.zzk();
                    new Integer(zzufVar.zzg());
                    CollectionsKt.Z(zzufVar.zzj(), null, null, null, 0, null, new zzfp(this.zzd), 31);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzftVar.zzh(e13, zzgdVar2, this);
                    if (zzh == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f80348a;
        }
        return Unit.f80348a;
    }
}
