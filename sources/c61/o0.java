package c61;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26632a;

    public o0(boolean z13) {
        this.f26632a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f26632a == ((o0) obj).f26632a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26632a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("SearchLandingRequestParams(shouldMockModules="), this.f26632a, ")");
    }
}
