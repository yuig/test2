package bk1;

/* loaded from: classes5.dex */
public final class j0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23245a;

    public j0(long j13) {
        this.f23245a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f23245a == ((j0) obj).f23245a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23245a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23245a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnFullScreenIndicatorTap(clickThroughStartTimestamp="), this.f23245a, ")");
    }
}
