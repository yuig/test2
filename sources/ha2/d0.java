package ha2;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a */
    public final int f68425a;

    /* renamed from: b */
    public final int f68426b;

    /* renamed from: c */
    public final int f68427c;

    /* renamed from: d */
    public final int f68428d;

    public d0(int i13, int i14, int i15, int i16) {
        this.f68425a = i13;
        this.f68426b = i14;
        this.f68427c = i15;
        this.f68428d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f68425a == d0Var.f68425a && this.f68426b == d0Var.f68426b && this.f68427c == d0Var.f68427c && this.f68428d == d0Var.f68428d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68428d) + ep.b.b(this.f68427c, ep.b.b(this.f68426b, Integer.hashCode(this.f68425a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ViewMargins(startRes=");
        sb3.append(this.f68425a);
        sb3.append(", topRes=");
        sb3.append(this.f68426b);
        sb3.append(", endRes=");
        sb3.append(this.f68427c);
        sb3.append(", bottomRes=");
        return a.a.n(sb3, this.f68428d, ")");
    }
}
