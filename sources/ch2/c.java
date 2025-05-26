package ch2;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f27742a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27743b;

    public c(int i13, long j13) {
        this.f27742a = i13;
        this.f27743b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27742a == cVar.f27742a && this.f27743b == cVar.f27743b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27743b) + (Integer.hashCode(this.f27742a) * 31);
    }

    public final String toString() {
        return "RetryInstance(failedAttempts=" + this.f27742a + ", nextRetryTimeMs=" + this.f27743b + ')';
    }
}
