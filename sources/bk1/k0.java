package bk1;

/* loaded from: classes5.dex */
public final class k0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23248a;

    public k0(long j13) {
        this.f23248a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f23248a == ((k0) obj).f23248a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23248a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23248a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPharmaAdDisclosureTap(clickThroughStartTimestamp="), this.f23248a, ")");
    }
}
