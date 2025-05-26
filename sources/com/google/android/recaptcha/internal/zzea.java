package com.google.android.recaptcha.internal;

import ao2.v;
import ao2.w;
import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
final class zzea extends j implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ v zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j13, v vVar, c cVar) {
        super(1, cVar);
        this.zzc = zzecVar;
        this.zzd = j13;
        this.zze = vVar;
    }

    @Override // dl2.a
    public final c create(c cVar) {
        return new zzea(this.zzc, this.zzd, this.zze, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzbd e13;
        zzdt zzdtVar;
        zzen zzenVar2;
        zzdt zzdtVar2;
        zzcj zzcjVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zzb;
        if (i13 == 0) {
            ue.c.H(obj);
            zzekVar = this.zzc.zzb;
            zzen zzf = zzekVar.zzf(41);
            try {
                zzdtVar = this.zzc.zza;
                long j13 = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzdtVar.zzo(j13, this);
                if (zzo != aVar) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return aVar;
            } catch (zzbd e14) {
                zzenVar = zzf;
                e13 = e14;
                this.zzc.zzd = e13;
                zzenVar.zzb(e13);
                throw e13;
            }
        }
        if (i13 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                ue.c.H(obj);
                zzenVar.zza();
                zzec zzecVar = this.zzc;
                zzcjVar = zzcm.zzb;
                zzecVar.zzf = zzcjVar;
                return Boolean.valueOf(((w) this.zze).Q(Unit.f80348a));
            } catch (zzbd e15) {
                e13 = e15;
                this.zzc.zzd = e13;
                zzenVar.zzb(e13);
                throw e13;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            ue.c.H(obj);
        } catch (zzbd e16) {
            e13 = e16;
            zzenVar = zzenVar2;
            this.zzc.zzd = e13;
            zzenVar.zzb(e13);
            throw e13;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdtVar2 = this.zzc.zza;
        long j14 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j14, this) != aVar) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec zzecVar2 = this.zzc;
            zzcjVar = zzcm.zzb;
            zzecVar2.zzf = zzcjVar;
            return Boolean.valueOf(((w) this.zze).Q(Unit.f80348a));
        }
        return aVar;
    }
}
