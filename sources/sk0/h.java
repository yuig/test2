package sk0;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f113059a;

    public h(int i13) {
        this.f113059a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f113059a == ((h) obj).f113059a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113059a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnToolViewed(position="), this.f113059a, ")");
    }
}
