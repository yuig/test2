package kb1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f79094a;

    public r(e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f79094a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f79094a, ((r) obj).f79094a);
    }

    public final int hashCode() {
        return this.f79094a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(wrapped="), this.f79094a, ")");
    }
}
