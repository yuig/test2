package gm2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s extends d0 implements pm2.i {

    /* renamed from: a, reason: collision with root package name */
    public final Type f65788a;

    /* renamed from: b, reason: collision with root package name */
    public final u f65789b;

    public s(Type reflectType) {
        u qVar;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f65788a = reflectType;
        if (reflectType instanceof Class) {
            qVar = new q((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            qVar = new e0((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f65789b = qVar;
    }

    @Override // gm2.d0, pm2.d
    public final pm2.a a(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // gm2.d0
    public final Type b() {
        return this.f65788a;
    }

    public final ArrayList c() {
        d0 iVar;
        List<Type> c13 = d.c(this.f65788a);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(c13, 10));
        for (Type type : c13) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z13 = type instanceof Class;
            if (z13) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    iVar = new b0(cls);
                    arrayList.add(iVar);
                }
            }
            iVar = ((type instanceof GenericArrayType) || (z13 && ((Class) type).isArray())) ? new i(type) : type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.f65788a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        return q0.f80391a;
    }
}
