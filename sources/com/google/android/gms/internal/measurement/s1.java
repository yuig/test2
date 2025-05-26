package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class s1 extends a6 {
    private static final s1 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private i6 zzg;
    private i6 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        s1 s1Var = new s1();
        zzc = s1Var;
        a6.j(s1.class, s1Var);
    }

    public s1() {
        m7 m7Var = m7.f31525d;
        this.zzg = m7Var;
        this.zzh = m7Var;
    }

    public static void t(s1 s1Var, int i13, u1 u1Var) {
        s1Var.getClass();
        i6 i6Var = s1Var.zzh;
        if (!((i5) i6Var).f31439a) {
            s1Var.zzh = a6.e(i6Var);
        }
        s1Var.zzh.set(i13, u1Var);
    }

    public static void u(s1 s1Var, int i13, c2 c2Var) {
        s1Var.getClass();
        i6 i6Var = s1Var.zzg;
        if (!((i5) i6Var).f31439a) {
            s1Var.zzg = a6.e(i6Var);
        }
        s1Var.zzg.set(i13, c2Var);
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (q1.f31591a[i13 - 1]) {
            case 1:
                return new s1();
            case 2:
                return new r1(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", c2.class, "zzh", u1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (s1.class) {
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

    public final u1 s(int i13) {
        return (u1) this.zzh.get(i13);
    }

    public final int v() {
        return this.zzh.size();
    }

    public final c2 w(int i13) {
        return (c2) this.zzg.get(i13);
    }

    public final int x() {
        return this.zzg.size();
    }

    public final List y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzg;
    }
}
