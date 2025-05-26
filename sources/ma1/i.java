package ma1;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f86785a;

    public i(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f86785a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f86785a, ((i) obj).f86785a);
    }

    public final int hashCode() {
        return this.f86785a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f86785a, ")");
    }
}
