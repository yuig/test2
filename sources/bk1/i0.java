package bk1;

/* loaded from: classes5.dex */
public final class i0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23236a;

    public i0(long j13) {
        this.f23236a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f23236a == ((i0) obj).f23236a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23236a);
    }

    @Override // bk1.p0
    public final long i() {
        return this.f23236a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnDlAdCloseupButtonTap(clickThroughStartTimestamp="), this.f23236a, ")");
    }
}
