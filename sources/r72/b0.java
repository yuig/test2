package r72;

/* loaded from: classes4.dex */
public final class b0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106441b;

    public b0(float f13) {
        this.f106441b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Float.compare(this.f106441b, ((b0) obj).f106441b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106441b);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Scaly(speed="), this.f106441b, ")");
    }
}
