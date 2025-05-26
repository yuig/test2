package tf1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117546a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f117548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f117549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f117550e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f117551f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f117552g;

    public a(boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17) {
        this.f117546a = z13;
        this.f117547b = z14;
        this.f117548c = z15;
        this.f117549d = i13;
        this.f117550e = i14;
        this.f117551f = z16;
        this.f117552g = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f117546a == aVar.f117546a && this.f117547b == aVar.f117547b && this.f117548c == aVar.f117548c && this.f117549d == aVar.f117549d && this.f117550e == aVar.f117550e && this.f117551f == aVar.f117551f && this.f117552g == aVar.f117552g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117552g) + ep.b.e(this.f117551f, ep.b.b(this.f117550e, ep.b.b(this.f117549d, ep.b.e(this.f117548c, ep.b.e(this.f117547b, Boolean.hashCode(this.f117546a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChromeViewModel(allowPageIndicator=");
        sb3.append(this.f117546a);
        sb3.append(", allowListButton=");
        sb3.append(this.f117547b);
        sb3.append(", allowOverflowIcon=");
        sb3.append(this.f117548c);
        sb3.append(", listButtonHeight=");
        sb3.append(this.f117549d);
        sb3.append(", listButtonTextSize=");
        sb3.append(this.f117550e);
        sb3.append(", scaleVideoToFitScreenHeight=");
        sb3.append(this.f117551f);
        sb3.append(", hideNonEssentialViewsInCloseup=");
        return a.a.r(sb3, this.f117552g, ")");
    }

    public /* synthetic */ a(boolean z13, boolean z14, int i13) {
        this(true, true, true, eo1.c.space_800, eo1.c.font_size_100, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14);
    }
}
