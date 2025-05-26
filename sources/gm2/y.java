package gm2;

import am2.o1;
import am2.r1;
import am2.u1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class y extends u implements pm2.d, pm2.m {
    @Override // pm2.d
    public final pm2.a a(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Member b13 = b();
        Intrinsics.g(b13, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) b13).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return bs1.c.j0(declaredAnnotations, fqName);
        }
        return null;
    }

    public abstract Member b();

    public final ym2.g c() {
        String name = b().getName();
        ym2.g e13 = name != null ? ym2.g.e(name) : null;
        return e13 == null ? ym2.i.f139482a : e13;
    }

    public final ArrayList d(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z13) {
        Method method;
        ArrayList arrayList;
        String str;
        boolean z14;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList2 = new ArrayList(parameterTypes.length);
        a aVar = a.f65753a;
        Member member = b();
        Intrinsics.checkNotNullParameter(member, "member");
        tb.l lVar = a.f65754b;
        if (lVar == null) {
            synchronized (aVar) {
                lVar = a.f65754b;
                if (lVar == null) {
                    lVar = a.a(member);
                    a.f65754b = lVar;
                }
            }
        }
        Method method2 = (Method) lVar.f116986b;
        if (method2 == null || (method = (Method) lVar.f116987c) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(member, new Object[0]);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, new Object[0]);
                Intrinsics.g(invoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) invoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        for (int i13 = 0; i13 < length; i13++) {
            d0 c13 = re2.f.c(parameterTypes[i13]);
            if (arrayList != null) {
                str = (String) CollectionsKt.U(i13 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i13 + '+' + size + " (name=" + c() + " type=" + c13 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z13) {
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                z14 = true;
                if (i13 == parameterTypes.length - 1) {
                    arrayList2.add(new f0(c13, parameterAnnotations[i13], str, z14));
                }
            }
            z14 = false;
            arrayList2.add(new f0(c13, parameterAnnotations[i13], str, z14));
        }
        return arrayList2;
    }

    public final u1 e() {
        int modifiers = b().getModifiers();
        return Modifier.isPublic(modifiers) ? r1.f15572c : Modifier.isPrivate(modifiers) ? o1.f15567c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? em2.c.f59640c : em2.b.f59639c : em2.a.f59638c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && Intrinsics.d(b(), ((y) obj).b());
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        Member b13 = b();
        Intrinsics.g(b13, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) b13).getDeclaredAnnotations();
        return declaredAnnotations != null ? bs1.c.n0(declaredAnnotations) : q0.f80391a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
