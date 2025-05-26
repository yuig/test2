package ef0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f58828a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58829b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58830c;

    public /* synthetic */ a(float f13, int i13) {
        this((i13 & 1) != 0 ? 0.0f : f13, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f58828a, aVar.f58828a) == 0 && this.f58829b == aVar.f58829b && this.f58830c == aVar.f58830c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58830c) + ep.b.e(this.f58829b, Float.hashCode(this.f58828a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BackgroundCornerSettings(cornerRadius=");
        sb3.append(this.f58828a);
        sb3.append(", isSquareTopCorners=");
        sb3.append(this.f58829b);
        sb3.append(", isSquareBottomCorners=");
        return a.a.r(sb3, this.f58830c, ")");
    }

    public a(float f13, boolean z13, boolean z14) {
        this.f58828a = f13;
        this.f58829b = z13;
        this.f58830c = z14;
    }
}
