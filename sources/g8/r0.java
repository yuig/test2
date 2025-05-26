package g8;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f64396a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64397b;

    public r0(int i13, boolean z13) {
        this.f64396a = i13;
        this.f64397b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f64396a == r0Var.f64396a && this.f64397b == r0Var.f64397b;
    }

    public final int hashCode() {
        return (this.f64396a * 31) + (this.f64397b ? 1 : 0);
    }
}
