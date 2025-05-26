package d92;

/* loaded from: classes4.dex */
public final class n implements z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f54170a;

    public n(boolean z13) {
        this.f54170a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f54170a == ((n) obj).f54170a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54170a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("OnAuthenticationSuccess(isAccountLinked="), this.f54170a, ")");
    }
}
