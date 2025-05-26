package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.y f26648a;

    public x0(zy.y impressionSideEffectRequest) {
        Intrinsics.checkNotNullParameter(impressionSideEffectRequest, "impressionSideEffectRequest");
        this.f26648a = impressionSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f26648a, ((x0) obj).f26648a);
    }

    public final int hashCode() {
        return this.f26648a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionSideEffectRequest(impressionSideEffectRequest=" + this.f26648a + ")";
    }
}
