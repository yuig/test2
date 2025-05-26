package pm;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f100575a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f100576b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f100577c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f100575a = type == null ? null : d.a(type);
        this.f100576b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f100577c = typeArr2;
        int length = typeArr2.length;
        for (int i13 = 0; i13 < length; i13++) {
            Objects.requireNonNull(this.f100577c[i13]);
            d.b(this.f100577c[i13]);
            Type[] typeArr3 = this.f100577c;
            typeArr3[i13] = d.a(typeArr3[i13]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f100577c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f100575a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f100576b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f100577c) ^ this.f100576b.hashCode();
        Type type = this.f100575a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f100577c;
        int length = typeArr.length;
        Type type = this.f100576b;
        if (length == 0) {
            return d.j(type);
        }
        StringBuilder sb3 = new StringBuilder((length + 1) * 30);
        sb3.append(d.j(type));
        sb3.append("<");
        sb3.append(d.j(typeArr[0]));
        for (int i13 = 1; i13 < length; i13++) {
            sb3.append(", ");
            sb3.append(d.j(typeArr[i13]));
        }
        sb3.append(">");
        return sb3.toString();
    }
}
