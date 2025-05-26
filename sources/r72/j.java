package r72;

/* loaded from: classes4.dex */
public final class j extends n {

    /* renamed from: b, reason: collision with root package name */
    public final float f106500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106501c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106502d;

    public j(float f13, int i13, boolean z13) {
        this.f106500b = f13;
        this.f106501c = i13;
        this.f106502d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f106500b, jVar.f106500b) == 0 && this.f106501c == jVar.f106501c && this.f106502d == jVar.f106502d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106502d) + ep.b.b(this.f106501c, Float.hashCode(this.f106500b) * 31, 31);
    }

    @Override // r72.n, r72.j0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Outline(width=");
        sb3.append(this.f106500b);
        sb3.append(", color=");
        sb3.append(this.f106501c);
        sb3.append(", useOldBorder=");
        return a.a.r(sb3, this.f106502d, ")");
    }
}
