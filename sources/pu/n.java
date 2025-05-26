package pu;

/* loaded from: classes3.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long f101365a;

    public n(long j13) {
        this.f101365a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f101365a == ((n) obj).f101365a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101365a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("PinClickthroughStartEventReceived(timestamp="), this.f101365a, ")");
    }
}
