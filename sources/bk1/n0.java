package bk1;

/* loaded from: classes5.dex */
public final class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23272a;

    public n0(long j13) {
        this.f23272a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.f23272a == ((n0) obj).f23272a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23272a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23272a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPromoMetadataTap(clickThroughStartTimestamp="), this.f23272a, ")");
    }
}
