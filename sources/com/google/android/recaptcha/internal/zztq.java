package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zztq extends zznd implements zzoj {
    private static final zztq zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zztq zztqVar = new zztq();
        zzb = zztqVar;
        zznd.zzI(zztq.class, zztqVar);
    }

    private zztq() {
    }

    public static zztp zzf() {
        return (zztp) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zztq zztqVar, String str) {
        str.getClass();
        zztqVar.zze = str;
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
            return new zztq();
        }
        zzug zzugVar = null;
        if (i14 == 4) {
            return new zztp(zzugVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zztq.class) {
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
