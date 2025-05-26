package nn1;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f91562a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91563b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91564c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91565d;

    public f(int i13, int i14, int i15, int i16) {
        this.f91562a = i13;
        this.f91563b = i14;
        this.f91564c = i15;
        this.f91565d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f91562a == fVar.f91562a && this.f91563b == fVar.f91563b && this.f91564c == fVar.f91564c && this.f91565d == fVar.f91565d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91565d) + ep.b.b(this.f91564c, ep.b.b(this.f91563b, Integer.hashCode(this.f91562a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GestaltSplitButtonColorPalette(textButtonBackgroundColor=");
        sb3.append(this.f91562a);
        sb3.append(", textColor=");
        sb3.append(this.f91563b);
        sb3.append(", iconButtonBackgroundColor=");
        sb3.append(this.f91564c);
        sb3.append(", iconColor=");
        return a.a.n(sb3, this.f91565d, ")");
    }
}
