package r72;

/* loaded from: classes4.dex */
public final class c0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106450b;

    public c0(float f13) {
        this.f106450b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Float.compare(this.f106450b, ((c0) obj).f106450b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106450b);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Shaky(speed="), this.f106450b, ")");
    }
}
