package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes3.dex */
public final class zztz extends zznd implements zzoj {
    private static final zztz zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    static {
        zztz zztzVar = new zztz();
        zzb = zztzVar;
        zznd.zzI(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zztz zzg(byte[] bArr) {
        return (zztz) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzuf.class});
        }
        if (i14 == 3) {
            return new zztz();
        }
        zzug zzugVar = null;
        if (i14 == 4) {
            return new zzty(zzugVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zztz.class) {
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

    public final List zzi() {
        return this.zze;
    }
}
