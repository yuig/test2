package dm1;

/* loaded from: classes5.dex */
public final class k extends n {

    /* renamed from: b, reason: collision with root package name */
    public final int f55378b;

    public k(int i13) {
        super(i13);
        this.f55378b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f55378b == ((k) obj).f55378b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55378b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55378b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Dismiss(id="), this.f55378b, ")");
    }
}
