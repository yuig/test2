package com.google.android.gms.internal.recaptcha;

/* loaded from: classes.dex */
public final class o1 extends b0 {
    private static final o1 zzh;
    private static volatile x0 zzi;
    private int zzc;
    private p1 zze;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";

    static {
        o1 o1Var = new o1();
        zzh = o1Var;
        b0.d(o1.class, o1Var);
    }

    public static o1 e() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.recaptcha.b0
    public final Object b(int i13) {
        switch (m1.f31770a[i13 - 1]) {
            case 1:
                return new o1();
            case 2:
                return new i(2, 0);
            case 3:
                return new y0(zzh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"zzc", "zzd", "zzf", "zzg", "zze"});
            case 4:
                return zzh;
            case 5:
                x0 x0Var = zzi;
                if (x0Var == null) {
                    synchronized (o1.class) {
                        try {
                            x0Var = zzi;
                            if (x0Var == null) {
                                x0Var = new y();
                                zzi = x0Var;
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
