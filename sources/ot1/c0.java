package ot1;

import kh2.c3;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97543a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97544b;

    public c0(boolean z13, long j13) {
        this.f97543a = z13;
        this.f97544b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f97543a == c0Var.f97543a && this.f97544b == c0Var.f97544b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f97543a) * 31;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f97544b) + hashCode;
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return "DirectionalSlices(sliceGroupChangeDirection=" + this.f97543a + ", sliceGroupChangeRate=" + c3.s0(this.f97544b) + ")";
    }
}
