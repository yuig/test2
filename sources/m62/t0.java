package m62;

/* loaded from: classes4.dex */
public final class t0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f86058a;

    public t0(float f13) {
        this.f86058a = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Float.compare(this.f86058a, ((t0) obj).f86058a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f86058a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("StartTrackingTouch(value="), this.f86058a, ")");
    }
}
