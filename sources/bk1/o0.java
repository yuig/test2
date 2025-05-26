package bk1;

/* loaded from: classes5.dex */
public final class o0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23275a;

    public o0(long j13) {
        this.f23275a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f23275a == ((o0) obj).f23275a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23275a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23275a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnUserAttributionTap(clickThroughStartTimestamp="), this.f23275a, ")");
    }
}
