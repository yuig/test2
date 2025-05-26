package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class f4 extends a6 {
    private static final f4 zzc;
    private static volatile i7 zzd;
    private int zze;
    private i6 zzf = m7.f31525d;
    private d4 zzg;

    static {
        f4 f4Var = new f4();
        zzc = f4Var;
        a6.j(f4.class, f4Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        x1 x1Var = null;
        switch (c4.f31317a[i13 - 1]) {
            case 1:
                return new f4();
            case 2:
                return new y1(14, x1Var);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", h4.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (f4.class) {
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

    public final d4 r() {
        d4 d4Var = this.zzg;
        return d4Var == null ? d4.t() : d4Var;
    }

    public final i6 t() {
        return this.zzf;
    }
}
