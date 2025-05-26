package m4;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f85793c = new g(f.f85791b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f85794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85795b;

    public g(float f13, int i13) {
        this.f85794a = f13;
        this.f85795b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f13 = gVar.f85794a;
        float f14 = f.f85790a;
        return Float.compare(this.f85794a, f13) == 0 && this.f85795b == gVar.f85795b;
    }

    public final int hashCode() {
        float f13 = f.f85790a;
        return Integer.hashCode(this.f85795b) + (Float.hashCode(this.f85794a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("LineHeightStyle(alignment=");
        float f13 = this.f85794a;
        if (f13 == 0.0f) {
            float f14 = f.f85790a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f13 == f.f85790a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f13 == f.f85791b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f13 == f.f85792c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f13 + ')';
        }
        sb3.append((Object) str);
        sb3.append(", trim=");
        int i13 = this.f85795b;
        sb3.append((Object) (i13 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i13 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i13 == 17 ? "LineHeightStyle.Trim.Both" : i13 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb3.append(')');
        return sb3.toString();
    }
}
