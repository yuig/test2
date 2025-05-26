package h42;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f67644a;

    /* renamed from: b, reason: collision with root package name */
    public final float f67645b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67646c;

    public b(int i13, float f13, int i14) {
        this.f67644a = i13;
        this.f67645b = f13;
        this.f67646c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f67644a == bVar.f67644a && Float.compare(this.f67645b, bVar.f67645b) == 0 && this.f67646c == bVar.f67646c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67646c) + a.a.a(this.f67645b, Integer.hashCode(this.f67644a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnPageScrolled(position=");
        sb3.append(this.f67644a);
        sb3.append(", positionOffset=");
        sb3.append(this.f67645b);
        sb3.append(", positionOffsetPixels=");
        return a.a.n(sb3, this.f67646c, ")");
    }
}
