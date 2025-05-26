package r72;

/* loaded from: classes4.dex */
public final class d0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106454b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106455c;

    public d0(float f13, boolean z13) {
        this.f106454b = f13;
        this.f106455c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Float.compare(this.f106454b, d0Var.f106454b) == 0 && this.f106455c == d0Var.f106455c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106455c) + (Float.hashCode(this.f106454b) * 31);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return "Slide(speed=" + this.f106454b + ", isHorizontalDirection=" + this.f106455c + ")";
    }
}
