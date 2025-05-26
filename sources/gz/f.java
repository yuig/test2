package gz;

import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f66339a;

    public f(u0 elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f66339a = elementType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f66339a == ((f) obj).f66339a;
    }

    public final int hashCode() {
        return this.f66339a.hashCode();
    }

    public final String toString() {
        return "ElementClicked(elementType=" + this.f66339a + ")";
    }
}
