package ni1;

/* loaded from: classes2.dex */
public final class j1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90714a;

    public j1(boolean z13) {
        this.f90714a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && this.f90714a == ((j1) obj).f90714a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90714a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnDetachedInclusive(isFromScroll="), this.f90714a, ")");
    }
}
