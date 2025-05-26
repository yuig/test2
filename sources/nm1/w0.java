package nm1;

/* loaded from: classes5.dex */
public final class w0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91502b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91503c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91504d;

    public w0(int i13, int i14, int i15) {
        super(i13, 0);
        this.f91502b = i13;
        this.f91503c = i14;
        this.f91504d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f91502b == w0Var.f91502b && this.f91503c == w0Var.f91503c && this.f91504d == w0Var.f91504d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91504d) + ep.b.b(this.f91503c, Integer.hashCode(this.f91502b) * 31, 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91502b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TabReselectedEvent(id=");
        sb3.append(this.f91502b);
        sb3.append(", tabID=");
        sb3.append(this.f91503c);
        sb3.append(", index=");
        return a.a.n(sb3, this.f91504d, ")");
    }
}
