package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzqw extends zznd implements zzoj {
    private static final zzqw zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqw zzqwVar = new zzqw();
        zzb = zzqwVar;
        zznd.zzI(zzqw.class, zzqwVar);
    }

    private zzqw() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i14 == 3) {
            return new zzqw();
        }
        zzqv zzqvVar = null;
        if (i14 == 4) {
            return new zzqu(zzqvVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzqw.class) {
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
