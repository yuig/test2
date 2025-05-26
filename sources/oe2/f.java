package oe2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94323a;

    public /* synthetic */ f(int i13) {
        this.f94323a = i13;
    }

    public static void b(Type type, Class cls) {
        Class<?> D = kg.a.D(type);
        if (cls.isAssignableFrom(D)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + D.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override // oe2.q
    public final r a(Type type, Set set, h0 h0Var) {
        kh2.w hVar;
        p pVar;
        Class D;
        Type[] actualTypeArguments;
        r rVar;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type type2 = type;
        int i13 = 0;
        int i14 = 1;
        Class<?> cls = null;
        switch (this.f94323a) {
            case 0:
                Type genericComponentType = type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : type2 instanceof Class ? ((Class) type2).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new g(kg.a.D(genericComponentType), h0Var.b(genericComponentType)).b();
                }
                return null;
            case 1:
                if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                    return null;
                }
                Class D2 = kg.a.D(type);
                if (D2.isInterface() || D2.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (pe2.b.d(D2)) {
                    b(type2, List.class);
                    b(type2, Set.class);
                    b(type2, Map.class);
                    b(type2, Collection.class);
                    String str = "Platform " + D2;
                    if (type2 instanceof ParameterizedType) {
                        str = str + " in " + type2;
                    }
                    throw new IllegalArgumentException(a.a.C(str, " requires explicit JsonAdapter to be registered"));
                }
                if (D2.isAnonymousClass()) {
                    throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(D2.getName()));
                }
                if (D2.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(D2.getName()));
                }
                if (D2.getEnclosingClass() != null && !Modifier.isStatic(D2.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(D2.getName()));
                }
                if (Modifier.isAbstract(D2.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(D2.getName()));
                }
                Class<? extends Annotation> cls2 = pe2.b.f100001d;
                if (cls2 != null && D2.isAnnotationPresent(cls2)) {
                    throw new IllegalArgumentException("Cannot serialize Kotlin type " + D2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                }
                try {
                    try {
                        try {
                            try {
                                Constructor declaredConstructor2 = D2.getDeclaredConstructor(new Class[0]);
                                declaredConstructor2.setAccessible(true);
                                hVar = new h(declaredConstructor2, D2, i13);
                            } catch (IllegalAccessException unused) {
                                throw new AssertionError();
                            } catch (NoSuchMethodException unused2) {
                                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                declaredMethod.setAccessible(true);
                                hVar = new h(declaredMethod, D2, i14);
                            } catch (InvocationTargetException e13) {
                                pe2.b.i(e13);
                                throw null;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                            declaredMethod2.setAccessible(true);
                            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                            declaredMethod3.setAccessible(true);
                            hVar = new j(declaredMethod3, D2, intValue);
                        } catch (IllegalAccessException unused4) {
                            throw new AssertionError();
                        }
                    } catch (NoSuchMethodException unused5) {
                        Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                        Field declaredField = cls3.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        hVar = new i(cls3.getMethod("allocateInstance", Class.class), declaredField.get(null), D2);
                    }
                    TreeMap treeMap = new TreeMap();
                    while (type2 != Object.class) {
                        Class D3 = kg.a.D(type2);
                        boolean d2 = pe2.b.d(D3);
                        Field[] declaredFields = D3.getDeclaredFields();
                        int length = declaredFields.length;
                        for (int i15 = i13; i15 < length; i15++) {
                            Field field = declaredFields[i15];
                            int modifiers = field.getModifiers();
                            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !d2) && ((pVar = (p) field.getAnnotation(p.class)) == null || !pVar.ignore()))) {
                                Type h10 = pe2.b.h(type2, D3, field.getGenericType(), new LinkedHashSet());
                                Set e14 = pe2.b.e(field.getAnnotations());
                                String name = field.getName();
                                r c13 = h0Var.c(h10, e14, name);
                                field.setAccessible(true);
                                if (pVar != null) {
                                    String name2 = pVar.name();
                                    if (!"\u0000".equals(name2)) {
                                        name = name2;
                                    }
                                }
                                k kVar = (k) treeMap.put(name, new k(name, field, c13));
                                if (kVar != null) {
                                    throw new IllegalArgumentException("Conflicting fields:\n    " + kVar.f94351b + "\n    " + field);
                                }
                            }
                        }
                        Class D4 = kg.a.D(type2);
                        type2 = pe2.b.h(type2, D4, D4.getGenericSuperclass(), new LinkedHashSet());
                        i13 = 0;
                    }
                    return new l(hVar, treeMap).b();
                } catch (Exception unused6) {
                    throw new IllegalArgumentException("cannot construct instances of ".concat(D2.getName()));
                }
            case 2:
                Class D5 = kg.a.D(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (D5 == List.class || D5 == Collection.class) {
                    return new m(h0Var.b(kg.a.k(type)), i13).b();
                }
                if (D5 == Set.class) {
                    return new m(h0Var.b(kg.a.k(type)), i14).b();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (D = kg.a.D(type)) != Map.class) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(D)) {
                        throw new IllegalArgumentException();
                    }
                    Type h13 = pe2.b.h(type2, D, pe2.b.c(type2, D, Map.class), new LinkedHashSet());
                    actualTypeArguments = h13 instanceof ParameterizedType ? ((ParameterizedType) h13).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new e0(h0Var, actualTypeArguments[0], actualTypeArguments[1]).b();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls4 = Boolean.TYPE;
                j0 j0Var = n0.f94372b;
                if (type2 == cls4) {
                    return j0Var;
                }
                Class cls5 = Byte.TYPE;
                j0 j0Var2 = n0.f94373c;
                if (type2 == cls5) {
                    return j0Var2;
                }
                Class cls6 = Character.TYPE;
                j0 j0Var3 = n0.f94374d;
                if (type2 == cls6) {
                    return j0Var3;
                }
                Class cls7 = Double.TYPE;
                j0 j0Var4 = n0.f94375e;
                if (type2 == cls7) {
                    return j0Var4;
                }
                Class cls8 = Float.TYPE;
                j0 j0Var5 = n0.f94376f;
                if (type2 == cls8) {
                    return j0Var5;
                }
                Class cls9 = Integer.TYPE;
                j0 j0Var6 = n0.f94377g;
                if (type2 == cls9) {
                    return j0Var6;
                }
                Class cls10 = Long.TYPE;
                j0 j0Var7 = n0.f94378h;
                if (type2 == cls10) {
                    return j0Var7;
                }
                Class cls11 = Short.TYPE;
                j0 j0Var8 = n0.f94379i;
                if (type2 == cls11) {
                    return j0Var8;
                }
                if (type2 == Boolean.class) {
                    return j0Var.b();
                }
                if (type2 == Byte.class) {
                    return j0Var2.b();
                }
                if (type2 == Character.class) {
                    return j0Var3.b();
                }
                if (type2 == Double.class) {
                    return j0Var4.b();
                }
                if (type2 == Float.class) {
                    return j0Var5.b();
                }
                if (type2 == Integer.class) {
                    return j0Var6.b();
                }
                if (type2 == Long.class) {
                    return j0Var7.b();
                }
                if (type2 == Short.class) {
                    return j0Var8.b();
                }
                if (type2 == String.class) {
                    return n0.f94380j.b();
                }
                if (type2 == Object.class) {
                    return new m0(h0Var).b();
                }
                Class D6 = kg.a.D(type);
                Set set2 = pe2.b.f99998a;
                s sVar = (s) D6.getAnnotation(s.class);
                if (sVar == null || !sVar.generateAdapter()) {
                    rVar = null;
                } else {
                    try {
                        try {
                            Class<?> cls12 = Class.forName(D6.getName().replace("$", "_") + "JsonAdapter", true, D6.getClassLoader());
                            try {
                                if (type2 instanceof ParameterizedType) {
                                    Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls12.getDeclaredConstructor(h0.class, Type[].class);
                                        objArr = new Object[]{h0Var, actualTypeArguments2};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls12.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments2};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls12.getDeclaredConstructor(h0.class);
                                        objArr = new Object[]{h0Var};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls12.getDeclaredConstructor(new Class[0]);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                rVar = ((r) declaredConstructor.newInstance(objArr)).b();
                            } catch (NoSuchMethodException e15) {
                                e = e15;
                                cls = cls12;
                                if ((type2 instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type2, e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type2 + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                            }
                        } catch (ClassNotFoundException e16) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type2, e16);
                        } catch (IllegalAccessException e17) {
                            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type2, e17);
                        } catch (InstantiationException e18) {
                            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type2, e18);
                        } catch (InvocationTargetException e19) {
                            pe2.b.i(e19);
                            throw null;
                        }
                    } catch (NoSuchMethodException e23) {
                        e = e23;
                    }
                }
                if (rVar != null) {
                    return rVar;
                }
                if (D6.isEnum()) {
                    return new l0(D6).b();
                }
                return null;
        }
    }
}
