package p1;

/* loaded from: classes.dex */
public final class y0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f98619a;

    /* renamed from: b, reason: collision with root package name */
    public final float f98620b;

    /* renamed from: c, reason: collision with root package name */
    public final float f98621c;

    /* renamed from: d, reason: collision with root package name */
    public final float f98622d;

    public y0(float f13, float f14, float f15, float f16) {
        this.f98619a = f13;
        this.f98620b = f14;
        this.f98621c = f15;
        this.f98622d = f16;
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative".toString());
        }
        if (f14 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative".toString());
        }
        if (f15 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative".toString());
        }
        if (f16 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative".toString());
        }
    }

    @Override // p1.x0
    public final float a() {
        return this.f98622d;
    }

    @Override // p1.x0
    public final float b(n4.k kVar) {
        return kVar == n4.k.Ltr ? this.f98621c : this.f98619a;
    }

    @Override // p1.x0
    public final float c(n4.k kVar) {
        return kVar == n4.k.Ltr ? this.f98619a : this.f98621c;
    }

    @Override // p1.x0
    public final float d() {
        return this.f98620b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return n4.e.a(this.f98619a, y0Var.f98619a) && n4.e.a(this.f98620b, y0Var.f98620b) && n4.e.a(this.f98621c, y0Var.f98621c) && n4.e.a(this.f98622d, y0Var.f98622d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f98622d) + a.a.a(this.f98621c, a.a.a(this.f98620b, Float.hashCode(this.f98619a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) n4.e.b(this.f98619a)) + ", top=" + ((Object) n4.e.b(this.f98620b)) + ", end=" + ((Object) n4.e.b(this.f98621c)) + ", bottom=" + ((Object) n4.e.b(this.f98622d)) + ')';
    }
}
