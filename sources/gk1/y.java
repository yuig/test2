package gk1;

/* loaded from: classes2.dex */
public final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65319a;

    public y(int i13) {
        this.f65319a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f65319a == ((y) obj).f65319a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65319a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnCarouselDragged(visibleItemIndex="), this.f65319a, ")");
    }
}
