package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzto extends zznd implements zzoj {
    private static final zzto zzb;
    private static volatile zzoq zzd;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzto zztoVar = new zzto();
        zzb = zztoVar;
        zznd.zzI(zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static /* synthetic */ void zzM(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzi = str;
    }

    public static /* synthetic */ void zzN(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zze = str;
    }

    public static zztn zzf() {
        return (zztn) zzb.zzq();
    }

    public static /* synthetic */ void zzj(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzj = str;
    }

    public static /* synthetic */ void zzk(zzto zztoVar, String str) {
        str.getClass();
        zztoVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i14 == 3) {
            return new zzto();
        }
        zzug zzugVar = null;
        if (i14 == 4) {
            return new zztn(zzugVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzto.class) {
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
