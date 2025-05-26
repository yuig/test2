package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzse extends zznd implements zzoj {
    private static final zzse zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf;
    private long zzg;
    private zzle zzh;
    private String zzi;
    private String zzj;

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zznd.zzI(zzse.class, zzseVar);
    }

    private zzse() {
        zzle zzleVar = zzle.zzb;
        this.zze = zzleVar;
        this.zzf = "";
        this.zzh = zzleVar;
        this.zzi = "";
        this.zzj = "";
    }

    public static zzse zzk() {
        return zzb;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzle zzg() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i14 == 3) {
            return new zzse();
        }
        zzsn zzsnVar = null;
        if (i14 == 4) {
            return new zzsd(zzsnVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzse.class) {
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

    public final zzle zzi() {
        return this.zze;
    }

    public final String zzl() {
        return this.zzf;
    }
}
