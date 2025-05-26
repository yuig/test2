package ca1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f27226a;

    public u(l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f27226a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f27226a, ((u) obj).f27226a);
    }

    public final int hashCode() {
        return this.f27226a.hashCode();
    }

    public final String toString() {
        return "ClaimMigrationVMState(pinalyticsVMState=" + this.f27226a + ")";
    }
}
