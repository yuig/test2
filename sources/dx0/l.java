package dx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final zy.y f56443a;

    public l(zy.y impressionSideEffectRequest) {
        Intrinsics.checkNotNullParameter(impressionSideEffectRequest, "impressionSideEffectRequest");
        this.f56443a = impressionSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f56443a, ((l) obj).f56443a);
    }

    public final int hashCode() {
        return this.f56443a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionSideEffectRequest(impressionSideEffectRequest=" + this.f56443a + ")";
    }
}
