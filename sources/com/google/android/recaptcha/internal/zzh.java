package com.google.android.recaptcha.internal;

import ao2.e;
import ao2.j0;
import ao2.p0;
import bl2.c;
import cl2.a;
import dl2.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import xk2.r;
import xk2.s;

/* loaded from: classes3.dex */
final class zzh extends j implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j13, c cVar) {
        super(2, cVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j13;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, cVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzen zzenVar2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            ue.c.H(obj);
        } else {
            ue.c.H(obj);
            j0 j0Var = (j0) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(kotlin.jvm.internal.j.d(j0Var, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            p0[] p0VarArr = (p0[]) arrayList.toArray(new p0[0]);
            p0[] p0VarArr2 = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
            this.zze = zzenVar;
            this.zza = 1;
            obj = p0VarArr2.length == 0 ? q0.f80391a : new e(p0VarArr2).a(this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar2 = zzenVar;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((s) it.next()).f135226a;
            if (!(obj2 instanceof r)) {
                zzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
