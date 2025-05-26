package qp1;

/* loaded from: classes5.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f104856a;

    public z(long j13) {
        this.f104856a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f104856a == ((z) obj).f104856a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104856a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPDPLoadingStarted(timeStamp="), this.f104856a, ")");
    }
}
