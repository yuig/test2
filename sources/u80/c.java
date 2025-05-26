package u80;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f120916a;

    /* renamed from: b, reason: collision with root package name */
    public final float f120917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f120918c;

    public /* synthetic */ c(float f13, int i13, int i14) {
        this(0.0f, (i14 & 2) != 0 ? 0.0f : f13, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f120916a, cVar.f120916a) == 0 && Float.compare(this.f120917b, cVar.f120917b) == 0 && this.f120918c == cVar.f120918c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120918c) + a.a.a(this.f120917b, Float.hashCode(this.f120916a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CardTransformation(xOffsetPercentage=");
        sb3.append(this.f120916a);
        sb3.append(", yOffsetPercentage=");
        sb3.append(this.f120917b);
        sb3.append(", rotationDegrees=");
        return a.a.n(sb3, this.f120918c, ")");
    }

    public c(float f13, float f14, int i13) {
        this.f120916a = f13;
        this.f120917b = f14;
        this.f120918c = i13;
    }
}
