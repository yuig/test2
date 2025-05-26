package wn1;

/* loaded from: classes5.dex */
public final class p extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130575b;

    public p(int i13) {
        super(i13);
        this.f130575b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f130575b == ((p) obj).f130575b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130575b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130575b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f130575b, ")");
    }
}
