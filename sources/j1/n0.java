package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f74157a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f74158b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74159c;

    public n0(b0 b0Var, l1 l1Var, long j13) {
        this.f74157a = b0Var;
        this.f74158b = l1Var;
        this.f74159c = j13;
    }

    @Override // j1.n
    public final r2 a(p2 p2Var) {
        return new y2(this.f74157a.a(p2Var), this.f74158b, this.f74159c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(n0Var.f74157a, this.f74157a) && n0Var.f74158b == this.f74158b && n0Var.f74159c == this.f74159c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f74159c) + ((this.f74158b.hashCode() + (this.f74157a.hashCode() * 31)) * 31);
    }
}
