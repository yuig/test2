package ps;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f101228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f101229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101230c;

    public g(int i13, int i14, long j13) {
        this.f101228a = j13;
        this.f101229b = i13;
        this.f101230c = i14;
    }

    public final long a() {
        return this.f101228a;
    }

    public final int b() {
        return this.f101229b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f101228a == gVar.f101228a && this.f101229b == gVar.f101229b && this.f101230c == gVar.f101230c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101230c) + ep.b.b(this.f101229b, Long.hashCode(this.f101228a) * 31, 31);
    }

    public final String toString() {
        return "Params(initialDelay=" + this.f101228a + ", numOfChipsInSlideShow=" + this.f101229b + ", numOfChipsPerRound=" + this.f101230c + ")";
    }
}
