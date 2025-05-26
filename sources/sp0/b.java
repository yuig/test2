package sp0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f114877a;

    /* renamed from: b, reason: collision with root package name */
    public final double f114878b;

    public b(double d2, double d13) {
        this.f114877a = d2;
        this.f114878b = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f114877a, bVar.f114877a) == 0 && Double.compare(this.f114878b, bVar.f114878b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f114878b) + (Double.hashCode(this.f114877a) * 31);
    }

    public final String toString() {
        return "Duration(startTime=" + this.f114877a + ", endTime=" + this.f114878b + ")";
    }
}
