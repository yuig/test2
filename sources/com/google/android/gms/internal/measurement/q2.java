package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class q2 extends a6 {
    private static final q2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        q2 q2Var = new q2();
        zzc = q2Var;
        a6.j(q2.class, q2Var);
    }

    public static void s(q2 q2Var, String str) {
        q2Var.getClass();
        str.getClass();
        q2Var.zze |= 1;
        q2Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new q2();
            case 2:
                return new p2(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (q2.class) {
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
        return this.zzi;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }
}
