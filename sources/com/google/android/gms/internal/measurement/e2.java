package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class e2 extends a6 {
    private static final e2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private i6 zzi = m7.f31525d;

    static {
        e2 e2Var = new e2();
        zzc = e2Var;
        a6.j(e2.class, e2Var);
    }

    public static e2 u() {
        return zzc;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        int i14 = 1;
        switch (q1.f31591a[i13 - 1]) {
            case 1:
                return new e2();
            case 2:
                return new y1(i14, 0);
            case 3:
                return new l7(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", d2.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (e2.class) {
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
        return this.zzi.size();
    }

    public final d2 s() {
        d2 zza = d2.zza(this.zzf);
        return zza == null ? d2.UNKNOWN_MATCH_TYPE : zza;
    }

    public final String v() {
        return this.zzg;
    }

    public final List w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
