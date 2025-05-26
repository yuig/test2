package nm1;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f91454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91456c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91457d;

    public o(int i13, int i14, int i15, int i16) {
        this.f91454a = i13;
        this.f91455b = i14;
        this.f91456c = i15;
        this.f91457d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f91454a == oVar.f91454a && this.f91455b == oVar.f91455b && this.f91456c == oVar.f91456c && this.f91457d == oVar.f91457d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91457d) + ep.b.b(this.f91456c, ep.b.b(this.f91455b, Integer.hashCode(this.f91454a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Connection(startID=");
        sb3.append(this.f91454a);
        sb3.append(", startSide=");
        sb3.append(this.f91455b);
        sb3.append(", endID=");
        sb3.append(this.f91456c);
        sb3.append(", endSide=");
        return a.a.n(sb3, this.f91457d, ")");
    }
}
