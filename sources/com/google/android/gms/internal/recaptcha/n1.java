package com.google.android.gms.internal.recaptcha;

/* loaded from: classes.dex */
public final class n1 extends b0 {
    private static final n1 zzg;
    private static volatile x0 zzh;
    private int zzc;
    private p1 zze;
    private String zzd = "";
    private String zzf = "";

    static {
        n1 n1Var = new n1();
        zzg = n1Var;
        b0.d(n1.class, n1Var);
    }

    public static n1 e() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.recaptcha.b0
    public final Object b(int i13) {
        int i14 = 1;
        switch (m1.f31770a[i13 - 1]) {
            case 1:
                return new n1();
            case 2:
                return new i(i14, 0);
            case 3:
                return new y0(zzg, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 4:
                return zzg;
            case 5:
                x0 x0Var = zzh;
                if (x0Var == null) {
                    synchronized (n1.class) {
                        try {
                            x0Var = zzh;
                            if (x0Var == null) {
                                x0Var = new y();
                                zzh = x0Var;
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
