package n90;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f89991a;

    /* renamed from: b, reason: collision with root package name */
    public final float f89992b;

    /* renamed from: c, reason: collision with root package name */
    public final float f89993c;

    /* renamed from: d, reason: collision with root package name */
    public final float f89994d;

    /* renamed from: e, reason: collision with root package name */
    public final float f89995e;

    public b(float f13, float f14, float f15, float f16, float f17) {
        this.f89991a = f13;
        this.f89992b = f14;
        this.f89993c = f15;
        this.f89994d = f16;
        this.f89995e = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n4.e.a(this.f89991a, bVar.f89991a) && n4.e.a(this.f89992b, bVar.f89992b) && Float.compare(this.f89993c, bVar.f89993c) == 0 && Float.compare(this.f89994d, bVar.f89994d) == 0 && n4.e.a(this.f89995e, bVar.f89995e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f89995e) + a.a.a(this.f89994d, a.a.a(this.f89993c, a.a.a(this.f89992b, Float.hashCode(this.f89991a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f89991a);
        String b14 = n4.e.b(this.f89992b);
        String b15 = n4.e.b(this.f89995e);
        StringBuilder w13 = a.a.w("CarouselCardStyle(width=", b13, ", height=", b14, ", cutoutOverlapPercentage=");
        w13.append(this.f89993c);
        w13.append(", cutoutHeightRatio=");
        w13.append(this.f89994d);
        w13.append(", minimumCutoutSize=");
        w13.append(b15);
        w13.append(")");
        return w13.toString();
    }
}
