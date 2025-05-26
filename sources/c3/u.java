package c3;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f25560a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25561b;

    public u(float f13, float f14) {
        this.f25560a = f13;
        this.f25561b = f14;
    }

    public final float[] a() {
        float f13 = this.f25560a;
        float f14 = this.f25561b;
        return new float[]{f13 / f14, 1.0f, ((1.0f - f13) - f14) / f14};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f25560a, uVar.f25560a) == 0 && Float.compare(this.f25561b, uVar.f25561b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25561b) + (Float.hashCode(this.f25560a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WhitePoint(x=");
        sb3.append(this.f25560a);
        sb3.append(", y=");
        return d7.g.h(sb3, this.f25561b, ')');
    }
}
