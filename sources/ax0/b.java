package ax0;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import u50.s;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f20601a;

    public b(i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f20601a = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f20601a, ((b) obj).f20601a);
    }

    public final int hashCode() {
        return this.f20601a.hashCode();
    }

    public final String toString() {
        return "ScenePinProductsDropdownClickedEvent(pinalyticsContext=" + this.f20601a + ")";
    }
}
