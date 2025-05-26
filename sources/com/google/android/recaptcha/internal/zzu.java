package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.q;
import xk2.s;

/* loaded from: classes3.dex */
final class zzu extends j implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, c cVar) {
        super(2, cVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzu(this.zzd, this.zze, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            ue.c.H(obj);
        } else {
            ue.c.H(obj);
            if (!this.zzd.zzS()) {
                q qVar = s.f135225b;
                return new s(ue.c.m(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() == 0) {
                q qVar2 = s.f135225b;
                return new s(ue.c.m(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzj, this) == aVar) {
                return aVar;
            }
        }
        q qVar3 = s.f135225b;
        return new s(Unit.f80348a);
    }
}
