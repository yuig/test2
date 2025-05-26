package gm2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 extends d0 implements pm2.r {

    /* renamed from: a, reason: collision with root package name */
    public final WildcardType f65773a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f65774b;

    public g0(WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f65773a = reflectType;
        this.f65774b = q0.f80391a;
    }

    @Override // gm2.d0
    public final Type b() {
        return this.f65773a;
    }

    public final d0 c() {
        d0 iVar;
        WildcardType wildcardType = this.f65773a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length != 1) {
            if (upperBounds.length == 1) {
                Type type = (Type) kotlin.collections.c0.R(upperBounds);
                if (!Intrinsics.d(type, Object.class)) {
                    Intrinsics.f(type);
                    Intrinsics.checkNotNullParameter(type, "type");
                    boolean z13 = type instanceof Class;
                    if (z13) {
                        Class cls = (Class) type;
                        if (cls.isPrimitive()) {
                            return new b0(cls);
                        }
                    }
                    iVar = ((type instanceof GenericArrayType) || (z13 && ((Class) type).isArray())) ? new i(type) : type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
                }
            }
            return null;
        }
        Object R = kotlin.collections.c0.R(lowerBounds);
        Intrinsics.checkNotNullExpressionValue(R, "single(...)");
        Type type2 = (Type) R;
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z14 = type2 instanceof Class;
        if (z14) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new b0(cls2);
            }
        }
        iVar = ((type2 instanceof GenericArrayType) || (z14 && ((Class) type2).isArray())) ? new i(type2) : type2 instanceof WildcardType ? new g0((WildcardType) type2) : new s(type2);
        return iVar;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        return this.f65774b;
    }
}
