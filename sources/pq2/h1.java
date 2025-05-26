package pq2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class h1 implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f101037a;

    public h1(Type type) {
        this.f101037a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && k1.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f101037a;
    }

    public final int hashCode() {
        return this.f101037a.hashCode();
    }

    public final String toString() {
        return k1.r(this.f101037a) + "[]";
    }
}
