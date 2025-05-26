package bk1;

/* loaded from: classes5.dex */
public final class h0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23230a;

    public h0(long j13) {
        this.f23230a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.f23230a == ((h0) obj).f23230a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23230a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23230a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnChinCTATap(clickThroughStartTimestamp="), this.f23230a, ")");
    }
}
