package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f134322a;

    public i(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f134322a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f134322a, ((i) obj).f134322a);
    }

    public final int hashCode() {
        return this.f134322a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f134322a, ")");
    }
}
