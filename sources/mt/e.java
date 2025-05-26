package mt;

/* loaded from: classes3.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f88108a;

    public e(long j13) {
        this.f88108a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f88108a == ((e) obj).f88108a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88108a);
    }

    public final String toString() {
        return a.a.o(new StringBuilder("ClickOnImage(timeStamp="), this.f88108a, ")");
    }
}
