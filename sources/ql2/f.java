package ql2;

/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final double f104103a;

    /* renamed from: b, reason: collision with root package name */
    public final double f104104b;

    public f(double d2, double d13) {
        this.f104103a = d2;
        this.f104104b = d13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        return doubleValue >= this.f104103a && doubleValue <= this.f104104b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ql2.h
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    @Override // ql2.i
    public final Comparable c() {
        return Double.valueOf(this.f104103a);
    }

    @Override // ql2.i
    public final Comparable d() {
        return Double.valueOf(this.f104104b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f104103a != fVar.f104103a || this.f104104b != fVar.f104104b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f104103a) * 31) + Double.hashCode(this.f104104b);
    }

    @Override // ql2.i
    public final boolean isEmpty() {
        return this.f104103a > this.f104104b;
    }

    public final String toString() {
        return this.f104103a + ".." + this.f104104b;
    }
}
