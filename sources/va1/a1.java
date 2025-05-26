package va1;

/* loaded from: classes5.dex */
public final class a1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f125147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125148b = 20;

    public a1(int i13) {
        this.f125147a = i13;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return String.valueOf(this.f125147a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.f125147a == ((a1) obj).f125147a;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125148b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125147a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Spacer(spaceResId="), this.f125147a, ")");
    }
}
