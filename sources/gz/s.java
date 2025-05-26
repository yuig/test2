package gz;

/* loaded from: classes3.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f66356a;

    public s(int i13) {
        this.f66356a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f66356a == ((s) obj).f66356a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66356a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Single(index="), this.f66356a, ")");
    }
}
