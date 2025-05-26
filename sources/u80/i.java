package u80;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f120943a;

    /* renamed from: b, reason: collision with root package name */
    public final float f120944b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f120945c;

    /* renamed from: d, reason: collision with root package name */
    public final float f120946d;

    public i(float f13, float f14, boolean z13, float f15) {
        this.f120943a = f13;
        this.f120944b = f14;
        this.f120945c = z13;
        this.f120946d = f15;
    }

    public static i a(i iVar, float f13, boolean z13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = iVar.f120943a;
        }
        float f15 = iVar.f120944b;
        if ((i13 & 4) != 0) {
            z13 = iVar.f120945c;
        }
        if ((i13 & 8) != 0) {
            f14 = iVar.f120946d;
        }
        iVar.getClass();
        return new i(f13, f15, z13, f14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n4.e.a(this.f120943a, iVar.f120943a) && Float.compare(this.f120944b, iVar.f120944b) == 0 && this.f120945c == iVar.f120945c && n4.e.a(this.f120946d, iVar.f120946d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f120946d) + ep.b.e(this.f120945c, a.a.a(this.f120944b, Float.hashCode(this.f120943a) * 31, 31), 31);
    }

    public final String toString() {
        return "CarouselCardPreviewStyle(width=" + n4.e.b(this.f120943a) + ", aspectRatio=" + this.f120944b + ", hasBorder=" + this.f120945c + ", cornerRadius=" + n4.e.b(this.f120946d) + ")";
    }
}
