package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class f3 extends a6 {
    private static final f3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        f3 f3Var = new f3();
        zzc = f3Var;
        a6.j(f3.class, f3Var);
    }

    public static void s(f3 f3Var, int i13) {
        f3Var.zze |= 1;
        f3Var.zzf = i13;
    }

    public static void t(f3 f3Var, long j13) {
        f3Var.zze |= 2;
        f3Var.zzg = j13;
    }

    public static e3 v() {
        return (e3) zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new f3();
            case 2:
                return new e3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (f3.class) {
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

    public final long u() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}
