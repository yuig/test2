package qo2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 implements oo2.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f104537a;

    /* renamed from: b, reason: collision with root package name */
    public final oo2.f f104538b;

    public c1(String serialName, oo2.f kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f104537a = serialName;
        this.f104538b = kind;
    }

    @Override // oo2.g
    public final boolean b() {
        return false;
    }

    @Override // oo2.g
    public final oo2.n c() {
        return this.f104538b;
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oo2.g
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (Intrinsics.d(this.f104537a, c1Var.f104537a)) {
            if (Intrinsics.d(this.f104538b, c1Var.f104538b)) {
                return true;
            }
        }
        return false;
    }

    @Override // oo2.g
    public final String f(int i13) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oo2.g
    public final List g(int i13) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // oo2.g
    public final oo2.g h(int i13) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f104538b.hashCode() * 31) + this.f104537a.hashCode();
    }

    @Override // oo2.g
    public final String i() {
        return this.f104537a;
    }

    @Override // oo2.g
    public final boolean isInline() {
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("PrimitiveDescriptor("), this.f104537a, ')');
    }
}
