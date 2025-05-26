package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzls extends zzna implements zzoj {
    private static final zzls zzd;
    private static volatile zzoq zze;
    private int zzf;
    private boolean zzg;
    private zzma zzh;
    private boolean zzi;
    private zzmc zzj;
    private byte zzl = 2;
    private zznk zzk = zzot.zze();

    static {
        zzls zzlsVar = new zzls();
        zzd = zzlsVar;
        zznd.zzI(zzls.class, zzlsVar);
    }

    private zzls() {
    }

    public static zzls zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i14 == 2) {
            return new zzou(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzmg.class});
        }
        if (i14 == 3) {
            return new zzls();
        }
        zzmh zzmhVar = null;
        if (i14 == 4) {
            return new zzlr(zzmhVar);
        }
        if (i14 == 5) {
            return zzd;
        }
        if (i14 != 6) {
            this.zzl = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar = zze;
        if (zzoqVar == null) {
            synchronized (zzls.class) {
                try {
                    zzoqVar = zze;
                    if (zzoqVar == null) {
                        zzoqVar = new zzmy(zzd);
                        zze = zzoqVar;
                    }
                } finally {
                }
            }
        }
        return zzoqVar;
    }
}
