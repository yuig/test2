package t80;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f116689a;

    public e(int i13) {
        this.f116689a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f116689a == ((e) obj).f116689a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116689a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CardClicked(id="), this.f116689a, ")");
    }
}
