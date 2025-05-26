package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import xk2.m;

/* loaded from: classes3.dex */
public final class zzgc {
    @NotNull
    public static final Class zza(Object obj) {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            Class cls = intValue == 1 ? Integer.TYPE : intValue == 2 ? Short.TYPE : intValue == 3 ? Byte.TYPE : intValue == 4 ? Long.TYPE : intValue == 5 ? Character.TYPE : intValue == 6 ? Float.TYPE : intValue == 7 ? Double.TYPE : intValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            throw new zzce(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzce(4, 5, null);
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i13 = zzav.zza;
            if (((zzfu) m.b(zzgb.zza).getValue()).zzb(str)) {
                return cls2;
            }
            throw new zzce(6, 47, null);
        } catch (Exception e13) {
            throw new zzce(6, 8, e13);
        }
    }
}
