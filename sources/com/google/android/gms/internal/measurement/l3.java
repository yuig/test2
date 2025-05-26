package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class l3 extends a6 {
    private static final l3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private i6 zzk = m7.f31525d;

    static {
        l3 l3Var = new l3();
        zzc = l3Var;
        a6.j(l3.class, l3Var);
    }

    public static void A(l3 l3Var, String str) {
        l3Var.getClass();
        str.getClass();
        l3Var.zze |= 2;
        l3Var.zzg = str;
    }

    public static void C(l3 l3Var) {
        l3Var.zze &= -17;
        l3Var.zzj = 0.0d;
    }

    public static void E(l3 l3Var) {
        l3Var.getClass();
        l3Var.zzk = m7.f31525d;
    }

    public static k3 F() {
        return (k3) zzc.l();
    }

    public static void s(l3 l3Var, double d2) {
        l3Var.zze |= 16;
        l3Var.zzj = d2;
    }

    public static void t(l3 l3Var, long j13) {
        l3Var.zze |= 4;
        l3Var.zzh = j13;
    }

    public static void u(l3 l3Var, l3 l3Var2) {
        l3Var.getClass();
        i6 i6Var = l3Var.zzk;
        if (!((i5) i6Var).f31439a) {
            l3Var.zzk = a6.e(i6Var);
        }
        l3Var.zzk.add(l3Var2);
    }

    public static void v(l3 l3Var, String str) {
        l3Var.getClass();
        str.getClass();
        l3Var.zze |= 1;
        l3Var.zzf = str;
    }

    public static void w(l3 l3Var, ArrayList arrayList) {
        i6 i6Var = l3Var.zzk;
        if (!((i5) i6Var).f31439a) {
            l3Var.zzk = a6.e(i6Var);
        }
        g5.b(arrayList, l3Var.zzk);
    }

    public static void x(l3 l3Var) {
        l3Var.zze &= -3;
        l3Var.zzg = zzc.zzg;
    }

    public static void z(l3 l3Var) {
        l3Var.zze &= -5;
        l3Var.zzh = 0L;
    }

    public final int B() {
        return this.zzk.size();
    }

    public final long D() {
        return this.zzh;
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzk;
    }

    public final boolean J() {
        return (this.zze & 16) != 0;
    }

    public final boolean K() {
        return (this.zze & 8) != 0;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new l3();
            case 2:
                return new k3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", l3.class});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (l3.class) {
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
        return this.zzj;
    }

    public final float y() {
        return this.zzi;
    }
}
