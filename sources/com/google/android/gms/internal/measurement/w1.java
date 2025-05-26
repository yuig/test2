package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class w1 extends a6 {
    private static final w1 zzc;
    private static volatile i7 zzd;
    private int zze;
    private e2 zzf;
    private a2 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        w1 w1Var = new w1();
        zzc = w1Var;
        a6.j(w1.class, w1Var);
    }

    public static void r(w1 w1Var, String str) {
        w1Var.getClass();
        w1Var.zze |= 8;
        w1Var.zzi = str;
    }

    public static w1 s() {
        return zzc;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (q1.f31591a[i13 - 1]) {
            case 1:
                return new w1();
            case 2:
                return new v1(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (w1.class) {
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

    public final a2 t() {
        a2 a2Var = this.zzg;
        return a2Var == null ? a2.t() : a2Var;
    }

    public final e2 u() {
        e2 e2Var = this.zzf;
        return e2Var == null ? e2.u() : e2Var;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 8) != 0;
    }
}
