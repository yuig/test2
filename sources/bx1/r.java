package bx1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes4.dex */
public final class r implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f24115a;

    public r() {
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f24115a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f24115a, ((r) obj).f24115a);
    }

    public final int hashCode() {
        return this.f24115a.hashCode();
    }

    public final String toString() {
        return "OverviewVMState(pinalyticsVMState=" + this.f24115a + ")";
    }
}
