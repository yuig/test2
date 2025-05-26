package h3;

/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66761c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66762d;

    public u(float f13, float f14) {
        super(false, false, 3);
        this.f66761c = f13;
        this.f66762d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f66761c, uVar.f66761c) == 0 && Float.compare(this.f66762d, uVar.f66762d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66762d) + (Float.hashCode(this.f66761c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeLineTo(dx=");
        sb3.append(this.f66761c);
        sb3.append(", dy=");
        return d7.g.h(sb3, this.f66762d, ')');
    }
}
