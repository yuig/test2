package j21;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f74488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74491d;

    public b(int i13, int i14, int i15, int i16) {
        this.f74488a = i13;
        this.f74489b = i14;
        this.f74490c = i15;
        this.f74491d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f74488a == bVar.f74488a && this.f74489b == bVar.f74489b && this.f74490c == bVar.f74490c && this.f74491d == bVar.f74491d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74491d) + ep.b.b(this.f74490c, ep.b.b(this.f74489b, Integer.hashCode(this.f74488a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CarouselPadding(start=");
        sb3.append(this.f74488a);
        sb3.append(", top=");
        sb3.append(this.f74489b);
        sb3.append(", end=");
        sb3.append(this.f74490c);
        sb3.append(", bottom=");
        return a.a.n(sb3, this.f74491d, ")");
    }
}
