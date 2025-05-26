package r72;

/* loaded from: classes4.dex */
public final class e0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106462b;

    public e0(float f13) {
        this.f106462b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Float.compare(this.f106462b, ((e0) obj).f106462b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106462b);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Spinny(speed="), this.f106462b, ")");
    }
}
