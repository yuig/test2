package g6;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public double f63681a;

    /* renamed from: b, reason: collision with root package name */
    public double f63682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63683c;

    /* renamed from: d, reason: collision with root package name */
    public double f63684d;

    /* renamed from: e, reason: collision with root package name */
    public double f63685e;

    /* renamed from: f, reason: collision with root package name */
    public double f63686f;

    /* renamed from: g, reason: collision with root package name */
    public double f63687g;

    /* renamed from: h, reason: collision with root package name */
    public double f63688h;

    /* renamed from: i, reason: collision with root package name */
    public double f63689i;

    /* renamed from: j, reason: collision with root package name */
    public final f f63690j;

    public i() {
        this.f63681a = Math.sqrt(1500.0d);
        this.f63682b = 0.5d;
        this.f63683c = false;
        this.f63689i = Double.MAX_VALUE;
        this.f63690j = new f();
    }

    public final f a(double d2, double d13, long j13) {
        double cos;
        double d14;
        if (!this.f63683c) {
            if (this.f63689i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d15 = this.f63682b;
            if (d15 > 1.0d) {
                double d16 = this.f63681a;
                this.f63686f = (Math.sqrt((d15 * d15) - 1.0d) * d16) + ((-d15) * d16);
                double d17 = this.f63682b;
                double d18 = this.f63681a;
                this.f63687g = ((-d17) * d18) - (Math.sqrt((d17 * d17) - 1.0d) * d18);
            } else if (d15 >= 0.0d && d15 < 1.0d) {
                this.f63688h = Math.sqrt(1.0d - (d15 * d15)) * this.f63681a;
            }
            this.f63683c = true;
        }
        double d19 = j13 / 1000.0d;
        double d23 = d2 - this.f63689i;
        double d24 = this.f63682b;
        if (d24 > 1.0d) {
            double d25 = this.f63687g;
            double d26 = this.f63686f;
            double d27 = d23 - (((d25 * d23) - d13) / (d25 - d26));
            double d28 = ((d23 * d25) - d13) / (d25 - d26);
            d14 = (Math.pow(2.718281828459045d, this.f63686f * d19) * d28) + (Math.pow(2.718281828459045d, d25 * d19) * d27);
            double d29 = this.f63687g;
            double pow = Math.pow(2.718281828459045d, d29 * d19) * d27 * d29;
            double d33 = this.f63686f;
            cos = (Math.pow(2.718281828459045d, d33 * d19) * d28 * d33) + pow;
        } else if (d24 == 1.0d) {
            double d34 = this.f63681a;
            double d35 = (d34 * d23) + d13;
            double d36 = (d35 * d19) + d23;
            double pow2 = Math.pow(2.718281828459045d, (-d34) * d19) * d36;
            double pow3 = Math.pow(2.718281828459045d, (-this.f63681a) * d19) * d36;
            double d37 = this.f63681a;
            cos = (Math.pow(2.718281828459045d, (-d37) * d19) * d35) + (pow3 * (-d37));
            d14 = pow2;
        } else {
            double d38 = 1.0d / this.f63688h;
            double d39 = this.f63681a;
            double d43 = ((d24 * d39 * d23) + d13) * d38;
            double sin = ((Math.sin(this.f63688h * d19) * d43) + (Math.cos(this.f63688h * d19) * d23)) * Math.pow(2.718281828459045d, (-d24) * d39 * d19);
            double d44 = this.f63681a;
            double d45 = this.f63682b;
            double d46 = (-d44) * sin * d45;
            double pow4 = Math.pow(2.718281828459045d, (-d45) * d44 * d19);
            double d47 = this.f63688h;
            double sin2 = Math.sin(d47 * d19) * (-d47) * d23;
            double d48 = this.f63688h;
            cos = (((Math.cos(d48 * d19) * d43 * d48) + sin2) * pow4) + d46;
            d14 = sin;
        }
        float f13 = (float) (d14 + this.f63689i);
        f fVar = this.f63690j;
        fVar.f63658a = f13;
        fVar.f63659b = (float) cos;
        return fVar;
    }

    public i(float f13) {
        this.f63681a = Math.sqrt(1500.0d);
        this.f63682b = 0.5d;
        this.f63683c = false;
        this.f63690j = new f();
        this.f63689i = f13;
    }
}
