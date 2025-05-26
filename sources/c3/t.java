package c3;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final double f25553a;

    /* renamed from: b, reason: collision with root package name */
    public final double f25554b;

    /* renamed from: c, reason: collision with root package name */
    public final double f25555c;

    /* renamed from: d, reason: collision with root package name */
    public final double f25556d;

    /* renamed from: e, reason: collision with root package name */
    public final double f25557e;

    /* renamed from: f, reason: collision with root package name */
    public final double f25558f;

    /* renamed from: g, reason: collision with root package name */
    public final double f25559g;

    public /* synthetic */ t(double d2, double d13, double d14, double d15, double d16) {
        this(d2, d13, d14, d15, d16, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Double.compare(this.f25553a, tVar.f25553a) == 0 && Double.compare(this.f25554b, tVar.f25554b) == 0 && Double.compare(this.f25555c, tVar.f25555c) == 0 && Double.compare(this.f25556d, tVar.f25556d) == 0 && Double.compare(this.f25557e, tVar.f25557e) == 0 && Double.compare(this.f25558f, tVar.f25558f) == 0 && Double.compare(this.f25559g, tVar.f25559g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f25559g) + a.c.a(this.f25558f, a.c.a(this.f25557e, a.c.a(this.f25556d, a.c.a(this.f25555c, a.c.a(this.f25554b, Double.hashCode(this.f25553a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f25553a + ", a=" + this.f25554b + ", b=" + this.f25555c + ", c=" + this.f25556d + ", d=" + this.f25557e + ", e=" + this.f25558f + ", f=" + this.f25559g + ')';
    }

    public t(double d2, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f25553a = d2;
        this.f25554b = d13;
        this.f25555c = d14;
        this.f25556d = d15;
        this.f25557e = d16;
        this.f25558f = d17;
        this.f25559g = d18;
        if (Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d18) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d16 < 0.0d || d16 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d16);
        }
        if (d16 == 0.0d && (d13 == 0.0d || d2 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d16 >= 1.0d && d15 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d13 == 0.0d || d2 == 0.0d) && d15 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d15 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d13 < 0.0d || d2 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
