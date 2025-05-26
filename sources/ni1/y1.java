package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y1 implements u50.m, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final hk1.o f90899a;

    public y1(hk1.o wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90899a = wrapped;
    }

    @Override // u50.m
    public final u50.s c() {
        return this.f90899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && Intrinsics.d(this.f90899a, ((y1) obj).f90899a);
    }

    public final int hashCode() {
        return this.f90899a.hashCode();
    }

    public final hk1.o j() {
        return this.f90899a;
    }

    public final String toString() {
        return "WrappedTrailingAccessoryEvent(wrapped=" + this.f90899a + ")";
    }
}
