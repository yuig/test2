package om1;

/* loaded from: classes5.dex */
public final class l extends p {

    /* renamed from: b, reason: collision with root package name */
    public final int f96670b;

    public l(int i13) {
        super(i13);
        this.f96670b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f96670b == ((l) obj).f96670b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96670b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f96670b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f96670b, ")");
    }
}
