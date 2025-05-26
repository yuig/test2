package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x implements b0, u50.t {

    /* renamed from: a, reason: collision with root package name */
    public final ek1.e1 f90838a;

    public x(ek1.e1 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90838a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f90838a, ((x) obj).f90838a);
    }

    public final int hashCode() {
        return this.f90838a.hashCode();
    }

    public final String toString() {
        return "WrappedMediaEffect(wrapped=" + this.f90838a + ")";
    }
}
