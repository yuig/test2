package h3;

/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66741c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66742d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66743e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66744f;

    public p(float f13, float f14, float f15, float f16) {
        super(true, false, 2);
        this.f66741c = f13;
        this.f66742d = f14;
        this.f66743e = f15;
        this.f66744f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f66741c, pVar.f66741c) == 0 && Float.compare(this.f66742d, pVar.f66742d) == 0 && Float.compare(this.f66743e, pVar.f66743e) == 0 && Float.compare(this.f66744f, pVar.f66744f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66744f) + a.a.a(this.f66743e, a.a.a(this.f66742d, Float.hashCode(this.f66741c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb3.append(this.f66741c);
        sb3.append(", y1=");
        sb3.append(this.f66742d);
        sb3.append(", x2=");
        sb3.append(this.f66743e);
        sb3.append(", y2=");
        return d7.g.h(sb3, this.f66744f, ')');
    }
}
