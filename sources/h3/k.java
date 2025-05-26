package h3;

/* loaded from: classes.dex */
public final class k extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66712c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66713d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66714e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66715f;

    /* renamed from: g, reason: collision with root package name */
    public final float f66716g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66717h;

    public k(float f13, float f14, float f15, float f16, float f17, float f18) {
        super(true, false, 2);
        this.f66712c = f13;
        this.f66713d = f14;
        this.f66714e = f15;
        this.f66715f = f16;
        this.f66716g = f17;
        this.f66717h = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f66712c, kVar.f66712c) == 0 && Float.compare(this.f66713d, kVar.f66713d) == 0 && Float.compare(this.f66714e, kVar.f66714e) == 0 && Float.compare(this.f66715f, kVar.f66715f) == 0 && Float.compare(this.f66716g, kVar.f66716g) == 0 && Float.compare(this.f66717h, kVar.f66717h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66717h) + a.a.a(this.f66716g, a.a.a(this.f66715f, a.a.a(this.f66714e, a.a.a(this.f66713d, Float.hashCode(this.f66712c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CurveTo(x1=");
        sb3.append(this.f66712c);
        sb3.append(", y1=");
        sb3.append(this.f66713d);
        sb3.append(", x2=");
        sb3.append(this.f66714e);
        sb3.append(", y2=");
        sb3.append(this.f66715f);
        sb3.append(", x3=");
        sb3.append(this.f66716g);
        sb3.append(", y3=");
        return d7.g.h(sb3, this.f66717h, ')');
    }
}
