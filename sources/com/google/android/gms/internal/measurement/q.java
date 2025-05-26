package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f31589a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31590b;

    public q(String str, ArrayList arrayList) {
        this.f31589a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f31590b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.f31589a;
        if (str == null ? qVar.f31589a != null : !str.equals(qVar.f31589a)) {
            return false;
        }
        ArrayList arrayList = this.f31590b;
        ArrayList arrayList2 = qVar.f31590b;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f31589a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f31590b;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return null;
    }
}
