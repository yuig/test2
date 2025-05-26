package t4;

/* loaded from: classes3.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public float f116387a;

    /* renamed from: b, reason: collision with root package name */
    public float f116388b;

    /* renamed from: c, reason: collision with root package name */
    public float f116389c;

    /* renamed from: d, reason: collision with root package name */
    public float f116390d;

    /* renamed from: e, reason: collision with root package name */
    public float f116391e;

    /* renamed from: f, reason: collision with root package name */
    public float f116392f;

    /* renamed from: g, reason: collision with root package name */
    public float f116393g;

    /* renamed from: h, reason: collision with root package name */
    public float f116394h;

    /* renamed from: i, reason: collision with root package name */
    public float f116395i;

    /* renamed from: j, reason: collision with root package name */
    public int f116396j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f116397k;

    /* renamed from: l, reason: collision with root package name */
    public float f116398l;

    /* renamed from: m, reason: collision with root package name */
    public float f116399m;

    @Override // t4.n
    public final float a() {
        return this.f116397k ? -c(this.f116399m) : c(this.f116399m);
    }

    @Override // t4.n
    public final boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f116395i - this.f116399m) < 1.0E-5f;
    }

    public final float c(float f13) {
        float f14;
        float f15;
        float f16 = this.f116390d;
        if (f13 <= f16) {
            f14 = this.f116387a;
            f15 = this.f116388b;
        } else {
            int i13 = this.f116396j;
            if (i13 == 1) {
                return 0.0f;
            }
            f13 -= f16;
            f16 = this.f116391e;
            if (f13 >= f16) {
                if (i13 == 2) {
                    return this.f116394h;
                }
                float f17 = f13 - f16;
                float f18 = this.f116392f;
                if (f17 >= f18) {
                    return this.f116395i;
                }
                float f19 = this.f116389c;
                return f19 - ((f17 * f19) / f18);
            }
            f14 = this.f116388b;
            f15 = this.f116389c;
        }
        return (((f15 - f14) * f13) / f16) + f14;
    }

    public final void d(float f13, float f14, float f15, float f16, float f17) {
        if (f13 == 0.0f) {
            f13 = 1.0E-4f;
        }
        this.f116387a = f13;
        float f18 = f13 / f15;
        float f19 = (f18 * f13) / 2.0f;
        if (f13 < 0.0f) {
            float sqrt = (float) Math.sqrt((f14 - ((((-f13) / f15) * f13) / 2.0f)) * f15);
            if (sqrt < f16) {
                this.f116396j = 2;
                this.f116387a = f13;
                this.f116388b = sqrt;
                this.f116389c = 0.0f;
                float f23 = (sqrt - f13) / f15;
                this.f116390d = f23;
                this.f116391e = sqrt / f15;
                this.f116393g = ((f13 + sqrt) * f23) / 2.0f;
                this.f116394h = f14;
                this.f116395i = f14;
                return;
            }
            this.f116396j = 3;
            this.f116387a = f13;
            this.f116388b = f16;
            this.f116389c = f16;
            float f24 = (f16 - f13) / f15;
            this.f116390d = f24;
            float f25 = f16 / f15;
            this.f116392f = f25;
            float f26 = ((f13 + f16) * f24) / 2.0f;
            float f27 = (f25 * f16) / 2.0f;
            this.f116391e = ((f14 - f26) - f27) / f16;
            this.f116393g = f26;
            this.f116394h = f14 - f27;
            this.f116395i = f14;
            return;
        }
        if (f19 >= f14) {
            this.f116396j = 1;
            this.f116387a = f13;
            this.f116388b = 0.0f;
            this.f116393g = f14;
            this.f116390d = (2.0f * f14) / f13;
            return;
        }
        float f28 = f14 - f19;
        float f29 = f28 / f13;
        if (f29 + f18 < f17) {
            this.f116396j = 2;
            this.f116387a = f13;
            this.f116388b = f13;
            this.f116389c = 0.0f;
            this.f116393g = f28;
            this.f116394h = f14;
            this.f116390d = f29;
            this.f116391e = f18;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f13 * f13) / 2.0f) + (f15 * f14));
        float f33 = (sqrt2 - f13) / f15;
        this.f116390d = f33;
        float f34 = sqrt2 / f15;
        this.f116391e = f34;
        if (sqrt2 < f16) {
            this.f116396j = 2;
            this.f116387a = f13;
            this.f116388b = sqrt2;
            this.f116389c = 0.0f;
            this.f116390d = f33;
            this.f116391e = f34;
            this.f116393g = ((f13 + sqrt2) * f33) / 2.0f;
            this.f116394h = f14;
            return;
        }
        this.f116396j = 3;
        this.f116387a = f13;
        this.f116388b = f16;
        this.f116389c = f16;
        float f35 = (f16 - f13) / f15;
        this.f116390d = f35;
        float f36 = f16 / f15;
        this.f116392f = f36;
        float f37 = ((f13 + f16) * f35) / 2.0f;
        float f38 = (f36 * f16) / 2.0f;
        this.f116391e = ((f14 - f37) - f38) / f16;
        this.f116393g = f37;
        this.f116394h = f14 - f38;
        this.f116395i = f14;
    }

    @Override // t4.n
    public final float getInterpolation(float f13) {
        float f14;
        float f15 = this.f116390d;
        if (f13 <= f15) {
            float f16 = this.f116387a;
            f14 = ((((this.f116388b - f16) * f13) * f13) / (f15 * 2.0f)) + (f16 * f13);
        } else {
            int i13 = this.f116396j;
            if (i13 == 1) {
                f14 = this.f116393g;
            } else {
                float f17 = f13 - f15;
                float f18 = this.f116391e;
                if (f17 < f18) {
                    float f19 = this.f116393g;
                    float f23 = this.f116388b;
                    f14 = ((((this.f116389c - f23) * f17) * f17) / (f18 * 2.0f)) + (f23 * f17) + f19;
                } else if (i13 == 2) {
                    f14 = this.f116394h;
                } else {
                    float f24 = f17 - f18;
                    float f25 = this.f116392f;
                    if (f24 <= f25) {
                        float f26 = this.f116394h;
                        float f27 = this.f116389c * f24;
                        f14 = (f26 + f27) - ((f27 * f24) / (f25 * 2.0f));
                    } else {
                        f14 = this.f116395i;
                    }
                }
            }
        }
        this.f116399m = f13;
        return this.f116397k ? this.f116398l - f14 : this.f116398l + f14;
    }
}
