package wn1;

/* loaded from: classes5.dex */
public final class x extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130588b;

    public x(int i13) {
        super(i13);
        this.f130588b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f130588b == ((x) obj).f130588b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130588b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130588b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("TertiaryIconClick(id="), this.f130588b, ")");
    }
}
