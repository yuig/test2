package h3;

/* loaded from: classes.dex */
public final class m extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66733c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66734d;

    public m(float f13, float f14) {
        super(false, false, 3);
        this.f66733c = f13;
        this.f66734d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f66733c, mVar.f66733c) == 0 && Float.compare(this.f66734d, mVar.f66734d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66734d) + (Float.hashCode(this.f66733c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LineTo(x=");
        sb3.append(this.f66733c);
        sb3.append(", y=");
        return d7.g.h(sb3, this.f66734d, ')');
    }
}
