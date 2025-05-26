package r72;

/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: e, reason: collision with root package name */
    public static final j1 f106504e = new j1(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final j1 f106505f = new j1(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f106506a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106507b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106508c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106509d;

    public j1(float f13, float f14, float f15, float f16) {
        this.f106506a = f13;
        this.f106507b = f14;
        this.f106508c = f15;
        this.f106509d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Float.compare(this.f106506a, j1Var.f106506a) == 0 && Float.compare(this.f106507b, j1Var.f106507b) == 0 && Float.compare(this.f106508c, j1Var.f106508c) == 0 && Float.compare(this.f106509d, j1Var.f106509d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f106509d) + a.a.a(this.f106508c, a.a.a(this.f106507b, Float.hashCode(this.f106506a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MaskBounds(left=");
        sb3.append(this.f106506a);
        sb3.append(", top=");
        sb3.append(this.f106507b);
        sb3.append(", width=");
        sb3.append(this.f106508c);
        sb3.append(", height=");
        return d7.g.i(sb3, this.f106509d, ")");
    }
}
