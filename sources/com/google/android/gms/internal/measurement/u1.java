package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class u1 extends a6 {
    private static final u1 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private i6 zzh = m7.f31525d;
    private boolean zzi;
    private a2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        u1 u1Var = new u1();
        zzc = u1Var;
        a6.j(u1.class, u1Var);
    }

    public static void t(u1 u1Var, int i13, w1 w1Var) {
        u1Var.getClass();
        i6 i6Var = u1Var.zzh;
        if (!((i5) i6Var).f31439a) {
            u1Var.zzh = a6.e(i6Var);
        }
        u1Var.zzh.set(i13, w1Var);
    }

    public static void u(u1 u1Var, String str) {
        u1Var.getClass();
        u1Var.zze |= 2;
        u1Var.zzg = str;
    }

    public static t1 w() {
        return (t1) zzc.l();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return this.zzl;
    }

    public final boolean C() {
        return this.zzm;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 1) != 0;
    }

    public final boolean F() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (q1.f31591a[i13 - 1]) {
            case 1:
                return new u1();
            case 2:
                return new t1(zzc);
            case 3:
                return new l7(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", w1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (u1.class) {
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
        return this.zzh.size();
    }

    public final w1 s(int i13) {
        return (w1) this.zzh.get(i13);
    }

    public final int v() {
        return this.zzf;
    }

    public final a2 x() {
        a2 a2Var = this.zzj;
        return a2Var == null ? a2.t() : a2Var;
    }

    public final String y() {
        return this.zzg;
    }

    public final i6 z() {
        return this.zzh;
    }
}
