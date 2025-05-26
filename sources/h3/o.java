package h3;

/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66737c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66738d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66739e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66740f;

    public o(float f13, float f14, float f15, float f16) {
        super(false, true, 1);
        this.f66737c = f13;
        this.f66738d = f14;
        this.f66739e = f15;
        this.f66740f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f66737c, oVar.f66737c) == 0 && Float.compare(this.f66738d, oVar.f66738d) == 0 && Float.compare(this.f66739e, oVar.f66739e) == 0 && Float.compare(this.f66740f, oVar.f66740f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66740f) + a.a.a(this.f66739e, a.a.a(this.f66738d, Float.hashCode(this.f66737c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QuadTo(x1=");
        sb3.append(this.f66737c);
        sb3.append(", y1=");
        sb3.append(this.f66738d);
        sb3.append(", x2=");
        sb3.append(this.f66739e);
        sb3.append(", y2=");
        return d7.g.h(sb3, this.f66740f, ')');
    }
}
