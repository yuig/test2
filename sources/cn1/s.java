package cn1;

/* loaded from: classes5.dex */
public final class s extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28235b;

    public s(int i13) {
        super(i13);
        this.f28235b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f28235b == ((s) obj).f28235b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28235b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f28235b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("StaticSearchClick(id="), this.f28235b, ")");
    }
}
