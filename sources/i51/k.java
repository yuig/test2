package i51;

import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements r {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f71594a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71595b;

    public k(u0 toggledElement, boolean z13) {
        Intrinsics.checkNotNullParameter(toggledElement, "toggledElement");
        this.f71594a = toggledElement;
        this.f71595b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f71594a == kVar.f71594a && this.f71595b == kVar.f71595b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71595b) + (this.f71594a.hashCode() * 31);
    }

    public final String toString() {
        return "GeneratedBoardVisibilityToggled(toggledElement=" + this.f71594a + ", newValue=" + this.f71595b + ")";
    }
}
