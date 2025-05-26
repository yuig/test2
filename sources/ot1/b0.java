package ot1;

import kh2.c3;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f97537a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97538b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97539c;

    public b0(long j13, long j14, boolean z13) {
        this.f97537a = j13;
        this.f97538b = j14;
        this.f97539c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f97537a == b0Var.f97537a && this.f97538b == b0Var.f97538b && this.f97539c == b0Var.f97539c;
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Boolean.hashCode(this.f97539c) + a.a.c(this.f97538b, Long.hashCode(this.f97537a) * 31, 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return a.a.r(a.a.w("CpbInfo(bitRateValue=", c3.s0(this.f97537a), ", cpbSizeValue=", c3.s0(this.f97538b), ", isCbr="), this.f97539c, ")");
    }
}
