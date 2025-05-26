package r72;

/* loaded from: classes4.dex */
public final class h0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106491b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106492c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106493d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106494e;

    public h0(float f13, float f14, float f15, float f16) {
        this.f106491b = f13;
        this.f106492c = f14;
        this.f106493d = f15;
        this.f106494e = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Float.compare(this.f106491b, h0Var.f106491b) == 0 && Float.compare(this.f106492c, h0Var.f106492c) == 0 && Float.compare(this.f106493d, h0Var.f106493d) == 0 && Float.compare(this.f106494e, h0Var.f106494e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106494e) + a.a.a(this.f106493d, a.a.a(this.f106492c, Float.hashCode(this.f106491b) * 31, 31), 31);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Wobbly(speed=");
        sb3.append(this.f106491b);
        sb3.append(", angle=");
        sb3.append(this.f106492c);
        sb3.append(", directionX=");
        sb3.append(this.f106493d);
        sb3.append(", directionY=");
        return d7.g.i(sb3, this.f106494e, ")");
    }
}
