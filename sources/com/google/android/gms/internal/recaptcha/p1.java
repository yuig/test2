package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public final class p1 extends b0 {
    private static final p1 zzi;
    private static volatile x0 zzj;
    private int zzd;
    private long zzf;
    private j zzg;
    private int zzh;
    private String zzc = "";
    private String zze = "";

    static {
        p1 p1Var = new p1();
        zzi = p1Var;
        b0.d(p1.class, p1Var);
    }

    @Override // com.google.android.gms.internal.recaptcha.b0
    public final Object b(int i13) {
        switch (m1.f31770a[i13 - 1]) {
            case 1:
                return new p1();
            case 2:
                return new i(3, 0);
            case 3:
                return new y0(zzi, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0002\u0005\t\u0007\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                x0 x0Var = zzj;
                if (x0Var == null) {
                    synchronized (p1.class) {
                        try {
                            x0Var = zzj;
                            if (x0Var == null) {
                                x0Var = new y();
                                zzj = x0Var;
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
