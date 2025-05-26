package ou;

import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final pu.a f97683a;

    public b(pu.a adsCoreDisplayState) {
        Intrinsics.checkNotNullParameter(adsCoreDisplayState, "adsCoreDisplayState");
        this.f97683a = adsCoreDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f97683a, ((b) obj).f97683a);
    }

    public final int hashCode() {
        return this.f97683a.hashCode();
    }

    public final String toString() {
        return "SbaAdsCollageDisplayState(adsCoreDisplayState=" + this.f97683a + ")";
    }
}
