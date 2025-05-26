package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum g4 implements f6 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);

    private static final e6 zzf = new p0();
    private final int zzh;

    g4(int i13) {
        this.zzh = i13;
    }

    public static h6 zzb() {
        return j4.f31478a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + g4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzh;
    }

    public static g4 zza(int i13) {
        if (i13 == 0) {
            return UNKNOWN;
        }
        if (i13 == 1) {
            return STRING;
        }
        if (i13 == 2) {
            return NUMBER;
        }
        if (i13 == 3) {
            return BOOLEAN;
        }
        if (i13 != 4) {
            return null;
        }
        return STATEMENT;
    }
}
