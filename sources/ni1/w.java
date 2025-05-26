package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements b0, u50.t {

    /* renamed from: a, reason: collision with root package name */
    public final dk1.e f90833a;

    public w(dk1.e wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90833a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f90833a, ((w) obj).f90833a);
    }

    public final int hashCode() {
        return this.f90833a.hashCode();
    }

    public final String toString() {
        return "WrappedHeaderEffect(wrapped=" + this.f90833a + ")";
    }
}
