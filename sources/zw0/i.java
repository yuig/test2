package zw0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k {
    public i() {
        al1.b request = al1.b.f15477a;
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        al1.b bVar = al1.b.f15477a;
        ((i) obj).getClass();
        return Intrinsics.d(bVar, bVar);
    }

    public final int hashCode() {
        return -1831311372;
    }

    public final String toString() {
        return "NavigationSideEffectRequest(request=" + al1.b.f15477a + ")";
    }
}
