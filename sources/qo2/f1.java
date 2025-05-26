package qo2;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 implements oo2.g, k {

    /* renamed from: a, reason: collision with root package name */
    public final oo2.g f104552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104553b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f104554c;

    public f1(oo2.g original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f104552a = original;
        this.f104553b = original.i() + '?';
        this.f104554c = w0.a(original);
    }

    @Override // qo2.k
    public final Set a() {
        return this.f104554c;
    }

    @Override // oo2.g
    public final boolean b() {
        return true;
    }

    @Override // oo2.g
    public final oo2.n c() {
        return this.f104552a.c();
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f104552a.d(name);
    }

    @Override // oo2.g
    public final int e() {
        return this.f104552a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return Intrinsics.d(this.f104552a, ((f1) obj).f104552a);
        }
        return false;
    }

    @Override // oo2.g
    public final String f(int i13) {
        return this.f104552a.f(i13);
    }

    @Override // oo2.g
    public final List g(int i13) {
        return this.f104552a.g(i13);
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return this.f104552a.getAnnotations();
    }

    @Override // oo2.g
    public final oo2.g h(int i13) {
        return this.f104552a.h(i13);
    }

    public final int hashCode() {
        return this.f104552a.hashCode() * 31;
    }

    @Override // oo2.g
    public final String i() {
        return this.f104553b;
    }

    @Override // oo2.g
    public final boolean isInline() {
        return this.f104552a.isInline();
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        return this.f104552a.j(i13);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f104552a);
        sb3.append('?');
        return sb3.toString();
    }
}
