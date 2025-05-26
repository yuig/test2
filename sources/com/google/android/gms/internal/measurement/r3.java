package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum r3 implements f6 {
    RADS(1),
    PROVISIONING(2);

    private static final e6 zzc = new p0();
    private final int zze;

    r3(int i13) {
        this.zze = i13;
    }

    public static h6 zzb() {
        return b4.f31296a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + r3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zze;
    }

    public static r3 zza(int i13) {
        if (i13 == 1) {
            return RADS;
        }
        if (i13 != 2) {
            return null;
        }
        return PROVISIONING;
    }
}
