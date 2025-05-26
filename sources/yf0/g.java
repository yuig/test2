package yf0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f138959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f138962d;

    public g(int i13, int i14, int i15, int i16) {
        this.f138959a = i13;
        this.f138960b = i14;
        this.f138961c = i15;
        this.f138962d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f138959a == gVar.f138959a && this.f138960b == gVar.f138960b && this.f138961c == gVar.f138961c && this.f138962d == gVar.f138962d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f138962d) + ep.b.b(this.f138961c, ep.b.b(this.f138960b, Integer.hashCode(this.f138959a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InitialPadding(start=");
        sb3.append(this.f138959a);
        sb3.append(", top=");
        sb3.append(this.f138960b);
        sb3.append(", end=");
        sb3.append(this.f138961c);
        sb3.append(", bottom=");
        return a.a.n(sb3, this.f138962d, ")");
    }
}
