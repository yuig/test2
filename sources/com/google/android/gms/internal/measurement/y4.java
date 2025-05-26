package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes3.dex */
public final class y4 extends v4 {
    @Override // com.google.android.gms.internal.measurement.v4
    public final Object c(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f31667a.f31300d;
        String str2 = this.f31668b;
        if (str == null || !str.isEmpty()) {
            str2 = a.a.C(str, str2);
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + str2 + ": " + String.valueOf(obj));
        return null;
    }
}
