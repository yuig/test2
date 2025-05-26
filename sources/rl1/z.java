package rl1;

/* loaded from: classes5.dex */
public final class z extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f108666b;

    public z(int i13) {
        super(i13);
        this.f108666b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f108666b == ((z) obj).f108666b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108666b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108666b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f108666b, ")");
    }
}
