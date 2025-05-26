package r72;

/* loaded from: classes4.dex */
public final class t extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106651b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106652c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106653d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106654e;

    /* renamed from: f, reason: collision with root package name */
    public final float f106655f;

    /* renamed from: g, reason: collision with root package name */
    public final float f106656g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f106657h;

    public t(float f13, float f14, float f15, float f16, float f17, float f18, boolean z13) {
        this.f106651b = f13;
        this.f106652c = f14;
        this.f106653d = f15;
        this.f106654e = f16;
        this.f106655f = f17;
        this.f106656g = f18;
        this.f106657h = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f106651b, tVar.f106651b) == 0 && Float.compare(this.f106652c, tVar.f106652c) == 0 && Float.compare(this.f106653d, tVar.f106653d) == 0 && Float.compare(this.f106654e, tVar.f106654e) == 0 && Float.compare(this.f106655f, tVar.f106655f) == 0 && Float.compare(this.f106656g, tVar.f106656g) == 0 && this.f106657h == tVar.f106657h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106657h) + a.a.a(this.f106656g, a.a.a(this.f106655f, a.a.a(this.f106654e, a.a.a(this.f106653d, a.a.a(this.f106652c, Float.hashCode(this.f106651b) * 31, 31), 31), 31), 31), 31);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Carousel(speed=");
        sb3.append(this.f106651b);
        sb3.append(", scale=");
        sb3.append(this.f106652c);
        sb3.append(", directionX=");
        sb3.append(this.f106653d);
        sb3.append(", directionY=");
        sb3.append(this.f106654e);
        sb3.append(", spacingX=");
        sb3.append(this.f106655f);
        sb3.append(", spacingY=");
        sb3.append(this.f106656g);
        sb3.append(", mirrored=");
        return a.a.r(sb3, this.f106657h, ")");
    }
}
