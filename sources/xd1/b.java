package xd1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f134622a;

    /* renamed from: b, reason: collision with root package name */
    public final float f134623b;

    /* renamed from: c, reason: collision with root package name */
    public final float f134624c;

    /* renamed from: d, reason: collision with root package name */
    public final float f134625d;

    public /* synthetic */ b(float f13, float f14, float f15, float f16, int i13) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? 0.0f : f15, (i13 & 8) != 0 ? 0.0f : f16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f134622a, bVar.f134622a) == 0 && Float.compare(this.f134623b, bVar.f134623b) == 0 && Float.compare(this.f134624c, bVar.f134624c) == 0 && Float.compare(this.f134625d, bVar.f134625d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f134625d) + a.a.a(this.f134624c, a.a.a(this.f134623b, Float.hashCode(this.f134622a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CornerRadii(topLeft=");
        sb3.append(this.f134622a);
        sb3.append(", topRight=");
        sb3.append(this.f134623b);
        sb3.append(", bottomLeft=");
        sb3.append(this.f134624c);
        sb3.append(", bottomRight=");
        return d7.g.i(sb3, this.f134625d, ")");
    }

    public b(float f13, float f14, float f15, float f16) {
        this.f134622a = f13;
        this.f134623b = f14;
        this.f134624c = f15;
        this.f134625d = f16;
    }
}
