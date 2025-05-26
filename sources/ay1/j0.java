package ay1;

/* loaded from: classes4.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20677a;

    public j0(int i13) {
        this.f20677a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f20677a == ((j0) obj).f20677a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20677a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Unavailable(message="), this.f20677a, ")");
    }
}
