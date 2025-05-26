package bk1;

/* loaded from: classes2.dex */
public final class b0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23181a;

    public b0(long j13) {
        this.f23181a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f23181a == ((b0) obj).f23181a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23181a);
    }

    public final long j() {
        return this.f23181a;
    }

    public final String toString() {
        return a.a.o(new StringBuilder("OnPinClickthroughStartEvent(startTimeNs="), this.f23181a, ")");
    }
}
