package ws;

/* loaded from: classes3.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final long f131057a;

    public g(long j13) {
        this.f131057a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f131057a == ((g) obj).f131057a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131057a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("ScrollEnded(timeStamp="), this.f131057a, ")");
    }
}
