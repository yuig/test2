package gk1;

/* loaded from: classes2.dex */
public final class w implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65281a;

    public w(boolean z13) {
        this.f65281a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f65281a == ((w) obj).f65281a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65281a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnAttachedInclusive(isFromScroll="), this.f65281a, ")");
    }
}
