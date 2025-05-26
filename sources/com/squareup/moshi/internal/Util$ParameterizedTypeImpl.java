package com.squareup.moshi.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import kg.a;
import pe2.b;

/* loaded from: classes4.dex */
public final class Util$ParameterizedTypeImpl implements ParameterizedType {

    /* renamed from: a */
    public final Type f52909a;

    /* renamed from: b */
    public final Type f52910b;

    /* renamed from: c */
    public final Type[] f52911c;

    public Util$ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || a.D(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f52909a = type == null ? null : b.a(type);
        this.f52910b = b.a(type2);
        this.f52911c = (Type[]) typeArr.clone();
        int i13 = 0;
        while (true) {
            Type[] typeArr2 = this.f52911c;
            if (i13 >= typeArr2.length) {
                return;
            }
            typeArr2[i13].getClass();
            b.b(this.f52911c[i13]);
            Type[] typeArr3 = this.f52911c;
            typeArr3[i13] = b.a(typeArr3[i13]);
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && a.r(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f52911c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f52909a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f52910b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f52911c) ^ this.f52910b.hashCode();
        Set set = b.f99998a;
        Type type = this.f52909a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f52911c;
        StringBuilder sb3 = new StringBuilder((typeArr.length + 1) * 30);
        sb3.append(b.k(this.f52910b));
        if (typeArr.length == 0) {
            return sb3.toString();
        }
        sb3.append("<");
        sb3.append(b.k(typeArr[0]));
        for (int i13 = 1; i13 < typeArr.length; i13++) {
            sb3.append(", ");
            sb3.append(b.k(typeArr[i13]));
        }
        sb3.append(">");
        return sb3.toString();
    }
}
