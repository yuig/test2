package h3;

/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f66735c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66736d;

    public n(float f13, float f14) {
        super(false, false, 3);
        this.f66735c = f13;
        this.f66736d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f66735c, nVar.f66735c) == 0 && Float.compare(this.f66736d, nVar.f66736d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66736d) + (Float.hashCode(this.f66735c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoveTo(x=");
        sb3.append(this.f66735c);
        sb3.append(", y=");
        return d7.g.h(sb3, this.f66736d, ')');
    }
}
