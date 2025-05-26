package u50;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f120552c;

    public c0(int i13, int i14, int i15) {
        this.f120550a = i13;
        this.f120551b = i14;
        this.f120552c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f120550a == c0Var.f120550a && this.f120551b == c0Var.f120551b && this.f120552c == c0Var.f120552c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120552c) + ep.b.b(this.f120551b, Integer.hashCode(this.f120550a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanInfo(startIndex=");
        sb3.append(this.f120550a);
        sb3.append(", endIndex=");
        sb3.append(this.f120551b);
        sb3.append(", flags=");
        return a.a.n(sb3, this.f120552c, ")");
    }
}
