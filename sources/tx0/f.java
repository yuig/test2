package tx0;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f119651a;

    public f(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f119651a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f119651a, ((f) obj).f119651a);
    }

    public final int hashCode() {
        return this.f119651a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f119651a, ")");
    }
}
