package am1;

/* loaded from: classes5.dex */
public final class g extends gm1.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f15537b;

    public g(int i13) {
        super(i13);
        this.f15537b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f15537b == ((g) obj).f15537b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15537b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f15537b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f15537b, ")");
    }
}
