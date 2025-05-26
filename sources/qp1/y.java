package qp1;

/* loaded from: classes5.dex */
public final class y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f104855a;

    public y(long j13) {
        this.f104855a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f104855a == ((y) obj).f104855a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104855a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPDPLoadingFinished(timeStamp="), this.f104855a, ")");
    }
}
