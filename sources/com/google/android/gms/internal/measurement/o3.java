package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class o3 extends a6 {
    private static final o3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private i6 zzf = m7.f31525d;
    private String zzg = "";

    static {
        o3 o3Var = new o3();
        zzc = o3Var;
        a6.j(o3.class, o3Var);
    }

    public static void t(o3 o3Var, q3 q3Var) {
        o3Var.getClass();
        i6 i6Var = o3Var.zzf;
        if (!((i5) i6Var).f31439a) {
            o3Var.zzf = a6.e(i6Var);
        }
        o3Var.zzf.add(q3Var);
    }

    public static n3 u() {
        return (n3) zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new o3();
            case 2:
                return new n3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", q3.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (o3.class) {
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
        return this.zzf.size();
    }

    public final q3 s() {
        return (q3) this.zzf.get(0);
    }

    public final List v() {
        return this.zzf;
    }
}
