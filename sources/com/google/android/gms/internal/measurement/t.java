package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t implements n {
    @Override // com.google.android.gms.internal.measurement.n
    public final n d(String str, m.h hVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof t;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return n.Fn;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzf() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator zzh() {
        return null;
    }
}
