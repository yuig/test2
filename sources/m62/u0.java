package m62;

/* loaded from: classes4.dex */
public final class u0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f86060a;

    public u0(float f13) {
        this.f86060a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Float.compare(this.f86060a, ((u0) obj).f86060a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f86060a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("StopTrackingTouch(value="), this.f86060a, ")");
    }
}
