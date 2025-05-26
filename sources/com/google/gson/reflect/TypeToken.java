package com.google.gson.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import kh2.k3;
import pm.b;
import pm.d;

/* loaded from: classes.dex */
public class TypeToken<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f33846a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f33847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33848c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type a13 = d.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    b(a13);
                }
                this.f33847b = a13;
                this.f33846a = d.f(a13);
                this.f33848c = a13.hashCode();
                return;
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + k3.L("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static TypeToken a(Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (typeArr.length == 0) {
            return new TypeToken(cls);
        }
        if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
        }
        for (int i13 = 0; i13 < length; i13++) {
            Type type = typeArr[i13];
            Objects.requireNonNull(type, "Type argument must not be null");
            Class<?> f13 = d.f(type);
            TypeVariable<Class<T>> typeVariable = typeParameters[i13];
            for (Type type2 : typeVariable.getBounds()) {
                if (!d.f(type2).isAssignableFrom(f13)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + cls);
                }
            }
        }
        return new TypeToken(new b(null, cls, typeArr));
    }

    public static void b(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + k3.L("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            b(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i13 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                b(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i13 < length) {
                b(actualTypeArguments[i13]);
                i13++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            b(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i13 < length2) {
            b(upperBounds[i13]);
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            if (d.c(this.f33847b, ((TypeToken) obj).f33847b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33848c;
    }

    public final String toString() {
        return d.j(this.f33847b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type a13 = d.a(type);
        this.f33847b = a13;
        this.f33846a = d.f(a13);
        this.f33848c = a13.hashCode();
    }
}
