package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class j implements i, n {

    /* renamed from: a */
    public final String f31470a;

    /* renamed from: b */
    public final HashMap f31471b = new HashMap();

    public j(String str) {
        this.f31470a = str;
    }

    public abstract n a(m.h hVar, List list);

    @Override // com.google.android.gms.internal.measurement.i
    public final boolean b(String str) {
        return this.f31471b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final void c(String str, n nVar) {
        HashMap hashMap = this.f31471b;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        return "toString".equals(str) ? new p(this.f31470a) : o0.n(this, new p(str), hVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f31470a;
        if (str != null) {
            return str.equals(jVar.f31470a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31470a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final n zza(String str) {
        HashMap hashMap = this.f31471b;
        return hashMap.containsKey(str) ? (n) hashMap.get(str) : n.Fn;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        return this.f31470a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return new k(this.f31471b.keySet().iterator());
    }
}
