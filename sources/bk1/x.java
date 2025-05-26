package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23371a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23372b;

    public x(long j13, String expectedPinId) {
        Intrinsics.checkNotNullParameter(expectedPinId, "expectedPinId");
        this.f23371a = j13;
        this.f23372b = expectedPinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f23371a == xVar.f23371a && Intrinsics.d(this.f23372b, xVar.f23372b);
    }

    public final int hashCode() {
        return this.f23372b.hashCode() + (Long.hashCode(this.f23371a) * 31);
    }

    public final long j() {
        return this.f23371a;
    }

    public final String k() {
        return this.f23372b;
    }

    public final String toString() {
        return "OnClickthroughEndEvent(endTimeNs=" + this.f23371a + ", expectedPinId=" + this.f23372b + ")";
    }
}
