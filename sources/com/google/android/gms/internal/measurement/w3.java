package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class w3 extends a6 {
    private static final w3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private j6 zzg = r6.f31622d;

    static {
        w3 w3Var = new w3();
        zzc = w3Var;
        a6.j(w3.class, w3Var);
    }

    public static void t(w3 w3Var, int i13) {
        w3Var.zze |= 1;
        w3Var.zzf = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(w3 w3Var, List list) {
        j6 j6Var = w3Var.zzg;
        if (!((i5) j6Var).f31439a) {
            w3Var.zzg = a6.f(j6Var);
        }
        g5.b(list, w3Var.zzg);
    }

    public static v3 w() {
        return (v3) zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new w3();
            case 2:
                return new v3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (w3.class) {
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
        return this.zzg.size();
    }

    public final long s(int i13) {
        r6 r6Var = (r6) this.zzg;
        r6Var.d(i13);
        return r6Var.f31623b[i13];
    }

    public final int v() {
        return this.zzf;
    }

    public final List x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
