package r72;

/* loaded from: classes4.dex */
public final class l extends n {

    /* renamed from: b, reason: collision with root package name */
    public final float f106528b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106529c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106530d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106531e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f106532f;

    public l(float f13, float f14, float f15, float f16, boolean z13) {
        this.f106528b = f13;
        this.f106529c = f14;
        this.f106530d = f15;
        this.f106531e = f16;
        this.f106532f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f106528b, lVar.f106528b) == 0 && Float.compare(this.f106529c, lVar.f106529c) == 0 && Float.compare(this.f106530d, lVar.f106530d) == 0 && Float.compare(this.f106531e, lVar.f106531e) == 0 && this.f106532f == lVar.f106532f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106532f) + a.a.a(this.f106531e, a.a.a(this.f106530d, a.a.a(this.f106529c, Float.hashCode(this.f106528b) * 31, 31), 31), 31);
    }

    @Override // r72.n, r72.j0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Shadow(opacity=");
        sb3.append(this.f106528b);
        sb3.append(", width=");
        sb3.append(this.f106529c);
        sb3.append(", directionX=");
        sb3.append(this.f106530d);
        sb3.append(", directionY=");
        sb3.append(this.f106531e);
        sb3.append(", useOldBorder=");
        return a.a.r(sb3, this.f106532f, ")");
    }
}
