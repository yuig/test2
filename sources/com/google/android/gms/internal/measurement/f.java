package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f implements n {

    /* renamed from: a */
    public final boolean f31381a;

    public f(Boolean bool) {
        if (bool == null) {
            this.f31381a = false;
        } else {
            this.f31381a = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z13 = this.f31381a;
        if (equals) {
            return new p(Boolean.toString(z13));
        }
        throw new IllegalArgumentException(a.a.l(Boolean.toString(z13), ".", str, " is not a function."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f31381a == ((f) obj).f31381a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f31381a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f31381a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return new f(Boolean.valueOf(this.f31381a));
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        return Boolean.valueOf(this.f31381a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        return Double.valueOf(this.f31381a ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        return Boolean.toString(this.f31381a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return null;
    }
}
