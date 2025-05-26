package cn1;

/* loaded from: classes5.dex */
public final class u extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28237b;

    public u(int i13) {
        super(i13);
        this.f28237b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f28237b == ((u) obj).f28237b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28237b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f28237b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("TrailingIconClick(id="), this.f28237b, ")");
    }
}
