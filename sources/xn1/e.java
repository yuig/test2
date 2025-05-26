package xn1;

/* loaded from: classes5.dex */
public final class e extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135446b;

    public e(int i13) {
        super(i13);
        this.f135446b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f135446b == ((e) obj).f135446b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135446b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135446b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("EndIconClick(id="), this.f135446b, ")");
    }
}
