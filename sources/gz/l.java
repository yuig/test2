package gz;

import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f66349a;

    public l(u0 elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f66349a = elementType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f66349a == ((l) obj).f66349a;
    }

    public final int hashCode() {
        return this.f66349a.hashCode();
    }

    public final String toString() {
        return "TrackElementClick(elementType=" + this.f66349a + ")";
    }
}
