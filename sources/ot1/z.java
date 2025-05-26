package ot1;

import kh2.c3;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f97652a;

    /* renamed from: b, reason: collision with root package name */
    public final long f97653b;

    public z(long j13, long j14) {
        this.f97652a = j13;
        this.f97653b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f97652a == zVar.f97652a && this.f97653b == zVar.f97653b;
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f97653b) + (Long.hashCode(this.f97652a) * 31);
    }

    public final String toString() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return a.a.m("ChromaLocInfo(chromaSampleLocTypeTopField=", c3.s0(this.f97652a), ", chromaSampleLocTypeBottomField=", c3.s0(this.f97653b), ")");
    }
}
