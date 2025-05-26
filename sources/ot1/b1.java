package ot1;

import kh2.c3;

/* loaded from: classes4.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f97540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97542c;

    public b1(long j13, long j14, boolean z13) {
        this.f97540a = j13;
        this.f97541b = j14;
        this.f97542c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f97540a == b1Var.f97540a && this.f97541b == b1Var.f97541b && this.f97542c == b1Var.f97542c;
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Boolean.hashCode(this.f97542c) + a.a.c(this.f97541b, Long.hashCode(this.f97540a) * 31, 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return a.a.r(a.a.w("TimingInfo(numUnitsInTick=", c3.s0(this.f97540a), ", timeScale=", c3.s0(this.f97541b), ", isFixedFrameRate="), this.f97542c, ")");
    }
}
