package bm1;

/* loaded from: classes5.dex */
public final class r extends t {

    /* renamed from: b, reason: collision with root package name */
    public final int f23521b;

    public r(int i13) {
        super(i13);
        this.f23521b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f23521b == ((r) obj).f23521b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23521b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f23521b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Select(id="), this.f23521b, ")");
    }
}
