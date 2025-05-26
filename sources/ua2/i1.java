package ua2;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final double f121506a;

    /* renamed from: b, reason: collision with root package name */
    public final double f121507b;

    public i1(double d2, double d13) {
        this.f121506a = d2;
        this.f121507b = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Double.compare(this.f121506a, i1Var.f121506a) == 0 && Double.compare(this.f121507b, i1Var.f121507b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f121507b) + (Double.hashCode(this.f121506a) * 31);
    }

    public final String toString() {
        return "WindowDimensions(width=" + this.f121506a + ", height=" + this.f121507b + ")";
    }
}
