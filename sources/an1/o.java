package an1;

/* loaded from: classes5.dex */
public final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    public final int f15756b;

    public o(int i13) {
        super(i13);
        this.f15756b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f15756b == ((o) obj).f15756b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15756b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f15756b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f15756b, ")");
    }
}
