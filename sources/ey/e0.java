package ey;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public int f60478a;

    /* renamed from: b */
    public int f60479b;

    /* renamed from: c */
    public int f60480c;

    public final int a() {
        return this.f60478a;
    }

    public final int b() {
        return this.f60479b;
    }

    public final int c() {
        return this.f60480c;
    }

    public final void d(int i13) {
        this.f60478a = i13;
    }

    public final void e(int i13) {
        this.f60479b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f60478a == e0Var.f60478a && this.f60479b == e0Var.f60479b && this.f60480c == e0Var.f60480c;
    }

    public final void f(int i13) {
        this.f60480c = i13;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60480c) + ep.b.b(this.f60479b, Integer.hashCode(this.f60478a) * 31, 31);
    }

    public final String toString() {
        int i13 = this.f60478a;
        int i14 = this.f60479b;
        return a.a.n(a.a.t("FeedStoryContainerTypeCounts(carouselCount=", i13, ", itemGridCount=", i14, ", otherCount="), this.f60480c, ")");
    }
}
