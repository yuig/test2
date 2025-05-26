package ly0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f85106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85109d;

    public a(int i13, int i14, int i15, int i16) {
        this.f85106a = i13;
        this.f85107b = i14;
        this.f85108c = i15;
        this.f85109d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f85106a == aVar.f85106a && this.f85107b == aVar.f85107b && this.f85108c == aVar.f85108c && this.f85109d == aVar.f85109d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85109d) + ep.b.b(this.f85108c, ep.b.b(this.f85107b, Integer.hashCode(this.f85106a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GridCellLayout(marginStart=");
        sb3.append(this.f85106a);
        sb3.append(", marginTop=");
        sb3.append(this.f85107b);
        sb3.append(", width=");
        sb3.append(this.f85108c);
        sb3.append(", height=");
        return a.a.n(sb3, this.f85109d, ")");
    }
}
