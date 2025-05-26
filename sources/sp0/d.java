package sp0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f114883a;

    /* renamed from: b, reason: collision with root package name */
    public final float f114884b;

    public d(float f13, float f14) {
        this.f114883a = f13;
        this.f114884b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f114883a, dVar.f114883a) == 0 && Float.compare(this.f114884b, dVar.f114884b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f114884b) + (Float.hashCode(this.f114883a) * 31);
    }

    public final String toString() {
        return "Position(x=" + this.f114883a + ", y=" + this.f114884b + ")";
    }
}
