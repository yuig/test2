package xs;

/* loaded from: classes3.dex */
public final class q implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f135754a;

    public q(long j13) {
        this.f135754a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f135754a == ((q) obj).f135754a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135754a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("LaunchLoadingScreen(timeStamp="), this.f135754a, ")");
    }
}
