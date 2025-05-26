package om1;

/* loaded from: classes5.dex */
public final class m extends p {

    /* renamed from: b, reason: collision with root package name */
    public final int f96671b;

    public m(int i13) {
        super(i13);
        this.f96671b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f96671b == ((m) obj).f96671b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96671b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f96671b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f96671b, ")");
    }
}
