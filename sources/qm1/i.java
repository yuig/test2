package qm1;

/* loaded from: classes5.dex */
public final class i extends k {

    /* renamed from: b, reason: collision with root package name */
    public final int f104402b;

    public i(int i13) {
        super(i13);
        this.f104402b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f104402b == ((i) obj).f104402b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104402b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f104402b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f104402b, ")");
    }
}
