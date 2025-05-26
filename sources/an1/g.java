package an1;

/* loaded from: classes5.dex */
public final class g extends gm1.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f15730b;

    public g(int i13) {
        super(i13);
        this.f15730b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f15730b == ((g) obj).f15730b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15730b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f15730b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f15730b, ")");
    }
}
