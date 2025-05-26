package pu;

/* loaded from: classes3.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f101332a;

    public c(long j13) {
        this.f101332a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f101332a == ((c) obj).f101332a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101332a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("MatchingClickthroughEndEventReceived(timestamp="), this.f101332a, ")");
    }
}
