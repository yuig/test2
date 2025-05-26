package dt0;

/* loaded from: classes5.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f56236a;

    public d(int i13) {
        this.f56236a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f56236a == ((d) obj).f56236a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56236a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnFilterSelected(selectionIndex="), this.f56236a, ")");
    }
}
