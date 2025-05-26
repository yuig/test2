package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class m3 extends a6 {
    private static final m3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private z2 zzh;

    static {
        m3 m3Var = new m3();
        zzc = m3Var;
        a6.j(m3.class, m3Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        a.c cVar = null;
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new m3();
            case 2:
                return new y1(11, cVar);
            case 3:
                return new l7(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (m3.class) {
                        try {
                            i7Var = zzd;
                            if (i7Var == null) {
                                i7Var = new y5();
                                zzd = i7Var;
                            }
                        } finally {
                        }
                    }
                }
                return i7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
