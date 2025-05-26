package xn1;

/* loaded from: classes5.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135442b;

    public c(int i13) {
        super(i13);
        this.f135442b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f135442b == ((c) obj).f135442b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135442b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135442b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f135442b, ")");
    }
}
