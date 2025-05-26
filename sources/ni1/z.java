package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements b0, u50.t {

    /* renamed from: a, reason: collision with root package name */
    public final gk1.n0 f90929a;

    public z(gk1.n0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90929a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f90929a, ((z) obj).f90929a);
    }

    public final int hashCode() {
        return this.f90929a.hashCode();
    }

    public final String toString() {
        return "WrappedOverlayEffect(wrapped=" + this.f90929a + ")";
    }
}
