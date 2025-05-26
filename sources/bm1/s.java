package bm1;

/* loaded from: classes5.dex */
public final class s extends t {

    /* renamed from: b, reason: collision with root package name */
    public final int f23522b;

    public s(int i13) {
        super(i13);
        this.f23522b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f23522b == ((s) obj).f23522b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23522b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f23522b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("UnSelect(id="), this.f23522b, ")");
    }
}
