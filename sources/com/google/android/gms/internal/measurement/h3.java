package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class h3 extends a6 {
    private static final h3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private i6 zzf = m7.f31525d;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        h3 h3Var = new h3();
        zzc = h3Var;
        a6.j(h3.class, h3Var);
    }

    public static void B(long j13, h3 h3Var) {
        h3Var.zze |= 4;
        h3Var.zzi = j13;
    }

    public static g3 E() {
        return (g3) zzc.l();
    }

    public static void t(int i13, h3 h3Var) {
        h3Var.K();
        h3Var.zzf.remove(i13);
    }

    public static void u(long j13, h3 h3Var) {
        h3Var.zze |= 2;
        h3Var.zzh = j13;
    }

    public static void v(h3 h3Var) {
        h3Var.getClass();
        h3Var.zzf = m7.f31525d;
    }

    public static void w(h3 h3Var, int i13, l3 l3Var) {
        h3Var.getClass();
        h3Var.K();
        h3Var.zzf.set(i13, l3Var);
    }

    public static void x(h3 h3Var, l3 l3Var) {
        h3Var.getClass();
        h3Var.K();
        h3Var.zzf.add(l3Var);
    }

    public static void y(h3 h3Var, Iterable iterable) {
        h3Var.K();
        g5.b(iterable, h3Var.zzf);
    }

    public static void z(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 1;
        h3Var.zzg = str;
    }

    public final int A() {
        return this.zzf.size();
    }

    public final long C() {
        return this.zzi;
    }

    public final long D() {
        return this.zzh;
    }

    public final String F() {
        return this.zzg;
    }

    public final i6 G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final boolean I() {
        return (this.zze & 4) != 0;
    }

    public final boolean J() {
        return (this.zze & 2) != 0;
    }

    public final void K() {
        i6 i6Var = this.zzf;
        if (((i5) i6Var).f31439a) {
            return;
        }
        this.zzf = a6.e(i6Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new h3();
            case 2:
                return new g3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", l3.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (h3.class) {
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
        return this.zzj;
    }

    public final l3 s(int i13) {
        return (l3) this.zzf.get(i13);
    }
}
