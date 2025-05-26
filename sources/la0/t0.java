package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ka0.o f82467a;

    public t0(ka0.o wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f82467a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f82467a, ((t0) obj).f82467a);
    }

    public final int hashCode() {
        return this.f82467a.hashCode();
    }

    public final String toString() {
        return "WrappedNavigationEffectRequest(wrapped=" + this.f82467a + ")";
    }
}
