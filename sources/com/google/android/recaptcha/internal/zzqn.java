package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzqn extends zznd implements zzoj {
    private static final zzqn zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf;
    private zzle zzg;
    private String zzh;
    private String zzi;
    private zzle zzj;
    private String zzk;
    private zzle zzl;

    static {
        zzqn zzqnVar = new zzqn();
        zzb = zzqnVar;
        zznd.zzI(zzqn.class, zzqnVar);
    }

    private zzqn() {
        zzle zzleVar = zzle.zzb;
        this.zze = zzleVar;
        this.zzf = "";
        this.zzg = zzleVar;
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzleVar;
        this.zzk = "";
        this.zzl = zzleVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i14 == 3) {
            return new zzqn();
        }
        zzqm zzqmVar = null;
        if (i14 == 4) {
            return new zzql(zzqmVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzqn.class) {
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
