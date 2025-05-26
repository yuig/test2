package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final sy.f f26651a;

    public z0(sy.f performanceSideEffect) {
        Intrinsics.checkNotNullParameter(performanceSideEffect, "performanceSideEffect");
        this.f26651a = performanceSideEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.d(this.f26651a, ((z0) obj).f26651a);
    }

    public final int hashCode() {
        return this.f26651a.hashCode();
    }

    public final String toString() {
        return "WrappedPerformanceSideEffectRequest(performanceSideEffect=" + this.f26651a + ")";
    }
}
