package ad2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements p {
    public o() {
        al1.b wrapped = al1.b.f15477a;
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        al1.b bVar = al1.b.f15477a;
        ((o) obj).getClass();
        return Intrinsics.d(bVar, bVar);
    }

    public final int hashCode() {
        return -1831311372;
    }

    public final String toString() {
        return "WrappedNavRequest(wrapped=" + al1.b.f15477a + ")";
    }
}
