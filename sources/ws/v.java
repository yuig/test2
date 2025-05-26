package ws;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements w {
    public v() {
        sy.e performanceSideEffect = sy.e.f115640a;
        Intrinsics.checkNotNullParameter(performanceSideEffect, "performanceSideEffect");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        sy.e eVar = sy.e.f115640a;
        ((v) obj).getClass();
        return Intrinsics.d(eVar, eVar);
    }

    public final int hashCode() {
        return sy.e.f115640a.hashCode();
    }

    public final String toString() {
        return "WrappedPerformanceSideEffectRequest(performanceSideEffect=" + sy.e.f115640a + ")";
    }
}
