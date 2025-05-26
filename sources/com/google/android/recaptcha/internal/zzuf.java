package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzuf extends zznd implements zzoj {
    private static final zzuf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private zznk zzg = zznd.zzB();

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zznd.zzI(zzuf.class, zzufVar);
        zzls zzg = zzls.zzg();
        zzpw zzpwVar = zzpw.zzi;
        zznd.zzs(zzg, "", null, null, 490775251, zzpwVar, String.class);
        zznd.zzs(zzls.zzg(), "", null, null, 490775252, zzpwVar, String.class);
    }

    private zzuf() {
    }

    public final int zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzue.class});
        }
        if (i14 == 3) {
            return new zzuf();
        }
        zzug zzugVar = null;
        if (i14 == 4) {
            return new zzuc(zzugVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzuf.class) {
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

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i13;
        switch (this.zze) {
            case 0:
                i13 = 2;
                break;
            case 1:
                i13 = 3;
                break;
            case 2:
                i13 = 4;
                break;
            case 3:
                i13 = 5;
                break;
            case 4:
                i13 = 6;
                break;
            case 5:
                i13 = 7;
                break;
            case 6:
                i13 = 8;
                break;
            case 7:
                i13 = 9;
                break;
            case 8:
                i13 = 10;
                break;
            case 9:
                i13 = 11;
                break;
            case 10:
                i13 = 12;
                break;
            case 11:
                i13 = 13;
                break;
            case 12:
                i13 = 14;
                break;
            case 13:
                i13 = 15;
                break;
            case 14:
                i13 = 16;
                break;
            case 15:
                i13 = 17;
                break;
            case 16:
                i13 = 18;
                break;
            case 17:
                i13 = 19;
                break;
            case 18:
                i13 = 20;
                break;
            case 19:
                i13 = 21;
                break;
            case 20:
                i13 = 22;
                break;
            case 21:
                i13 = 23;
                break;
            case 22:
                i13 = 24;
                break;
            case 23:
                i13 = 25;
                break;
            case 24:
                i13 = 26;
                break;
            case 25:
                i13 = 27;
                break;
            case 26:
                i13 = 28;
                break;
            case 27:
                i13 = 29;
                break;
            case 28:
                i13 = 30;
                break;
            case 29:
                i13 = 31;
                break;
            case 30:
                i13 = 32;
                break;
            case 31:
                i13 = 33;
                break;
            case 32:
                i13 = 34;
                break;
            case 33:
                i13 = 35;
                break;
            case 34:
                i13 = 36;
                break;
            case 35:
                i13 = 37;
                break;
            case 36:
                i13 = 38;
                break;
            case 37:
                i13 = 39;
                break;
            case 38:
                i13 = 40;
                break;
            case 39:
                i13 = 41;
                break;
            case 40:
                i13 = 42;
                break;
            case 41:
                i13 = 43;
                break;
            default:
                i13 = 0;
                break;
        }
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }
}
