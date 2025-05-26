package rl2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: a, reason: collision with root package name */
    public final Type f108667a;

    public a(Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f108667a = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (Intrinsics.d(this.f108667a, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f108667a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return g0.k(this.f108667a) + "[]";
    }

    public final int hashCode() {
        return this.f108667a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
