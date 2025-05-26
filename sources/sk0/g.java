package sk0;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f113058a;

    public g(int i13) {
        this.f113058a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f113058a == ((g) obj).f113058a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113058a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnToolTapped(position="), this.f113058a, ")");
    }
}
