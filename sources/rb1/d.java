package rb1;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f107079a;

    public d(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f107079a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f107079a, ((d) obj).f107079a);
    }

    public final int hashCode() {
        return this.f107079a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f107079a, ")");
    }
}
