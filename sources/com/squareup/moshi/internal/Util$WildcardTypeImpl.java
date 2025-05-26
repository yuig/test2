package com.squareup.moshi.internal;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kg.a;
import pe2.b;

/* loaded from: classes4.dex */
public final class Util$WildcardTypeImpl implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f52912a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f52913b;

    public Util$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            b.b(typeArr[0]);
            this.f52913b = null;
            this.f52912a = b.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        b.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f52913b = b.a(typeArr2[0]);
        this.f52912a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && a.r(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f52913b;
        return type != null ? new Type[]{type} : b.f99999b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f52912a};
    }

    public final int hashCode() {
        Type type = this.f52913b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f52912a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f52913b;
        if (type != null) {
            return "? super " + b.k(type);
        }
        Type type2 = this.f52912a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + b.k(type2);
    }
}
