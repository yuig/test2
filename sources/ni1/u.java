package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements b0, u50.t {

    /* renamed from: a, reason: collision with root package name */
    public final bk1.o1 f90806a;

    public u(bk1.o1 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90806a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f90806a, ((u) obj).f90806a);
    }

    public final int hashCode() {
        return this.f90806a.hashCode();
    }

    public final String toString() {
        return "WrappedClickThroughEffect(wrapped=" + this.f90806a + ")";
    }
}
