package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class d4 extends a6 {
    private static final d4 zzc;
    private static volatile i7 zzd;
    private i6 zze = m7.f31525d;

    static {
        d4 d4Var = new d4();
        zzc = d4Var;
        a6.j(d4.class, d4Var);
    }

    public static d4 t() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        x1 x1Var = null;
        switch (c4.f31317a[i13 - 1]) {
            case 1:
                return new d4();
            case 2:
                return new y1(12, x1Var);
            case 3:
                return new l7(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", e4.class});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (d4.class) {
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
        return this.zze.size();
    }

    public final List u() {
        return this.zze;
    }
}
