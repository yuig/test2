package re1;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f107673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f107674b;

    /* renamed from: c, reason: collision with root package name */
    public final int f107675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f107676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107677e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107678f;

    /* renamed from: g, reason: collision with root package name */
    public final int f107679g;

    /* renamed from: h, reason: collision with root package name */
    public final int f107680h;

    public u(float f13, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f107673a = f13;
        this.f107674b = i13;
        this.f107675c = i14;
        this.f107676d = i15;
        this.f107677e = i16;
        this.f107678f = i17;
        this.f107679g = i18;
        this.f107680h = i19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f107673a, uVar.f107673a) == 0 && this.f107674b == uVar.f107674b && this.f107675c == uVar.f107675c && this.f107676d == uVar.f107676d && this.f107677e == uVar.f107677e && this.f107678f == uVar.f107678f && this.f107679g == uVar.f107679g && this.f107680h == uVar.f107680h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107680h) + ep.b.b(this.f107679g, ep.b.b(this.f107678f, ep.b.b(this.f107677e, ep.b.b(this.f107676d, ep.b.b(this.f107675c, ep.b.b(this.f107674b, Float.hashCode(this.f107673a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeroImageThumbnailExtras(imageRotation=");
        sb3.append(this.f107673a);
        sb3.append(", imageOffset=");
        sb3.append(this.f107674b);
        sb3.append(", thumbnailWidthPx=");
        sb3.append(this.f107675c);
        sb3.append(", thumbnailHeightPx=");
        sb3.append(this.f107676d);
        sb3.append(", marginTop=");
        sb3.append(this.f107677e);
        sb3.append(", marginBottom=");
        sb3.append(this.f107678f);
        sb3.append(", marginEnd=");
        sb3.append(this.f107679g);
        sb3.append(", gravity=");
        return a.a.n(sb3, this.f107680h, ")");
    }
}
