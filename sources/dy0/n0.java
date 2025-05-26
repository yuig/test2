package dy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56600a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.l0 f56601b;

    public n0(zy.l0 pinalyticsVMState, boolean z13) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f56600a = z13;
        this.f56601b = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f56600a == n0Var.f56600a && Intrinsics.d(this.f56601b, n0Var.f56601b);
    }

    public final int hashCode() {
        return this.f56601b.hashCode() + (Boolean.hashCode(this.f56600a) * 31);
    }

    public final String toString() {
        return "NuxEndVMState(inBatchRepinsExp=" + this.f56600a + ", pinalyticsVMState=" + this.f56601b + ")";
    }
}
