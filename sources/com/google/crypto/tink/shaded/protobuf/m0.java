package com.google.crypto.tink.shaded.protobuf;

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
public final class m0 {
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 BOOLEAN;
    public static final m0 BYTE_STRING;
    public static final m0 DOUBLE;
    public static final m0 ENUM;
    public static final m0 FLOAT;
    public static final m0 INT;
    public static final m0 LONG;
    public static final m0 MESSAGE;
    public static final m0 STRING;
    public static final m0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        m0 m0Var = new m0("VOID", 0, Void.class, Void.class, null);
        VOID = m0Var;
        Class cls = Integer.TYPE;
        m0 m0Var2 = new m0("INT", 1, cls, Integer.class, 0);
        INT = m0Var2;
        m0 m0Var3 = new m0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = m0Var3;
        m0 m0Var4 = new m0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = m0Var4;
        m0 m0Var5 = new m0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = m0Var5;
        m0 m0Var6 = new m0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = m0Var6;
        m0 m0Var7 = new m0("STRING", 6, String.class, String.class, "");
        STRING = m0Var7;
        m0 m0Var8 = new m0("BYTE_STRING", 7, k.class, k.class, k.f33636b);
        BYTE_STRING = m0Var8;
        m0 m0Var9 = new m0("ENUM", 8, cls, Integer.class, null);
        ENUM = m0Var9;
        m0 m0Var10 = new m0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = m0Var10;
        $VALUES = new m0[]{m0Var, m0Var2, m0Var3, m0Var4, m0Var5, m0Var6, m0Var7, m0Var8, m0Var9, m0Var10};
    }

    private m0(String str, int i13, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
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
