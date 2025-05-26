package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class y3 extends a6 {
    private static final y3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        y3 y3Var = new y3();
        zzc = y3Var;
        a6.j(y3.class, y3Var);
    }

    public static void B(y3 y3Var) {
        y3Var.zze &= -33;
        y3Var.zzk = 0.0d;
    }

    public static x3 D() {
        return (x3) zzc.l();
    }

    public static void s(y3 y3Var, double d2) {
        y3Var.zze |= 32;
        y3Var.zzk = d2;
    }

    public static void t(y3 y3Var, long j13) {
        y3Var.zze |= 1;
        y3Var.zzf = j13;
    }

    public static void u(y3 y3Var, String str) {
        y3Var.getClass();
        str.getClass();
        y3Var.zze |= 2;
        y3Var.zzg = str;
    }

    public static void v(y3 y3Var) {
        y3Var.zze &= -5;
        y3Var.zzh = zzc.zzh;
    }

    public static void x(y3 y3Var) {
        y3Var.zze &= -9;
        y3Var.zzi = 0L;
    }

    public static void y(y3 y3Var, long j13) {
        y3Var.zze |= 8;
        y3Var.zzi = j13;
    }

    public static void z(y3 y3Var, String str) {
        y3Var.getClass();
        str.getClass();
        y3Var.zze |= 4;
        y3Var.zzh = str;
    }

    public final long A() {
        return this.zzi;
    }

    public final long C() {
        return this.zzf;
    }

    public final String E() {
        return this.zzg;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zze & 32) != 0;
    }

    public final boolean H() {
        return (this.zze & 16) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new y3();
            case 2:
                return new x3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (y3.class) {
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

    public final double r() {
        return this.zzk;
    }

    public final float w() {
        return this.zzj;
    }
}
