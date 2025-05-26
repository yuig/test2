package r72;

/* loaded from: classes4.dex */
public final class g0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106478b;

    public g0(float f13) {
        this.f106478b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Float.compare(this.f106478b, ((g0) obj).f106478b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106478b);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Watery(speed="), this.f106478b, ")");
    }
}
