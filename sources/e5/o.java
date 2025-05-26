package e5;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: k, reason: collision with root package name */
    public static final o f57246k;

    /* renamed from: a, reason: collision with root package name */
    public final float f57247a;

    /* renamed from: b, reason: collision with root package name */
    public final float f57248b;

    /* renamed from: c, reason: collision with root package name */
    public final float f57249c;

    /* renamed from: d, reason: collision with root package name */
    public final float f57250d;

    /* renamed from: e, reason: collision with root package name */
    public final float f57251e;

    /* renamed from: f, reason: collision with root package name */
    public final float f57252f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f57253g;

    /* renamed from: h, reason: collision with root package name */
    public final float f57254h;

    /* renamed from: i, reason: collision with root package name */
    public final float f57255i;

    /* renamed from: j, reason: collision with root package name */
    public final float f57256j;

    static {
        float[] fArr = b.f57211c;
        float c13 = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f57209a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = (fArr3[1] * f15) + f14;
        float f17 = fArr[2];
        float f18 = (fArr3[2] * f17) + f16;
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f15) + (fArr4[0] * f13);
        float[] fArr5 = fArr2[2];
        float f23 = (f17 * fArr5[2]) + (f15 * fArr5[1]) + (f13 * fArr5[0]);
        float f24 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c13) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f23) * exp) + 1.0f) - exp};
        float f25 = 1.0f / ((5.0f * c13) + 1.0f);
        float f26 = f25 * f25 * f25 * f25;
        float f27 = 1.0f - f26;
        float cbrt = (0.1f * f27 * f27 * ((float) Math.cbrt(c13 * 5.0d))) + (f26 * c13);
        float c14 = b.c() / fArr[1];
        double d13 = c14;
        float sqrt = ((float) Math.sqrt(d13)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d13, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f19) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f23) / 100.0d, 0.42d)};
        float f28 = fArr7[0];
        float f29 = (f28 * 400.0f) / (f28 + 27.13f);
        float f33 = fArr7[1];
        float f34 = (f33 * 400.0f) / (f33 + 27.13f);
        float f35 = fArr7[2];
        float[] fArr8 = {f29, f34, (400.0f * f35) / (f35 + 27.13f)};
        f57246k = new o(c14, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f24, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public o(float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr, float f19, float f23, float f24) {
        this.f57252f = f13;
        this.f57247a = f14;
        this.f57248b = f15;
        this.f57249c = f16;
        this.f57250d = f17;
        this.f57251e = f18;
        this.f57253g = fArr;
        this.f57254h = f19;
        this.f57255i = f23;
        this.f57256j = f24;
    }
}
