package li1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class q implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f83578a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83579b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f83580c;

    public q(String pinUid, boolean z13, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f83578a = pinUid;
        this.f83579b = z13;
        this.f83580c = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f83578a, qVar.f83578a) && this.f83579b == qVar.f83579b && Intrinsics.d(this.f83580c, qVar.f83580c);
    }

    public final int hashCode() {
        return this.f83580c.hashCode() + ep.b.e(this.f83579b, this.f83578a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WeightLossOptOutVMState(pinUid=" + this.f83578a + ", optedOut=" + this.f83579b + ", pinalyticsVMState=" + this.f83580c + ")";
    }
}
