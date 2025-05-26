package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p1 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f74195a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74196b;

    public p1(h0 h0Var, long j13) {
        this.f74195a = h0Var;
        this.f74196b = j13;
    }

    @Override // j1.n
    public final r2 a(p2 p2Var) {
        return new q1(this.f74195a.a(p2Var), this.f74196b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return p1Var.f74196b == this.f74196b && Intrinsics.d(p1Var.f74195a, this.f74195a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f74196b) + (this.f74195a.hashCode() * 31);
    }
}
