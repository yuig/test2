package n91;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f90073a;

    public w(e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90073a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f90073a, ((w) obj).f90073a);
    }

    public final int hashCode() {
        return this.f90073a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(wrapped="), this.f90073a, ")");
    }
}
