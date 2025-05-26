package fk1;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f62351a;

    public g(int i13) {
        this.f62351a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f62351a == ((g) obj).f62351a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62351a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnCarouselDragged(visibleItemIndex="), this.f62351a, ")");
    }
}
