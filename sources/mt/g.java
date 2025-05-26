package mt;

/* loaded from: classes3.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f88110a;

    public g(long j13) {
        this.f88110a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f88110a == ((g) obj).f88110a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88110a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnBackPressed(timeStamp="), this.f88110a, ")");
    }
}
