package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class u5 {
    public static final u5 zza;
    private static final u5 zzaa;
    private static final u5 zzab;
    private static final u5 zzac;
    private static final u5 zzad;
    private static final u5 zzae;
    private static final u5 zzaf;
    private static final u5 zzag;
    private static final u5 zzah;
    private static final u5 zzai;
    private static final u5 zzaj;
    private static final u5 zzak;
    private static final u5 zzal;
    private static final u5 zzam;
    private static final u5 zzan;
    private static final u5 zzao;
    private static final u5 zzap;
    private static final u5 zzaq;
    private static final u5 zzar;
    private static final u5 zzas;
    private static final u5 zzat;
    private static final u5 zzau;
    private static final u5 zzav;
    private static final u5 zzaw;
    private static final u5 zzax;
    private static final u5 zzay;
    private static final u5[] zzaz;
    public static final u5 zzb;
    private static final Type[] zzba;
    private static final /* synthetic */ u5[] zzbb;
    private static final u5 zzc;
    private static final u5 zzd;
    private static final u5 zze;
    private static final u5 zzf;
    private static final u5 zzg;
    private static final u5 zzh;
    private static final u5 zzi;
    private static final u5 zzj;
    private static final u5 zzk;
    private static final u5 zzl;
    private static final u5 zzm;
    private static final u5 zzn;
    private static final u5 zzo;
    private static final u5 zzp;
    private static final u5 zzq;
    private static final u5 zzr;
    private static final u5 zzs;
    private static final u5 zzt;
    private static final u5 zzu;
    private static final u5 zzv;
    private static final u5 zzw;
    private static final u5 zzx;
    private static final u5 zzy;
    private static final u5 zzz;
    private final k6 zzbc;
    private final int zzbd;
    private final v5 zzbe;
    private final Class<?> zzbf;
    private final boolean zzbg;

    static {
        v5 v5Var = v5.SCALAR;
        k6 k6Var = k6.zze;
        u5 u5Var = new u5("DOUBLE", 0, 0, v5Var, k6Var);
        zzc = u5Var;
        k6 k6Var2 = k6.zzd;
        u5 u5Var2 = new u5("FLOAT", 1, 1, v5Var, k6Var2);
        zzd = u5Var2;
        k6 k6Var3 = k6.zzc;
        u5 u5Var3 = new u5("INT64", 2, 2, v5Var, k6Var3);
        zze = u5Var3;
        u5 u5Var4 = new u5("UINT64", 3, 3, v5Var, k6Var3);
        zzf = u5Var4;
        k6 k6Var4 = k6.zzb;
        u5 u5Var5 = new u5("INT32", 4, 4, v5Var, k6Var4);
        zzg = u5Var5;
        u5 u5Var6 = new u5("FIXED64", 5, 5, v5Var, k6Var3);
        zzh = u5Var6;
        u5 u5Var7 = new u5("FIXED32", 6, 6, v5Var, k6Var4);
        zzi = u5Var7;
        k6 k6Var5 = k6.zzf;
        u5 u5Var8 = new u5("BOOL", 7, 7, v5Var, k6Var5);
        zzj = u5Var8;
        k6 k6Var6 = k6.zzg;
        u5 u5Var9 = new u5("STRING", 8, 8, v5Var, k6Var6);
        zzk = u5Var9;
        k6 k6Var7 = k6.zzj;
        u5 u5Var10 = new u5("MESSAGE", 9, 9, v5Var, k6Var7);
        zzl = u5Var10;
        k6 k6Var8 = k6.zzh;
        u5 u5Var11 = new u5("BYTES", 10, 10, v5Var, k6Var8);
        zzm = u5Var11;
        u5 u5Var12 = new u5("UINT32", 11, 11, v5Var, k6Var4);
        zzn = u5Var12;
        k6 k6Var9 = k6.zzi;
        u5 u5Var13 = new u5("ENUM", 12, 12, v5Var, k6Var9);
        zzo = u5Var13;
        u5 u5Var14 = new u5("SFIXED32", 13, 13, v5Var, k6Var4);
        zzp = u5Var14;
        u5 u5Var15 = new u5("SFIXED64", 14, 14, v5Var, k6Var3);
        zzq = u5Var15;
        u5 u5Var16 = new u5("SINT32", 15, 15, v5Var, k6Var4);
        zzr = u5Var16;
        u5 u5Var17 = new u5("SINT64", 16, 16, v5Var, k6Var3);
        zzs = u5Var17;
        u5 u5Var18 = new u5("GROUP", 17, 17, v5Var, k6Var7);
        zzt = u5Var18;
        v5 v5Var2 = v5.VECTOR;
        u5 u5Var19 = new u5("DOUBLE_LIST", 18, 18, v5Var2, k6Var);
        zzu = u5Var19;
        u5 u5Var20 = new u5("FLOAT_LIST", 19, 19, v5Var2, k6Var2);
        zzv = u5Var20;
        u5 u5Var21 = new u5("INT64_LIST", 20, 20, v5Var2, k6Var3);
        zzw = u5Var21;
        u5 u5Var22 = new u5("UINT64_LIST", 21, 21, v5Var2, k6Var3);
        zzx = u5Var22;
        u5 u5Var23 = new u5("INT32_LIST", 22, 22, v5Var2, k6Var4);
        zzy = u5Var23;
        u5 u5Var24 = new u5("FIXED64_LIST", 23, 23, v5Var2, k6Var3);
        zzz = u5Var24;
        u5 u5Var25 = new u5("FIXED32_LIST", 24, 24, v5Var2, k6Var4);
        zzaa = u5Var25;
        u5 u5Var26 = new u5("BOOL_LIST", 25, 25, v5Var2, k6Var5);
        zzab = u5Var26;
        u5 u5Var27 = new u5("STRING_LIST", 26, 26, v5Var2, k6Var6);
        zzac = u5Var27;
        u5 u5Var28 = new u5("MESSAGE_LIST", 27, 27, v5Var2, k6Var7);
        zzad = u5Var28;
        u5 u5Var29 = new u5("BYTES_LIST", 28, 28, v5Var2, k6Var8);
        zzae = u5Var29;
        u5 u5Var30 = new u5("UINT32_LIST", 29, 29, v5Var2, k6Var4);
        zzaf = u5Var30;
        u5 u5Var31 = new u5("ENUM_LIST", 30, 30, v5Var2, k6Var9);
        zzag = u5Var31;
        u5 u5Var32 = new u5("SFIXED32_LIST", 31, 31, v5Var2, k6Var4);
        zzah = u5Var32;
        u5 u5Var33 = new u5("SFIXED64_LIST", 32, 32, v5Var2, k6Var3);
        zzai = u5Var33;
        u5 u5Var34 = new u5("SINT32_LIST", 33, 33, v5Var2, k6Var4);
        zzaj = u5Var34;
        u5 u5Var35 = new u5("SINT64_LIST", 34, 34, v5Var2, k6Var3);
        zzak = u5Var35;
        v5 v5Var3 = v5.PACKED_VECTOR;
        u5 u5Var36 = new u5("DOUBLE_LIST_PACKED", 35, 35, v5Var3, k6Var);
        zza = u5Var36;
        u5 u5Var37 = new u5("FLOAT_LIST_PACKED", 36, 36, v5Var3, k6Var2);
        zzal = u5Var37;
        u5 u5Var38 = new u5("INT64_LIST_PACKED", 37, 37, v5Var3, k6Var3);
        zzam = u5Var38;
        u5 u5Var39 = new u5("UINT64_LIST_PACKED", 38, 38, v5Var3, k6Var3);
        zzan = u5Var39;
        u5 u5Var40 = new u5("INT32_LIST_PACKED", 39, 39, v5Var3, k6Var4);
        zzao = u5Var40;
        u5 u5Var41 = new u5("FIXED64_LIST_PACKED", 40, 40, v5Var3, k6Var3);
        zzap = u5Var41;
        u5 u5Var42 = new u5("FIXED32_LIST_PACKED", 41, 41, v5Var3, k6Var4);
        zzaq = u5Var42;
        u5 u5Var43 = new u5("BOOL_LIST_PACKED", 42, 42, v5Var3, k6Var5);
        zzar = u5Var43;
        u5 u5Var44 = new u5("UINT32_LIST_PACKED", 43, 43, v5Var3, k6Var4);
        zzas = u5Var44;
        u5 u5Var45 = new u5("ENUM_LIST_PACKED", 44, 44, v5Var3, k6Var9);
        zzat = u5Var45;
        u5 u5Var46 = new u5("SFIXED32_LIST_PACKED", 45, 45, v5Var3, k6Var4);
        zzau = u5Var46;
        u5 u5Var47 = new u5("SFIXED64_LIST_PACKED", 46, 46, v5Var3, k6Var3);
        zzav = u5Var47;
        u5 u5Var48 = new u5("SINT32_LIST_PACKED", 47, 47, v5Var3, k6Var4);
        zzaw = u5Var48;
        u5 u5Var49 = new u5("SINT64_LIST_PACKED", 48, 48, v5Var3, k6Var3);
        zzb = u5Var49;
        u5 u5Var50 = new u5("GROUP_LIST", 49, 49, v5Var2, k6Var7);
        zzax = u5Var50;
        u5 u5Var51 = new u5("MAP", 50, 50, v5.MAP, k6.zza);
        zzay = u5Var51;
        zzbb = new u5[]{u5Var, u5Var2, u5Var3, u5Var4, u5Var5, u5Var6, u5Var7, u5Var8, u5Var9, u5Var10, u5Var11, u5Var12, u5Var13, u5Var14, u5Var15, u5Var16, u5Var17, u5Var18, u5Var19, u5Var20, u5Var21, u5Var22, u5Var23, u5Var24, u5Var25, u5Var26, u5Var27, u5Var28, u5Var29, u5Var30, u5Var31, u5Var32, u5Var33, u5Var34, u5Var35, u5Var36, u5Var37, u5Var38, u5Var39, u5Var40, u5Var41, u5Var42, u5Var43, u5Var44, u5Var45, u5Var46, u5Var47, u5Var48, u5Var49, u5Var50, u5Var51};
        zzba = new Type[0];
        u5[] values = values();
        zzaz = new u5[values.length];
        for (u5 u5Var52 : values) {
            zzaz[u5Var52.zzbd] = u5Var52;
        }
    }

    private u5(String str, int i13, int i14, v5 v5Var, k6 k6Var) {
        int i15;
        this.zzbd = i14;
        this.zzbe = v5Var;
        this.zzbc = k6Var;
        int ordinal = v5Var.ordinal();
        if (ordinal == 1) {
            this.zzbf = k6Var.zza();
        } else if (ordinal != 3) {
            this.zzbf = null;
        } else {
            this.zzbf = k6Var.zza();
        }
        this.zzbg = (v5Var != v5.SCALAR || (i15 = w5.f31684a[k6Var.ordinal()]) == 1 || i15 == 2 || i15 == 3) ? false : true;
    }

    public static u5[] values() {
        return (u5[]) zzbb.clone();
    }

    public final int zza() {
        return this.zzbd;
    }
}
