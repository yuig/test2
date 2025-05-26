package rl1;

/* loaded from: classes5.dex */
public final class t extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f108660b;

    public t(int i13) {
        super(i13);
        this.f108660b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f108660b == ((t) obj).f108660b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108660b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108660b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f108660b, ")");
    }
}
