package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes3.dex */
public final class x4 extends v4 {
    @Override // com.google.android.gms.internal.measurement.v4
    public final Object c(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (i4.f31428c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (i4.f31429d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f31667a.f31300d;
        String str3 = this.f31668b;
        if (str2 == null || !str2.isEmpty()) {
            str3 = a.a.C(str2, str3);
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + str3 + ": " + String.valueOf(obj));
        return null;
    }
}
