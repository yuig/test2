package rl2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    public final Class f108669a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f108670b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f108671c;

    public c0(Class rawType, Type type, ArrayList typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f108669a = rawType;
        this.f108670b = type;
        this.f108671c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.d(this.f108669a, parameterizedType.getRawType()) && Intrinsics.d(this.f108670b, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f108671c, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f108671c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f108670b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f108669a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb3 = new StringBuilder();
        Class cls = this.f108669a;
        Type type = this.f108670b;
        if (type != null) {
            sb3.append(g0.k(type));
            sb3.append("$");
            sb3.append(cls.getSimpleName());
        } else {
            sb3.append(g0.k(cls));
        }
        Type[] typeArr = this.f108671c;
        if (!(typeArr.length == 0)) {
            kotlin.collections.c0.L(typeArr, sb3, ", ", "<", ">", -1, "...", b0.f108668a);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public final int hashCode() {
        int hashCode = this.f108669a.hashCode();
        Type type = this.f108670b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f108671c);
    }

    public final String toString() {
        return getTypeName();
    }
}
