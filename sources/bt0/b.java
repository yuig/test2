package bt0;

import kotlin.jvm.internal.Intrinsics;
import o82.a0;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f23860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23861b;

    public b(a0 multiSectionDisplayState, int i13) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f23860a = multiSectionDisplayState;
        this.f23861b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f23860a, bVar.f23860a) && this.f23861b == bVar.f23861b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23861b) + (this.f23860a.f93524a.hashCode() * 31);
    }

    public final String toString() {
        return "SbaHftFollowingTabDisplayState(multiSectionDisplayState=" + this.f23860a + ", emptyStateString=" + this.f23861b + ")";
    }
}
