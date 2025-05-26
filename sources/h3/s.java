package h3;

/* loaded from: classes.dex */
public final class s extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66754c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66755d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66756e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66757f;

    /* renamed from: g, reason: collision with root package name */
    public final float f66758g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66759h;

    public s(float f13, float f14, float f15, float f16, float f17, float f18) {
        super(true, false, 2);
        this.f66754c = f13;
        this.f66755d = f14;
        this.f66756e = f15;
        this.f66757f = f16;
        this.f66758g = f17;
        this.f66759h = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f66754c, sVar.f66754c) == 0 && Float.compare(this.f66755d, sVar.f66755d) == 0 && Float.compare(this.f66756e, sVar.f66756e) == 0 && Float.compare(this.f66757f, sVar.f66757f) == 0 && Float.compare(this.f66758g, sVar.f66758g) == 0 && Float.compare(this.f66759h, sVar.f66759h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66759h) + a.a.a(this.f66758g, a.a.a(this.f66757f, a.a.a(this.f66756e, a.a.a(this.f66755d, Float.hashCode(this.f66754c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeCurveTo(dx1=");
        sb3.append(this.f66754c);
        sb3.append(", dy1=");
        sb3.append(this.f66755d);
        sb3.append(", dx2=");
        sb3.append(this.f66756e);
        sb3.append(", dy2=");
        sb3.append(this.f66757f);
        sb3.append(", dx3=");
        sb3.append(this.f66758g);
        sb3.append(", dy3=");
        return d7.g.h(sb3, this.f66759h, ')');
    }
}
