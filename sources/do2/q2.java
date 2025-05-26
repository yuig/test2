package do2;

import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class q2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f55911a;

    /* renamed from: b, reason: collision with root package name */
    public final long f55912b;

    public q2(long j13, long j14) {
        this.f55911a = j13;
        this.f55912b = j14;
        if (j13 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j13 + " ms) cannot be negative").toString());
        }
        if (j14 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j14 + " ms) cannot be negative").toString());
    }

    @Override // do2.k2
    public final i a(eo2.q0 q0Var) {
        o2 o2Var = new o2(this, null);
        int i13 = b1.f55739a;
        eo2.r rVar = new eo2.r(o2Var, q0Var, kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND);
        return lb.l0.V(new s0(0, new p2(2, null), rVar));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            if (this.f55911a == q2Var.f55911a && this.f55912b == q2Var.f55912b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55912b) + (Long.hashCode(this.f55911a) * 31);
    }

    public final String toString() {
        yk2.b bVar = new yk2.b(2);
        long j13 = this.f55911a;
        if (j13 > 0) {
            bVar.add("stopTimeout=" + j13 + "ms");
        }
        long j14 = this.f55912b;
        if (j14 < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + j14 + "ms");
        }
        return ep.b.k(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.Z(kotlin.collections.e0.a(bVar), null, null, null, 0, null, null, 63), ')');
    }
}
