package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class x0 {
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 BOOLEAN;
    public static final x0 BYTE_STRING;
    public static final x0 DOUBLE;
    public static final x0 ENUM;
    public static final x0 FLOAT;
    public static final x0 INT;
    public static final x0 LONG;
    public static final x0 MESSAGE;
    public static final x0 STRING;
    public static final x0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        x0 x0Var = new x0("VOID", 0, Void.class, Void.class, null);
        VOID = x0Var;
        Class cls = Integer.TYPE;
        x0 x0Var2 = new x0("INT", 1, cls, Integer.class, 0);
        INT = x0Var2;
        x0 x0Var3 = new x0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = x0Var3;
        x0 x0Var4 = new x0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = x0Var4;
        x0 x0Var5 = new x0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = x0Var5;
        x0 x0Var6 = new x0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = x0Var6;
        x0 x0Var7 = new x0("STRING", 6, String.class, String.class, "");
        STRING = x0Var7;
        x0 x0Var8 = new x0("BYTE_STRING", 7, l.class, l.class, l.f33922b);
        BYTE_STRING = x0Var8;
        x0 x0Var9 = new x0("ENUM", 8, cls, Integer.class, null);
        ENUM = x0Var9;
        x0 x0Var10 = new x0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = x0Var10;
        $VALUES = new x0[]{x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8, x0Var9, x0Var10};
    }

    private x0(String str, int i13, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
