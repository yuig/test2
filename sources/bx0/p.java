package bx0;

/* loaded from: classes5.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f24083a;

    public p(int i13) {
        this.f24083a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f24083a == ((p) obj).f24083a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24083a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ScenePinScrolledTo(scrollIndex="), this.f24083a, ")");
    }
}
