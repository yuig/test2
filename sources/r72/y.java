package r72;

/* loaded from: classes4.dex */
public final class y extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106709b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106710c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106711d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106712e;

    /* renamed from: f, reason: collision with root package name */
    public final float f106713f;

    /* renamed from: g, reason: collision with root package name */
    public final float f106714g;

    public y(float f13, boolean z13, float f14, float f15, float f16, float f17) {
        this.f106709b = f13;
        this.f106710c = z13;
        this.f106711d = f14;
        this.f106712e = f15;
        this.f106713f = f16;
        this.f106714g = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f106709b, yVar.f106709b) == 0 && this.f106710c == yVar.f106710c && Float.compare(this.f106711d, yVar.f106711d) == 0 && Float.compare(this.f106712e, yVar.f106712e) == 0 && Float.compare(this.f106713f, yVar.f106713f) == 0 && Float.compare(this.f106714g, yVar.f106714g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106714g) + a.a.a(this.f106713f, a.a.a(this.f106712e, a.a.a(this.f106711d, ep.b.e(this.f106710c, Float.hashCode(this.f106709b) * 31, 31), 31), 31), 31);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return "Glitch(speed=" + this.f106709b + ", animateColor=" + this.f106710c + ", intensity=" + this.f106711d + ", fragment=" + this.f106712e + ", colorDistort=" + this.f106713f + ", melt=" + this.f106714g + ")";
    }
}
