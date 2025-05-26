package pq2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i1 implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f101040a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f101041b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f101042c;

    public i1(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            k1.c(type3);
        }
        this.f101040a = type;
        this.f101041b = type2;
        this.f101042c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && k1.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f101042c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f101040a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f101041b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f101042c) ^ this.f101041b.hashCode();
        Type type = this.f101040a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f101042c;
        int length = typeArr.length;
        Type type = this.f101041b;
        if (length == 0) {
            return k1.r(type);
        }
        StringBuilder sb3 = new StringBuilder((typeArr.length + 1) * 30);
        sb3.append(k1.r(type));
        sb3.append("<");
        sb3.append(k1.r(typeArr[0]));
        for (int i13 = 1; i13 < typeArr.length; i13++) {
            sb3.append(", ");
            sb3.append(k1.r(typeArr[i13]));
        }
        sb3.append(">");
        return sb3.toString();
    }
}
