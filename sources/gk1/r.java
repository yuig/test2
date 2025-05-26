package gk1;

/* loaded from: classes2.dex */
public final class r implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65259a;

    public r(boolean z13) {
        this.f65259a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f65259a == ((r) obj).f65259a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65259a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("EndFrameVisibilityChanged(enabled="), this.f65259a, ")");
    }
}
