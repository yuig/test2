package m62;

/* loaded from: classes4.dex */
public final class o0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final double f86037a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86038b;

    public o0(double d2, double d13) {
        this.f86037a = d2;
        this.f86038b = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Double.compare(this.f86037a, o0Var.f86037a) == 0 && Double.compare(this.f86038b, o0Var.f86038b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f86038b) + (Double.hashCode(this.f86037a) * 31);
    }

    public final String toString() {
        return "ItemChanged(rotationX=" + this.f86037a + ", rotationY=" + this.f86038b + ")";
    }
}
