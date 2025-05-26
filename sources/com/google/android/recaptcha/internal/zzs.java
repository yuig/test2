package com.google.android.recaptcha.internal;

import ao2.j0;
import ao2.o1;
import bl2.c;
import cl2.a;
import dl2.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xk2.q;
import xk2.s;

/* loaded from: classes3.dex */
final class zzs extends j implements Function2 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, c cVar) {
        super(2, cVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, cVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.zza;
        ue.c.H(obj);
        if (i13 == 0) {
            j0 j0Var = (j0) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(kotlin.jvm.internal.j.z(j0Var, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            o1[] o1VarArr = (o1[]) arrayList2.toArray(new o1[0]);
            o1[] o1VarArr2 = (o1[]) Arrays.copyOf(o1VarArr, o1VarArr.length);
            this.zza = 1;
            if (com.bumptech.glide.c.F0(o1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        q qVar = s.f135225b;
        zzq = this.zzb.zzq(this.zzc);
        return new s(zzq);
    }
}
