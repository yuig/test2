package h3;

/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66747c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66748d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66749e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66750f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f66751g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66752h;

    /* renamed from: i, reason: collision with root package name */
    public final float f66753i;

    public r(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
        super(false, false, 3);
        this.f66747c = f13;
        this.f66748d = f14;
        this.f66749e = f15;
        this.f66750f = z13;
        this.f66751g = z14;
        this.f66752h = f16;
        this.f66753i = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f66747c, rVar.f66747c) == 0 && Float.compare(this.f66748d, rVar.f66748d) == 0 && Float.compare(this.f66749e, rVar.f66749e) == 0 && this.f66750f == rVar.f66750f && this.f66751g == rVar.f66751g && Float.compare(this.f66752h, rVar.f66752h) == 0 && Float.compare(this.f66753i, rVar.f66753i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66753i) + a.a.a(this.f66752h, ep.b.e(this.f66751g, ep.b.e(this.f66750f, a.a.a(this.f66749e, a.a.a(this.f66748d, Float.hashCode(this.f66747c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb3.append(this.f66747c);
        sb3.append(", verticalEllipseRadius=");
        sb3.append(this.f66748d);
        sb3.append(", theta=");
        sb3.append(this.f66749e);
        sb3.append(", isMoreThanHalf=");
        sb3.append(this.f66750f);
        sb3.append(", isPositiveArc=");
        sb3.append(this.f66751g);
        sb3.append(", arcStartDx=");
        sb3.append(this.f66752h);
        sb3.append(", arcStartDy=");
        return d7.g.h(sb3, this.f66753i, ')');
    }
}
