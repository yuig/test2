package qp1;

/* loaded from: classes5.dex */
public final class t implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f104840a;

    public t(long j13) {
        this.f104840a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f104840a == ((t) obj).f104840a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104840a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnDestroy(endPinClickthroughTimeNs="), this.f104840a, ")");
    }
}
