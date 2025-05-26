package com.google.android.gms.internal.measurement;

import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class s2 extends a6 {
    private static final s2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private i6 zzi;
    private i6 zzj;
    private i6 zzk;
    private String zzl;
    private boolean zzm;
    private i6 zzn;
    private i6 zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private n2 zzt;
    private t2 zzu;

    static {
        s2 s2Var = new s2();
        zzc = s2Var;
        a6.j(s2.class, s2Var);
    }

    public s2() {
        m7 m7Var = m7.f31525d;
        this.zzi = m7Var;
        this.zzj = m7Var;
        this.zzk = m7Var;
        this.zzl = "";
        this.zzn = m7Var;
        this.zzo = m7Var;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
    }

    public static void t(s2 s2Var) {
        s2Var.getClass();
        s2Var.zzk = m7.f31525d;
    }

    public static void u(s2 s2Var, int i13, q2 q2Var) {
        s2Var.getClass();
        i6 i6Var = s2Var.zzj;
        if (!((i5) i6Var).f31439a) {
            s2Var.zzj = a6.e(i6Var);
        }
        s2Var.zzj.set(i13, q2Var);
    }

    public static r2 y() {
        return (r2) zzc.l();
    }

    public static s2 z() {
        return zzc;
    }

    public final String A() {
        return this.zzg;
    }

    public final String B() {
        return this.zzr;
    }

    public final String C() {
        return this.zzq;
    }

    public final String D() {
        return this.zzp;
    }

    public final i6 E() {
        return this.zzk;
    }

    public final i6 F() {
        return this.zzo;
    }

    public final i6 G() {
        return this.zzn;
    }

    public final i6 H() {
        return this.zzi;
    }

    public final boolean I() {
        return this.zzm;
    }

    public final boolean J() {
        return (this.zze & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new s2();
            case 2:
                return new r2(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", v2.class, "zzj", q2.class, "zzk", s1.class, "zzl", "zzm", "zzn", f4.class, "zzo", o2.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (s2.class) {
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
        return this.zzn.size();
    }

    public final q2 s(int i13) {
        return (q2) this.zzj.get(i13);
    }

    public final int v() {
        return this.zzj.size();
    }

    public final long w() {
        return this.zzf;
    }

    public final n2 x() {
        n2 n2Var = this.zzt;
        return n2Var == null ? n2.s() : n2Var;
    }
}
