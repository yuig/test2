package ny;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public int f92519a;

    /* renamed from: b */
    public int f92520b;

    /* renamed from: c */
    public int f92521c;

    /* renamed from: d */
    public int f92522d;

    /* renamed from: e */
    public int f92523e;

    /* renamed from: f */
    public int f92524f;

    /* renamed from: g */
    public int f92525g;

    /* renamed from: h */
    public int f92526h;

    public final void a(int i13) {
        this.f92521c = i13;
    }

    public final void b(int i13) {
        this.f92519a = i13;
    }

    public final void c(int i13) {
        this.f92520b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f92519a == fVar.f92519a && this.f92520b == fVar.f92520b && this.f92521c == fVar.f92521c && this.f92522d == fVar.f92522d && this.f92523e == fVar.f92523e && this.f92524f == fVar.f92524f && this.f92525g == fVar.f92525g && this.f92526h == fVar.f92526h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92526h) + ep.b.b(this.f92525g, ep.b.b(this.f92524f, ep.b.b(this.f92523e, ep.b.b(this.f92522d, ep.b.b(this.f92521c, ep.b.b(this.f92520b, Integer.hashCode(this.f92519a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.f92519a;
        int i14 = this.f92520b;
        int i15 = this.f92521c;
        int i16 = this.f92522d;
        int i17 = this.f92523e;
        int i18 = this.f92524f;
        int i19 = this.f92525g;
        int i23 = this.f92526h;
        StringBuilder t13 = a.a.t("FeedPinCellTypeCounts(videoPinCount=", i13, ", videoStoryPinCount=", i14, ", otherStoryPinCount=");
        a.a.z(t13, i15, ", carouselPinCount=", i16, ", otherPinCount=");
        a.a.z(t13, i17, ", adsModelCount=", i18, ", organicModelCount=");
        t13.append(i19);
        t13.append(", modelCount=");
        t13.append(i23);
        t13.append(")");
        return t13.toString();
    }
}
