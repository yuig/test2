package tk0;

/* loaded from: classes5.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f117986a;

    public o(int i13) {
        this.f117986a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f117986a == ((o) obj).f117986a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117986a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ToolTapped(position="), this.f117986a, ")");
    }
}
