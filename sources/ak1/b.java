package ak1;

import kotlin.jvm.internal.Intrinsics;
import ni1.f0;
import u50.n;

/* loaded from: classes2.dex */
public final class b implements aj1.a, wi1.b, f0, vi1.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f15465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15466b;

    public b(n padding, String str) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f15465a = padding;
        this.f15466b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f15465a, bVar.f15465a) && Intrinsics.d(this.f15466b, bVar.f15466b);
    }

    public final int hashCode() {
        int hashCode = this.f15465a.hashCode() * 31;
        String str = this.f15466b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinVerticalPaddingDisplayState(padding=" + this.f15465a + ", tag=" + this.f15466b + ")";
    }
}
