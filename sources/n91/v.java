package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f90072a;

    public v(al1.i wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90072a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f90072a, ((v) obj).f90072a);
    }

    public final int hashCode() {
        return this.f90072a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavigationEffect(wrapped="), this.f90072a, ")");
    }
}
