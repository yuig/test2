package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzma extends zzna implements zzoj {
    private static final zzma zzd;
    private static volatile zzoq zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;

    static {
        zzma zzmaVar = new zzma();
        zzd = zzmaVar;
        zznd.zzI(zzma.class, zzmaVar);
    }

    private zzma() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i14 == 2) {
            return new zzou(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", zzlv.zza, "zzh", zzlu.zza, "zzi", zzly.zza, "zzj", zzlz.zza, "zzk", zzlx.zza, "zzl", zzlw.zza});
        }
        if (i14 == 3) {
            return new zzma();
        }
        zzmh zzmhVar = null;
        if (i14 == 4) {
            return new zzlt(zzmhVar);
        }
        if (i14 == 5) {
            return zzd;
        }
        if (i14 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar = zze;
        if (zzoqVar == null) {
            synchronized (zzma.class) {
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
