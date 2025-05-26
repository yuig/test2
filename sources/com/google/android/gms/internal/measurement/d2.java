package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum d2 implements f6 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);

    private static final e6 zzh = new p0();
    private final int zzj;

    d2(int i13) {
        this.zzj = i13;
    }

    public static h6 zzb() {
        return g2.f31405a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + d2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzj;
    }

    public static d2 zza(int i13) {
        switch (i13) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }
}
