package j1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public double f74303a;

    /* renamed from: b, reason: collision with root package name */
    public double f74304b;

    public x(double d2, double d13) {
        this.f74303a = d2;
        this.f74304b = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Double.compare(this.f74303a, xVar.f74303a) == 0 && Double.compare(this.f74304b, xVar.f74304b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f74304b) + (Double.hashCode(this.f74303a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f74303a + ", _imaginary=" + this.f74304b + ')';
    }
}
