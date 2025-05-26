package p1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f98549a;

    /* renamed from: b, reason: collision with root package name */
    public final n4.b f98550b;

    public l0(m1 m1Var, q3.o1 o1Var) {
        this.f98549a = m1Var;
        this.f98550b = o1Var;
    }

    @Override // p1.x0
    public final float a() {
        m1 m1Var = this.f98549a;
        n4.b bVar = this.f98550b;
        return bVar.f0(m1Var.c(bVar));
    }

    @Override // p1.x0
    public final float b(n4.k kVar) {
        m1 m1Var = this.f98549a;
        n4.b bVar = this.f98550b;
        return bVar.f0(m1Var.a(bVar, kVar));
    }

    @Override // p1.x0
    public final float c(n4.k kVar) {
        m1 m1Var = this.f98549a;
        n4.b bVar = this.f98550b;
        return bVar.f0(m1Var.d(bVar, kVar));
    }

    @Override // p1.x0
    public final float d() {
        m1 m1Var = this.f98549a;
        n4.b bVar = this.f98550b;
        return bVar.f0(m1Var.b(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f98549a, l0Var.f98549a) && Intrinsics.d(this.f98550b, l0Var.f98550b);
    }

    public final int hashCode() {
        return this.f98550b.hashCode() + (this.f98549a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f98549a + ", density=" + this.f98550b + ')';
    }
}
