package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzsx extends zznd implements zzoj {
    private static final zzsx zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzni zzh = zznd.zzy();
    private int zzi;
    private int zzj;

    static {
        zzsx zzsxVar = new zzsx();
        zzb = zzsxVar;
        zznd.zzI(zzsx.class, zzsxVar);
    }

    private zzsx() {
    }

    public static zzsv zzf() {
        return (zzsv) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsx zzsxVar, String str) {
        str.getClass();
        zzsxVar.zze |= 2;
        zzsxVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzsx zzsxVar, String str) {
        str.getClass();
        zzsxVar.zze |= 1;
        zzsxVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzsx zzsxVar, int i13) {
        zzsxVar.zzi = 2;
        zzsxVar.zze |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzsw.zza, "zzj"});
        }
        if (i14 == 3) {
            return new zzsx();
        }
        zzta zztaVar = null;
        if (i14 == 4) {
            return new zzsv(zztaVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzsx.class) {
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
