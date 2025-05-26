package d92;

/* loaded from: classes4.dex */
public final class q implements z {

    /* renamed from: a, reason: collision with root package name */
    public final long f54183a;

    public q(long j13) {
        this.f54183a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f54183a == ((q) obj).f54183a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f54183a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnDestroy(endPinClickthroughTimeNs="), this.f54183a, ")");
    }
}
