package rb1;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f107092a;

    public q(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f107092a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f107092a, ((q) obj).f107092a);
    }

    public final int hashCode() {
        return this.f107092a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f107092a, ")");
    }
}
