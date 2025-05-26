package bk1;

/* loaded from: classes5.dex */
public final class g0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23227a;

    public g0(long j13) {
        this.f23227a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.f23227a == ((g0) obj).f23227a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23227a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23227a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("DefaultTap(clickThroughStartTimestamp="), this.f23227a, ")");
    }
}
