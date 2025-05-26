package yi1;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f139139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139141c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139142d;

    public q(int i13, int i14, int i15, int i16) {
        this.f139139a = i13;
        this.f139140b = i14;
        this.f139141c = i15;
        this.f139142d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f139139a == qVar.f139139a && this.f139140b == qVar.f139140b && this.f139141c == qVar.f139141c && this.f139142d == qVar.f139142d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139142d) + ep.b.b(this.f139141c, ep.b.b(this.f139140b, Integer.hashCode(this.f139139a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinImageEdges(left=");
        sb3.append(this.f139139a);
        sb3.append(", top=");
        sb3.append(this.f139140b);
        sb3.append(", right=");
        sb3.append(this.f139141c);
        sb3.append(", bottom=");
        return a.a.n(sb3, this.f139142d, ")");
    }
}
