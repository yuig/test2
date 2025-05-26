package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum k2 implements f6 {
    CONSENT_STATUS_UNSPECIFIED(0),
    GRANTED(1),
    DENIED(2);

    private static final e6 zzd = new p0();
    private final int zzf;

    k2(int i13) {
        this.zzf = i13;
    }

    public static h6 zzb() {
        return w2.f31682a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + k2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzf;
    }

    public static k2 zza(int i13) {
        if (i13 == 0) {
            return CONSENT_STATUS_UNSPECIFIED;
        }
        if (i13 == 1) {
            return GRANTED;
        }
        if (i13 != 2) {
            return null;
        }
        return DENIED;
    }
}
