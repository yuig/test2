package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l implements n {
    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof l;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return n.Gn;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return null;
    }
}
