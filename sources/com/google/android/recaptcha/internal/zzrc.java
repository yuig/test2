package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzrc extends zznd implements zzoj {
    private static final zzrc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzml zzo;
    private int zzp;
    private zzqq zzq;
    private zzro zzr;
    private zzpj zzt;
    private zzml zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzs = "";
    private zzni zzv = zznd.zzy();

    static {
        zzrc zzrcVar = new zzrc();
        zzb = zzrcVar;
        zznd.zzI(zzrc.class, zzrcVar);
    }

    private zzrc() {
    }

    public static /* synthetic */ void zzO(zzrc zzrcVar, int i13) {
        zzni zzniVar = zzrcVar.zzv;
        if (!zzniVar.zzc()) {
            zzrcVar.zzv = zznd.zzz(zzniVar);
        }
        zzrcVar.zzv.zzh(0);
    }

    public static /* synthetic */ void zzP(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzj = str;
    }

    public static /* synthetic */ void zzR(zzrc zzrcVar, zzqq zzqqVar) {
        zzrcVar.zzq = zzqqVar;
        zzrcVar.zze |= 2;
    }

    public static /* synthetic */ void zzS(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzk = str;
    }

    public static /* synthetic */ void zzT(zzrc zzrcVar, zzro zzroVar) {
        zzroVar.getClass();
        zzrcVar.zzr = zzroVar;
        zzrcVar.zze |= 4;
    }

    public static /* synthetic */ void zzU(zzrc zzrcVar, int i13) {
        zzrcVar.zze |= 32;
        zzrcVar.zzw = i13;
    }

    public static /* synthetic */ void zzab(zzrc zzrcVar, int i13) {
        if (i13 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzrcVar.zzi = i13 - 2;
    }

    public static zzra zzi() {
        return (zzra) zzb.zzq();
    }

    public static zzrc zzk() {
        return zzb;
    }

    public static zzrc zzl(byte[] bArr) {
        return (zzrc) zznd.zzx(zzb, bArr);
    }

    public final String zzM() {
        return this.zzk;
    }

    public final String zzN() {
        return this.zzl;
    }

    public final boolean zzX() {
        return (this.zze & 2) != 0;
    }

    public final int zzY() {
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
            default:
                i13 = 0;
                break;
        }
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    public final int zzZ() {
        int i13 = this.zzp;
        int i14 = i13 != 0 ? i13 != 1 ? i13 != 2 ? 0 : 4 : 3 : 2;
        if (i14 == 0) {
            return 1;
        }
        return i14;
    }

    @Deprecated
    public final long zzf() {
        return this.zzn;
    }

    public final zzqq zzg() {
        zzqq zzqqVar = this.zzq;
        return zzqqVar == null ? zzqq.zzj() : zzqqVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i13, Object obj, Object obj2) {
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (byte) 1;
        }
        if (i14 == 2) {
            return zznd.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqg.class, "zzv", "zzw", "zzi"});
        }
        if (i14 == 3) {
            return new zzrc();
        }
        zzrb zzrbVar = null;
        if (i14 == 4) {
            return new zzra(zzrbVar);
        }
        if (i14 == 5) {
            return zzb;
        }
        if (i14 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzrc.class) {
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
