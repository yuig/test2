package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f94178a;

    public v(zy.k0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f94178a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f94178a, ((v) obj).f94178a);
    }

    public final int hashCode() {
        return this.f94178a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LifecyclePinalyticsSideEffectRequest(nestedEffect="), this.f94178a, ")");
    }
}
