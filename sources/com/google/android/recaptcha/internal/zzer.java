package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import ao2.j0;
import bl2.c;
import cl2.a;
import dl2.j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
final class zzer extends j implements Function2 {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, c cVar) {
        super(2, cVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new zzer(this.zza, this.zzb, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        zzei zzeiVar2;
        zzei zzeiVar3;
        zzei zzeiVar4;
        zzei zzeiVar5;
        zzei zzeiVar6;
        a aVar = a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzeiVar = zzesVar.zze;
                if (zzeiVar != null) {
                    byte[] zzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzeiVar2 = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar2.getWritableDatabase().insert("ce", null, contentValues);
                    zzeiVar3 = zzesVar.zze;
                    int zzb = zzeiVar3.zzb() - 500;
                    if (zzb > 0) {
                        zzeiVar5 = zzesVar.zze;
                        List y03 = CollectionsKt.y0(zzeiVar5.zzd(), zzb);
                        zzeiVar6 = zzesVar.zze;
                        zzeiVar6.zza(y03);
                    }
                    zzeiVar4 = zzesVar.zze;
                    if (zzeiVar4.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return Unit.f80348a;
    }
}
