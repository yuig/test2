package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzmc extends zznd implements zzoj {
    private static final zzmc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;

    static {
        zzmc zzmcVar = new zzmc();
        zzb = zzmcVar;
        zznd.zzI(zzmc.class, zzmcVar);
    }

    private zzmc() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            zznh zznhVar = zzlp.zza;
            return new zzou(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zze", "zzf", zznhVar, "zzg", zznhVar, "zzh", "zzi", zznhVar});
        }
        if (i14 == 3) {
            return new zzmc();
        }
        zzmh zzmhVar = null;
        if (i14 == 4) {
            return new zzmb(zzmhVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzmc.class) {
                try {
                    zzoqVar = zzd;
                    if (zzoqVar == null) {
                        zzoqVar = new zzmy(zzb);
                        zzd = zzoqVar;
                    }
                } finally {
                }
            }
        }
        return zzoqVar;
    }
}
