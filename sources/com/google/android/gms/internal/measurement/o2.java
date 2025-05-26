package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class o2 extends a6 {
    private static final o2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private String zzf = "";
    private i6 zzg = m7.f31525d;
    private boolean zzh;

    static {
        o2 o2Var = new o2();
        zzc = o2Var;
        a6.j(o2.class, o2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        Object obj = null;
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new o2();
            case 2:
                return new y1(6, obj);
            case 3:
                return new l7(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", u2.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (o2.class) {
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

    public final String s() {
        return this.zzf;
    }
}
