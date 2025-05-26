package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum qb {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    private final int zzg;

    qb(int i13) {
        this.zzg = i13;
    }

    public static qb zza(int i13) {
        return i13 != 2 ? i13 != 3 ? i13 != 5 ? i13 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
