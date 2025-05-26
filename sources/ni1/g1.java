package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final ua2.i1 f90686a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90687b;

    public g1(ua2.i1 windowDimensions, boolean z13) {
        Intrinsics.checkNotNullParameter(windowDimensions, "windowDimensions");
        this.f90686a = windowDimensions;
        this.f90687b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        return Intrinsics.d(this.f90686a, g1Var.f90686a) && this.f90687b == g1Var.f90687b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90687b) + ((this.f90686a.hashCode() + (Boolean.hashCode(false) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnAttachedInclusive(isContainedByShoppingSlideshowPinCellView=false, windowDimensions=");
        sb3.append(this.f90686a);
        sb3.append(", isFromScroll=");
        return a.a.r(sb3, this.f90687b, ")");
    }
}
