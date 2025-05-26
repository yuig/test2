package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.y f94118a;

    public c0(zy.y impressionSideEffectRequest) {
        Intrinsics.checkNotNullParameter(impressionSideEffectRequest, "impressionSideEffectRequest");
        this.f94118a = impressionSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f94118a, ((c0) obj).f94118a);
    }

    public final int hashCode() {
        return this.f94118a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionSideEffectRequest(impressionSideEffectRequest=" + this.f94118a + ")";
    }
}
