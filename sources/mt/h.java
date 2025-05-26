package mt;

/* loaded from: classes3.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f88111a;

    public h(long j13) {
        this.f88111a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f88111a == ((h) obj).f88111a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88111a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("ScrollEnded(timeStamp="), this.f88111a, ")");
    }
}
