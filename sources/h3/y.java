package h3;

/* loaded from: classes.dex */
public final class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66773c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66774d;

    public y(float f13, float f14) {
        super(false, true, 1);
        this.f66773c = f13;
        this.f66774d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f66773c, yVar.f66773c) == 0 && Float.compare(this.f66774d, yVar.f66774d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66774d) + (Float.hashCode(this.f66773c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb3.append(this.f66773c);
        sb3.append(", dy=");
        return d7.g.h(sb3, this.f66774d, ')');
    }
}
