package rn1;

/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f108882b;

    public h(int i13) {
        super(i13);
        this.f108882b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f108882b == ((h) obj).f108882b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108882b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108882b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f108882b, ")");
    }
}
