package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class s3 extends a6 {
    private static final s3 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf = 1;
    private i6 zzg = m7.f31525d;

    static {
        s3 s3Var = new s3();
        zzc = s3Var;
        a6.j(s3.class, s3Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new s3();
            case 2:
                return new i3(zzc);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", r3.zzb(), "zzg", j3.class});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (s3.class) {
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
}
