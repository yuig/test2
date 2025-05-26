package qm1;

/* loaded from: classes5.dex */
public final class j extends k {

    /* renamed from: b, reason: collision with root package name */
    public final int f104403b;

    public j(int i13) {
        super(i13);
        this.f104403b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f104403b == ((j) obj).f104403b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104403b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f104403b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f104403b, ")");
    }
}
