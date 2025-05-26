package qg0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f103825a;

    public b(int i13) {
        this.f103825a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f103825a == ((b) obj).f103825a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103825a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("SearchFeedIntentEvent(searchCount="), this.f103825a, ")");
    }
}
