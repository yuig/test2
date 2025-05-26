package n90;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f89997a;

    /* renamed from: b, reason: collision with root package name */
    public final float f89998b;

    public d(float f13, float f14) {
        this.f89997a = f13;
        this.f89998b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f89997a, dVar.f89997a) == 0 && Float.compare(this.f89998b, dVar.f89998b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89998b) + (Float.hashCode(this.f89997a) * 31);
    }

    public final String toString() {
        return "CarouselStyle(leadCardWidthRatio=" + this.f89997a + ", leadCardHeightRatio=" + this.f89998b + ")";
    }
}
