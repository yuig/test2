package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzsk extends zznd implements zzoj {
    private static final zzsk zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzsk zzskVar = new zzsk();
        zzb = zzskVar;
        zznd.zzI(zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zzsj zzf() {
        return (zzsj) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsk zzskVar, String str) {
        str.getClass();
        zzskVar.zze |= 2;
        zzskVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzsk zzskVar, String str) {
        str.getClass();
        zzskVar.zze |= 1;
        zzskVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i14 == 3) {
            return new zzsk();
        }
        zzsn zzsnVar = null;
        if (i14 == 4) {
            return new zzsj(zzsnVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzsk.class) {
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
