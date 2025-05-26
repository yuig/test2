package mt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final sy.f f88116a;

    public n(sy.f performanceSideEffect) {
        Intrinsics.checkNotNullParameter(performanceSideEffect, "performanceSideEffect");
        this.f88116a = performanceSideEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f88116a, ((n) obj).f88116a);
    }

    public final int hashCode() {
        return this.f88116a.hashCode();
    }

    public final String toString() {
        return "WrappedPerformanceSideEffectRequest(performanceSideEffect=" + this.f88116a + ")";
    }
}
