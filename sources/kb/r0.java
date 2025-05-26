package kb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f79028a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79029b;

    public r0(long j13, long j14) {
        this.f79028a = j13;
        this.f79029b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(r0.class, obj.getClass())) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return r0Var.f79028a == this.f79028a && r0Var.f79029b == this.f79029b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f79029b) + (Long.hashCode(this.f79028a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f79028a + ", flexIntervalMillis=" + this.f79029b + '}';
    }
}
