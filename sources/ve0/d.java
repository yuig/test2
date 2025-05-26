package ve0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f125677a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125678b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125679c;

    public d(int i13, int i14, boolean z13) {
        this.f125677a = i13;
        this.f125678b = i14;
        this.f125679c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f125677a == dVar.f125677a && this.f125678b == dVar.f125678b && this.f125679c == dVar.f125679c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125679c) + ep.b.b(this.f125678b, Integer.hashCode(this.f125677a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BaseBubbleDrawableConfig(radiusPx=");
        sb3.append(this.f125677a);
        sb3.append(", outlineStrokeWidth=");
        sb3.append(this.f125678b);
        sb3.append(", shouldClampWidthAndHeight=");
        return a.a.r(sb3, this.f125679c, ")");
    }
}
