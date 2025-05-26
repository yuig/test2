package xs;

/* loaded from: classes3.dex */
public final class p implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f135753a;

    public p(long j13) {
        this.f135753a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f135753a == ((p) obj).f135753a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135753a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("CloseButtonClickEvent(timeStamp="), this.f135753a, ")");
    }
}
