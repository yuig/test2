package x31;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f131622a;

    public f(int i13) {
        this.f131622a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f131622a == ((f) obj).f131622a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131622a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("FilterTapped(id="), this.f131622a, ")");
    }
}
