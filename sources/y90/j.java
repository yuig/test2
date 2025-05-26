package y90;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f138191a;

    public j(boolean z13) {
        this.f138191a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f138191a == ((j) obj).f138191a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138191a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("BackHandled(consumed="), this.f138191a, ")");
    }
}
