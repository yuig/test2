package x62;

/* loaded from: classes4.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    public final float f133994a;

    public q(float f13) {
        this.f133994a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Float.compare(this.f133994a, ((q) obj).f133994a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f133994a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("BrushSizeChanged(value="), this.f133994a, ")");
    }
}
