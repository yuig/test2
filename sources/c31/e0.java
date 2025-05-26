package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.y f25580a;

    public e0(zy.y impressionSideEffectRequest) {
        Intrinsics.checkNotNullParameter(impressionSideEffectRequest, "impressionSideEffectRequest");
        this.f25580a = impressionSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f25580a, ((e0) obj).f25580a);
    }

    public final int hashCode() {
        return this.f25580a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionSideEffectRequest(impressionSideEffectRequest=" + this.f25580a + ")";
    }
}
