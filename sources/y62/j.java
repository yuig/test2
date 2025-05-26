package y62;

/* loaded from: classes4.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final int f137943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f137944b;

    /* renamed from: c, reason: collision with root package name */
    public final float f137945c;

    /* renamed from: d, reason: collision with root package name */
    public final float f137946d;

    public j(float f13, float f14, int i13, int i14) {
        this.f137943a = i13;
        this.f137944b = i14;
        this.f137945c = f13;
        this.f137946d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f137943a == jVar.f137943a && this.f137944b == jVar.f137944b && Float.compare(this.f137945c, jVar.f137945c) == 0 && Float.compare(this.f137946d, jVar.f137946d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f137946d) + a.a.a(this.f137945c, ep.b.b(this.f137944b, Integer.hashCode(this.f137943a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageClicked(containerWidth=");
        sb3.append(this.f137943a);
        sb3.append(", containerHeight=");
        sb3.append(this.f137944b);
        sb3.append(", x=");
        sb3.append(this.f137945c);
        sb3.append(", y=");
        return d7.g.i(sb3, this.f137946d, ")");
    }
}
