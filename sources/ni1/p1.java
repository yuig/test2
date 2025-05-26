package ni1;

/* loaded from: classes2.dex */
public final class p1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90779a;

    public p1(int i13) {
        this.f90779a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && this.f90779a == ((p1) obj).f90779a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90779a);
    }

    public final int j() {
        return this.f90779a;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PinRepOnCarouselDragged(visibleItemIndex="), this.f90779a, ")");
    }
}
