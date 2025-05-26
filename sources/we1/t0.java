package we1;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f129611a;

    /* renamed from: b, reason: collision with root package name */
    public final float f129612b;

    /* renamed from: c, reason: collision with root package name */
    public final float f129613c;

    public t0(float f13, float f14, float f15) {
        this.f129611a = f13;
        this.f129612b = f14;
        this.f129613c = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Float.compare(this.f129611a, t0Var.f129611a) == 0 && Float.compare(this.f129612b, t0Var.f129612b) == 0 && Float.compare(this.f129613c, t0Var.f129613c) == 0 && Float.compare(0.9367816f, 0.9367816f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.9367816f) + a.a.a(this.f129613c, a.a.a(this.f129612b, Float.hashCode(this.f129611a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PositionOffsetsByColumn(columnOneOffsetX=");
        sb3.append(this.f129611a);
        sb3.append(", columnOneOffsetY=");
        sb3.append(this.f129612b);
        sb3.append(", columnTwoOffsetY=");
        return d7.g.i(sb3, this.f129613c, ", columnThreeOffsetY=0.9367816)");
    }
}
