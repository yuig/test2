package com.google.android.recaptcha.internal;

import ao2.e;
import ao2.j0;
import ao2.p0;
import bl2.c;
import cl2.a;
import dl2.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import xk2.q;
import xk2.r;
import xk2.s;

/* loaded from: classes3.dex */
final class zzk extends j implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j13, zzsc zzscVar, c cVar) {
        super(2, cVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j13;
        this.zze = zzscVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, cVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            ue.c.H(obj);
        } else {
            ue.c.H(obj);
            j0 j0Var = (j0) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.jvm.internal.j.d(j0Var, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            p0[] p0VarArr = (p0[]) arrayList.toArray(new p0[0]);
            p0[] p0VarArr2 = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
            this.zzf = zzf;
            this.zza = 1;
            obj = p0VarArr2.length == 0 ? q0.f80391a : new e(p0VarArr2).a(this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzf;
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((s) it2.next()).f135226a instanceof r)) {
                    zzenVar.zza();
                    obj2 = Unit.f80348a;
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        q qVar = s.f135225b;
        obj2 = ue.c.m(zzbdVar);
        return new s(obj2);
    }
}
