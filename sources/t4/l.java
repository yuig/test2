package t4;

/* loaded from: classes3.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public double f116377a;

    /* renamed from: b, reason: collision with root package name */
    public double f116378b;

    /* renamed from: c, reason: collision with root package name */
    public double f116379c;

    /* renamed from: d, reason: collision with root package name */
    public float f116380d;

    /* renamed from: e, reason: collision with root package name */
    public float f116381e;

    /* renamed from: f, reason: collision with root package name */
    public float f116382f;

    /* renamed from: g, reason: collision with root package name */
    public float f116383g;

    /* renamed from: h, reason: collision with root package name */
    public float f116384h;

    /* renamed from: i, reason: collision with root package name */
    public int f116385i;

    @Override // t4.n
    public final float a() {
        return 0.0f;
    }

    @Override // t4.n
    public final boolean b() {
        double d2 = this.f116381e - this.f116379c;
        double d13 = this.f116378b;
        double d14 = this.f116382f;
        return Math.sqrt((((d13 * d2) * d2) + ((d14 * d14) * ((double) this.f116383g))) / d13) <= ((double) this.f116384h);
    }

    @Override // t4.n
    public final float getInterpolation(float f13) {
        l lVar = this;
        float f14 = f13;
        double d2 = f14 - lVar.f116380d;
        double d13 = lVar.f116378b;
        double d14 = lVar.f116377a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d13 / lVar.f116383g) * d2) * 4.0d)) + 1.0d);
        double d15 = d2 / sqrt;
        int i13 = 0;
        while (i13 < sqrt) {
            double d16 = lVar.f116381e;
            double d17 = lVar.f116379c;
            int i14 = sqrt;
            int i15 = i13;
            double d18 = lVar.f116382f;
            double d19 = lVar.f116383g;
            double d23 = ((((((-d13) * (d16 - d17)) - (d14 * d18)) / d19) * d15) / 2.0d) + d18;
            double d24 = ((((-((((d15 * d23) / 2.0d) + d16) - d17)) * d13) - (d23 * d14)) / d19) * d15;
            float f15 = (float) (d18 + d24);
            this.f116382f = f15;
            float f16 = (float) ((((d24 / 2.0d) + d18) * d15) + d16);
            this.f116381e = f16;
            int i16 = this.f116385i;
            if (i16 > 0) {
                if (f16 < 0.0f && (i16 & 1) == 1) {
                    this.f116381e = -f16;
                    this.f116382f = -f15;
                }
                float f17 = this.f116381e;
                if (f17 > 1.0f && (i16 & 2) == 2) {
                    this.f116381e = 2.0f - f17;
                    this.f116382f = -this.f116382f;
                }
            }
            f14 = f13;
            sqrt = i14;
            i13 = i15 + 1;
            lVar = this;
        }
        l lVar2 = lVar;
        lVar2.f116380d = f14;
        return lVar2.f116381e;
    }
}
