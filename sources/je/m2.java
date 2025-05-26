package je;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f75701a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75702b;

    /* renamed from: c, reason: collision with root package name */
    public float f75703c;

    /* renamed from: d, reason: collision with root package name */
    public float f75704d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75705e = false;

    public m2(float f13, float f14, float f15, float f16) {
        this.f75703c = 0.0f;
        this.f75704d = 0.0f;
        this.f75701a = f13;
        this.f75702b = f14;
        double sqrt = Math.sqrt((f16 * f16) + (f15 * f15));
        if (sqrt != 0.0d) {
            this.f75703c = (float) (f15 / sqrt);
            this.f75704d = (float) (f16 / sqrt);
        }
    }

    public final void a(float f13, float f14) {
        float f15 = f13 - this.f75701a;
        float f16 = f14 - this.f75702b;
        double sqrt = Math.sqrt((f16 * f16) + (f15 * f15));
        if (sqrt != 0.0d) {
            f15 = (float) (f15 / sqrt);
            f16 = (float) (f16 / sqrt);
        }
        float f17 = this.f75703c;
        if (f15 != (-f17) || f16 != (-this.f75704d)) {
            this.f75703c = f17 + f15;
            this.f75704d += f16;
        } else {
            this.f75705e = true;
            this.f75703c = -f16;
            this.f75704d = f15;
        }
    }

    public final void b(m2 m2Var) {
        float f13 = m2Var.f75703c;
        float f14 = this.f75703c;
        if (f13 == (-f14)) {
            float f15 = m2Var.f75704d;
            if (f15 == (-this.f75704d)) {
                this.f75705e = true;
                this.f75703c = -f15;
                this.f75704d = m2Var.f75703c;
                return;
            }
        }
        this.f75703c = f14 + f13;
        this.f75704d += m2Var.f75704d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(this.f75701a);
        sb3.append(",");
        sb3.append(this.f75702b);
        sb3.append(" ");
        sb3.append(this.f75703c);
        sb3.append(",");
        return d7.g.i(sb3, this.f75704d, ")");
    }
}
