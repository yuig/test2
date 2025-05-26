package li1;

import kotlin.jvm.internal.Intrinsics;
import zy.f0;
import zy.k0;

/* loaded from: classes5.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f83575a;

    public n(f0 pinalyticsSideEffectRequest) {
        Intrinsics.checkNotNullParameter(pinalyticsSideEffectRequest, "pinalyticsSideEffectRequest");
        this.f83575a = pinalyticsSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f83575a, ((n) obj).f83575a);
    }

    public final int hashCode() {
        return this.f83575a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingRequest(pinalyticsSideEffectRequest="), this.f83575a, ")");
    }
}
