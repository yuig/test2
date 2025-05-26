package xs0;

import kotlin.jvm.internal.Intrinsics;
import ni1.z1;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f135841a;

    public t(z1 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f135841a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f135841a, ((t) obj).f135841a);
    }

    public final int hashCode() {
        return this.f135841a.hashCode();
    }

    public final String toString() {
        return "WrappedPinRepEvent(wrapped=" + this.f135841a + ")";
    }
}
