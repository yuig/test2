package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 implements b0, u50.t {

    /* renamed from: a, reason: collision with root package name */
    public final hk1.q f90593a;

    public a0(hk1.q wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90593a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f90593a, ((a0) obj).f90593a);
    }

    public final int hashCode() {
        return this.f90593a.hashCode();
    }

    public final String toString() {
        return "WrappedTrailingAccessoryEffect(wrapped=" + this.f90593a + ")";
    }
}
