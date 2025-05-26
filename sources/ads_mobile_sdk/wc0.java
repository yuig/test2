package ads_mobile_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class wc0 {

    /* renamed from: b, reason: collision with root package name */
    public static final wc0 f12979b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc0 f12980c;

    /* renamed from: d, reason: collision with root package name */
    public static final wc0[] f12981d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wc0[] f12982e;

    /* renamed from: a, reason: collision with root package name */
    public final int f12983a;

    /* JADX INFO: Fake field, exist only in values array */
    wc0 EF0;

    static {
        m21 m21Var = m21.DOUBLE;
        wc0 wc0Var = new wc0("DOUBLE", 0, 0, 1, m21Var);
        m21 m21Var2 = m21.FLOAT;
        wc0 wc0Var2 = new wc0("FLOAT", 1, 1, 1, m21Var2);
        m21 m21Var3 = m21.LONG;
        wc0 wc0Var3 = new wc0("INT64", 2, 2, 1, m21Var3);
        wc0 wc0Var4 = new wc0("UINT64", 3, 3, 1, m21Var3);
        m21 m21Var4 = m21.INT;
        wc0 wc0Var5 = new wc0("INT32", 4, 4, 1, m21Var4);
        wc0 wc0Var6 = new wc0("FIXED64", 5, 5, 1, m21Var3);
        wc0 wc0Var7 = new wc0("FIXED32", 6, 6, 1, m21Var4);
        m21 m21Var5 = m21.BOOLEAN;
        wc0 wc0Var8 = new wc0("BOOL", 7, 7, 1, m21Var5);
        m21 m21Var6 = m21.STRING;
        wc0 wc0Var9 = new wc0("STRING", 8, 8, 1, m21Var6);
        m21 m21Var7 = m21.MESSAGE;
        wc0 wc0Var10 = new wc0("MESSAGE", 9, 9, 1, m21Var7);
        m21 m21Var8 = m21.BYTE_STRING;
        wc0 wc0Var11 = new wc0("BYTES", 10, 10, 1, m21Var8);
        wc0 wc0Var12 = new wc0("UINT32", 11, 11, 1, m21Var4);
        m21 m21Var9 = m21.ENUM;
        wc0 wc0Var13 = new wc0("ENUM", 12, 12, 1, m21Var9);
        wc0 wc0Var14 = new wc0("SFIXED32", 13, 13, 1, m21Var4);
        wc0 wc0Var15 = new wc0("SFIXED64", 14, 14, 1, m21Var3);
        wc0 wc0Var16 = new wc0("SINT32", 15, 15, 1, m21Var4);
        wc0 wc0Var17 = new wc0("SINT64", 16, 16, 1, m21Var3);
        wc0 wc0Var18 = new wc0("GROUP", 17, 17, 1, m21Var7);
        wc0 wc0Var19 = new wc0("DOUBLE_LIST", 18, 18, 2, m21Var);
        wc0 wc0Var20 = new wc0("FLOAT_LIST", 19, 19, 2, m21Var2);
        wc0 wc0Var21 = new wc0("INT64_LIST", 20, 20, 2, m21Var3);
        wc0 wc0Var22 = new wc0("UINT64_LIST", 21, 21, 2, m21Var3);
        wc0 wc0Var23 = new wc0("INT32_LIST", 22, 22, 2, m21Var4);
        wc0 wc0Var24 = new wc0("FIXED64_LIST", 23, 23, 2, m21Var3);
        wc0 wc0Var25 = new wc0("FIXED32_LIST", 24, 24, 2, m21Var4);
        wc0 wc0Var26 = new wc0("BOOL_LIST", 25, 25, 2, m21Var5);
        wc0 wc0Var27 = new wc0("STRING_LIST", 26, 26, 2, m21Var6);
        wc0 wc0Var28 = new wc0("MESSAGE_LIST", 27, 27, 2, m21Var7);
        wc0 wc0Var29 = new wc0("BYTES_LIST", 28, 28, 2, m21Var8);
        wc0 wc0Var30 = new wc0("UINT32_LIST", 29, 29, 2, m21Var4);
        wc0 wc0Var31 = new wc0("ENUM_LIST", 30, 30, 2, m21Var9);
        wc0 wc0Var32 = new wc0("SFIXED32_LIST", 31, 31, 2, m21Var4);
        wc0 wc0Var33 = new wc0("SFIXED64_LIST", 32, 32, 2, m21Var3);
        wc0 wc0Var34 = new wc0("SINT32_LIST", 33, 33, 2, m21Var4);
        wc0 wc0Var35 = new wc0("SINT64_LIST", 34, 34, 2, m21Var3);
        wc0 wc0Var36 = new wc0("DOUBLE_LIST_PACKED", 35, 35, 3, m21Var);
        f12979b = wc0Var36;
        wc0 wc0Var37 = new wc0("FLOAT_LIST_PACKED", 36, 36, 3, m21Var2);
        wc0 wc0Var38 = new wc0("INT64_LIST_PACKED", 37, 37, 3, m21Var3);
        wc0 wc0Var39 = new wc0("UINT64_LIST_PACKED", 38, 38, 3, m21Var3);
        wc0 wc0Var40 = new wc0("INT32_LIST_PACKED", 39, 39, 3, m21Var4);
        wc0 wc0Var41 = new wc0("FIXED64_LIST_PACKED", 40, 40, 3, m21Var3);
        wc0 wc0Var42 = new wc0("FIXED32_LIST_PACKED", 41, 41, 3, m21Var4);
        wc0 wc0Var43 = new wc0("BOOL_LIST_PACKED", 42, 42, 3, m21Var5);
        wc0 wc0Var44 = new wc0("UINT32_LIST_PACKED", 43, 43, 3, m21Var4);
        wc0 wc0Var45 = new wc0("ENUM_LIST_PACKED", 44, 44, 3, m21Var9);
        wc0 wc0Var46 = new wc0("SFIXED32_LIST_PACKED", 45, 45, 3, m21Var4);
        wc0 wc0Var47 = new wc0("SFIXED64_LIST_PACKED", 46, 46, 3, m21Var3);
        wc0 wc0Var48 = new wc0("SINT32_LIST_PACKED", 47, 47, 3, m21Var4);
        wc0 wc0Var49 = new wc0("SINT64_LIST_PACKED", 48, 48, 3, m21Var3);
        f12980c = wc0Var49;
        f12982e = new wc0[]{wc0Var, wc0Var2, wc0Var3, wc0Var4, wc0Var5, wc0Var6, wc0Var7, wc0Var8, wc0Var9, wc0Var10, wc0Var11, wc0Var12, wc0Var13, wc0Var14, wc0Var15, wc0Var16, wc0Var17, wc0Var18, wc0Var19, wc0Var20, wc0Var21, wc0Var22, wc0Var23, wc0Var24, wc0Var25, wc0Var26, wc0Var27, wc0Var28, wc0Var29, wc0Var30, wc0Var31, wc0Var32, wc0Var33, wc0Var34, wc0Var35, wc0Var36, wc0Var37, wc0Var38, wc0Var39, wc0Var40, wc0Var41, wc0Var42, wc0Var43, wc0Var44, wc0Var45, wc0Var46, wc0Var47, wc0Var48, wc0Var49, new wc0("GROUP_LIST", 49, 49, 2, m21Var7), new wc0("MAP", 50, 50, 4, m21.VOID)};
        wc0[] values = values();
        f12981d = new wc0[values.length];
        for (wc0 wc0Var50 : values) {
            f12981d[wc0Var50.f12983a] = wc0Var50;
        }
    }

    public wc0(String str, int i13, int i14, int i15, m21 m21Var) {
        this.f12983a = i14;
        int c13 = a.bb.c(i15);
        if (c13 == 1) {
            m21Var.getClass();
        } else if (c13 == 3) {
            m21Var.getClass();
        }
        if (i15 == 1) {
            m21Var.ordinal();
        }
    }

    public static wc0[] values() {
        return (wc0[]) f12982e.clone();
    }

    public final int a() {
        return this.f12983a;
    }
}
