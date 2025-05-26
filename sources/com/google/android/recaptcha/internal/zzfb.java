package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzfb extends j implements Function2 {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, c cVar) {
        super(2, cVar);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzey zzg;
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            if (!zzff.zzb(this.zza).zzb(this.zzb)) {
                throw new zzbd(zzbb.zzc, zzba.zzQ, null);
            }
            zzg = this.zza.zzg();
            return zzg.zza(this.zzb, this.zzc);
        } catch (zzbd e13) {
            throw e13;
        } catch (Exception e14) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e14.getMessage());
        }
    }
}
