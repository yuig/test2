package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class u2 extends a6 {
    private static final u2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        u2 u2Var = new u2();
        zzc = u2Var;
        a6.j(u2.class, u2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        Object obj = null;
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new u2();
            case 2:
                return new y1(8, obj);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (u2.class) {
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
