package gx;

/* loaded from: classes3.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f66249a;

    public g(int i13) {
        this.f66249a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f66249a == ((g) obj).f66249a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66249a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("CacheSelectedCategorySideEffect(selectedCategoryIndex="), this.f66249a, ")");
    }
}
