package r72;

/* loaded from: classes4.dex */
public final class f0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106467b;

    public f0(float f13) {
        this.f106467b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Float.compare(this.f106467b, ((f0) obj).f106467b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106467b);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Swivel(speed="), this.f106467b, ")");
    }
}
