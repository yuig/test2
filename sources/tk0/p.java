package tk0;

/* loaded from: classes5.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f117987a;

    public p(int i13) {
        this.f117987a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f117987a == ((p) obj).f117987a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117987a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ToolViewed(position="), this.f117987a, ")");
    }
}
