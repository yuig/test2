package hk1;

/* loaded from: classes5.dex */
public final class h implements o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69352a;

    public h(boolean z13) {
        this.f69352a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f69352a == ((h) obj).f69352a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69352a);
    }

    public final boolean j() {
        return this.f69352a;
    }

    public final String toString() {
        return a.a.r(new StringBuilder("ErrorUpdatingFavoriteState(originalIsFavoritedValue="), this.f69352a, ")");
    }
}
