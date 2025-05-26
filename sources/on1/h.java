package on1;

/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f96737b;

    public h(int i13) {
        super(i13);
        this.f96737b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f96737b == ((h) obj).f96737b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96737b);
    }

    @Override // on1.i, gm1.c
    public final int j() {
        return this.f96737b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("UnChecked(id="), this.f96737b, ")");
    }
}
