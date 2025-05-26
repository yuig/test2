package androidx.datastore.preferences.protobuf;

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
public final class k0 {
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 BOOLEAN;
    public static final k0 BYTE_STRING;
    public static final k0 DOUBLE;
    public static final k0 ENUM;
    public static final k0 FLOAT;
    public static final k0 INT;
    public static final k0 LONG;
    public static final k0 MESSAGE;
    public static final k0 STRING;
    public static final k0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        k0 k0Var = new k0("VOID", 0, Void.class, Void.class, null);
        VOID = k0Var;
        Class cls = Integer.TYPE;
        k0 k0Var2 = new k0("INT", 1, cls, Integer.class, 0);
        INT = k0Var2;
        k0 k0Var3 = new k0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = k0Var3;
        k0 k0Var4 = new k0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = k0Var4;
        k0 k0Var5 = new k0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = k0Var5;
        k0 k0Var6 = new k0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = k0Var6;
        k0 k0Var7 = new k0("STRING", 6, String.class, String.class, "");
        STRING = k0Var7;
        k0 k0Var8 = new k0("BYTE_STRING", 7, i.class, i.class, i.f18075b);
        BYTE_STRING = k0Var8;
        k0 k0Var9 = new k0("ENUM", 8, cls, Integer.class, null);
        ENUM = k0Var9;
        k0 k0Var10 = new k0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = k0Var10;
        $VALUES = new k0[]{k0Var, k0Var2, k0Var3, k0Var4, k0Var5, k0Var6, k0Var7, k0Var8, k0Var9, k0Var10};
    }

    private k0(String str, int i13, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
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
