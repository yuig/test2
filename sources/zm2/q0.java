package zm2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class q0 {
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 BOOL;
    public static final q0 BYTES;
    public static final q0 DOUBLE;
    public static final q0 ENUM;
    public static final q0 FIXED32;
    public static final q0 FIXED64;
    public static final q0 FLOAT;
    public static final q0 GROUP;
    public static final q0 INT32;
    public static final q0 INT64;
    public static final q0 MESSAGE;
    public static final q0 SFIXED32;
    public static final q0 SFIXED64;
    public static final q0 SINT32;
    public static final q0 SINT64;
    public static final q0 STRING;
    public static final q0 UINT32;
    public static final q0 UINT64;
    private final r0 javaType;
    private final int wireType;

    static {
        q0 q0Var = new q0("DOUBLE", 0, r0.DOUBLE, 1);
        DOUBLE = q0Var;
        q0 q0Var2 = new q0("FLOAT", 1, r0.FLOAT, 5);
        FLOAT = q0Var2;
        r0 r0Var = r0.LONG;
        final int i13 = 2;
        q0 q0Var3 = new q0("INT64", 2, r0Var, 0);
        INT64 = q0Var3;
        final int i14 = 3;
        q0 q0Var4 = new q0("UINT64", 3, r0Var, 0);
        UINT64 = q0Var4;
        r0 r0Var2 = r0.INT;
        q0 q0Var5 = new q0("INT32", 4, r0Var2, 0);
        INT32 = q0Var5;
        q0 q0Var6 = new q0("FIXED64", 5, r0Var, 1);
        FIXED64 = q0Var6;
        q0 q0Var7 = new q0("FIXED32", 6, r0Var2, 5);
        FIXED32 = q0Var7;
        q0 q0Var8 = new q0("BOOL", 7, r0.BOOLEAN, 0);
        BOOL = q0Var8;
        final int i15 = 8;
        final r0 r0Var3 = r0.STRING;
        final String str = "STRING";
        q0 q0Var9 = new q0(str, i15, r0Var3, i13) { // from class: zm2.m0
            @Override // zm2.q0
            public boolean isPackable() {
                return false;
            }
        };
        STRING = q0Var9;
        final r0 r0Var4 = r0.MESSAGE;
        final String str2 = "GROUP";
        final int i16 = 9;
        q0 q0Var10 = new q0(str2, i16, r0Var4, i14) { // from class: zm2.n0
            @Override // zm2.q0
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = q0Var10;
        final String str3 = "MESSAGE";
        final int i17 = 10;
        final int i18 = 2;
        q0 q0Var11 = new q0(str3, i17, r0Var4, i18) { // from class: zm2.o0
            @Override // zm2.q0
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = q0Var11;
        final int i19 = 11;
        final r0 r0Var5 = r0.BYTE_STRING;
        final String str4 = "BYTES";
        q0 q0Var12 = new q0(str4, i19, r0Var5, i18) { // from class: zm2.p0
            @Override // zm2.q0
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = q0Var12;
        q0 q0Var13 = new q0("UINT32", 12, r0Var2, 0);
        UINT32 = q0Var13;
        q0 q0Var14 = new q0("ENUM", 13, r0.ENUM, 0);
        ENUM = q0Var14;
        q0 q0Var15 = new q0("SFIXED32", 14, r0Var2, 5);
        SFIXED32 = q0Var15;
        q0 q0Var16 = new q0("SFIXED64", 15, r0Var, 1);
        SFIXED64 = q0Var16;
        q0 q0Var17 = new q0("SINT32", 16, r0Var2, 0);
        SINT32 = q0Var17;
        q0 q0Var18 = new q0("SINT64", 17, r0Var, 0);
        SINT64 = q0Var18;
        $VALUES = new q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9, q0Var10, q0Var11, q0Var12, q0Var13, q0Var14, q0Var15, q0Var16, q0Var17, q0Var18};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    public r0 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private q0(String str, int i13, r0 r0Var, int i14) {
        this.javaType = r0Var;
        this.wireType = i14;
    }
}
