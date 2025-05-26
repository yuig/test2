package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x1 implements u50.m, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gk1.d0 f90840a;

    public x1(gk1.d0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90840a = wrapped;
    }

    @Override // u50.m
    public final u50.s c() {
        return this.f90840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && Intrinsics.d(this.f90840a, ((x1) obj).f90840a);
    }

    public final int hashCode() {
        return this.f90840a.hashCode();
    }

    public final String toString() {
        return "WrappedOverlayEvent(wrapped=" + this.f90840a + ")";
    }
}
