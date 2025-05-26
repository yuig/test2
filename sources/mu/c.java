package mu;

/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f88192a;

    public c(int i13) {
        this.f88192a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f88192a == ((c) obj).f88192a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88192a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CarouselSwiped(newIndex="), this.f88192a, ")");
    }
}
