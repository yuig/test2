package r72;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f106645a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106646b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106647c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106648d;

    public s0(float f13, float f14, float f15, float f16) {
        this.f106645a = f13;
        this.f106646b = f14;
        this.f106647c = f15;
        this.f106648d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Float.compare(this.f106645a, s0Var.f106645a) == 0 && Float.compare(this.f106646b, s0Var.f106646b) == 0 && Float.compare(this.f106647c, s0Var.f106647c) == 0 && Float.compare(this.f106648d, s0Var.f106648d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106648d) + a.a.a(this.f106647c, a.a.a(this.f106646b, Float.hashCode(this.f106645a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Line(x0=");
        sb3.append(this.f106645a);
        sb3.append(", y0=");
        sb3.append(this.f106646b);
        sb3.append(", x1=");
        sb3.append(this.f106647c);
        sb3.append(", y1=");
        return d7.g.i(sb3, this.f106648d, ")");
    }
}
