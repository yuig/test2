package bb2;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f22591a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22592b;

    public b(float f13, float f14) {
        this.f22591a = f13;
        this.f22592b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f22591a, bVar.f22591a) == 0 && Float.compare(this.f22592b, bVar.f22592b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22592b) + (Float.hashCode(this.f22591a) * 31);
    }

    public final String toString() {
        return "ConstrainedImageDimensions(constrainedWidth=" + this.f22591a + ", constrainedHeight=" + this.f22592b + ")";
    }
}
