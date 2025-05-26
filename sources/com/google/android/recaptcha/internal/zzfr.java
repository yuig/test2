package com.google.android.recaptcha.internal;

import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.b;
import dl2.j;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.k0;

/* loaded from: classes3.dex */
final class zzfr extends j implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, c cVar) {
        super(2, cVar);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, cVar);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zztd zztdVar;
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVar = ((zzce) exc).zza();
            zztdVar.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zzf = zzte.zzf();
            zzf.zze(zzgdVar.zza());
            zzf.zzr(2);
            zzf.zzq(2);
            zztdVar = zzf;
        }
        zzte zzteVar = (zzte) zztdVar.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        k0.f80436a.b(this.zza.getClass()).f();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zza = zzev.zza(zzb, zzbnVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        if (b.x1(j0Var)) {
            zzft zzftVar = this.zzc;
            zzkh zzh = zzkh.zzh();
            byte[] zzd2 = zzteVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzkh zzh2 = zzkh.zzh();
            byte[] zzd3 = zza.zzd();
            zzftVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return Unit.f80348a;
    }
}
