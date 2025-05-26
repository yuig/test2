package pw0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f101524a;

    public m(int i13) {
        this.f101524a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f101524a == ((m) obj).f101524a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101524a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("GalleryTabAction(position="), this.f101524a, ")");
    }
}
