package r72;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f106666a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106667b;

    public u0(float f13, float f14) {
        this.f106666a = f13;
        this.f106667b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Float.compare(this.f106666a, u0Var.f106666a) == 0 && Float.compare(this.f106667b, u0Var.f106667b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106667b) + (Float.hashCode(this.f106666a) * 31);
    }

    public final String toString() {
        return "Point2d(x=" + this.f106666a + ", y=" + this.f106667b + ")";
    }
}
