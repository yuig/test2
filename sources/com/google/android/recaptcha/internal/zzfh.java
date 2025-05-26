package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzfh extends j implements Function2 {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, c cVar) {
        super(2, cVar);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = zzfj.zza(this.zza).zza(this.zzb.zzd());
                    zzewVar.zzc();
                    zzewVar.zze(this.zzc.zzd());
                    zzsr zzsrVar = (zzsr) zzewVar.zza(zzsr.zzi());
                    zzewVar.zzd();
                    return zzsrVar;
                } catch (Exception e13) {
                    throw new zzbd(zzbb.zzc, zzba.zzF, e13.getMessage());
                }
            } catch (zzbd e14) {
                throw e14;
            }
        } catch (Throwable th3) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th3;
        }
    }
}
