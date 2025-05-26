package xn1;

/* loaded from: classes5.dex */
public final class h extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135452b;

    public h(int i13) {
        super(i13);
        this.f135452b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f135452b == ((h) obj).f135452b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135452b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135452b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("StartIconClick(id="), this.f135452b, ")");
    }
}
