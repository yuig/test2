package ek1;

/* loaded from: classes2.dex */
public final class w implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f59387a;

    public w(int i13) {
        this.f59387a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f59387a == ((w) obj).f59387a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59387a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnCarouselDragged(visibleItemIndex="), this.f59387a, ")");
    }
}
