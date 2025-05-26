package gm2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class e extends u implements pm2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f65765a;

    public e(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f65765a = annotation;
    }

    public final ArrayList b() {
        Annotation annotation = this.f65765a;
        Method[] declaredMethods = l0.t0(l0.m0(annotation)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
            arrayList.add(re2.h.g(invoke, ym2.g.e(method.getName())));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f65765a == ((e) obj).f65765a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f65765a);
    }

    public final String toString() {
        return e.class.getName() + ": " + this.f65765a;
    }
}
