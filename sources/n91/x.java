package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f90074a;

    public x(k92.n wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90074a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f90074a, ((x) obj).f90074a);
    }

    public final int hashCode() {
        return this.f90074a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastEffect(wrapped="), this.f90074a, ")");
    }
}
