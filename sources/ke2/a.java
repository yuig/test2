package ke2;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f79302a;

    /* renamed from: b, reason: collision with root package name */
    public float f79303b;

    public a(float f13, float f14) {
        this.f79302a = f13;
        this.f79303b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f79302a, aVar.f79302a) == 0 && Float.compare(this.f79303b, aVar.f79303b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f79303b) + (Float.hashCode(this.f79302a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Flip(horizontal=");
        sb3.append(this.f79302a);
        sb3.append(", vertical=");
        return d7.g.h(sb3, this.f79303b, ')');
    }
}
