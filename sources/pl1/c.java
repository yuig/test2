package pl1;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f100565a;

    /* renamed from: b, reason: collision with root package name */
    public float f100566b;

    /* renamed from: c, reason: collision with root package name */
    public float f100567c;

    /* renamed from: d, reason: collision with root package name */
    public float f100568d;

    /* renamed from: e, reason: collision with root package name */
    public float f100569e;

    /* renamed from: f, reason: collision with root package name */
    public float f100570f;

    /* renamed from: h, reason: collision with root package name */
    public float f100572h;

    /* renamed from: g, reason: collision with root package name */
    public float f100571g = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100573i = true;

    public c(float f13, float f14, float f15, float f16) {
        this.f100565a = f13;
        this.f100566b = f14;
        this.f100567c = f15 * 0.5f;
        this.f100568d = f16 * 0.3f;
        this.f100569e = f13;
        this.f100570f = f13;
    }

    public final float a() {
        this.f100571g = ((this.f100566b - this.f100569e) * this.f100568d) + ((1.0f - this.f100567c) * this.f100571g);
        if (!c()) {
            return this.f100566b;
        }
        float f13 = this.f100569e;
        this.f100570f = f13;
        float f14 = f13 + this.f100571g;
        this.f100569e = f14;
        return f14;
    }

    public final float b() {
        if (this.f100573i) {
            float abs = Math.abs(this.f100565a - this.f100566b) / (80.0f / this.f100567c);
            this.f100572h = abs;
            if (abs < 0.001f) {
                abs = 0.001f;
            }
            this.f100572h = abs;
            this.f100573i = false;
        }
        return this.f100572h;
    }

    public final boolean c() {
        return Math.abs(this.f100569e - this.f100566b) > b() || Math.abs(this.f100570f - this.f100566b) > b();
    }
}
