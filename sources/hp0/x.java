package hp0;

/* loaded from: classes5.dex */
public final class x implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69887a;

    public x(boolean z13) {
        this.f69887a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f69887a == ((x) obj).f69887a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69887a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("LogQcmDrawerItemClick(isFirstClick="), this.f69887a, ")");
    }
}
