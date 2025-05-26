package ka0;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f78896a;

    public c(int i13) {
        this.f78896a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f78896a == ((c) obj).f78896a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78896a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("PageChanged(position="), this.f78896a, ")");
    }
}
