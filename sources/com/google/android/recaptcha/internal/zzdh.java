package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import ih.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzdh extends j implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, c cVar) {
        super(2, cVar);
        this.zzb = zzdtVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzdh(this.zzb, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Application zzr;
        String str;
        Application zzr2;
        zzek zzekVar;
        zzbf zzt;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            zzbs zzbsVar = new zzbs(d.f72259b);
            zzr = this.zzb.zzr();
            int zza = zzbsVar.zza(zzr);
            zzdt zzdtVar = this.zzb;
            str = zzdtVar.zza;
            zzr2 = zzdtVar.zzr();
            String packageName = zzr2.getPackageName();
            zzekVar = this.zzb.zzb;
            String zzd = zzekVar.zzd();
            zzt = this.zzb.zzt();
            int i14 = Build.VERSION.SDK_INT;
            String zza2 = zzt.zza();
            zztn zzf = zzto.zzf();
            zzf.zzt(str);
            zzf.zzq(packageName);
            zzf.zzu(zza);
            zzf.zzr("18.6.1");
            zzf.zzs(zzd);
            zzf.zzf(String.valueOf(i14));
            zzf.zze(zza2);
            zzto zztoVar = (zzto) zzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzg = zzdt.zzg(zzdtVar2);
            String zzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzg.zzc(zzb, zztoVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
