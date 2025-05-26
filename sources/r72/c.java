package r72;

/* loaded from: classes4.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final float f106446b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106447c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106448d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106449e;

    public c(float f13, float f14, float f15, float f16) {
        this.f106446b = f13;
        this.f106447c = f14;
        this.f106448d = f15;
        this.f106449e = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f106446b, cVar.f106446b) == 0 && Float.compare(this.f106447c, cVar.f106447c) == 0 && Float.compare(this.f106448d, cVar.f106448d) == 0 && Float.compare(this.f106449e, cVar.f106449e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106449e) + a.a.a(this.f106448d, a.a.a(this.f106447c, Float.hashCode(this.f106446b) * 31, 31), 31);
    }

    @Override // r72.g, r72.j0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FadeGradient(x0=");
        sb3.append(this.f106446b);
        sb3.append(", y0=");
        sb3.append(this.f106447c);
        sb3.append(", x1=");
        sb3.append(this.f106448d);
        sb3.append(", y1=");
        return d7.g.i(sb3, this.f106449e, ")");
    }
}
