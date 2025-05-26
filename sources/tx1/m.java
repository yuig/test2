package tx1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes4.dex */
public final class m implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f119692a;

    public m() {
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f119692a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f119692a, ((m) obj).f119692a);
    }

    public final int hashCode() {
        return this.f119692a.hashCode();
    }

    public final String toString() {
        return "HomeAnalyticsVMState(pinalyticsVMState=" + this.f119692a + ")";
    }
}
