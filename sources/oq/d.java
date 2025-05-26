package oq;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f97002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f97005d;

    public d(int i13, int i14, int i15, int i16) {
        this.f97002a = i13;
        this.f97003b = i14;
        this.f97004c = i15;
        this.f97005d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f97002a == dVar.f97002a && this.f97003b == dVar.f97003b && this.f97004c == dVar.f97004c && this.f97005d == dVar.f97005d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97005d) + ep.b.b(this.f97004c, ep.b.b(this.f97003b, Integer.hashCode(this.f97002a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CloseupIdeaPinDimensions(height=");
        sb3.append(this.f97002a);
        sb3.append(", width=");
        sb3.append(this.f97003b);
        sb3.append(", displayHeight=");
        sb3.append(this.f97004c);
        sb3.append(", verticalPadding=");
        return a.a.n(sb3, this.f97005d, ")");
    }
}
