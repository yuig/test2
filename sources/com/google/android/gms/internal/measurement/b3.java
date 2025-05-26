package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class b3 extends a6 {
    private static final b3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        b3 b3Var = new b3();
        zzc = b3Var;
        a6.j(b3.class, b3Var);
    }

    public static void A(b3 b3Var, boolean z13) {
        b3Var.zze |= 32;
        b3Var.zzk = z13;
    }

    public static void C(b3 b3Var, boolean z13) {
        b3Var.zze |= 64;
        b3Var.zzl = z13;
    }

    public static a3 r() {
        return (a3) zzc.l();
    }

    public static void s(b3 b3Var, boolean z13) {
        b3Var.zze |= 1;
        b3Var.zzf = z13;
    }

    public static void t(b3 b3Var, boolean z13) {
        b3Var.zze |= 2;
        b3Var.zzg = z13;
    }

    public static b3 u() {
        return zzc;
    }

    public static void v(b3 b3Var, boolean z13) {
        b3Var.zze |= 4;
        b3Var.zzh = z13;
    }

    public static void w(b3 b3Var, boolean z13) {
        b3Var.zze |= 8;
        b3Var.zzi = z13;
    }

    public static void y(b3 b3Var, boolean z13) {
        b3Var.zze |= 16;
        b3Var.zzj = z13;
    }

    public final boolean B() {
        return this.zzf;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzg;
    }

    public final boolean F() {
        return this.zzh;
    }

    public final boolean G() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new b3();
            case 2:
                return new a3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (b3.class) {
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

    public final boolean x() {
        return this.zzk;
    }

    public final boolean z() {
        return this.zzj;
    }
}
