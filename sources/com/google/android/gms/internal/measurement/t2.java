package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class t2 extends a6 {
    private static final t2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    static {
        t2 t2Var = new t2();
        zzc = t2Var;
        a6.j(t2.class, t2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        Object obj = null;
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new t2();
            case 2:
                return new y1(7, obj);
            case 3:
                return new l7(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (t2.class) {
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
