package h3;

/* loaded from: classes.dex */
public final class v extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66763c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66764d;

    public v(float f13, float f14) {
        super(false, false, 3);
        this.f66763c = f13;
        this.f66764d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f66763c, vVar.f66763c) == 0 && Float.compare(this.f66764d, vVar.f66764d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66764d) + (Float.hashCode(this.f66763c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RelativeMoveTo(dx=");
        sb3.append(this.f66763c);
        sb3.append(", dy=");
        return d7.g.h(sb3, this.f66764d, ')');
    }
}
