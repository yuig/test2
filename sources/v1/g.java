package v1;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f123827a;

    public g(float f13) {
        this.f123827a = f13;
        if (f13 < 0.0f || f13 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // v1.b
    public final float a(long j13, n4.b bVar) {
        return (this.f123827a / 100.0f) * a3.f.c(j13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f123827a, ((g) obj).f123827a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f123827a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("CornerSize(size = "), this.f123827a, "%)");
    }
}
