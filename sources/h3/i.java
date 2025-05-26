package h3;

/* loaded from: classes.dex */
public final class i extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66697c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66698d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66699e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66700f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f66701g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66702h;

    /* renamed from: i, reason: collision with root package name */
    public final float f66703i;

    public i(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
        super(false, false, 3);
        this.f66697c = f13;
        this.f66698d = f14;
        this.f66699e = f15;
        this.f66700f = z13;
        this.f66701g = z14;
        this.f66702h = f16;
        this.f66703i = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f66697c, iVar.f66697c) == 0 && Float.compare(this.f66698d, iVar.f66698d) == 0 && Float.compare(this.f66699e, iVar.f66699e) == 0 && this.f66700f == iVar.f66700f && this.f66701g == iVar.f66701g && Float.compare(this.f66702h, iVar.f66702h) == 0 && Float.compare(this.f66703i, iVar.f66703i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66703i) + a.a.a(this.f66702h, ep.b.e(this.f66701g, ep.b.e(this.f66700f, a.a.a(this.f66699e, a.a.a(this.f66698d, Float.hashCode(this.f66697c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb3.append(this.f66697c);
        sb3.append(", verticalEllipseRadius=");
        sb3.append(this.f66698d);
        sb3.append(", theta=");
        sb3.append(this.f66699e);
        sb3.append(", isMoreThanHalf=");
        sb3.append(this.f66700f);
        sb3.append(", isPositiveArc=");
        sb3.append(this.f66701g);
        sb3.append(", arcStartX=");
        sb3.append(this.f66702h);
        sb3.append(", arcStartY=");
        return d7.g.h(sb3, this.f66703i, ')');
    }
}
