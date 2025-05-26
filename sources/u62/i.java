package u62;

/* loaded from: classes4.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final int f120840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120841b;

    /* renamed from: c, reason: collision with root package name */
    public final float f120842c;

    /* renamed from: d, reason: collision with root package name */
    public final float f120843d;

    public i(float f13, float f14, int i13, int i14) {
        this.f120840a = i13;
        this.f120841b = i14;
        this.f120842c = f13;
        this.f120843d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f120840a == iVar.f120840a && this.f120841b == iVar.f120841b && Float.compare(this.f120842c, iVar.f120842c) == 0 && Float.compare(this.f120843d, iVar.f120843d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120843d) + a.a.a(this.f120842c, ep.b.b(this.f120841b, Integer.hashCode(this.f120840a) * 31, 31), 31);
    }

    @Override // u62.k
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageClicked(containerWidth=");
        sb3.append(this.f120840a);
        sb3.append(", containerHeight=");
        sb3.append(this.f120841b);
        sb3.append(", x=");
        sb3.append(this.f120842c);
        sb3.append(", y=");
        return d7.g.i(sb3, this.f120843d, ")");
    }
}
