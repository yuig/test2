package p71;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f99091a;

    public g(int i13) {
        this.f99091a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f99091a == ((g) obj).f99091a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99091a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("RecentlyActionedPinsRequestParams(pinPreviewCount="), this.f99091a, ")");
    }
}
