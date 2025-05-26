package zw0;

import kotlin.jvm.internal.Intrinsics;
import zy.y;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final y f142909a;

    public j(y impressionSideEffectRequest) {
        Intrinsics.checkNotNullParameter(impressionSideEffectRequest, "impressionSideEffectRequest");
        this.f142909a = impressionSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f142909a, ((j) obj).f142909a);
    }

    public final int hashCode() {
        return this.f142909a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionSideEffectRequest(impressionSideEffectRequest=" + this.f142909a + ")";
    }
}
