package nm1;

/* loaded from: classes5.dex */
public final class y0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91510b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91511c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91512d;

    public y0(int i13, int i14, int i15) {
        super(i13, 0);
        this.f91510b = i13;
        this.f91511c = i14;
        this.f91512d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f91510b == y0Var.f91510b && this.f91511c == y0Var.f91511c && this.f91512d == y0Var.f91512d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91512d) + ep.b.b(this.f91511c, Integer.hashCode(this.f91510b) * 31, 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91510b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TabUnselectedEvent(id=");
        sb3.append(this.f91510b);
        sb3.append(", tabID=");
        sb3.append(this.f91511c);
        sb3.append(", index=");
        return a.a.n(sb3, this.f91512d, ")");
    }
}
