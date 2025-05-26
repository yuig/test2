package com.google.protobuf;

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
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 BOOL;
    public static final f0 BOOL_LIST;
    public static final f0 BOOL_LIST_PACKED;
    public static final f0 BYTES;
    public static final f0 BYTES_LIST;
    public static final f0 DOUBLE;
    public static final f0 DOUBLE_LIST;
    public static final f0 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final f0 ENUM;
    public static final f0 ENUM_LIST;
    public static final f0 ENUM_LIST_PACKED;
    public static final f0 FIXED32;
    public static final f0 FIXED32_LIST;
    public static final f0 FIXED32_LIST_PACKED;
    public static final f0 FIXED64;
    public static final f0 FIXED64_LIST;
    public static final f0 FIXED64_LIST_PACKED;
    public static final f0 FLOAT;
    public static final f0 FLOAT_LIST;
    public static final f0 FLOAT_LIST_PACKED;
    public static final f0 GROUP;
    public static final f0 GROUP_LIST;
    public static final f0 INT32;
    public static final f0 INT32_LIST;
    public static final f0 INT32_LIST_PACKED;
    public static final f0 INT64;
    public static final f0 INT64_LIST;
    public static final f0 INT64_LIST_PACKED;
    public static final f0 MAP;
    public static final f0 MESSAGE;
    public static final f0 MESSAGE_LIST;
    public static final f0 SFIXED32;
    public static final f0 SFIXED32_LIST;
    public static final f0 SFIXED32_LIST_PACKED;
    public static final f0 SFIXED64;
    public static final f0 SFIXED64_LIST;
    public static final f0 SFIXED64_LIST_PACKED;
    public static final f0 SINT32;
    public static final f0 SINT32_LIST;
    public static final f0 SINT32_LIST_PACKED;
    public static final f0 SINT64;
    public static final f0 SINT64_LIST;
    public static final f0 SINT64_LIST_PACKED;
    public static final f0 STRING;
    public static final f0 STRING_LIST;
    public static final f0 UINT32;
    public static final f0 UINT32_LIST;
    public static final f0 UINT32_LIST_PACKED;
    public static final f0 UINT64;
    public static final f0 UINT64_LIST;
    public static final f0 UINT64_LIST_PACKED;
    private static final f0[] VALUES;
    private final e0 collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f33883id;
    private final x0 javaType;
    private final boolean primitiveScalar;

    static {
        e0 e0Var = e0.SCALAR;
        x0 x0Var = x0.DOUBLE;
        f0 f0Var = new f0("DOUBLE", 0, 0, e0Var, x0Var);
        DOUBLE = f0Var;
        x0 x0Var2 = x0.FLOAT;
        f0 f0Var2 = new f0("FLOAT", 1, 1, e0Var, x0Var2);
        FLOAT = f0Var2;
        x0 x0Var3 = x0.LONG;
        f0 f0Var3 = new f0("INT64", 2, 2, e0Var, x0Var3);
        INT64 = f0Var3;
        f0 f0Var4 = new f0("UINT64", 3, 3, e0Var, x0Var3);
        UINT64 = f0Var4;
        x0 x0Var4 = x0.INT;
        f0 f0Var5 = new f0("INT32", 4, 4, e0Var, x0Var4);
        INT32 = f0Var5;
        f0 f0Var6 = new f0("FIXED64", 5, 5, e0Var, x0Var3);
        FIXED64 = f0Var6;
        f0 f0Var7 = new f0("FIXED32", 6, 6, e0Var, x0Var4);
        FIXED32 = f0Var7;
        x0 x0Var5 = x0.BOOLEAN;
        f0 f0Var8 = new f0("BOOL", 7, 7, e0Var, x0Var5);
        BOOL = f0Var8;
        x0 x0Var6 = x0.STRING;
        f0 f0Var9 = new f0("STRING", 8, 8, e0Var, x0Var6);
        STRING = f0Var9;
        x0 x0Var7 = x0.MESSAGE;
        f0 f0Var10 = new f0("MESSAGE", 9, 9, e0Var, x0Var7);
        MESSAGE = f0Var10;
        x0 x0Var8 = x0.BYTE_STRING;
        f0 f0Var11 = new f0("BYTES", 10, 10, e0Var, x0Var8);
        BYTES = f0Var11;
        f0 f0Var12 = new f0("UINT32", 11, 11, e0Var, x0Var4);
        UINT32 = f0Var12;
        x0 x0Var9 = x0.ENUM;
        f0 f0Var13 = new f0("ENUM", 12, 12, e0Var, x0Var9);
        ENUM = f0Var13;
        f0 f0Var14 = new f0("SFIXED32", 13, 13, e0Var, x0Var4);
        SFIXED32 = f0Var14;
        f0 f0Var15 = new f0("SFIXED64", 14, 14, e0Var, x0Var3);
        SFIXED64 = f0Var15;
        f0 f0Var16 = new f0("SINT32", 15, 15, e0Var, x0Var4);
        SINT32 = f0Var16;
        f0 f0Var17 = new f0("SINT64", 16, 16, e0Var, x0Var3);
        SINT64 = f0Var17;
        f0 f0Var18 = new f0("GROUP", 17, 17, e0Var, x0Var7);
        GROUP = f0Var18;
        e0 e0Var2 = e0.VECTOR;
        f0 f0Var19 = new f0("DOUBLE_LIST", 18, 18, e0Var2, x0Var);
        DOUBLE_LIST = f0Var19;
        f0 f0Var20 = new f0("FLOAT_LIST", 19, 19, e0Var2, x0Var2);
        FLOAT_LIST = f0Var20;
        f0 f0Var21 = new f0("INT64_LIST", 20, 20, e0Var2, x0Var3);
        INT64_LIST = f0Var21;
        f0 f0Var22 = new f0("UINT64_LIST", 21, 21, e0Var2, x0Var3);
        UINT64_LIST = f0Var22;
        f0 f0Var23 = new f0("INT32_LIST", 22, 22, e0Var2, x0Var4);
        INT32_LIST = f0Var23;
        f0 f0Var24 = new f0("FIXED64_LIST", 23, 23, e0Var2, x0Var3);
        FIXED64_LIST = f0Var24;
        f0 f0Var25 = new f0("FIXED32_LIST", 24, 24, e0Var2, x0Var4);
        FIXED32_LIST = f0Var25;
        f0 f0Var26 = new f0("BOOL_LIST", 25, 25, e0Var2, x0Var5);
        BOOL_LIST = f0Var26;
        f0 f0Var27 = new f0("STRING_LIST", 26, 26, e0Var2, x0Var6);
        STRING_LIST = f0Var27;
        f0 f0Var28 = new f0("MESSAGE_LIST", 27, 27, e0Var2, x0Var7);
        MESSAGE_LIST = f0Var28;
        f0 f0Var29 = new f0("BYTES_LIST", 28, 28, e0Var2, x0Var8);
        BYTES_LIST = f0Var29;
        f0 f0Var30 = new f0("UINT32_LIST", 29, 29, e0Var2, x0Var4);
        UINT32_LIST = f0Var30;
        f0 f0Var31 = new f0("ENUM_LIST", 30, 30, e0Var2, x0Var9);
        ENUM_LIST = f0Var31;
        f0 f0Var32 = new f0("SFIXED32_LIST", 31, 31, e0Var2, x0Var4);
        SFIXED32_LIST = f0Var32;
        f0 f0Var33 = new f0("SFIXED64_LIST", 32, 32, e0Var2, x0Var3);
        SFIXED64_LIST = f0Var33;
        f0 f0Var34 = new f0("SINT32_LIST", 33, 33, e0Var2, x0Var4);
        SINT32_LIST = f0Var34;
        f0 f0Var35 = new f0("SINT64_LIST", 34, 34, e0Var2, x0Var3);
        SINT64_LIST = f0Var35;
        e0 e0Var3 = e0.PACKED_VECTOR;
        f0 f0Var36 = new f0("DOUBLE_LIST_PACKED", 35, 35, e0Var3, x0Var);
        DOUBLE_LIST_PACKED = f0Var36;
        f0 f0Var37 = new f0("FLOAT_LIST_PACKED", 36, 36, e0Var3, x0Var2);
        FLOAT_LIST_PACKED = f0Var37;
        f0 f0Var38 = new f0("INT64_LIST_PACKED", 37, 37, e0Var3, x0Var3);
        INT64_LIST_PACKED = f0Var38;
        f0 f0Var39 = new f0("UINT64_LIST_PACKED", 38, 38, e0Var3, x0Var3);
        UINT64_LIST_PACKED = f0Var39;
        f0 f0Var40 = new f0("INT32_LIST_PACKED", 39, 39, e0Var3, x0Var4);
        INT32_LIST_PACKED = f0Var40;
        f0 f0Var41 = new f0("FIXED64_LIST_PACKED", 40, 40, e0Var3, x0Var3);
        FIXED64_LIST_PACKED = f0Var41;
        f0 f0Var42 = new f0("FIXED32_LIST_PACKED", 41, 41, e0Var3, x0Var4);
        FIXED32_LIST_PACKED = f0Var42;
        f0 f0Var43 = new f0("BOOL_LIST_PACKED", 42, 42, e0Var3, x0Var5);
        BOOL_LIST_PACKED = f0Var43;
        f0 f0Var44 = new f0("UINT32_LIST_PACKED", 43, 43, e0Var3, x0Var4);
        UINT32_LIST_PACKED = f0Var44;
        f0 f0Var45 = new f0("ENUM_LIST_PACKED", 44, 44, e0Var3, x0Var9);
        ENUM_LIST_PACKED = f0Var45;
        f0 f0Var46 = new f0("SFIXED32_LIST_PACKED", 45, 45, e0Var3, x0Var4);
        SFIXED32_LIST_PACKED = f0Var46;
        f0 f0Var47 = new f0("SFIXED64_LIST_PACKED", 46, 46, e0Var3, x0Var3);
        SFIXED64_LIST_PACKED = f0Var47;
        f0 f0Var48 = new f0("SINT32_LIST_PACKED", 47, 47, e0Var3, x0Var4);
        SINT32_LIST_PACKED = f0Var48;
        f0 f0Var49 = new f0("SINT64_LIST_PACKED", 48, 48, e0Var3, x0Var3);
        SINT64_LIST_PACKED = f0Var49;
        f0 f0Var50 = new f0("GROUP_LIST", 49, 49, e0Var2, x0Var7);
        GROUP_LIST = f0Var50;
        f0 f0Var51 = new f0("MAP", 50, 50, e0.MAP, x0.VOID);
        MAP = f0Var51;
        $VALUES = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10, f0Var11, f0Var12, f0Var13, f0Var14, f0Var15, f0Var16, f0Var17, f0Var18, f0Var19, f0Var20, f0Var21, f0Var22, f0Var23, f0Var24, f0Var25, f0Var26, f0Var27, f0Var28, f0Var29, f0Var30, f0Var31, f0Var32, f0Var33, f0Var34, f0Var35, f0Var36, f0Var37, f0Var38, f0Var39, f0Var40, f0Var41, f0Var42, f0Var43, f0Var44, f0Var45, f0Var46, f0Var47, f0Var48, f0Var49, f0Var50, f0Var51};
        EMPTY_TYPES = new Type[0];
        f0[] values = values();
        VALUES = new f0[values.length];
        for (f0 f0Var52 : values) {
            VALUES[f0Var52.f33883id] = f0Var52;
        }
    }

    private f0(String str, int i13, int i14, e0 e0Var, x0 x0Var) {
        int i15;
        this.f33883id = i14;
        this.collection = e0Var;
        this.javaType = x0Var;
        int i16 = d0.f33868a[e0Var.ordinal()];
        if (i16 == 1) {
            this.elementType = x0Var.getBoxedType();
        } else if (i16 != 2) {
            this.elementType = null;
        } else {
            this.elementType = x0Var.getBoxedType();
        }
        this.primitiveScalar = (e0Var != e0.SCALAR || (i15 = d0.f33869b[x0Var.ordinal()]) == 1 || i15 == 2 || i15 == 3) ? false : true;
    }

    public static f0 forId(int i13) {
        if (i13 < 0) {
            return null;
        }
        f0[] f0VarArr = VALUES;
        if (i13 >= f0VarArr.length) {
            return null;
        }
        return f0VarArr[i13];
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

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    public x0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f33883id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == e0.MAP;
    }

    public boolean isPacked() {
        return e0.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == e0.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return e0.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
