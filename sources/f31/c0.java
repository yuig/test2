package f31;

/* loaded from: classes5.dex */
public final class c0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60995a;

    public c0(boolean z13) {
        this.f60995a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f60995a == ((c0) obj).f60995a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60995a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("LaunchContentCreation(showBoardOption="), this.f60995a, ")");
    }
}
