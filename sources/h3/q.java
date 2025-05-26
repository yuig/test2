package h3;

/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66745c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66746d;

    public q(float f13, float f14) {
        super(false, true, 1);
        this.f66745c = f13;
        this.f66746d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f66745c, qVar.f66745c) == 0 && Float.compare(this.f66746d, qVar.f66746d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66746d) + (Float.hashCode(this.f66745c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReflectiveQuadTo(x=");
        sb3.append(this.f66745c);
        sb3.append(", y=");
        return d7.g.h(sb3, this.f66746d, ')');
    }
}
