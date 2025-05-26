package ot1;

import kh2.c3;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f97580a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97581b;

    public h0(long j13, long j14) {
        this.f97580a = j13;
        this.f97581b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f97580a == h0Var.f97580a && this.f97581b == h0Var.f97581b;
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f97581b) + (Long.hashCode(this.f97580a) * 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return a.a.m("IndexedSlice(topLeftIndex=", c3.s0(this.f97580a), ", bottomRightIndex=", c3.s0(this.f97581b), ")");
    }
}
