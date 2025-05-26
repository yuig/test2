package ay1;

import kotlin.jvm.internal.Intrinsics;
import zy.l0;

/* loaded from: classes4.dex */
public final class y implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f20689a;

    public y() {
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f20689a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f20689a, ((y) obj).f20689a);
    }

    public final int hashCode() {
        return this.f20689a.hashCode();
    }

    public final String toString() {
        return "PinStatsVMState(pinalyticsVMState=" + this.f20689a + ")";
    }
}
