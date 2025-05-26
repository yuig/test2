package a3;

import kh2.s0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f478a;

    /* renamed from: b, reason: collision with root package name */
    public float f479b;

    /* renamed from: c, reason: collision with root package name */
    public float f480c;

    /* renamed from: d, reason: collision with root package name */
    public float f481d;

    public final void a(float f13, float f14, float f15, float f16) {
        this.f478a = Math.max(f13, this.f478a);
        this.f479b = Math.max(f14, this.f479b);
        this.f480c = Math.min(f15, this.f480c);
        this.f481d = Math.min(f16, this.f481d);
    }

    public final boolean b() {
        return this.f478a >= this.f480c || this.f479b >= this.f481d;
    }

    public final void c() {
        this.f478a = 0.0f;
        this.f479b = 0.0f;
        this.f480c = 0.0f;
        this.f481d = 0.0f;
    }

    public final String toString() {
        return "MutableRect(" + s0.a1(this.f478a) + ", " + s0.a1(this.f479b) + ", " + s0.a1(this.f480c) + ", " + s0.a1(this.f481d) + ')';
    }
}
