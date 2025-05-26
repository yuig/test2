package xl1;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: b, reason: collision with root package name */
    public final int f135260b;

    public a(int i13) {
        super(i13);
        this.f135260b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f135260b == ((a) obj).f135260b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135260b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135260b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f135260b, ")");
    }
}
