package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class d3 extends a6 {
    private static final d3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private u3 zzg;
    private u3 zzh;
    private boolean zzi;

    static {
        d3 d3Var = new d3();
        zzc = d3Var;
        a6.j(d3.class, d3Var);
    }

    public static void s(d3 d3Var, int i13) {
        d3Var.zze |= 1;
        d3Var.zzf = i13;
    }

    public static void t(d3 d3Var, u3 u3Var) {
        d3Var.getClass();
        d3Var.zzg = u3Var;
        d3Var.zze |= 2;
    }

    public static void u(d3 d3Var, boolean z13) {
        d3Var.zze |= 8;
        d3Var.zzi = z13;
    }

    public static c3 v() {
        return (c3) zzc.l();
    }

    public static void w(d3 d3Var, u3 u3Var) {
        d3Var.getClass();
        u3Var.getClass();
        d3Var.zzh = u3Var;
        d3Var.zze |= 4;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new d3();
            case 2:
                return new c3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (d3.class) {
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

    public final u3 x() {
        u3 u3Var = this.zzg;
        return u3Var == null ? u3.E() : u3Var;
    }

    public final u3 y() {
        u3 u3Var = this.zzh;
        return u3Var == null ? u3.E() : u3Var;
    }

    public final boolean z() {
        return this.zzi;
    }
}
