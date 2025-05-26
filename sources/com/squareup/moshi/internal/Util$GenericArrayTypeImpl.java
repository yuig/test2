package com.squareup.moshi.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kg.a;
import pe2.b;

/* loaded from: classes4.dex */
public final class Util$GenericArrayTypeImpl implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f52908a;

    public Util$GenericArrayTypeImpl(Type type) {
        this.f52908a = b.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && a.r(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f52908a;
    }

    public final int hashCode() {
        return this.f52908a.hashCode();
    }

    public final String toString() {
        return b.k(this.f52908a) + "[]";
    }
}
