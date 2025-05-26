package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class j2 extends a6 {
    private static final j2 zzc;
    private static volatile i7 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        j2 j2Var = new j2();
        zzc = j2Var;
        a6.j(j2.class, j2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        Object obj = null;
        switch (h2.f31417a[i13 - 1]) {
            case 1:
                return new j2();
            case 2:
                return new y1(4, obj);
            case 3:
                return new l7(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", l2.zzb(), "zzg", l2.zzb()});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (j2.class) {
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

    public final l2 s() {
        l2 zza = l2.zza(this.zzg);
        return zza == null ? l2.CONSENT_TYPE_UNSPECIFIED : zza;
    }

    public final l2 t() {
        l2 zza = l2.zza(this.zzf);
        return zza == null ? l2.CONSENT_TYPE_UNSPECIFIED : zza;
    }
}
