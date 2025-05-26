package gm2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class q extends u implements pm2.d, pm2.g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f65786a;

    public q(Class klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f65786a = klass;
    }

    @Override // pm2.d
    public final pm2.a a(ym2.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Class cls = this.f65786a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return bs1.c.j0(declaredAnnotations, fqName);
    }

    public final Collection b() {
        Field[] declaredFields = this.f65786a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return yn2.c0.t(yn2.c0.p(yn2.c0.k(kotlin.collections.c0.v(declaredFields), l.f65781a), m.f65782a));
    }

    public final ym2.c c() {
        ym2.c b13 = d.a(this.f65786a).b();
        Intrinsics.checkNotNullExpressionValue(b13, "asSingleFqName(...)");
        return b13;
    }

    public final Collection d() {
        Method[] declaredMethods = this.f65786a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return yn2.c0.t(yn2.c0.p(yn2.c0.j(kotlin.collections.c0.v(declaredMethods), new e82.l(this, 13)), p.f65785a));
    }

    public final ym2.g e() {
        Class cls = this.f65786a;
        if (!cls.isAnonymousClass()) {
            return ym2.g.e(cls.getSimpleName());
        }
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return ym2.g.e(StringsKt.c0(name, "."));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Intrinsics.d(this.f65786a, ((q) obj).f65786a)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList f() {
        Class clazz = this.f65786a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = (Method) com.bumptech.glide.c.i0().f33806d;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(clazz, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new c0(obj));
        }
        return arrayList;
    }

    public final boolean g() {
        Boolean bool;
        Class clazz = this.f65786a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = (Method) com.bumptech.glide.c.i0().f33805c;
        if (method == null) {
            bool = null;
        } else {
            Object invoke = method.invoke(clazz, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f65786a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? q0.f80391a : bs1.c.n0(declaredAnnotations);
    }

    @Override // pm2.q
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f65786a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new e0(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() {
        Boolean bool;
        Class clazz = this.f65786a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method method = (Method) com.bumptech.glide.c.i0().f33803a;
        if (method == null) {
            bool = null;
        } else {
            Object invoke = method.invoke(clazz, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f65786a.hashCode();
    }

    public final String toString() {
        return q.class.getName() + ": " + this.f65786a;
    }
}
