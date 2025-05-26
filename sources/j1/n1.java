package j1;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public float f74160a;

    /* renamed from: b, reason: collision with root package name */
    public double f74161b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f74162c;

    /* renamed from: d, reason: collision with root package name */
    public double f74163d;

    /* renamed from: e, reason: collision with root package name */
    public double f74164e;

    /* renamed from: f, reason: collision with root package name */
    public double f74165f;

    /* renamed from: g, reason: collision with root package name */
    public float f74166g;

    public final long a(long j13, float f13, float f14) {
        double cos;
        double d2;
        if (!this.f74162c) {
            if (this.f74160a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f15 = this.f74166g;
            double d13 = f15;
            double d14 = d13 * d13;
            if (f15 > 1.0f) {
                double d15 = this.f74161b;
                double d16 = d14 - 1;
                this.f74163d = (Math.sqrt(d16) * d15) + ((-f15) * d15);
                double d17 = -this.f74166g;
                double d18 = this.f74161b;
                this.f74164e = (d17 * d18) - (Math.sqrt(d16) * d18);
            } else if (f15 >= 0.0f && f15 < 1.0f) {
                this.f74165f = Math.sqrt(1 - d14) * this.f74161b;
            }
            this.f74162c = true;
        }
        float f16 = f13 - this.f74160a;
        double d19 = j13 / 1000.0d;
        float f17 = this.f74166g;
        if (f17 > 1.0f) {
            double d23 = f16;
            double d24 = this.f74164e;
            double d25 = f14;
            double d26 = this.f74163d;
            double d27 = d23 - (((d24 * d23) - d25) / (d24 - d26));
            double d28 = ((d23 * d24) - d25) / (d24 - d26);
            d2 = (Math.exp(this.f74163d * d19) * d28) + (Math.exp(d24 * d19) * d27);
            double d29 = this.f74164e;
            double exp = Math.exp(d29 * d19) * d27 * d29;
            double d33 = this.f74163d;
            cos = (Math.exp(d33 * d19) * d28 * d33) + exp;
        } else if (f17 == 1.0f) {
            double d34 = this.f74161b;
            double d35 = f16;
            double d36 = (d34 * d35) + f14;
            double d37 = (d36 * d19) + d35;
            d2 = Math.exp((-d34) * d19) * d37;
            double exp2 = Math.exp((-this.f74161b) * d19) * d37;
            double d38 = this.f74161b;
            cos = (Math.exp((-d38) * d19) * d36) + (exp2 * (-d38));
        } else {
            double d39 = 1 / this.f74165f;
            double d43 = this.f74161b;
            double d44 = f16;
            double d45 = ((f17 * d43 * d44) + f14) * d39;
            double exp3 = Math.exp((-f17) * d43 * d19) * ((Math.sin(this.f74165f * d19) * d45) + (Math.cos(this.f74165f * d19) * d44));
            double d46 = this.f74161b;
            double d47 = (-d46) * exp3 * this.f74166g;
            double exp4 = Math.exp((-r7) * d46 * d19);
            double d48 = this.f74165f;
            double sin = Math.sin(d48 * d19) * (-d48) * d44;
            double d49 = this.f74165f;
            cos = (((Math.cos(d49 * d19) * d45 * d49) + sin) * exp4) + d47;
            d2 = exp3;
        }
        return (Float.floatToRawIntBits((float) cos) & 4294967295L) | (Float.floatToRawIntBits((float) (d2 + this.f74160a)) << 32);
    }
}
