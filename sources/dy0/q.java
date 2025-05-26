package dy0;

/* loaded from: classes5.dex */
public final class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f56611a;

    public q(int i13) {
        this.f56611a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f56611a == ((q) obj).f56611a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56611a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AwaitSignalCollection(loadingTimeMillis="), this.f56611a, ")");
    }
}
