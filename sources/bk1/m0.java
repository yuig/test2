package bk1;

/* loaded from: classes5.dex */
public final class m0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23267a;

    public m0(long j13) {
        this.f23267a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f23267a == ((m0) obj).f23267a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23267a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23267a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPinImageTap(clickThroughStartTimestamp="), this.f23267a, ")");
    }
}
