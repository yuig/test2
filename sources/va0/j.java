package va0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f125123a;

    /* renamed from: b, reason: collision with root package name */
    public final float f125124b;

    /* renamed from: c, reason: collision with root package name */
    public final float f125125c;

    /* renamed from: d, reason: collision with root package name */
    public final ql2.g f125126d;

    public j(float f13, float f14, float f15) {
        this.f125123a = f13;
        this.f125124b = f14;
        this.f125125c = f15;
        this.f125126d = new ql2.g(f14, f15);
    }

    public static j a(j jVar, float f13, float f14, float f15, int i13) {
        if ((i13 & 1) != 0) {
            f13 = jVar.f125123a;
        }
        if ((i13 & 2) != 0) {
            f14 = jVar.f125124b;
        }
        if ((i13 & 4) != 0) {
            f15 = jVar.f125125c;
        }
        jVar.getClass();
        return new j(f13, f14, f15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f125123a, jVar.f125123a) == 0 && Float.compare(this.f125124b, jVar.f125124b) == 0 && Float.compare(this.f125125c, jVar.f125125c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f125125c) + a.a.a(this.f125124b, Float.hashCode(this.f125123a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectSliderState(value=");
        sb3.append(this.f125123a);
        sb3.append(", valueFrom=");
        sb3.append(this.f125124b);
        sb3.append(", valueTo=");
        return d7.g.i(sb3, this.f125125c, ")");
    }
}
