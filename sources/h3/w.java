package h3;

/* loaded from: classes.dex */
public final class w extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66765c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66766d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66767e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66768f;

    public w(float f13, float f14, float f15, float f16) {
        super(false, true, 1);
        this.f66765c = f13;
        this.f66766d = f14;
        this.f66767e = f15;
        this.f66768f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f66765c, wVar.f66765c) == 0 && Float.compare(this.f66766d, wVar.f66766d) == 0 && Float.compare(this.f66767e, wVar.f66767e) == 0 && Float.compare(this.f66768f, wVar.f66768f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66768f) + a.a.a(this.f66767e, a.a.a(this.f66766d, Float.hashCode(this.f66765c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeQuadTo(dx1=");
        sb3.append(this.f66765c);
        sb3.append(", dy1=");
        sb3.append(this.f66766d);
        sb3.append(", dx2=");
        sb3.append(this.f66767e);
        sb3.append(", dy2=");
        return d7.g.h(sb3, this.f66768f, ')');
    }
}
