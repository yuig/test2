package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class rb extends j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31630c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t6 f31632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(t6 t6Var, boolean z13, boolean z14) {
        super("log");
        this.f31632e = t6Var;
        this.f31630c = z13;
        this.f31631d = z14;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(m.h hVar, List list) {
        o0.C(1, "log", list);
        int size = list.size();
        t tVar = n.Fn;
        t6 t6Var = this.f31632e;
        if (size == 1) {
            ((bb.p) t6Var.f31647d).r(qb.INFO, hVar.P((n) list.get(0)).zzf(), Collections.emptyList(), this.f31630c, this.f31631d);
            return tVar;
        }
        qb zza = qb.zza(o0.A(hVar.P((n) list.get(0)).zze().doubleValue()));
        String zzf = hVar.P((n) list.get(1)).zzf();
        if (list.size() == 2) {
            ((bb.p) t6Var.f31647d).r(zza, zzf, Collections.emptyList(), this.f31630c, this.f31631d);
            return tVar;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 2; i13 < Math.min(list.size(), 5); i13++) {
            arrayList.add(hVar.P((n) list.get(i13)).zzf());
        }
        ((bb.p) t6Var.f31647d).r(zza, zzf, arrayList, this.f31630c, this.f31631d);
        return tVar;
    }
}
