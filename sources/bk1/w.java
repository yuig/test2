package bk1;

/* loaded from: classes2.dex */
public final class w implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23367a;

    public w(int i13) {
        this.f23367a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f23367a == ((w) obj).f23367a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23367a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnCarouselDragged(visibleItemIndex="), this.f23367a, ")");
    }
}
