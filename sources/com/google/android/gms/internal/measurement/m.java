package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class m implements i, n {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31516a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.i
    public final boolean b(String str) {
        return this.f31516a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final void c(String str, n nVar) {
        HashMap hashMap = this.f31516a;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    public n d(String str, m.h hVar, ArrayList arrayList) {
        return "toString".equals(str) ? new p(toString()) : o0.n(this, new p(str), hVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f31516a.equals(((m) obj).f31516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31516a.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{");
        HashMap hashMap = this.f31516a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb3.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb3.deleteCharAt(sb3.lastIndexOf(","));
        }
        sb3.append("}");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final n zza(String str) {
        HashMap hashMap = this.f31516a;
        return hashMap.containsKey(str) ? (n) hashMap.get(str) : n.Fn;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        m mVar = new m();
        for (Map.Entry entry : this.f31516a.entrySet()) {
            boolean z13 = entry.getValue() instanceof i;
            HashMap hashMap = mVar.f31516a;
            if (z13) {
                hashMap.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((n) entry.getValue()).zzc());
            }
        }
        return mVar;
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
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return new k(this.f31516a.keySet().iterator());
    }
}
