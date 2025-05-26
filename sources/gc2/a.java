package gc2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f64773a;

    /* renamed from: b, reason: collision with root package name */
    public long f64774b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f64773a == aVar.f64773a && this.f64774b == aVar.f64774b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f64774b) + (Long.hashCode(this.f64773a) * 31);
    }

    public final String toString() {
        return "BandwidthData(startTimeMs=" + this.f64773a + ", endTimeMs=" + this.f64774b + ")";
    }
}
