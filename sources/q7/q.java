package q7;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f102674a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102675b;

    public q(long j13, long j14) {
        this.f102674a = j13;
        this.f102675b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f102674a == qVar.f102674a && this.f102675b == qVar.f102675b;
    }

    public final int hashCode() {
        return (((int) this.f102674a) * 31) + ((int) this.f102675b);
    }
}
