package bk1;

/* loaded from: classes2.dex */
public final class u implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23346a;

    public u(boolean z13) {
        this.f23346a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f23346a == ((u) obj).f23346a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23346a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnAttached(isContainedByShoppingSlideshowPinCellView="), this.f23346a, ")");
    }
}
