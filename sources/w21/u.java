package w21;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f127824a;

    public u(int i13) {
        this.f127824a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f127824a == ((u) obj).f127824a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127824a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("RefreshChoice(phase="), this.f127824a, ")");
    }
}
