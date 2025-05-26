package rl1;

/* loaded from: classes2.dex */
public final class x extends y {

    /* renamed from: b, reason: collision with root package name */
    public final int f108665b;

    public x(int i13) {
        super(i13);
        this.f108665b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f108665b == ((x) obj).f108665b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108665b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108665b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ImageSubmit(id="), this.f108665b, ")");
    }
}
