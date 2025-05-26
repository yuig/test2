package r72;

/* loaded from: classes4.dex */
public final class a0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106433b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106434c;

    public a0(float f13, boolean z13) {
        this.f106433b = f13;
        this.f106434c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Float.compare(this.f106433b, a0Var.f106433b) == 0 && this.f106434c == a0Var.f106434c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106434c) + (Float.hashCode(this.f106433b) * 31);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return "Rotate(speed=" + this.f106433b + ", isClockWiseRotation=" + this.f106434c + ")";
    }
}
