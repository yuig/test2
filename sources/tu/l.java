package tu;

/* loaded from: classes3.dex */
public final class l implements t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f119294a;

    public l(boolean z13) {
        this.f119294a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f119294a == ((l) obj).f119294a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119294a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnActivate(requiresSpamCheck="), this.f119294a, ")");
    }
}
