package ka0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {
    public r() {
        m wrapped = m.f78914a;
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        m mVar = m.f78914a;
        ((r) obj).getClass();
        return Intrinsics.d(mVar, mVar);
    }

    public final int hashCode() {
        return 868447824;
    }

    public final String toString() {
        return "WrappedNavigationEffectRequest(wrapped=" + m.f78914a + ")";
    }
}
