package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements i0 {
    public g0() {
        sy.b performanceSideEffect = sy.b.f115637a;
        Intrinsics.checkNotNullParameter(performanceSideEffect, "performanceSideEffect");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        sy.b bVar = sy.b.f115637a;
        ((g0) obj).getClass();
        return Intrinsics.d(bVar, bVar);
    }

    public final int hashCode() {
        return sy.b.f115637a.hashCode();
    }

    public final String toString() {
        return "WrappedPerformanceSideEffectRequest(performanceSideEffect=" + sy.b.f115637a + ")";
    }
}
