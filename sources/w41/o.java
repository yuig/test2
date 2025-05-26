package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements q {
    public o() {
        w31.a filter = w31.a.f127915a;
        Intrinsics.checkNotNullParameter(filter, "filter");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        w31.a aVar = w31.a.f127915a;
        ((o) obj).getClass();
        return Intrinsics.d(aVar, aVar);
    }

    public final int hashCode() {
        return 531526407;
    }

    public final String toString() {
        return "FilterEmptyStateCtaTap(filter=" + w31.a.f127915a + ")";
    }
}
