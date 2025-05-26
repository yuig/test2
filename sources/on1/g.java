package on1;

/* loaded from: classes5.dex */
public final class g extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f96736b;

    public g(int i13) {
        super(i13);
        this.f96736b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f96736b == ((g) obj).f96736b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96736b);
    }

    @Override // on1.i, gm1.c
    public final int j() {
        return this.f96736b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Checked(id="), this.f96736b, ")");
    }
}
