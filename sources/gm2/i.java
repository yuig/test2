package gm2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends d0 implements pm2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Type f65776a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f65777b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f65778c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type reflectType) {
        d0 b0Var;
        d0 d0Var;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f65776a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> type = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(type, "getComponentType(...)");
                    Intrinsics.checkNotNullParameter(type, "type");
                    boolean z13 = type instanceof Class;
                    b0Var = (z13 && type.isPrimitive()) ? new b0(type) : ((type instanceof GenericArrayType) || (z13 && type.isArray())) ? new i(type) : type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type type2 = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(type2, "getGenericComponentType(...)");
        Intrinsics.checkNotNullParameter(type2, "type");
        boolean z14 = type2 instanceof Class;
        if (z14) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                d0Var = new b0(cls2);
                this.f65777b = d0Var;
                this.f65778c = q0.f80391a;
            }
        }
        b0Var = ((type2 instanceof GenericArrayType) || (z14 && ((Class) type2).isArray())) ? new i(type2) : type2 instanceof WildcardType ? new g0((WildcardType) type2) : new s(type2);
        d0Var = b0Var;
        this.f65777b = d0Var;
        this.f65778c = q0.f80391a;
    }

    @Override // gm2.d0
    public final Type b() {
        return this.f65776a;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        return this.f65778c;
    }
}
