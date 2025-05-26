package i1;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f70711a;

    /* renamed from: b, reason: collision with root package name */
    public final float f70712b;

    public a(float f13, float f14) {
        this.f70711a = f13;
        this.f70712b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f70711a, aVar.f70711a) == 0 && Float.compare(this.f70712b, aVar.f70712b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f70712b) + (Float.hashCode(this.f70711a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb3.append(this.f70711a);
        sb3.append(", velocityCoefficient=");
        return d7.g.h(sb3, this.f70712b, ')');
    }
}
