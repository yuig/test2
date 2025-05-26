package nm1;

/* loaded from: classes5.dex */
public final class x0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91507b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91508c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91509d;

    public x0(int i13, int i14, int i15) {
        super(i13, 0);
        this.f91507b = i13;
        this.f91508c = i14;
        this.f91509d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f91507b == x0Var.f91507b && this.f91508c == x0Var.f91508c && this.f91509d == x0Var.f91509d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91509d) + ep.b.b(this.f91508c, Integer.hashCode(this.f91507b) * 31, 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91507b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TabSelectedEvent(id=");
        sb3.append(this.f91507b);
        sb3.append(", tabID=");
        sb3.append(this.f91508c);
        sb3.append(", index=");
        return a.a.n(sb3, this.f91509d, ")");
    }
}
