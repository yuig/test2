package mu;

/* loaded from: classes3.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f88202a;

    public g(long j13) {
        this.f88202a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f88202a == ((g) obj).f88202a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88202a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnDestroyView(timestamp="), this.f88202a, ")");
    }
}
