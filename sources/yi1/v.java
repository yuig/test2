package yi1;

import kotlin.jvm.internal.Intrinsics;
import ua2.i1;

/* loaded from: classes2.dex */
public final class v implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f139161a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f139162b;

    public v(boolean z13, i1 windowDimensions) {
        Intrinsics.checkNotNullParameter(windowDimensions, "windowDimensions");
        this.f139161a = z13;
        this.f139162b = windowDimensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f139161a == vVar.f139161a && Intrinsics.d(this.f139162b, vVar.f139162b);
    }

    public final int hashCode() {
        return this.f139162b.hashCode() + (Boolean.hashCode(this.f139161a) * 31);
    }

    public final String toString() {
        return "OnAttached(isContainedByShoppingSlideshowPinCellView=" + this.f139161a + ", windowDimensions=" + this.f139162b + ")";
    }
}
