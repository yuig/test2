package dm1;

/* loaded from: classes5.dex */
public final class m extends n {

    /* renamed from: b, reason: collision with root package name */
    public final int f55380b;

    public m(int i13) {
        super(i13);
        this.f55380b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f55380b == ((m) obj).f55380b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55380b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55380b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SecondaryActionClick(id="), this.f55380b, ")");
    }
}
