package rn1;

/* loaded from: classes5.dex */
public final class f extends i {

    /* renamed from: b */
    public final int f108879b;

    public f(int i13) {
        super(i13);
        this.f108879b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f108879b == ((f) obj).f108879b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108879b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108879b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f108879b, ")");
    }
}
