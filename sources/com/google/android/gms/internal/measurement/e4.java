package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class e4 extends a6 {
    private static final e4 zzc;
    private static volatile i7 zzd;
    private int zze;
    private String zzf = "";
    private i6 zzg = m7.f31525d;

    static {
        e4 e4Var = new e4();
        zzc = e4Var;
        a6.j(e4.class, e4Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        x1 x1Var = null;
        switch (c4.f31317a[i13 - 1]) {
            case 1:
                return new e4();
            case 2:
                return new y1(13, x1Var);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", h4.class});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (e4.class) {
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

    public final String s() {
        return this.zzf;
    }

    public final i6 t() {
        return this.zzg;
    }
}
