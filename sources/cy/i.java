package cy;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f53409a;

    public i(long j13) {
        this.f53409a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f53409a == ((i) obj).f53409a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53409a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("PreCompressionContentLength(length="), this.f53409a, ")");
    }
}
