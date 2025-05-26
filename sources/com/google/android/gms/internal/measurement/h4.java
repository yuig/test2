package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class h4 extends a6 {
    private static final h4 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private i6 zzg = m7.f31525d;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        h4 h4Var = new h4();
        zzc = h4Var;
        a6.j(h4.class, h4Var);
    }

    public final boolean A() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        x1 x1Var = null;
        switch (c4.f31317a[i13 - 1]) {
            case 1:
                return new h4();
            case 2:
                return new y1(15, x1Var);
            case 3:
                return new l7(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", g4.zzb(), "zzg", h4.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (h4.class) {
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
        return this.zzk;
    }

    public final g4 s() {
        g4 zza = g4.zza(this.zzf);
        return zza == null ? g4.UNKNOWN : zza;
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzi;
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }

    public final boolean z() {
        return (this.zze & 16) != 0;
    }
}
