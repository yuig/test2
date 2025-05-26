package oo2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f96869a;

    /* renamed from: b, reason: collision with root package name */
    public final rl2.d f96870b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96871c;

    public b(h original, rl2.d kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f96869a = original;
        this.f96870b = kClass;
        this.f96871c = original.f96883a + '<' + kClass.f() + '>';
    }

    @Override // oo2.g
    public final boolean b() {
        return this.f96869a.b();
    }

    @Override // oo2.g
    public final n c() {
        return this.f96869a.c();
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f96869a.d(name);
    }

    @Override // oo2.g
    public final int e() {
        return this.f96869a.e();
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && Intrinsics.d(this.f96869a, bVar.f96869a) && Intrinsics.d(bVar.f96870b, this.f96870b);
    }

    @Override // oo2.g
    public final String f(int i13) {
        return this.f96869a.f(i13);
    }

    @Override // oo2.g
    public final List g(int i13) {
        return this.f96869a.g(i13);
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return this.f96869a.getAnnotations();
    }

    @Override // oo2.g
    public final g h(int i13) {
        return this.f96869a.h(i13);
    }

    public final int hashCode() {
        return this.f96871c.hashCode() + (this.f96870b.hashCode() * 31);
    }

    @Override // oo2.g
    public final String i() {
        return this.f96871c;
    }

    @Override // oo2.g
    public final boolean isInline() {
        return this.f96869a.isInline();
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        return this.f96869a.j(i13);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f96870b + ", original: " + this.f96869a + ')';
    }
}
