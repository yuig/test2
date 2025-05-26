package gk1;

/* loaded from: classes2.dex */
public final class z implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65320a;

    public z(boolean z13) {
        this.f65320a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f65320a == ((z) obj).f65320a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65320a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnDetachedInclusive(isFromScroll="), this.f65320a, ")");
    }
}
