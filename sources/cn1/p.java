package cn1;

/* loaded from: classes5.dex */
public final class p extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28230b;

    public p(int i13) {
        super(i13);
        this.f28230b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f28230b == ((p) obj).f28230b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28230b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f28230b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LeftTrailingIconClick(id="), this.f28230b, ")");
    }
}
