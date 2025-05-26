package com.google.android.recaptcha.internal;

import bl2.c;
import cl2.a;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzct extends j implements Function2 {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j13, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, c cVar) {
        super(2, cVar);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j13;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, cVar);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzcn zzcnVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            ue.c.H(obj);
        } else {
            ue.c.H(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zza = zzcv.zza(this.zzd, this.zze);
            if (zza != null) {
                return zza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVar2 = this.zzg;
            if (zzcnVar2 == null) {
                zzcnVar2 = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j13 = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVar2;
            this.zzb = 1;
            if (zzcnVar2.zzb(j13, this) == aVar) {
                return aVar;
            }
            zzcnVar = zzcnVar2;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
