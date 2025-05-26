package rw1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes4.dex */
public final class g implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f110118a;

    public g() {
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f110118a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f110118a, ((g) obj).f110118a);
    }

    public final int hashCode() {
        return this.f110118a.hashCode();
    }

    public final String toString() {
        return "GraphCloseupVMState(pinalyticsVMState=" + this.f110118a + ")";
    }
}
