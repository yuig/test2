package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzte extends zznd implements zzoj {
    private static final zzte zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zztc zzj;
    private int zzk;
    private zztl zzl;

    static {
        zzte zzteVar = new zzte();
        zzb = zzteVar;
        zznd.zzI(zzte.class, zzteVar);
    }

    private zzte() {
    }

    public static /* synthetic */ void zzM(zzte zzteVar, int i13) {
        if (i13 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzteVar.zzh = i13 - 2;
    }

    public static /* synthetic */ void zzN(zzte zzteVar, int i13) {
        if (i13 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzteVar.zzf = i13 - 2;
    }

    public static zztd zzf() {
        return (zztd) zzb.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i14 == 3) {
            return new zzte();
        }
        if (i14 == 4) {
            return new zztd(null);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzte.class) {
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

    public final int zzk() {
        int i13;
        switch (this.zzh) {
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
            case 42:
                i13 = 44;
                break;
            case 43:
                i13 = 45;
                break;
            case 44:
                i13 = 46;
                break;
            case 45:
                i13 = 47;
                break;
            case 46:
                i13 = 48;
                break;
            case 47:
                i13 = 49;
                break;
            case 48:
                i13 = 50;
                break;
            case 49:
                i13 = 51;
                break;
            case 50:
                i13 = 52;
                break;
            case 51:
                i13 = 53;
                break;
            case 52:
                i13 = 54;
                break;
            case 53:
                i13 = 55;
                break;
            case 54:
                i13 = 56;
                break;
            case 55:
                i13 = 57;
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

    public final int zzl() {
        int i13;
        switch (this.zzf) {
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
