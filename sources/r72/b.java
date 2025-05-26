package r72;

/* loaded from: classes4.dex */
public final class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final float f106440b;

    public b(float f13) {
        this.f106440b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.compare(this.f106440b, ((b) obj).f106440b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106440b);
    }

    @Override // r72.g, r72.j0
    public final String toString() {
        return d7.g.i(new StringBuilder("Alpha(opacity="), this.f106440b, ")");
    }
}
