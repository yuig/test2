package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q3 implements k1.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25097a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25098b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25099c;

    public q3(boolean z13, float f13, long j13) {
        this.f25097a = z13;
        this.f25098b = f13;
        this.f25099c = j13;
    }

    @Override // k1.q1
    public final s3.m b(o1.k kVar) {
        n1 n1Var = new n1(this, 1);
        return new p1(kVar, this.f25097a, this.f25098b, n1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        if (this.f25097a == q3Var.f25097a && n4.e.a(this.f25098b, q3Var.f25098b) && Intrinsics.d(null, null)) {
            return b3.w.c(this.f25099c, q3Var.f25099c);
        }
        return false;
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f25098b, Boolean.hashCode(this.f25097a) * 31, 961);
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f25099c) + a13;
    }
}
