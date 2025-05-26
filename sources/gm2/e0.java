package gm2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e0 extends u implements pm2.d {

    /* renamed from: a, reason: collision with root package name */
    public final TypeVariable f65766a;

    public e0(TypeVariable typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
        this.f65766a = typeVariable;
    }

    @Override // pm2.d
    public final pm2.a a(ym2.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        TypeVariable typeVariable = this.f65766a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return bs1.c.j0(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            if (Intrinsics.d(this.f65766a, ((e0) obj).f65766a)) {
                return true;
            }
        }
        return false;
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f65766a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? q0.f80391a : bs1.c.n0(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f65766a.hashCode();
    }

    public final String toString() {
        return e0.class.getName() + ": " + this.f65766a;
    }
}
