package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class u3 extends a6 {
    private static final u3 zzc;
    private static volatile i7 zzd;
    private j6 zze;
    private j6 zzf;
    private i6 zzg;
    private i6 zzh;

    static {
        u3 u3Var = new u3();
        zzc = u3Var;
        a6.j(u3.class, u3Var);
    }

    public u3() {
        r6 r6Var = r6.f31622d;
        this.zze = r6Var;
        this.zzf = r6Var;
        m7 m7Var = m7.f31525d;
        this.zzg = m7Var;
        this.zzh = m7Var;
    }

    public static void B(u3 u3Var) {
        u3Var.getClass();
        u3Var.zzh = m7.f31525d;
    }

    public static void C(u3 u3Var, List list) {
        i6 i6Var = u3Var.zzh;
        if (!((i5) i6Var).f31439a) {
            u3Var.zzh = a6.e(i6Var);
        }
        g5.b(list, u3Var.zzh);
    }

    public static t3 D() {
        return (t3) zzc.l();
    }

    public static u3 E() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(u3 u3Var, List list) {
        j6 j6Var = u3Var.zze;
        if (!((i5) j6Var).f31439a) {
            u3Var.zze = a6.f(j6Var);
        }
        g5.b(list, u3Var.zze);
    }

    public static void t(u3 u3Var) {
        u3Var.getClass();
        u3Var.zze = r6.f31622d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(u3 u3Var, List list) {
        j6 j6Var = u3Var.zzf;
        if (!((i5) j6Var).f31439a) {
            u3Var.zzf = a6.f(j6Var);
        }
        g5.b(list, u3Var.zzf);
    }

    public static void w(u3 u3Var) {
        u3Var.getClass();
        u3Var.zzf = r6.f31622d;
    }

    public static void y(u3 u3Var) {
        u3Var.getClass();
        u3Var.zzg = m7.f31525d;
    }

    public static void z(u3 u3Var, ArrayList arrayList) {
        i6 i6Var = u3Var.zzg;
        if (!((i5) i6Var).f31439a) {
            u3Var.zzg = a6.e(i6Var);
        }
        g5.b(arrayList, u3Var.zzg);
    }

    public final int A() {
        return this.zze.size();
    }

    public final i6 F() {
        return this.zzg;
    }

    public final List G() {
        return this.zzf;
    }

    public final i6 H() {
        return this.zzh;
    }

    public final j6 I() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new u3();
            case 2:
                return new t3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", f3.class, "zzh", w3.class});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (u3.class) {
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

    public final int u() {
        return this.zzf.size();
    }

    public final int x() {
        return this.zzh.size();
    }
}
