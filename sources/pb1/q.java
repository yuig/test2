package pb1;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f99478a;

    public q(zy.f0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f99478a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f99478a, ((q) obj).f99478a);
    }

    public final int hashCode() {
        return this.f99478a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffectRequest(wrapped="), this.f99478a, ")");
    }
}
