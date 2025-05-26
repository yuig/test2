package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class c2 extends a6 {
    private static final c2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private w1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        c2 c2Var = new c2();
        zzc = c2Var;
        a6.j(c2.class, c2Var);
    }

    public static void s(c2 c2Var, String str) {
        c2Var.getClass();
        c2Var.zze |= 2;
        c2Var.zzg = str;
    }

    public static b2 u() {
        return (b2) zzc.l();
    }

    public final boolean A() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (q1.f31591a[i13 - 1]) {
            case 1:
                return new c2();
            case 2:
                return new b2(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (c2.class) {
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

    public final int r() {
        return this.zzf;
    }

    public final w1 t() {
        w1 w1Var = this.zzh;
        return w1Var == null ? w1.s() : w1Var;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return this.zzk;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
