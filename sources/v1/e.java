package v1;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f123825a;

    public e(float f13) {
        this.f123825a = f13;
    }

    @Override // v1.b
    public final float a(long j13, n4.b bVar) {
        return bVar.l0(this.f123825a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && n4.e.a(this.f123825a, ((e) obj).f123825a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f123825a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("CornerSize(size = "), this.f123825a, ".dp)");
    }
}
