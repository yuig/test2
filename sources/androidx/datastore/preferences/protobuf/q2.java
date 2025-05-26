package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
public class q2 {
    private static final /* synthetic */ q2[] $VALUES;
    public static final q2 BOOL;
    public static final q2 BYTES;
    public static final q2 DOUBLE;
    public static final q2 ENUM;
    public static final q2 FIXED32;
    public static final q2 FIXED64;
    public static final q2 FLOAT;
    public static final q2 GROUP;
    public static final q2 INT32;
    public static final q2 INT64;
    public static final q2 MESSAGE;
    public static final q2 SFIXED32;
    public static final q2 SFIXED64;
    public static final q2 SINT32;
    public static final q2 SINT64;
    public static final q2 STRING;
    public static final q2 UINT32;
    public static final q2 UINT64;
    private final r2 javaType;
    private final int wireType;

    static {
        q2 q2Var = new q2("DOUBLE", 0, r2.DOUBLE, 1);
        DOUBLE = q2Var;
        q2 q2Var2 = new q2("FLOAT", 1, r2.FLOAT, 5);
        FLOAT = q2Var2;
        r2 r2Var = r2.LONG;
        final int i13 = 2;
        q2 q2Var3 = new q2("INT64", 2, r2Var, 0);
        INT64 = q2Var3;
        final int i14 = 3;
        q2 q2Var4 = new q2("UINT64", 3, r2Var, 0);
        UINT64 = q2Var4;
        r2 r2Var2 = r2.INT;
        q2 q2Var5 = new q2("INT32", 4, r2Var2, 0);
        INT32 = q2Var5;
        q2 q2Var6 = new q2("FIXED64", 5, r2Var, 1);
        FIXED64 = q2Var6;
        q2 q2Var7 = new q2("FIXED32", 6, r2Var2, 5);
        FIXED32 = q2Var7;
        q2 q2Var8 = new q2("BOOL", 7, r2.BOOLEAN, 0);
        BOOL = q2Var8;
        final int i15 = 8;
        final r2 r2Var3 = r2.STRING;
        final String str = "STRING";
        q2 q2Var9 = new q2(str, i15, r2Var3, i13) { // from class: androidx.datastore.preferences.protobuf.m2
            @Override // androidx.datastore.preferences.protobuf.q2
            public boolean isPackable() {
                return false;
            }
        };
        STRING = q2Var9;
        final r2 r2Var4 = r2.MESSAGE;
        final String str2 = "GROUP";
        final int i16 = 9;
        q2 q2Var10 = new q2(str2, i16, r2Var4, i14) { // from class: androidx.datastore.preferences.protobuf.n2
            @Override // androidx.datastore.preferences.protobuf.q2
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = q2Var10;
        final String str3 = "MESSAGE";
        final int i17 = 10;
        final int i18 = 2;
        q2 q2Var11 = new q2(str3, i17, r2Var4, i18) { // from class: androidx.datastore.preferences.protobuf.o2
            @Override // androidx.datastore.preferences.protobuf.q2
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = q2Var11;
        final int i19 = 11;
        final r2 r2Var5 = r2.BYTE_STRING;
        final String str4 = "BYTES";
        q2 q2Var12 = new q2(str4, i19, r2Var5, i18) { // from class: androidx.datastore.preferences.protobuf.p2
            @Override // androidx.datastore.preferences.protobuf.q2
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = q2Var12;
        q2 q2Var13 = new q2("UINT32", 12, r2Var2, 0);
        UINT32 = q2Var13;
        q2 q2Var14 = new q2("ENUM", 13, r2.ENUM, 0);
        ENUM = q2Var14;
        q2 q2Var15 = new q2("SFIXED32", 14, r2Var2, 5);
        SFIXED32 = q2Var15;
        q2 q2Var16 = new q2("SFIXED64", 15, r2Var, 1);
        SFIXED64 = q2Var16;
        q2 q2Var17 = new q2("SINT32", 16, r2Var2, 0);
        SINT32 = q2Var17;
        q2 q2Var18 = new q2("SINT64", 17, r2Var, 0);
        SINT64 = q2Var18;
        $VALUES = new q2[]{q2Var, q2Var2, q2Var3, q2Var4, q2Var5, q2Var6, q2Var7, q2Var8, q2Var9, q2Var10, q2Var11, q2Var12, q2Var13, q2Var14, q2Var15, q2Var16, q2Var17, q2Var18};
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }

    public r2 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private q2(String str, int i13, r2 r2Var, int i14) {
        this.javaType = r2Var;
        this.wireType = i14;
    }
}
