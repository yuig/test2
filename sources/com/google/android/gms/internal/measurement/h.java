package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h implements n {

    /* renamed from: a */
    public final n f31411a;

    /* renamed from: b */
    public final String f31412b;

    public h(String str) {
        this.f31411a = n.Fn;
        this.f31412b = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f31412b.equals(hVar.f31412b) && this.f31411a.equals(hVar.f31411a);
    }

    public final int hashCode() {
        return this.f31411a.hashCode() + (this.f31412b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return new h(this.f31412b, this.f31411a.zzc());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return null;
    }

    public h(String str, n nVar) {
        this.f31411a = nVar;
        this.f31412b = str;
    }
}
