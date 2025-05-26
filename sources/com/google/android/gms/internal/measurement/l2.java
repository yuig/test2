package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum l2 implements f6 {
    CONSENT_TYPE_UNSPECIFIED(0),
    AD_STORAGE(1),
    ANALYTICS_STORAGE(2),
    AD_USER_DATA(3),
    AD_PERSONALIZATION(4);

    private static final e6 zzf = new p0();
    private final int zzh;

    l2(int i13) {
        this.zzh = i13;
    }

    public static h6 zzb() {
        return x2.f31696a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + l2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzh;
    }

    public static l2 zza(int i13) {
        if (i13 == 0) {
            return CONSENT_TYPE_UNSPECIFIED;
        }
        if (i13 == 1) {
            return AD_STORAGE;
        }
        if (i13 == 2) {
            return ANALYTICS_STORAGE;
        }
        if (i13 == 3) {
            return AD_USER_DATA;
        }
        if (i13 != 4) {
            return null;
        }
        return AD_PERSONALIZATION;
    }
}
