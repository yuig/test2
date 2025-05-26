package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 BOOL;
    public static final a0 BOOL_LIST;
    public static final a0 BOOL_LIST_PACKED;
    public static final a0 BYTES;
    public static final a0 BYTES_LIST;
    public static final a0 DOUBLE;
    public static final a0 DOUBLE_LIST;
    public static final a0 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final a0 ENUM;
    public static final a0 ENUM_LIST;
    public static final a0 ENUM_LIST_PACKED;
    public static final a0 FIXED32;
    public static final a0 FIXED32_LIST;
    public static final a0 FIXED32_LIST_PACKED;
    public static final a0 FIXED64;
    public static final a0 FIXED64_LIST;
    public static final a0 FIXED64_LIST_PACKED;
    public static final a0 FLOAT;
    public static final a0 FLOAT_LIST;
    public static final a0 FLOAT_LIST_PACKED;
    public static final a0 GROUP;
    public static final a0 GROUP_LIST;
    public static final a0 INT32;
    public static final a0 INT32_LIST;
    public static final a0 INT32_LIST_PACKED;
    public static final a0 INT64;
    public static final a0 INT64_LIST;
    public static final a0 INT64_LIST_PACKED;
    public static final a0 MAP;
    public static final a0 MESSAGE;
    public static final a0 MESSAGE_LIST;
    public static final a0 SFIXED32;
    public static final a0 SFIXED32_LIST;
    public static final a0 SFIXED32_LIST_PACKED;
    public static final a0 SFIXED64;
    public static final a0 SFIXED64_LIST;
    public static final a0 SFIXED64_LIST_PACKED;
    public static final a0 SINT32;
    public static final a0 SINT32_LIST;
    public static final a0 SINT32_LIST_PACKED;
    public static final a0 SINT64;
    public static final a0 SINT64_LIST;
    public static final a0 SINT64_LIST_PACKED;
    public static final a0 STRING;
    public static final a0 STRING_LIST;
    public static final a0 UINT32;
    public static final a0 UINT32_LIST;
    public static final a0 UINT32_LIST_PACKED;
    public static final a0 UINT64;
    public static final a0 UINT64_LIST;
    public static final a0 UINT64_LIST_PACKED;
    private static final a0[] VALUES;
    private final z collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f18030id;
    private final k0 javaType;
    private final boolean primitiveScalar;

    static {
        z zVar = z.SCALAR;
        k0 k0Var = k0.DOUBLE;
        a0 a0Var = new a0("DOUBLE", 0, 0, zVar, k0Var);
        DOUBLE = a0Var;
        k0 k0Var2 = k0.FLOAT;
        a0 a0Var2 = new a0("FLOAT", 1, 1, zVar, k0Var2);
        FLOAT = a0Var2;
        k0 k0Var3 = k0.LONG;
        a0 a0Var3 = new a0("INT64", 2, 2, zVar, k0Var3);
        INT64 = a0Var3;
        a0 a0Var4 = new a0("UINT64", 3, 3, zVar, k0Var3);
        UINT64 = a0Var4;
        k0 k0Var4 = k0.INT;
        a0 a0Var5 = new a0("INT32", 4, 4, zVar, k0Var4);
        INT32 = a0Var5;
        a0 a0Var6 = new a0("FIXED64", 5, 5, zVar, k0Var3);
        FIXED64 = a0Var6;
        a0 a0Var7 = new a0("FIXED32", 6, 6, zVar, k0Var4);
        FIXED32 = a0Var7;
        k0 k0Var5 = k0.BOOLEAN;
        a0 a0Var8 = new a0("BOOL", 7, 7, zVar, k0Var5);
        BOOL = a0Var8;
        k0 k0Var6 = k0.STRING;
        a0 a0Var9 = new a0("STRING", 8, 8, zVar, k0Var6);
        STRING = a0Var9;
        k0 k0Var7 = k0.MESSAGE;
        a0 a0Var10 = new a0("MESSAGE", 9, 9, zVar, k0Var7);
        MESSAGE = a0Var10;
        k0 k0Var8 = k0.BYTE_STRING;
        a0 a0Var11 = new a0("BYTES", 10, 10, zVar, k0Var8);
        BYTES = a0Var11;
        a0 a0Var12 = new a0("UINT32", 11, 11, zVar, k0Var4);
        UINT32 = a0Var12;
        k0 k0Var9 = k0.ENUM;
        a0 a0Var13 = new a0("ENUM", 12, 12, zVar, k0Var9);
        ENUM = a0Var13;
        a0 a0Var14 = new a0("SFIXED32", 13, 13, zVar, k0Var4);
        SFIXED32 = a0Var14;
        a0 a0Var15 = new a0("SFIXED64", 14, 14, zVar, k0Var3);
        SFIXED64 = a0Var15;
        a0 a0Var16 = new a0("SINT32", 15, 15, zVar, k0Var4);
        SINT32 = a0Var16;
        a0 a0Var17 = new a0("SINT64", 16, 16, zVar, k0Var3);
        SINT64 = a0Var17;
        a0 a0Var18 = new a0("GROUP", 17, 17, zVar, k0Var7);
        GROUP = a0Var18;
        z zVar2 = z.VECTOR;
        a0 a0Var19 = new a0("DOUBLE_LIST", 18, 18, zVar2, k0Var);
        DOUBLE_LIST = a0Var19;
        a0 a0Var20 = new a0("FLOAT_LIST", 19, 19, zVar2, k0Var2);
        FLOAT_LIST = a0Var20;
        a0 a0Var21 = new a0("INT64_LIST", 20, 20, zVar2, k0Var3);
        INT64_LIST = a0Var21;
        a0 a0Var22 = new a0("UINT64_LIST", 21, 21, zVar2, k0Var3);
        UINT64_LIST = a0Var22;
        a0 a0Var23 = new a0("INT32_LIST", 22, 22, zVar2, k0Var4);
        INT32_LIST = a0Var23;
        a0 a0Var24 = new a0("FIXED64_LIST", 23, 23, zVar2, k0Var3);
        FIXED64_LIST = a0Var24;
        a0 a0Var25 = new a0("FIXED32_LIST", 24, 24, zVar2, k0Var4);
        FIXED32_LIST = a0Var25;
        a0 a0Var26 = new a0("BOOL_LIST", 25, 25, zVar2, k0Var5);
        BOOL_LIST = a0Var26;
        a0 a0Var27 = new a0("STRING_LIST", 26, 26, zVar2, k0Var6);
        STRING_LIST = a0Var27;
        a0 a0Var28 = new a0("MESSAGE_LIST", 27, 27, zVar2, k0Var7);
        MESSAGE_LIST = a0Var28;
        a0 a0Var29 = new a0("BYTES_LIST", 28, 28, zVar2, k0Var8);
        BYTES_LIST = a0Var29;
        a0 a0Var30 = new a0("UINT32_LIST", 29, 29, zVar2, k0Var4);
        UINT32_LIST = a0Var30;
        a0 a0Var31 = new a0("ENUM_LIST", 30, 30, zVar2, k0Var9);
        ENUM_LIST = a0Var31;
        a0 a0Var32 = new a0("SFIXED32_LIST", 31, 31, zVar2, k0Var4);
        SFIXED32_LIST = a0Var32;
        a0 a0Var33 = new a0("SFIXED64_LIST", 32, 32, zVar2, k0Var3);
        SFIXED64_LIST = a0Var33;
        a0 a0Var34 = new a0("SINT32_LIST", 33, 33, zVar2, k0Var4);
        SINT32_LIST = a0Var34;
        a0 a0Var35 = new a0("SINT64_LIST", 34, 34, zVar2, k0Var3);
        SINT64_LIST = a0Var35;
        z zVar3 = z.PACKED_VECTOR;
        a0 a0Var36 = new a0("DOUBLE_LIST_PACKED", 35, 35, zVar3, k0Var);
        DOUBLE_LIST_PACKED = a0Var36;
        a0 a0Var37 = new a0("FLOAT_LIST_PACKED", 36, 36, zVar3, k0Var2);
        FLOAT_LIST_PACKED = a0Var37;
        a0 a0Var38 = new a0("INT64_LIST_PACKED", 37, 37, zVar3, k0Var3);
        INT64_LIST_PACKED = a0Var38;
        a0 a0Var39 = new a0("UINT64_LIST_PACKED", 38, 38, zVar3, k0Var3);
        UINT64_LIST_PACKED = a0Var39;
        a0 a0Var40 = new a0("INT32_LIST_PACKED", 39, 39, zVar3, k0Var4);
        INT32_LIST_PACKED = a0Var40;
        a0 a0Var41 = new a0("FIXED64_LIST_PACKED", 40, 40, zVar3, k0Var3);
        FIXED64_LIST_PACKED = a0Var41;
        a0 a0Var42 = new a0("FIXED32_LIST_PACKED", 41, 41, zVar3, k0Var4);
        FIXED32_LIST_PACKED = a0Var42;
        a0 a0Var43 = new a0("BOOL_LIST_PACKED", 42, 42, zVar3, k0Var5);
        BOOL_LIST_PACKED = a0Var43;
        a0 a0Var44 = new a0("UINT32_LIST_PACKED", 43, 43, zVar3, k0Var4);
        UINT32_LIST_PACKED = a0Var44;
        a0 a0Var45 = new a0("ENUM_LIST_PACKED", 44, 44, zVar3, k0Var9);
        ENUM_LIST_PACKED = a0Var45;
        a0 a0Var46 = new a0("SFIXED32_LIST_PACKED", 45, 45, zVar3, k0Var4);
        SFIXED32_LIST_PACKED = a0Var46;
        a0 a0Var47 = new a0("SFIXED64_LIST_PACKED", 46, 46, zVar3, k0Var3);
        SFIXED64_LIST_PACKED = a0Var47;
        a0 a0Var48 = new a0("SINT32_LIST_PACKED", 47, 47, zVar3, k0Var4);
        SINT32_LIST_PACKED = a0Var48;
        a0 a0Var49 = new a0("SINT64_LIST_PACKED", 48, 48, zVar3, k0Var3);
        SINT64_LIST_PACKED = a0Var49;
        a0 a0Var50 = new a0("GROUP_LIST", 49, 49, zVar2, k0Var7);
        GROUP_LIST = a0Var50;
        a0 a0Var51 = new a0("MAP", 50, 50, z.MAP, k0.VOID);
        MAP = a0Var51;
        $VALUES = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9, a0Var10, a0Var11, a0Var12, a0Var13, a0Var14, a0Var15, a0Var16, a0Var17, a0Var18, a0Var19, a0Var20, a0Var21, a0Var22, a0Var23, a0Var24, a0Var25, a0Var26, a0Var27, a0Var28, a0Var29, a0Var30, a0Var31, a0Var32, a0Var33, a0Var34, a0Var35, a0Var36, a0Var37, a0Var38, a0Var39, a0Var40, a0Var41, a0Var42, a0Var43, a0Var44, a0Var45, a0Var46, a0Var47, a0Var48, a0Var49, a0Var50, a0Var51};
        EMPTY_TYPES = new Type[0];
        a0[] values = values();
        VALUES = new a0[values.length];
        for (a0 a0Var52 : values) {
            VALUES[a0Var52.f18030id] = a0Var52;
        }
    }

    private a0(String str, int i13, int i14, z zVar, k0 k0Var) {
        int i15;
        this.f18030id = i14;
        this.collection = zVar;
        this.javaType = k0Var;
        int i16 = y.f18171a[zVar.ordinal()];
        if (i16 == 1) {
            this.elementType = k0Var.getBoxedType();
        } else if (i16 != 2) {
            this.elementType = null;
        } else {
            this.elementType = k0Var.getBoxedType();
        }
        this.primitiveScalar = (zVar != z.SCALAR || (i15 = y.f18172b[k0Var.ordinal()]) == 1 || i15 == 2 || i15 == 3) ? false : true;
    }

    public static a0 forId(int i13) {
        if (i13 < 0) {
            return null;
        }
        a0[] a0VarArr = VALUES;
        if (i13 >= a0VarArr.length) {
            return null;
        }
        return a0VarArr[i13];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i13 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i13 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i13];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i13++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i14 = 0; i14 < actualTypeArguments.length; i14++) {
                    Type type = actualTypeArguments[i14];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i15 = 0; i15 < typeParameters.length; i15++) {
                            if (type == typeParameters[i15]) {
                                actualTypeArguments[i14] = typeArr[i15];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public k0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f18030id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == z.MAP;
    }

    public boolean isPacked() {
        return z.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == z.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return z.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
