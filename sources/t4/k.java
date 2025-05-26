package t4;

/* loaded from: classes3.dex */
public final class k extends e {

    /* renamed from: d, reason: collision with root package name */
    public double f116375d;

    /* renamed from: e, reason: collision with root package name */
    public double f116376e;

    @Override // t4.e
    public final double a(double d2) {
        double d13 = this.f116376e;
        double d14 = this.f116375d;
        if (d2 < d13) {
            return (d13 * d2) / (((d13 - d2) * d14) + d2);
        }
        return ((d2 - 1.0d) * (1.0d - d13)) / ((1.0d - d2) - ((d13 - d2) * d14));
    }

    @Override // t4.e
    public final double b(double d2) {
        double d13 = this.f116376e;
        double d14 = this.f116375d;
        if (d2 < d13) {
            double d15 = d14 * d13 * d13;
            double d16 = ((d13 - d2) * d14) + d2;
            return d15 / (d16 * d16);
        }
        double d17 = d13 - 1.0d;
        double d18 = (((d13 - d2) * (-d14)) - d2) + 1.0d;
        return ((d17 * d14) * d17) / (d18 * d18);
    }
}
