package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f101052a = new Type[0];

    /* renamed from: b, reason: collision with root package name */
    public static boolean f101053b = true;

    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type e(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i13 = 0; i13 < length; i13++) {
                Class<?> cls3 = interfaces[i13];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i13];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i13], interfaces[i13], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type f(int i13, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i13 >= 0 && i13 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i13];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder s13 = a.a.s("Index ", i13, " not in range [0,");
        s13.append(actualTypeArguments.length);
        s13.append(") for ");
        s13.append(parameterizedType);
        throw new IllegalArgumentException(s13.toString());
    }

    public static Class g(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type h(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return p(type, cls, e(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean i(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (i(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return i(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static boolean j(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Type type) {
        return f101053b && type == Unit.class;
    }

    public static IllegalArgumentException m(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder D = ep.b.D(String.format(str, objArr), "\n    for method ");
        D.append(method.getDeclaringClass().getSimpleName());
        D.append(".");
        D.append(method.getName());
        return new IllegalArgumentException(D.toString(), exc);
    }

    public static IllegalArgumentException n(Method method, int i13, String str, Object... objArr) {
        return m(method, null, a.a.l(str, " (", t0.f101085b.g0(i13, method), ")"), objArr);
    }

    public static IllegalArgumentException o(Method method, Exception exc, int i13, String str, Object... objArr) {
        return m(method, exc, a.a.l(str, " (", t0.f101085b.g0(i13, method), ")"), objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[LOOP:0: B:2:0x0002->B:10:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type p(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pq2.k1.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void q(Throwable th3) {
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    public static String r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(x0 x0Var, Object obj);

    public i0 b() {
        return new i0(this, 1);
    }

    public i0 l() {
        return new i0(this, 0);
    }
}
