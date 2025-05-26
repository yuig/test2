package com.google.protobuf;

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
public class z2 {
    private static final /* synthetic */ z2[] $VALUES;
    public static final z2 BOOL;
    public static final z2 BYTES;
    public static final z2 DOUBLE;
    public static final z2 ENUM;
    public static final z2 FIXED32;
    public static final z2 FIXED64;
    public static final z2 FLOAT;
    public static final z2 GROUP;
    public static final z2 INT32;
    public static final z2 INT64;
    public static final z2 MESSAGE;
    public static final z2 SFIXED32;
    public static final z2 SFIXED64;
    public static final z2 SINT32;
    public static final z2 SINT64;
    public static final z2 STRING;
    public static final z2 UINT32;
    public static final z2 UINT64;
    private final a3 javaType;
    private final int wireType;

    static {
        z2 z2Var = new z2("DOUBLE", 0, a3.DOUBLE, 1);
        DOUBLE = z2Var;
        z2 z2Var2 = new z2("FLOAT", 1, a3.FLOAT, 5);
        FLOAT = z2Var2;
        a3 a3Var = a3.LONG;
        final int i13 = 2;
        z2 z2Var3 = new z2("INT64", 2, a3Var, 0);
        INT64 = z2Var3;
        final int i14 = 3;
        z2 z2Var4 = new z2("UINT64", 3, a3Var, 0);
        UINT64 = z2Var4;
        a3 a3Var2 = a3.INT;
        z2 z2Var5 = new z2("INT32", 4, a3Var2, 0);
        INT32 = z2Var5;
        z2 z2Var6 = new z2("FIXED64", 5, a3Var, 1);
        FIXED64 = z2Var6;
        z2 z2Var7 = new z2("FIXED32", 6, a3Var2, 5);
        FIXED32 = z2Var7;
        z2 z2Var8 = new z2("BOOL", 7, a3.BOOLEAN, 0);
        BOOL = z2Var8;
        final int i15 = 8;
        final a3 a3Var3 = a3.STRING;
        final String str = "STRING";
        z2 z2Var9 = new z2(str, i15, a3Var3, i13) { // from class: com.google.protobuf.v2
            @Override // com.google.protobuf.z2
            public boolean isPackable() {
                return false;
            }
        };
        STRING = z2Var9;
        final a3 a3Var4 = a3.MESSAGE;
        final String str2 = "GROUP";
        final int i16 = 9;
        z2 z2Var10 = new z2(str2, i16, a3Var4, i14) { // from class: com.google.protobuf.w2
            @Override // com.google.protobuf.z2
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = z2Var10;
        final String str3 = "MESSAGE";
        final int i17 = 10;
        final int i18 = 2;
        z2 z2Var11 = new z2(str3, i17, a3Var4, i18) { // from class: com.google.protobuf.x2
            @Override // com.google.protobuf.z2
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = z2Var11;
        final int i19 = 11;
        final a3 a3Var5 = a3.BYTE_STRING;
        final String str4 = "BYTES";
        z2 z2Var12 = new z2(str4, i19, a3Var5, i18) { // from class: com.google.protobuf.y2
            @Override // com.google.protobuf.z2
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = z2Var12;
        z2 z2Var13 = new z2("UINT32", 12, a3Var2, 0);
        UINT32 = z2Var13;
        z2 z2Var14 = new z2("ENUM", 13, a3.ENUM, 0);
        ENUM = z2Var14;
        z2 z2Var15 = new z2("SFIXED32", 14, a3Var2, 5);
        SFIXED32 = z2Var15;
        z2 z2Var16 = new z2("SFIXED64", 15, a3Var, 1);
        SFIXED64 = z2Var16;
        z2 z2Var17 = new z2("SINT32", 16, a3Var2, 0);
        SINT32 = z2Var17;
        z2 z2Var18 = new z2("SINT64", 17, a3Var, 0);
        SINT64 = z2Var18;
        $VALUES = new z2[]{z2Var, z2Var2, z2Var3, z2Var4, z2Var5, z2Var6, z2Var7, z2Var8, z2Var9, z2Var10, z2Var11, z2Var12, z2Var13, z2Var14, z2Var15, z2Var16, z2Var17, z2Var18};
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) $VALUES.clone();
    }

    public a3 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private z2(String str, int i13, a3 a3Var, int i14) {
        this.javaType = a3Var;
        this.wireType = i14;
    }
}
