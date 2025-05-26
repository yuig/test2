package a3;

import kh2.s0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f483e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f484a;

    /* renamed from: b, reason: collision with root package name */
    public final float f485b;

    /* renamed from: c, reason: collision with root package name */
    public final float f486c;

    /* renamed from: d, reason: collision with root package name */
    public final float f487d;

    public d(float f13, float f14, float f15, float f16) {
        this.f484a = f13;
        this.f485b = f14;
        this.f486c = f15;
        this.f487d = f16;
    }

    public final boolean a(long j13) {
        return c.d(j13) >= this.f484a && c.d(j13) < this.f486c && c.e(j13) >= this.f485b && c.e(j13) < this.f487d;
    }

    public final long b() {
        return com.bumptech.glide.c.d((d() / 2.0f) + this.f484a, (c() / 2.0f) + this.f485b);
    }

    public final float c() {
        return this.f487d - this.f485b;
    }

    public final float d() {
        return this.f486c - this.f484a;
    }

    public final d e(d dVar) {
        return new d(Math.max(this.f484a, dVar.f484a), Math.max(this.f485b, dVar.f485b), Math.min(this.f486c, dVar.f486c), Math.min(this.f487d, dVar.f487d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f484a, dVar.f484a) == 0 && Float.compare(this.f485b, dVar.f485b) == 0 && Float.compare(this.f486c, dVar.f486c) == 0 && Float.compare(this.f487d, dVar.f487d) == 0;
    }

    public final boolean f(d dVar) {
        return this.f486c > dVar.f484a && dVar.f486c > this.f484a && this.f487d > dVar.f485b && dVar.f487d > this.f485b;
    }

    public final d g(float f13, float f14) {
        return new d(this.f484a + f13, this.f485b + f14, this.f486c + f13, this.f487d + f14);
    }

    public final d h(long j13) {
        return new d(c.d(j13) + this.f484a, c.e(j13) + this.f485b, c.d(j13) + this.f486c, c.e(j13) + this.f487d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f487d) + a.a.a(this.f486c, a.a.a(this.f485b, Float.hashCode(this.f484a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + s0.a1(this.f484a) + ", " + s0.a1(this.f485b) + ", " + s0.a1(this.f486c) + ", " + s0.a1(this.f487d) + ')';
    }
}
