package m90;

/* loaded from: classes5.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f86646a;

    public e(int i13) {
        this.f86646a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f86646a == ((e) obj).f86646a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86646a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CardClicked(id="), this.f86646a, ")");
    }
}
