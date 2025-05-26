package h3;

/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66769c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66770d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66771e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66772f;

    public x(float f13, float f14, float f15, float f16) {
        super(true, false, 2);
        this.f66769c = f13;
        this.f66770d = f14;
        this.f66771e = f15;
        this.f66772f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f66769c, xVar.f66769c) == 0 && Float.compare(this.f66770d, xVar.f66770d) == 0 && Float.compare(this.f66771e, xVar.f66771e) == 0 && Float.compare(this.f66772f, xVar.f66772f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66772f) + a.a.a(this.f66771e, a.a.a(this.f66770d, Float.hashCode(this.f66769c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb3.append(this.f66769c);
        sb3.append(", dy1=");
        sb3.append(this.f66770d);
        sb3.append(", dx2=");
        sb3.append(this.f66771e);
        sb3.append(", dy2=");
        return d7.g.h(sb3, this.f66772f, ')');
    }
}
