package xs0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.b0 f135849a;

    public z(ni1.b0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f135849a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f135849a, ((z) obj).f135849a);
    }

    public final int hashCode() {
        return this.f135849a.hashCode();
    }

    public final String toString() {
        return "WrappedPgcSideEffectRequest(wrapped=" + this.f135849a + ")";
    }
}
