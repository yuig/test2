package r72;

/* loaded from: classes4.dex */
public final class x extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106702b;

    public x(float f13) {
        this.f106702b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Float.compare(this.f106702b, ((x) obj).f106702b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106702b);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Floaty(speed="), this.f106702b, ")");
    }
}
