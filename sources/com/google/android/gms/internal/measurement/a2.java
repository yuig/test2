package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class a2 extends a6 {
    private static final a2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        a2 a2Var = new a2();
        zzc = a2Var;
        a6.j(a2.class, a2Var);
    }

    public static a2 t() {
        return zzc;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 16) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (q1.f31591a[i13 - 1]) {
            case 1:
                return new a2();
            case 2:
                int i14 = 0;
                return new y1(i14, i14);
            case 3:
                return new l7(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", z1.zzb(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (a2.class) {
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

    public final z1 r() {
        z1 zza = z1.zza(this.zzf);
        return zza == null ? z1.UNKNOWN_COMPARISON_TYPE : zza;
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzj;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
