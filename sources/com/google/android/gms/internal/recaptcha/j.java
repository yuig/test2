package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class j extends b0 {
    private static final j zze;
    private static volatile x0 zzf;
    private int zzc;
    private String zzd = "";

    static {
        j jVar = new j();
        zze = jVar;
        b0.d(j.class, jVar);
    }

    @Override // com.google.android.gms.internal.recaptcha.b0
    public final Object b(int i13) {
        switch (h.f31752a[i13 - 1]) {
            case 1:
                return new j();
            case 2:
                return new i(0);
            case 3:
                return new y0(zze, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 4:
                return zze;
            case 5:
                x0 x0Var = zzf;
                if (x0Var == null) {
                    synchronized (j.class) {
                        try {
                            x0Var = zzf;
                            if (x0Var == null) {
                                x0Var = new y();
                                zzf = x0Var;
                            }
                        } finally {
                        }
                    }
                }
                return x0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
