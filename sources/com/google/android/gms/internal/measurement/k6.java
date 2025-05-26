package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class k6 {
    public static final k6 zza;
    public static final k6 zzb;
    public static final k6 zzc;
    public static final k6 zzd;
    public static final k6 zze;
    public static final k6 zzf;
    public static final k6 zzg;
    public static final k6 zzh;
    public static final k6 zzi;
    public static final k6 zzj;
    private static final /* synthetic */ k6[] zzk;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        k6 k6Var = new k6("VOID", 0, Void.class, Void.class, null);
        zza = k6Var;
        Class cls = Integer.TYPE;
        k6 k6Var2 = new k6("INT", 1, cls, Integer.class, 0);
        zzb = k6Var2;
        k6 k6Var3 = new k6("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = k6Var3;
        k6 k6Var4 = new k6("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = k6Var4;
        k6 k6Var5 = new k6("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = k6Var5;
        k6 k6Var6 = new k6("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = k6Var6;
        k6 k6Var7 = new k6("STRING", 6, String.class, String.class, "");
        zzg = k6Var7;
        k6 k6Var8 = new k6("BYTE_STRING", 7, o5.class, o5.class, o5.f31566b);
        zzh = k6Var8;
        k6 k6Var9 = new k6("ENUM", 8, cls, Integer.class, null);
        zzi = k6Var9;
        k6 k6Var10 = new k6("MESSAGE", 9, Object.class, Object.class, null);
        zzj = k6Var10;
        zzk = new k6[]{k6Var, k6Var2, k6Var3, k6Var4, k6Var5, k6Var6, k6Var7, k6Var8, k6Var9, k6Var10};
    }

    private k6(String str, int i13, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static k6[] values() {
        return (k6[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzm;
    }
}
