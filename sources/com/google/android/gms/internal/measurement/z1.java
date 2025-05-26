package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum z1 implements f6 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);

    private static final e6 zzf = new p0();
    private final int zzh;

    z1(int i13) {
        this.zzh = i13;
    }

    public static h6 zzb() {
        return f2.f31388a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + z1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzh;
    }

    public static z1 zza(int i13) {
        if (i13 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i13 == 1) {
            return LESS_THAN;
        }
        if (i13 == 2) {
            return GREATER_THAN;
        }
        if (i13 == 3) {
            return EQUAL;
        }
        if (i13 != 4) {
            return null;
        }
        return BETWEEN;
    }
}
