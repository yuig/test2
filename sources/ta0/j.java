package ta0;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f116887a;

    public j(int i13) {
        this.f116887a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f116887a == ((j) obj).f116887a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116887a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ShowResToast(messageStringRes="), this.f116887a, ")");
    }
}
