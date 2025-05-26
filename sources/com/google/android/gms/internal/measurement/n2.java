package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class n2 extends a6 {
    private static final n2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private i6 zzf;
    private i6 zzg;
    private i6 zzh;
    private boolean zzi;
    private i6 zzj;

    static {
        n2 n2Var = new n2();
        zzc = n2Var;
        a6.j(n2.class, n2Var);
    }

    public n2() {
        m7 m7Var = m7.f31525d;
        this.zzf = m7Var;
        this.zzg = m7Var;
        this.zzh = m7Var;
        this.zzj = m7Var;
    }

    public static n2 s() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        Object obj = null;
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new n2();
            case 2:
                return new y1(2, obj);
            case 3:
                return new l7(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", i2.class, "zzg", j2.class, "zzh", m2.class, "zzi", "zzj", i2.class});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (n2.class) {
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

    public final i6 t() {
        return this.zzh;
    }

    public final List u() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}
