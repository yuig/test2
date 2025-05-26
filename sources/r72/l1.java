package r72;

/* loaded from: classes4.dex */
public final class l1 {

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f106534c = new l1(0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f106535a;

    /* renamed from: b, reason: collision with root package name */
    public final double f106536b;

    public l1(double d2, double d13) {
        this.f106535a = d2;
        this.f106536b = d13;
    }

    public static l1 a(l1 l1Var, double d2) {
        double d13 = l1Var.f106535a;
        l1Var.getClass();
        return new l1(d13, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Double.compare(this.f106535a, l1Var.f106535a) == 0 && Double.compare(this.f106536b, l1Var.f106536b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f106536b) + (Double.hashCode(this.f106535a) * 31);
    }

    public final String toString() {
        return "Offset(dx=" + this.f106535a + ", dy=" + this.f106536b + ")";
    }
}
