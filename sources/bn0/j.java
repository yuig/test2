package bn0;

/* loaded from: classes5.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final long f23576a;

    public j(long j13) {
        this.f23576a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f23576a == ((j) obj).f23576a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23576a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("VideoMuxingProgressChanged(frameTimeUs="), this.f23576a, ")");
    }
}
