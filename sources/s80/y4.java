package s80;

/* loaded from: classes5.dex */
public final class y4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111857a;

    public y4(boolean z13) {
        this.f111857a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4) && this.f111857a == ((y4) obj).f111857a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111857a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("SetZOrderingEnabled(enabled="), this.f111857a, ")");
    }
}
