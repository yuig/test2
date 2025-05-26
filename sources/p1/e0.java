package p1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f98501a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f98502b;

    public e0(m1 m1Var, m1 m1Var2) {
        this.f98501a = m1Var;
        this.f98502b = m1Var2;
    }

    @Override // p1.m1
    public final int a(n4.b bVar, n4.k kVar) {
        int a13 = this.f98501a.a(bVar, kVar) - this.f98502b.a(bVar, kVar);
        if (a13 < 0) {
            return 0;
        }
        return a13;
    }

    @Override // p1.m1
    public final int b(n4.b bVar) {
        int b13 = this.f98501a.b(bVar) - this.f98502b.b(bVar);
        if (b13 < 0) {
            return 0;
        }
        return b13;
    }

    @Override // p1.m1
    public final int c(n4.b bVar) {
        int c13 = this.f98501a.c(bVar) - this.f98502b.c(bVar);
        if (c13 < 0) {
            return 0;
        }
        return c13;
    }

    @Override // p1.m1
    public final int d(n4.b bVar, n4.k kVar) {
        int d2 = this.f98501a.d(bVar, kVar) - this.f98502b.d(bVar, kVar);
        if (d2 < 0) {
            return 0;
        }
        return d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(e0Var.f98501a, this.f98501a) && Intrinsics.d(e0Var.f98502b, this.f98502b);
    }

    public final int hashCode() {
        return this.f98502b.hashCode() + (this.f98501a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f98501a + " - " + this.f98502b + ')';
    }
}
