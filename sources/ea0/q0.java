package ea0;

/* loaded from: classes5.dex */
public final class q0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57996a;

    public q0(boolean z13) {
        this.f57996a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f57996a == ((q0) obj).f57996a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57996a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("SourceCollageLoading(showProgress="), this.f57996a, ")");
    }
}
