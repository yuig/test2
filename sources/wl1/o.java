package wl1;

/* loaded from: classes5.dex */
public final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    public final int f130206b;

    public o(int i13) {
        super(i13);
        this.f130206b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f130206b == ((o) obj).f130206b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130206b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130206b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PrimaryActionClick(id="), this.f130206b, ")");
    }
}
