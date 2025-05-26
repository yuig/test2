package com.google.crypto.tink.shaded.protobuf;

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
public final class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z BOOL;
    public static final z BOOL_LIST;
    public static final z BOOL_LIST_PACKED;
    public static final z BYTES;
    public static final z BYTES_LIST;
    public static final z DOUBLE;
    public static final z DOUBLE_LIST;
    public static final z DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final z ENUM;
    public static final z ENUM_LIST;
    public static final z ENUM_LIST_PACKED;
    public static final z FIXED32;
    public static final z FIXED32_LIST;
    public static final z FIXED32_LIST_PACKED;
    public static final z FIXED64;
    public static final z FIXED64_LIST;
    public static final z FIXED64_LIST_PACKED;
    public static final z FLOAT;
    public static final z FLOAT_LIST;
    public static final z FLOAT_LIST_PACKED;
    public static final z GROUP;
    public static final z GROUP_LIST;
    public static final z INT32;
    public static final z INT32_LIST;
    public static final z INT32_LIST_PACKED;
    public static final z INT64;
    public static final z INT64_LIST;
    public static final z INT64_LIST_PACKED;
    public static final z MAP;
    public static final z MESSAGE;
    public static final z MESSAGE_LIST;
    public static final z SFIXED32;
    public static final z SFIXED32_LIST;
    public static final z SFIXED32_LIST_PACKED;
    public static final z SFIXED64;
    public static final z SFIXED64_LIST;
    public static final z SFIXED64_LIST_PACKED;
    public static final z SINT32;
    public static final z SINT32_LIST;
    public static final z SINT32_LIST_PACKED;
    public static final z SINT64;
    public static final z SINT64_LIST;
    public static final z SINT64_LIST_PACKED;
    public static final z STRING;
    public static final z STRING_LIST;
    public static final z UINT32;
    public static final z UINT32_LIST;
    public static final z UINT32_LIST_PACKED;
    public static final z UINT64;
    public static final z UINT64_LIST;
    public static final z UINT64_LIST_PACKED;
    private static final z[] VALUES;
    private final y collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f33715id;
    private final m0 javaType;
    private final boolean primitiveScalar;

    static {
        y yVar = y.SCALAR;
        m0 m0Var = m0.DOUBLE;
        z zVar = new z("DOUBLE", 0, 0, yVar, m0Var);
        DOUBLE = zVar;
        m0 m0Var2 = m0.FLOAT;
        z zVar2 = new z("FLOAT", 1, 1, yVar, m0Var2);
        FLOAT = zVar2;
        m0 m0Var3 = m0.LONG;
        z zVar3 = new z("INT64", 2, 2, yVar, m0Var3);
        INT64 = zVar3;
        z zVar4 = new z("UINT64", 3, 3, yVar, m0Var3);
        UINT64 = zVar4;
        m0 m0Var4 = m0.INT;
        z zVar5 = new z("INT32", 4, 4, yVar, m0Var4);
        INT32 = zVar5;
        z zVar6 = new z("FIXED64", 5, 5, yVar, m0Var3);
        FIXED64 = zVar6;
        z zVar7 = new z("FIXED32", 6, 6, yVar, m0Var4);
        FIXED32 = zVar7;
        m0 m0Var5 = m0.BOOLEAN;
        z zVar8 = new z("BOOL", 7, 7, yVar, m0Var5);
        BOOL = zVar8;
        m0 m0Var6 = m0.STRING;
        z zVar9 = new z("STRING", 8, 8, yVar, m0Var6);
        STRING = zVar9;
        m0 m0Var7 = m0.MESSAGE;
        z zVar10 = new z("MESSAGE", 9, 9, yVar, m0Var7);
        MESSAGE = zVar10;
        m0 m0Var8 = m0.BYTE_STRING;
        z zVar11 = new z("BYTES", 10, 10, yVar, m0Var8);
        BYTES = zVar11;
        z zVar12 = new z("UINT32", 11, 11, yVar, m0Var4);
        UINT32 = zVar12;
        m0 m0Var9 = m0.ENUM;
        z zVar13 = new z("ENUM", 12, 12, yVar, m0Var9);
        ENUM = zVar13;
        z zVar14 = new z("SFIXED32", 13, 13, yVar, m0Var4);
        SFIXED32 = zVar14;
        z zVar15 = new z("SFIXED64", 14, 14, yVar, m0Var3);
        SFIXED64 = zVar15;
        z zVar16 = new z("SINT32", 15, 15, yVar, m0Var4);
        SINT32 = zVar16;
        z zVar17 = new z("SINT64", 16, 16, yVar, m0Var3);
        SINT64 = zVar17;
        z zVar18 = new z("GROUP", 17, 17, yVar, m0Var7);
        GROUP = zVar18;
        y yVar2 = y.VECTOR;
        z zVar19 = new z("DOUBLE_LIST", 18, 18, yVar2, m0Var);
        DOUBLE_LIST = zVar19;
        z zVar20 = new z("FLOAT_LIST", 19, 19, yVar2, m0Var2);
        FLOAT_LIST = zVar20;
        z zVar21 = new z("INT64_LIST", 20, 20, yVar2, m0Var3);
        INT64_LIST = zVar21;
        z zVar22 = new z("UINT64_LIST", 21, 21, yVar2, m0Var3);
        UINT64_LIST = zVar22;
        z zVar23 = new z("INT32_LIST", 22, 22, yVar2, m0Var4);
        INT32_LIST = zVar23;
        z zVar24 = new z("FIXED64_LIST", 23, 23, yVar2, m0Var3);
        FIXED64_LIST = zVar24;
        z zVar25 = new z("FIXED32_LIST", 24, 24, yVar2, m0Var4);
        FIXED32_LIST = zVar25;
        z zVar26 = new z("BOOL_LIST", 25, 25, yVar2, m0Var5);
        BOOL_LIST = zVar26;
        z zVar27 = new z("STRING_LIST", 26, 26, yVar2, m0Var6);
        STRING_LIST = zVar27;
        z zVar28 = new z("MESSAGE_LIST", 27, 27, yVar2, m0Var7);
        MESSAGE_LIST = zVar28;
        z zVar29 = new z("BYTES_LIST", 28, 28, yVar2, m0Var8);
        BYTES_LIST = zVar29;
        z zVar30 = new z("UINT32_LIST", 29, 29, yVar2, m0Var4);
        UINT32_LIST = zVar30;
        z zVar31 = new z("ENUM_LIST", 30, 30, yVar2, m0Var9);
        ENUM_LIST = zVar31;
        z zVar32 = new z("SFIXED32_LIST", 31, 31, yVar2, m0Var4);
        SFIXED32_LIST = zVar32;
        z zVar33 = new z("SFIXED64_LIST", 32, 32, yVar2, m0Var3);
        SFIXED64_LIST = zVar33;
        z zVar34 = new z("SINT32_LIST", 33, 33, yVar2, m0Var4);
        SINT32_LIST = zVar34;
        z zVar35 = new z("SINT64_LIST", 34, 34, yVar2, m0Var3);
        SINT64_LIST = zVar35;
        y yVar3 = y.PACKED_VECTOR;
        z zVar36 = new z("DOUBLE_LIST_PACKED", 35, 35, yVar3, m0Var);
        DOUBLE_LIST_PACKED = zVar36;
        z zVar37 = new z("FLOAT_LIST_PACKED", 36, 36, yVar3, m0Var2);
        FLOAT_LIST_PACKED = zVar37;
        z zVar38 = new z("INT64_LIST_PACKED", 37, 37, yVar3, m0Var3);
        INT64_LIST_PACKED = zVar38;
        z zVar39 = new z("UINT64_LIST_PACKED", 38, 38, yVar3, m0Var3);
        UINT64_LIST_PACKED = zVar39;
        z zVar40 = new z("INT32_LIST_PACKED", 39, 39, yVar3, m0Var4);
        INT32_LIST_PACKED = zVar40;
        z zVar41 = new z("FIXED64_LIST_PACKED", 40, 40, yVar3, m0Var3);
        FIXED64_LIST_PACKED = zVar41;
        z zVar42 = new z("FIXED32_LIST_PACKED", 41, 41, yVar3, m0Var4);
        FIXED32_LIST_PACKED = zVar42;
        z zVar43 = new z("BOOL_LIST_PACKED", 42, 42, yVar3, m0Var5);
        BOOL_LIST_PACKED = zVar43;
        z zVar44 = new z("UINT32_LIST_PACKED", 43, 43, yVar3, m0Var4);
        UINT32_LIST_PACKED = zVar44;
        z zVar45 = new z("ENUM_LIST_PACKED", 44, 44, yVar3, m0Var9);
        ENUM_LIST_PACKED = zVar45;
        z zVar46 = new z("SFIXED32_LIST_PACKED", 45, 45, yVar3, m0Var4);
        SFIXED32_LIST_PACKED = zVar46;
        z zVar47 = new z("SFIXED64_LIST_PACKED", 46, 46, yVar3, m0Var3);
        SFIXED64_LIST_PACKED = zVar47;
        z zVar48 = new z("SINT32_LIST_PACKED", 47, 47, yVar3, m0Var4);
        SINT32_LIST_PACKED = zVar48;
        z zVar49 = new z("SINT64_LIST_PACKED", 48, 48, yVar3, m0Var3);
        SINT64_LIST_PACKED = zVar49;
        z zVar50 = new z("GROUP_LIST", 49, 49, yVar2, m0Var7);
        GROUP_LIST = zVar50;
        z zVar51 = new z("MAP", 50, 50, y.MAP, m0.VOID);
        MAP = zVar51;
        $VALUES = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10, zVar11, zVar12, zVar13, zVar14, zVar15, zVar16, zVar17, zVar18, zVar19, zVar20, zVar21, zVar22, zVar23, zVar24, zVar25, zVar26, zVar27, zVar28, zVar29, zVar30, zVar31, zVar32, zVar33, zVar34, zVar35, zVar36, zVar37, zVar38, zVar39, zVar40, zVar41, zVar42, zVar43, zVar44, zVar45, zVar46, zVar47, zVar48, zVar49, zVar50, zVar51};
        EMPTY_TYPES = new Type[0];
        z[] values = values();
        VALUES = new z[values.length];
        for (z zVar52 : values) {
            VALUES[zVar52.f33715id] = zVar52;
        }
    }

    private z(String str, int i13, int i14, y yVar, m0 m0Var) {
        int i15;
        this.f33715id = i14;
        this.collection = yVar;
        this.javaType = m0Var;
        int i16 = x.f33710a[yVar.ordinal()];
        if (i16 == 1) {
            this.elementType = m0Var.getBoxedType();
        } else if (i16 != 2) {
            this.elementType = null;
        } else {
            this.elementType = m0Var.getBoxedType();
        }
        this.primitiveScalar = (yVar != y.SCALAR || (i15 = x.f33711b[m0Var.ordinal()]) == 1 || i15 == 2 || i15 == 3) ? false : true;
    }

    public static z forId(int i13) {
        if (i13 < 0) {
            return null;
        }
        z[] zVarArr = VALUES;
        if (i13 >= zVarArr.length) {
            return null;
        }
        return zVarArr[i13];
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

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public m0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f33715id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == y.MAP;
    }

    public boolean isPacked() {
        return y.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == y.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return y.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
