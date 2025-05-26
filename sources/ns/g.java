package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f91913a;

    public g(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f91913a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f91913a, ((g) obj).f91913a);
    }

    public final int hashCode() {
        return this.f91913a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f91913a, ")");
    }
}
