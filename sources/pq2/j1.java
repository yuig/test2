package pq2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes4.dex */
public final class j1 implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f101046a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f101047b;

    public j1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            k1.c(typeArr[0]);
            this.f101047b = null;
            this.f101046a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        k1.c(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f101047b = typeArr2[0];
        this.f101046a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && k1.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f101047b;
        return type != null ? new Type[]{type} : k1.f101052a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f101046a};
    }

    public final int hashCode() {
        Type type = this.f101047b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f101046a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f101047b;
        if (type != null) {
            return "? super " + k1.r(type);
        }
        Type type2 = this.f101046a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + k1.r(type2);
    }
}
