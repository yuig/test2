package ma1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f86813a;

    public u(e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f86813a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f86813a, ((u) obj).f86813a);
    }

    public final int hashCode() {
        return this.f86813a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(wrapped="), this.f86813a, ")");
    }
}
