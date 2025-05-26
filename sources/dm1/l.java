package dm1;

/* loaded from: classes5.dex */
public final class l extends n {

    /* renamed from: b, reason: collision with root package name */
    public final int f55379b;

    public l(int i13) {
        super(i13);
        this.f55379b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f55379b == ((l) obj).f55379b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55379b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55379b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PrimaryActionClick(id="), this.f55379b, ")");
    }
}
