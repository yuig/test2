package p1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f98541a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f98542b;

    public k1(m1 m1Var, m1 m1Var2) {
        this.f98541a = m1Var;
        this.f98542b = m1Var2;
    }

    @Override // p1.m1
    public final int a(n4.b bVar, n4.k kVar) {
        return Math.max(this.f98541a.a(bVar, kVar), this.f98542b.a(bVar, kVar));
    }

    @Override // p1.m1
    public final int b(n4.b bVar) {
        return Math.max(this.f98541a.b(bVar), this.f98542b.b(bVar));
    }

    @Override // p1.m1
    public final int c(n4.b bVar) {
        return Math.max(this.f98541a.c(bVar), this.f98542b.c(bVar));
    }

    @Override // p1.m1
    public final int d(n4.b bVar, n4.k kVar) {
        return Math.max(this.f98541a.d(bVar, kVar), this.f98542b.d(bVar, kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(k1Var.f98541a, this.f98541a) && Intrinsics.d(k1Var.f98542b, this.f98542b);
    }

    public final int hashCode() {
        return (this.f98542b.hashCode() * 31) + this.f98541a.hashCode();
    }

    public final String toString() {
        return "(" + this.f98541a + " ∪ " + this.f98542b + ')';
    }
}
