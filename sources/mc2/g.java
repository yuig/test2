package mc2;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f86932a;

    public g(int i13) {
        this.f86932a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f86932a == ((g) obj).f86932a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86932a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CacheValue(selectedTier="), this.f86932a, ")");
    }
}
