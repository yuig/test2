package rl2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i0 implements WildcardType, Type {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h0 f108675c = new h0(null);

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f108676d = new i0(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Type f108677a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f108678b;

    public i0(Type type, Type type2) {
        this.f108677a = type;
        this.f108678b = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f108678b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f108678b;
        if (type != null) {
            return "? super " + g0.k(type);
        }
        Type type2 = this.f108677a;
        if (type2 == null || Intrinsics.d(type2, Object.class)) {
            return "?";
        }
        return "? extends " + g0.k(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f108677a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
